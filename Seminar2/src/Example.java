// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example {
    public static void main(String[] args) {
        try {
            int num = -10;
            if (num < 0) {
                throw new InvalidInputException("number must be positive");
            }
            System.out.println("number: " + num);
        }
        catch (InvalidInputException e) {
            System.out.println("Error: " + e);
        }
    }
}