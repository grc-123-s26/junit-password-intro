import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        String password = "";
        String result = PasswordUtils.describePasswordLength(password);
        assertEquals("short", result);
    }

    @Test 
    void testDescribePasswordLengthLongPassword() {
        String password = "eeniemeeniemienemoe";
        String actual = PasswordUtils.describePasswordLength(password);
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsVeryLong() {
        String password = "qwertyuiopasdfghjklqwertyuoopzxvbnqwertqwertyuiopasdfghjklzxcvbnm";
        String actual = PasswordUtils.describePasswordLength(password);
        assertEquals("very long", actual);
    }
}
