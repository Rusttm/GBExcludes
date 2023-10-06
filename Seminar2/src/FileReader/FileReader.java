package FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            File new_file = new File("test.txt");
            Scanner scanner = new Scanner(new_file);
            System.out.println("File exists");
        } catch (FileNotFoundException e) {
            System.out.println( "Error: " + e.getMessage());
        }
    }

}
