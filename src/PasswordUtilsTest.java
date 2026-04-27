import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword(){
        // Arrange
        String password = "sdafasdsaffaeffdfa";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsVeryLong(){
        // Arrange
        String password = "sdafasdsaffaeffdfateheHfdgGRGgFFGerFDGHeGFBAHhfnstgsghfgga";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }

    @Test
    void testAlphanumeric(){
        //Arrange
        String password = "sdafasdsaffaeffdfateheHfdgGRGgFFGerFDGHeGFBAHhfnstgsghfgga";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testMoreAlphanumeric(){
        //Arrange
        String password = "i76 54";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testSpaceAtTheEndAlphanumeric(){
        //Arrange
        String password = "i7654 ";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }
     @Test
    void testEmptyStringAlphanumeric(){
        //Arrange
        String password = "";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testContainsTriple(){
        //Arrange
        String password = "";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }
}
