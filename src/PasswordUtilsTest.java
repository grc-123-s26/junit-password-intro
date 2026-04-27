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

    //Test isAlphanumeric()
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

    @Test
    void testIsAlphanumericSpecialCharacterAtTheEnd() {
        //Arrange
        String password = "egfw234fw!";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

    //Test containsTriple()
    @Test
    void testContainsTripleContains3InARow() {
        //Arrange
        String password = "paaasword";
        //Act
        Boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testContainsTripleContainsMoreThan3InARow() {
        //Arrange
        String password = "paasssssssword";
        //Act
        Boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testContainsTripleContainsLessThan3InARow() {
        //Arrange
        String password = "paasword";
        //Act
        Boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testContainsTripleContainsEmptyString() {
        //Arrange
        String password = "";
        //Act
        Boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

    //Test countSpecialCharacters()
    @Test
    void testCountSpecialCharactersEmptyString() {
        //Arrange
        String password = "";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(0, actual);
    }

    @Test
    void testCountSpecialCharacters5Characters() {
        //Arrange
        String password = "efewf8#$jhf#fi**";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(5, actual);
    }

    @Test
    void testCountSpecialCharactersNoSpecialCharacters() {
        //Arrange
        String password = "hurtg39hgofdihg390";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(0, actual);
    }
}
