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

    @Test
    void testPasswordEntirelyAlphanumericIsAlphanumeric() {
        String password = "password";
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        assertEquals(true, actual);
    }

    @Test
    void testPasswordLastCharacterNotAlphanumericIsNotAlphanumeric() {
        String password = "password@";
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        assertEquals(false, actual);
    }

    @Test
    void testEmptyPasswordIsNotAlphanumeric() {
        String password = "";
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        assertEquals(false, actual);
    }

    @Test
    void testPasswordWithNonConsecutiveRepeatingCharactersDoesNotContainTriple() {
        String password = "pasaswaord";
        Boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(false, actual);
    }

    @Test
    void testPasswordWithRepeatingCharactersContainsTriple() {
        String password = "paaassword";
        Boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(true, actual);
    }

    @Test
    void testPasswordWithoutRepeatingCharactersDoesNotContainTriple() {
        String password = "password";
        Boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(false, actual);
    }

    @Test
    void testPasswordWithThreeSpecialCharactersHasThreeSpecialCharacters() {
        String password = "@pas$word!";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(3, actual);
    }

    @Test
    void testEmptyPasswordHasNoSpecialCharacters() {
        String password = "";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(0, actual);
    }

    @Test
    void testPasswordWithNoSpecialCharactersHasNoSpecialCharacters() {
        String password = "password";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(0, actual);
    }
}
