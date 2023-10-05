class Seminar1DZ {
    public static void arrayOutOfBoundsException() {
      int[] new_array = new int[10];
      new_array[18] = 15;
        
      
}

    public static void divisionByZero() {
      int num;
      num = 10/0;
      
      
}

    public static void numberFormatException() {
      int num;
      num = '5';
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Seminar1DZ();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}