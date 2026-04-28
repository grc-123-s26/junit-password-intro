import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //Arrange 
        String password = "";
        //Act - method you're testing
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert (expected, actual)
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword(){
        //Arrange
        String password = "supercalifragilisticexpealidocious";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }
     @Test
    void testDescribePasswordLongerThan40charsIsVeryLong(){
        //Arrange
        String password = "qwertyuiopasdfghjklzxcvbnm,asgybugytsmodnfjyh";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }
    


    @Test
    void testDescribePasswordWorksWithPercentSign(){
        //Arrange
        String password = "ilovemydog123%"; //shouldn't work
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }

      @Test
    void testDescribePasswordWorksWithOnlyLetters(){
        //Arrange
        String password = "ilovemydog"; //should work
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }

     @Test
    void testDescribePasswordWorksWithOnlyNumbers(){
        //Arrange
        String password = "12345"; //should work
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
    }



    @Test
    void testDescribePasswordHasBsInARow(){
        //Arrange
        String password = "pubbblic"; //should work
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void testDescribePasswordDoesNotHave3BsAtTheEnd(){
        //Arrange
        String password = "public"; //shouldn't work
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }
    
     @Test
    void testDescribePasswordDoesHave2CsAtTheEnd(){
        //Arrange
        String password = "publicc"; 
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(false, actual);
    }

@Test
    void testDescribePasswordDoesHave3SpecailChars(){
        //Arrange
        String password = "passwordis!@#"; 
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(3, actual);
    }

@Test
    void testDescribePasswordDoesNotHaveSpecailChars(){
        //Arrange
        String password = "passwordis12345"; 
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(0, actual);
    }
    @Test
    void testDescribePasswordDoesHaveSpecailCharsAtBegginning(){
        //Arrange
        String password = "!@#$$passwordis12345"; 
        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //Assert
        assertEquals(5, actual);
    }

    @Test
    void testDescribePasswordDoesHaveSufficientAmountOfSpecialChars(){
        //Arrange
        String password = "!@#$$passwordis12345"; 
        int specialCharCount = 5;
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password,specialCharCount);
        //Assert
        assertEquals(true, actual);
    }

     @Test
    void testDescribePasswordDoesNotHaveSufficientAmountOfSpecialChars(){
        //Arrange
        String password = "!@#$$passwordis12345"; 
        int specialCharCount = 3;
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password,specialCharCount);
        //Assert
        assertEquals(false, actual);
    }

    @Test
    void testDescribePasswordDoesHaveSufficientAmountOfSpecialChars8(){
        //Arrange
        String password = "!pass(word)^is$12345**&"; 
        int specialCharCount = 8;
        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password,specialCharCount);
        //Assert
        assertEquals(true, actual);
    }


}

