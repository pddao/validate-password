import javax.print.DocFlavor;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter password: ");
        String input = scan.next();

        //Öffnet die Methode und speichert das zurückgelieferte Ergebnis als Boolean ab.
        boolean hasMinimumLength = checkPasswordLength(input);
        boolean hasNumbersInPassword = checkPasswordForNumbers(input);
        boolean hasUpperOrLower = checkForUpperOrLowerCase(input);

        //Komplette überprüfung aller Richtlinien
        boolean haseverything = checkListOfPasswords(input);

        //Ausgabe ob das Passwort alle richtlinien Entspricht oder nicht.
        if (haseverything == true) {
            System.out.println("Entered password was correct!");
        } else {
            System.out.println("No valid password!");
        }
    }

    //Die Methode überprüft, ob das Passwort länger als 6 Zeichen lang ist.
    public static boolean checkPasswordLength(String input) {
        if (input.length() < 6) {
            return false;
        } else {
            return true;
        }
    }

    //Die Methode überprüft, ob das Passwort ebenfalls Zahlen enthält.
    public static boolean checkPasswordForNumbers(String input) {
        boolean isNumeric = false;
        //Mit der for Schleife, wird jedes Zeichen im Passwort auf eine Zahl überprüft.
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                isNumeric = true;
            }
        }
        return isNumeric;
    }

    //Die Methode überprüft, ob das Passwort sowohl Klein, als auch Großbuchstaben hat.
    public static boolean checkForUpperOrLowerCase(String input) {

        boolean isUpper = false;
        boolean isLower = false;
        //Mit der for Schleife, wird jedes Zeichen im Passwort auf eine Groß und Kleinbuchstaben überprüft.
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                isUpper = true;
            } else if (Character.isLowerCase(input.charAt(i))) {
                isLower = true;
            }
        }
        //Nur wenn beides vorhanden ist (Klein und Großbuchstabe) wird ein True zurückgegeben.
        if (isUpper == true && isLower == true) {
            return true;
        } else {
            return false;
        }

    }

    //Überprüfung alle Richtlinien
    public static boolean checkPassword(String input) {
        //Überprüfung erster Richtlinie (Länge des Passworts)
        boolean valPass = checkPasswordLength(input);
        //Nur wenn die erste Richtlinie korrekt ist geht es hier weiter. Sonst Zeile 88
        if (valPass == true) {
            //Überprüfung der zweiten Richtlinie (Zahlen im Passwort)
            valPass = checkPasswordForNumbers(input);
            //Nur wenn die zweite Richtlinie ebenfalls korrekt ist, geht es weiter. Sonst Zeile 84
            if (valPass == true) {
                //Letzte Überprüfung der Richtlinie (Groß und Kleinschreibung).
                // Sollte das Ergebnis korrekt sein, wird in der Variablen valPass True gespeichert.
                valPass = checkForUpperOrLowerCase(input);
            } else {
                //Rückgabe das die zweite Richtlinie falsch ist.
                return valPass;
            }
        } else {
            //Rückgabe das die erste Richtilinie falsch ist.
            return valPass;
        }
        //Allgemeine Rückgabe.
        return valPass;
    }

    public static boolean checkListOfPasswords(String[] passwords){
        for (String password : passwords) {
            boolean valPass2 = checkPassword(password);
            if (!valPass2) {
                return false;
            }
        }
        return true;
    }
}
