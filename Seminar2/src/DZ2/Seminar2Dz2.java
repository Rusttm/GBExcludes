//Задача 2:
//        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//        Если второе число равно нулю, программа должна выбрасывать
//        исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//        В противном случае, программа должна выводить результат деления.
//


package DZ2;

public class Seminar2Dz2 {
    public static void main(String[] args) throws DivisionByZeroException {
        int[] int_array = TwoNumbersReader.Request();
        int a = int_array[0];
        int b = int_array[1];
        if (b == 0) {
            throw new DivisionByZeroException("Unsupportable division by zero");
        }
        float result = (float) a /b;
        System.out.println("Result (a/b): " + result);

    }
}
