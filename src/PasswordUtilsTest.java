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
}
