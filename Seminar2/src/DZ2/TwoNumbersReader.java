// this class reads two numbers from command line and return array


package DZ2;

import java.util.Scanner;

public class TwoNumbersReader {
    public static int[] Request() {
        Scanner scan = new Scanner(System.in);
        int[] input_array = new int[2];
        while (true) {
            try {
                System.out.println("Enter number a");
                input_array[0] = Integer.parseInt(scan.nextLine());
                System.out.println("Enter number b");
                input_array[1] = Integer.parseInt(scan.nextLine());
//                input_num = Integer.parseInt(System.console().readLine());

                scan.close();
                return input_array;
            } catch (NumberFormatException e) {
                System.out.println("Error: unknown number format");
            }
        }
    }

}
