//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю,
//        программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
//        В противном случае, программа должна выводить сообщение "Число корректно".

package DZ1;

import java.util.Scanner;

public class Seminar2Dz1 {
    public static void main(String[] args) {
        System.out.println("Number: " + NumRequest() + "is correct!");
    }
    public static int NumRequest() {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        while (age < 1) {
            try {
                System.out.println("Enter number");
                age = Integer.parseInt(scan.nextLine());
                if (age < 0) {
                    throw new NegativeNumberException("Number is negative");
                }
                if (age == 0) {
                    throw new ZeroNumberException("Number shouldn't be 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: unknown number format");
            } catch (NegativeNumberException e) {
                System.out.println("Number should be positive");
            } catch (ZeroNumberException e) {
                System.out.println("Number should be >0 ");
            }

        }
        scan.close();

        return age;
    }
}
