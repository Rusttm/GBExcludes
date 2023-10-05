public class Lesson1 {  
    public static void main(String args[]){  
        int[] num = new int[4];
        try {
            System.out.println("Befor exception");
            num[8] = 10;
            System.out.println("After exception");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Catched exception");
        }
        System.out.println("End of operation");  
    }  
    public static void numberFormatException() {
      int num2;
      num2 = '5';
    }
    }  