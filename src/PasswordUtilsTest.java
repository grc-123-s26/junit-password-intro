import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;



public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmptyString() {
        // arrange
        String password = " ";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPasword(){
        // arrange
        String password = "supercalifragilisticexpialidocious";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("long", actual);
    }
    
    @Test
    void testPasswordLongerThan40CharsIsVeryLong(){
        // arrange
        String password = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("very long", actual);
    }

    @Test
    void testisAlphamericTrue(){
        // arrange
        String password = "abcd1234";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testisAlphamericFalse(){
        // arrange
        String password = "abcd1234!";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(false , actual);
    }

    @Test
    void testisAlphamericEmptyString(){
        // arrange
        String password = "";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testcontainsTripleTrue(){
        // arrange
        String password = "paaassword";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testcontainsTripleFalse(){
        // arrange
        String password = "paassword";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(false , actual);
    }

    @Test
    void testcontainsTripleEmptyString(){
        // arrange
        String password = "";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(false , actual);
    }

    @Test
    void testcountSpecialCharactersReturnInt(){
        // arrange
        String password = "abcde1234!!$$";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(4 , actual);
    }

    @Test
    void testcountSpecialCharactersReturnZero(){
        // arrange
        String password = "abcde1234";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(0 , actual);
    }

    @Test
    void testcountSpecialCharactersEmptyString(){
        // arrange
        String password = "";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(0 , actual);
    }
    
    
}
