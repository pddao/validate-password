import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter password: ");
        String input = scan.next();

        boolean hasMinimumLength = checkPasswordLength(input);
        boolean hasNumbersInPassword = checkPasswordForNumbers(input);

        System.out.println(hasNumbersInPassword);
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
        for (int i=0; i < input.length(); i++){

        }
    }
}
