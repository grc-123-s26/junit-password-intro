import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmptyString() {
        //Arrange
        String password = ""; 
        //Act
       String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword(){
        //Arrange
        String password ="eeniemeeniemienemoe";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40CharsIsVeryLong(){
        //Arrange
        String password ="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }
@Test
    void testPasswordAlphanumericTrueCase(){
        //Arrange
        String password ="abcdef123456";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }
@Test
    void testPasswordAlphanumericFalseCase(){
        //Arrange
        String password ="&*()%&$+_)!@#$%^&*()_";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }
    @Test
    void testPasswordAlphanumericEndletter(){
        //Arrange
        String password ="abcdef123456*";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }

}
