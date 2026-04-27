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
        String password = "eeniemeeniemienemoe";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert 
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsVeryLong() {
        // Arrange
        String password = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("very long", actual);
    }
    @Test 
    void testIsAlphanumeric() {
        //Arrange
        String password = "avafvbtrbqerfvfdhuneqerbqebbqterb";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert 
        assertEquals(true, actual);
    }
    @Test 
    void testSpaceEndAlphanumeric() {
        //Arrange
        String password = "1738 ";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert 
        assertEquals(false, actual);
    }

    @Test 
    void testContainsTriple() {
        //Arrange
        String password = "paaasword";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert 
        assertEquals(true, actual);
    }

    @Test 
    void testWrongContainsTriple() {
        //Arrange
        String password = "vnofv";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert 
        assertEquals(false, actual);
    }

    @Test 
    void testCountSpecialCharacters() {
        //Arrange
        String password = "";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert 
        assertEquals(0, actual);
    }

    @Test 
    void testCheckCountSpecialCharacters() {
        //Arrange
        String password = "!Happy Birthday!";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(3, actual);
    }

    @Test
    void testhasSufficientSpecialCharacters() {
        //Arrange
        String password = "";
        int minimum = 0;
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //Assert 
        assertEquals(true, actual);
    }

    @Test
    void testCheckhasSufficientSpecialCharacters() {
        //Arrange
        String password = "!Happy Birthday!";
        int minimum = 3;
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //Assert 
        assertEquals(true, actual);
    }

}
