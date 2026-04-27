import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmptyString() {
        //Arrange - Set up test
        String password = "";

        //Act - Actually do the method you want to test
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert - Test if we got what we expected
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword() {
        //Arrange
        String password = "eeniemeeniemienemoe";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthMediumPasswordWithSpace() {
        //Arrange
        String password = "top dog";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("medium", actual);
    }

    @Test
    void testDescribePasswordLongerThan40CharsVeryLong() {
        //Arrange
        String password = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }

    @Test
    void testIsAlphanumericIfFalse() {
        //Arrange
        String password = "@#%$#$%@$#%@$%";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testIsAlphanumericIfTrue() {
        //Arrange
        String password = "egfw234fw";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }
}
