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

    @Test
    void testPasswordTripleDiggitstrue(){
        //Arrange
        String password ="abcdef123456";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }
    @Test
    void testPasswordTripleDiggitsFalseNumbers(){
        //Arrange
        String password ="abcdef111111123456";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }
@Test
    void testPasswordTripleDiggitsFalseCharacter(){
        //Arrange
        String password ="aaaaabcdef123456";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

@Test
    void testPasswordTripleDiggitsRandomPlacement(){
        //Arrange
        String password ="ab1cda1ef123a14516a";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }
@Test
    void testPasswordCountingSpecialCharacterRandomPlacment(){
        //Arrange
        String password ="&4234&&Af&";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(4, actual);
    }
@Test
    void testPasswordCountingSpecialCharacterNoCharacter(){
        //Arrange
        String password ="12345abecd";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(0, actual);
    }
@Test
    void testPasswordCountingSpecialCharacterAtTheEnd(){
        //Arrange
        String password ="12345abecd*";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(1, actual);
    }
@Test
    void testPasswordCountingSpecialCharacterALotDifferent(){
        //Arrange
        String password ="!@#$%^&*()";
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(10, actual);
    }
    @Test
    void testPasswordMinimumSpecialCharacter3isminfalse(){
        //Arrange
        String password ="aa@aaabcdef@123456";
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password,3);
        //Assert
        assertEquals(false, actual);
    }
    @Test
    void testPasswordMinimumSpecialCharacter3ismintrue(){
        //Arrange
        String password ="aa@aaabc#def@12345$6";
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password,3);
        //Assert
        assertEquals(true, actual);
    }
        @Test
    void testPasswordMinimumSpecialCharacterminis0(){
        //Arrange
        String password ="aaaaabcdef123456";
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password,0);
        //Assert
        assertEquals(true, actual);
    }
}

