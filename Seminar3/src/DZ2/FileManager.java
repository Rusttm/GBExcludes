//Создайте класс FileManager.
// Этот класс должен иметь методы для выполнения основных операций с файлами:
// чтение, запись и копирование. Каждый из этих методов должен выбрасывать
// соответствующее исключение, если в процессе выполнения операции произошла ошибка
// (например, FileNotFoundException, если файл не найден).



package DZ2;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws IOException {
        // read file
        System.out.println("Load data from file ...");
        FileRead("test.txt");

        // save data to file
        System.out.println("Save data to file ...");
        String[] data_array = {"first string", "second string"};
        FileSave("test.txt", data_array);

        //copy file text.txt to copied_test.txt
        System.out.println("Copy file ...");
        FileCopy("test.txt", "copied_test.txt");

    }

    public static void FileRead(String file_path) throws FileNotFoundException {
        // reads file and print data from file, or throw errors, if file doesnt exist
        try {
            File load_file = new File(file_path);
            Scanner scanner = new Scanner(load_file);
            System.out.println("Data in file " + file_path + " : ");
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File '" + file_path + "' doesn't exist, and not loaded: " + e.getMessage());
        }
    }
    public static void FileSave(String save_file_path, String[] data_array) throws FileNotFoundException {
        // saves data from array to existed file or throw exception
        try {
            File save_file = new File(save_file_path);
            if (!save_file.exists()) {
                // if you want to create file, uncomment
//                save_file.createNewFile();
//                System.out.println("File created: " + save_file.getName());
                throw new FileNotFoundException("File: '" + save_file_path + "' not found for save");
            } else {
                System.out.println("File " + save_file_path + " already exists. Saving ...");
            }
            // write data array to file
            try {
                FileWriter myWriter = new FileWriter(save_file_path);
                for (String st: data_array) {
                    myWriter.write(st + "\n");
                }
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred." + e);
            }
        } catch (FileNotFoundException e) {
            System.out.println( "Error: " + e.getMessage());
            throw new FileNotFoundException("File: '" + save_file_path + "' not found for save");
        }
    }

    public static void FileCopy(String source_file_path, String dest_file_path) throws IOException {
        // copies source file to destination file or trow exception? if destination file already exist
        File source=new File(source_file_path);
        if (!source.exists()) {
            throw new FileNotFoundException("Cant find source file: " + source);
        }
        File destination=new File(dest_file_path);
        if (destination.exists()) {
            throw new FileAlreadyExistsException("Cant copy '" + source +"' to existed destination file: " + destination.getPath());
        }
        Files.copy(source.toPath(), destination.toPath());
        System.out.println("File '" + source + "' copied to " + destination);

    }
}
