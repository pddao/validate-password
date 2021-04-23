import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    @DisplayName("Checking for password length!")
    public void checkPasswordLength(){

        //GIVEN
        String input = "Hallo123";

        //WHEN
        boolean hasMinimumLength = PasswordValidator.checkPasswordLength(input);

        //THEN
        assertTrue(hasMinimumLength);
    }

    @Test
    @DisplayName("Checking if password contains numbers")
    public void checkForNumbers(){

        //GIVEN
        String input = "Hallo123";

        //WHEN
        boolean containsNumbers = PasswordValidator.checkPasswordForNumbers(input);

        //THEN
        assertTrue(containsNumbers);
    }

    @Test
    @DisplayName("Checking if password contains uppercase and lowercase")

    public void checkForUpperLower (){

        //GIVEN
        String input = "Hallo123";

        //WHEN
        boolean containsUpperOrLowerCase = PasswordValidator.checkForUpperOrLowerCase(input);

        //THEN
        assertTrue(containsUpperOrLowerCase);

    }



}