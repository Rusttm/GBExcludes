//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю,
//        программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
//        В противном случае, программа должна выводить сообщение "Число корректно".

package DZ1;

import java.util.Scanner;

public class Seminar2Dz1 {
    public static void main(String[] args) {
        try {
            int num_req = NumberRequest.Request();
            System.out.println("Number: " + num_req + " is correct!");
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e);
        }

    }

}
