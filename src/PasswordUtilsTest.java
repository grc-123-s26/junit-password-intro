import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmptyString() {
        //Arrange
        String password = ""; 
        //Act
       String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword(){
        //Arrange
        String password ="eeniemeeniemienemoe";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40CharsIsVeryLong(){
        //Arrange
        String password ="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }
/**
* Checks whether a password has a character that is repeated at least three
* times in a row.
*
* For example, "paaasword" has the letter 'a' three times in a row.
*
* @param password the password to check
* @return true if password has a character repeated three times in a row, false otherwise
*/
public static boolean containsTriple(String password) {
// TODO: Make tests FIRST, then implement the method
// Please have your tests in a separate commit from the implementation
return false;
}

/**
* Returns the number of special characters in the password.
*
* A special character is any non-alphanumeric (not letter or digit) character.
*
*
* @param password the password to check
* @return the count of special characters
*/
public static int countSpecialCharacters(String password) {
// TODO: Make tests FIRST, then implement the method
// Please have your tests in a separate commit from the implementation
return 0;
}

/**
* Checks whether a password has at least a minimum number of special characters.
*
* A special character is any non-alphanumeric (not letter or digit) character.
*
* @param password the password to check
* @param minimum the minimum number of special characters (inclusive)
* @return true has the minimum number of special charcters or more, false otherwise
*/
public static boolean hasSufficientSpecialCharacters(String password, int minimum) {
// TODO: Make tests FIRST, then implement the method
// Please have your tests in a separate commit from the implementation
// Required: please use countSpecialCharacters as a helper method.
// Don't just copy/paste the logic!
return false;
}
}
