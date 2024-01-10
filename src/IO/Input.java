package IO;
import java.util.Scanner;

public class Input {

    // Method to receive a String input from the user in console
    public static String getString(String s) {
        System.out.print(s + ": ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    } // end of method

    // Method to receive an integer input from the user in console
    public static int getInt() {

        int input = 0;

        while (true) {
            try {
                input = Integer.parseInt(getString("Input a number"));
                return input;
            } catch (Exception e) {
                System.out.println("Invalid input. Please write a whole number: ");
                // Catches the error if the user doesn't input a number format
            }
        }
    } // end of method

    // Overloading getInt() to be able to ask a question
    public static int getInt(String s) {
        System.out.print(s + ": ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int input = scanner.nextInt();
                return input;
            } catch (Exception e) {
                System.out.println("Invalid input. Please write a whole number");
                scanner.nextLine();
            }
        }
    } // end of method
} // end of class
