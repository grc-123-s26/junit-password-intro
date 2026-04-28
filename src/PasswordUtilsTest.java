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

    // containsAlphanumeric() method

    @Test 
    void testPasswordContainsAlphanumericTrue() {
        String password = "woiefnw2093nk";
        boolean actual = PasswordUtils.isAlphanumeric(password);
        assertEquals(true, actual);
    }

    @Test
    void testPasswordContainsAlphanumericFalse() {
        String password = "@#$@^";
        boolean actual = PasswordUtils.isAlphanumeric(password); 
        assertEquals(false, actual); 
    }

    @Test
    void testPasswordContainsAlphanumericLength() {
        String password = "oasijehowh@"; 
        boolean actual = PasswordUtils.isAlphanumeric(password); 
        assertEquals(false, actual); 
    }

    @Test 
    void testPasswordContainsAlphanumericIteration() {
        String password = "2#iwe%owifehwe#oih2@";
        boolean actual = PasswordUtils.isAlphanumeric(password); 
        assertEquals(false, actual); 
    }

    @Test
    void testPasswordContainsAlphanumericEmpty() {
        String password = ""; 
        boolean actual = PasswordUtils.isAlphanumeric(password); 
        assertEquals(false, actual); 
    }

    // containsTriple() method

    @Test
    void testPasswordContainsTripleTrue() {
        String password = "faaa"; 
        boolean actual = PasswordUtils.isAlphanumeric(password); 
        assertEquals(true, actual);
    }

    @Test 
    void testPasswordContainsTripleFalse() {
        String password = "aawfein"; 
        boolean actual = PasswordUtils.containsTriple(password); 
        assertEquals(false, actual);
    }

    @Test 
    void testPasswordContainsTripleEmpty() {
        String password = ""; 
        boolean actual = PasswordUtils.containsTriple(password); 
        assertEquals(false, actual); 
    }

    @Test
    void testPasswordContainsTripleRepetition() {
        String password = "aaljkwefaoweia0"; 
        boolean actual = PasswordUtils.containsTriple(password); 
        assertEquals(false, actual); 
    }

    // countSpecialCharacters method

    @Test
    void testPasswordCountSpecialTrue() {
        String password = "@aohiegwoie@@";
        int actual = PasswordUtils.countSpecialCharacters(password); 
        assertEquals(3, actual); 
    }

    @Test
    void testPasswordCountSpecialEmpty() {
        String password = ""; 
        int actual = PasswordUtils.countSpecialCharacters(password); 
        assertEquals(0, actual); 
    }

    @Test
    void testPasswordCountSpecialLength() {
        String password = "@asfeio@foiwef2#@$8435^@#";
        int actual = PasswordUtils.countSpecialCharacters(password); 
        assertEquals(8, actual); 
    }

    // hasSufficientSpecialCharacters() method

    @Test
    void testSufficientSpecialCharactersTrue() {
        String password = "iwheoif2@$k2#)(_";
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 6);
        assertEquals(true, actual); 
    }

    @Test
    void testSufficientSpecialCharactersFalse() {
        String password = "ahiowef@#^!"; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 10);
        assertEquals(false, actual);
    }

    @Test 
    void testSufficientSpecialCharactersEmpty() {
        String password = ""; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 1);
        assertEquals(false, actual); 
    }

    @Test
    void testSufficientSpecialCharactersPlacement() {
        String password = "[]klwe_/234{\"\'.;ise";
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 6);
        assertEquals(true, actual);
    }
}

