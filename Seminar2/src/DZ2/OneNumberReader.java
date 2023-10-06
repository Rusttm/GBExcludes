// this class reads number from command line and return it


package DZ2;

import java.util.Scanner;

public class OneNumberReader {
    public static void main(String[] args){
        System.out.println(Request("Enter number"));
    }
    public static int Request(String msg) {
        Scanner scan = new Scanner(System.in);
        int input_num = 0;
        while (true) {
            try {
                System.out.println(msg);
                input_num = Integer.parseInt(scan.nextLine());
//                input_num = Integer.parseInt(System.console().readLine());

                scan.close();
                return input_num;
            } catch (NumberFormatException e) {
                System.out.println("Error: unknown number format");
            }
        }
    }

}
