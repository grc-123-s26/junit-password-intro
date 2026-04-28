import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmotyString() {
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
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePassWordLongerThan40CharsIsVeryLong() {
        // Arrange
        String password = "lkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkjlkj";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("very long", actual);
    }

    @Test
    void testDescribePassWordIsAlphanumericFalse() {
        // Arrange
        String password = "ihatemydog123%";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testDescribePassWordIsAlphanumericTrue() {
        // Arrange
        String password = "ihatemydog";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }
    
    @Test
    void testDescribePassWordIsAlphanumericSpaces() {
        // Arrange
        String password = "top 1 dog";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testDescribePassWordContainsTriple() {
        // Arrange
        String password = "passsword";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testDescribePassWordContainsTripleAtEnd() {
        // Arrange
        String password = "alexxx";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testDescribePassWordContainsTripleAtAll() {
        // Arrange
        String password = "aalleexx";
        // Act
      boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(false, actual);
    }

    
}
