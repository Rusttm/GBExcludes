// this class reads positive number >0 from command line and raise exception if its not


package DZ1;

import java.util.Scanner;

public class NumberRequest {
    public static void main(String[] args) throws InvalidNumberException {
        System.out.println(Request());
    }
    public static int Request() throws InvalidNumberException {
        Scanner scan = new Scanner(System.in);
        int input_num = 0;
        while (input_num < 1) {
            try {
                System.out.println("Enter number");
                input_num = Integer.parseInt(scan.nextLine());
                if (input_num < 0) {
                    throw new NegativeNumberException("Number is negative");
                }
                if (input_num == 0) {
                    throw new ZeroNumberException("Number shouldn't be 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: unknown number format");
            } catch (NegativeNumberException e) {
                System.out.println("Number should be positive");
                throw new InvalidNumberException("Not correct number");
            } catch (ZeroNumberException e) {
                System.out.println("Number should be >0 ");
                throw new InvalidNumberException("Not correct number");
            }
        }
        scan.close();

        return input_num;
    }

}
