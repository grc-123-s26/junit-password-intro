import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmptyString() {
        // Arrange
        String password = "";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePassWordLengthLongPassword() {
        // Arrange
        String password = "eeneemeeniemienemoe";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsEveryLong() {
        // Arrange
        String password = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }

    @Test
    void testPasswordIsAlphanumeric() {
        // Arrange
        String password = "password123";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordIsNotAlphanumeric() {
        // Arrange
        String password = "^^";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordIsAlphanumericNumbers() {
        // Arrange
        String password = "123456";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordIsAlphanumericWords() {
        // Arrange
        String password = "justWords";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordIsAlphanumericPercentEnd() {
        // Arrange
        String password = "justWords%%";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordDoesRepeatCharacterTriplet() {
        // Arrange
        String password = "pasworddd";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordDoesNotRepeatCharacterTriplet() {
        // Arrange
        String password = "wolalil";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordDoesRepeatCharacterSameWord() {
        // Arrange
        String password = "aaaaaaaaaaaaaa";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordDoesRepeatCharacteradddda() {
        // Arrange
        String password = "adddda";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testPasswordDoesRepeatCharacterHello() {
        // Arrange
        String password = "hello";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testPasswordcountSpecialCharacters() {
        // Arrange
        String password = "GRC@2026!";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(2, actual);
    }

    @Test
    void testPasswordcountSpecialCharactersBeginningEnd() {
        // Arrange
        String password = "!!!!MySpec1alPassw0rd!!!!";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(8, actual);
    }

    @Test
    void testPasswordcountSpecialCharactersMixed() {
        // Arrange
        String password = "cAnY&uR#aDTh^s?";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(4, actual);
    }

    @Test
    void testPasswordMinimumSpecialCharacters() {
        // Arrange
        String password = "CloseEnough!!!!";
        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 4);
        // Assert
        assertEquals(true, actual);
    }
}
