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
        String password = "paaasword";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testWrongCaseContainsTriple(){
        //Arrange
        String password = "odfgjreg";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testCountSpecials(){
        //Arrange
        String password = "dog has 4 legs!";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(4, actual);
    }
    @Test
    void testEqualNumberOfHasSufficientSpecialCharacters(){
        //Arrange
        String password = "dog has 4 legs!";
        int minimum = 4;
        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //Assert
        assertEquals(true, actual);
    }
    @Test
    void testLessHasSufficientSpecialCharacters(){
        //Arrange
        String password = "dog has 4 legs!";
        int minimum = 3;
        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //Assert
        assertEquals(true, actual);
    }
    void testOverHasSufficientSpecialCharacters(){
        //Arrange
        String password = "dog has 4 legs!";
        int minimum = 5;
        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //Assert
        assertEquals(false, actual);
    }
}
