import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange - Setup the argument(s) you are going to test
        String password = ""; 
        // Act - Define a variable that is assigned to the return of your test
        String actual = PasswordUtils.describePasswordLength(password); 
        // Assert - Do you get what you are expecting?
        assertEquals("short", actual); 
    }

    @Test
    void testDescribePasswordLengthLongPassword() {
        String password = "eeniemeenieminemoe"; 
        String actual = PasswordUtils.describePasswordLength(password); 
        assertEquals("long", actual); 
    }

    @Test
    void testPasswordLongerThan40CharsIsVeryLong() {
        // Arrange
        String password = "yuhjbbgyuftdchgvjbugiyfvhjbuig76fyvhjbkiohu6jreytshdrage";
        // Act
        String actual = PasswordUtils.describePasswordLength(password); 
        // Assert
        assertEquals("very long", actual); 
    }

    @Test
    void testPasswordLengthMediumPassword() {
        String password = "something"; 
        String actual = PasswordUtils.describePasswordLength(password);
        assertEquals("medium", actual);
    }

    @Test 
    void testPasswordContainsAlphanumericTrue() {
        String password = "woiefnw2093nk";
        boolean actual = PasswordUtils.isAlphanumeric(password);
        assertEquals(true, actual);
    }
}

