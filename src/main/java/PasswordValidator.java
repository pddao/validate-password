import javax.print.DocFlavor;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter password: ");
        String input = scan.next();

        boolean hasMinimumLength = checkPasswordLength(input);
        boolean hasNumbersInPassword = checkPasswordForNumbers(input);

        if (hasNumbersInPassword == true){
            System.out.println("Entered Pasword was correct!");
        }
        else{
            System.out.println("No number in Password!");
        }
    }

    public static boolean checkPasswordLength(String input){
        if (input.length() < 6){
            System.out.println("Entered password was too short!");
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean checkPasswordForNumbers(String input){
        boolean isNumeric=false;
            for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                isNumeric = true;
            }
        }
        return isNumeric;
    }
}
