// this class reads positive number >0 from command line and raise exception if its not


package DZ1;

import java.util.Scanner;

public class PasswordReader {
    public static void main(String[] args){
        System.out.println(Request());
    }
    public static String Request() {
        Scanner scan = new Scanner(System.in);
        String input_line = "";
        System.out.println("Enter password");
        input_line = scan.nextLine();
        scan.close();
        return input_line;
    }

}
