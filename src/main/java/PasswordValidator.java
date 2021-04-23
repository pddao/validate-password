import javax.print.DocFlavor;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter password: ");
        String input = scan.next();

        boolean hasMinimumLength = checkPasswordLength(input);
        boolean hasNumbersInPassword = checkPasswordForNumbers(input);
        boolean hasUpperOrLower = checkForUpperOrLowerCase(input);

        if (hasNumbersInPassword == true && hasUpperOrLower == true && hasMinimumLength == true) {
            System.out.println("Entered password was correct!");
        } else {
            System.out.println("No valid password!");
        }
    }

    public static boolean checkPasswordLength(String input) {
        if (input.length() < 6) {
            System.out.println("Entered password was too short!");
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkPasswordForNumbers(String input) {
        boolean isNumeric = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                isNumeric = true;
            }
        }
        return isNumeric;
    }

    public static boolean checkForUpperOrLowerCase(String input) {

        boolean isUpper = false;
        boolean isLower = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                isUpper = true;
            } else if (Character.isLowerCase(input.charAt(i))){

                isLower = true;
            }
        }

        if (isUpper == true && isLower == true) {
            return true;
        }

        else {
            return false;
        }

    }
}
