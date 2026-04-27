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
}
