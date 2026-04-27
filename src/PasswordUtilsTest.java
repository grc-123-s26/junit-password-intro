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
    void testIsAlphamericTrue(){
        // arrange
        String password = "abcd1234";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testiIsAlphamericFalse(){
        // arrange
        String password = "abcd1234!";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(false , actual);
    }

    @Test
    void testIsAlphamericEmptyString(){
        // arrange
        String password = "";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testContainsTripleTrue(){
        // arrange
        String password = "paaassword";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testContainsTripleFalse(){
        // arrange
        String password = "paassword";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(false , actual);
    }

    @Test
    void testContainsTripleEmptyString(){
        // arrange
        String password = "";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(false , actual);
    }

    @Test
    void testCountSpecialCharactersReturnInt(){
        // arrange
        String password = "abcde1234!!$$";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(4 , actual);
    }

    @Test
    void testCountSpecialCharactersReturnZero(){
        // arrange
        String password = "abcde1234";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(0 , actual);
    }

    @Test
    void testCountSpecialCharactersEmptyString(){
        // arrange
        String password = "";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(0 , actual);
    }

    @Test
    void testHasSufficientCharactersReturnTrue(){
        // arrange
        String password = "helloworld!!!";
        int min = 3;

        // act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, min);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testHasSufficientCharactersReturnFalse(){
        // arrange
        String password = "helloworld";
        int min = 5;

        // act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, min);

        // assert
        assertEquals(false , actual);
    }
    
    @Test
    void testHasSufficientCharactersEmptyStringTrue(){
        // arrange
        String password = "";
        int min = 0;

        // act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, min);

        // assert
        assertEquals(true , actual);
    }

    @Test
    void testHasSufficientCharactersEmptyStringFalse(){
        // arrange
        String password = "";
        int min = 10;

        // act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, min);

        // assert
        assertEquals(false , actual);
    }
    
}
