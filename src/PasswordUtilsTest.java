import static org.junit.Assert.assertEquals;

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
    void testDescribePasswordLengthLongPassword() {
        //Arrange
        String password = "asdjkjfghjklasdfg";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsVeryLong() {
        //Arrange
        String password = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }

    @Test
    void testPasswordAlphaNumericWithSymbols() {
        //Arrange
        String password = "asdf12$$$%^&*(12";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordAlphaNumericWithOutSymbols() {
        //Arrange
        String password = "bigTEST1234";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test 
    void testPasswordAlphaNumericSymbolEnd() {
        //Arrange
        String password = "12345!";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordAlphaNumericSymbolBegginning() {
        //Arrange
        String password = "!abcd123";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordHasTripleYesTriple() {
        //Arrange
        String password = "Hello111Yes";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordHasTripleNoTriple() {
        //Arrange
        String password = "notriplehere";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordHasTripleYesContainsThreeNotSequential() {
        //Arrange
        String password = "aabbccddeeaabbccddee";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordNumberOfSpecialCharactersZero() {
        //Arrange
        String password = "password";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(0, actual);
    }

    @Test
    void testPasswordNumberOfSpecialCharactersThreeSameInARow() {
        //Arrange
        String password = "pass&&&word";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(3, actual);

    }

    @Test
    void testPasswordNumberOfSpecialCharactersThreeDifferentInARow() {
        //Arrange
        String password = "pass&%*word";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(3, actual);

    }

    @Test
    void testPasswordNumberOfSpecialCharactersThreeDifferentNotInARow() {
        //Arrange
        String password = "pa%ss*wo#rd";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(3, actual);

    }

    @Test
    void testPasswordNumberOfSpecialCharactersZeroAndEmpty() {
        //Arrange
        String password = "";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(0, actual);

    }

    @Test
    void testPasswordNumberOfSpecialCharactersTenAllCharactersSpecial() {
        //Arrange
        String password = "!@#$%^&*()";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(10, actual);

    }
}
