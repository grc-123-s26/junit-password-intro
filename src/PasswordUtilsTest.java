import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPasswordEmptyString() {

        //Arrange
        String password = "";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthLongPassord() {
        //range
        String password = "hellohowareyoudoingtodaygoodsir";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsVeryLong() {
        //arrage
        String password = "evjndfguhfuherguhefuhufhgsdifughasdffraehgbdfdatthgfewrthbf";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("very long", actual);
    }


    @Test
    void testPasswordIsMedium() {
        //arange
        String password = "helloismy";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("medium", actual);
    }


    @Test

    void testPasswordContainsAlphaNumericTrue() {
        //arange
        String password = "weqirj49543jt";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //assert
        assertEquals(true, actual);
    }

    @Test

    void testPasswordContainsAlphaNumericFalse() {
        //arange
        String password = "!@#%@#$%";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //assert
        assertEquals(false, actual);
    }

    @Test

    void testPasswordContainsAlphaNumericLength() {
        //arrange
        String password = "oasijehowh@";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //assert
        assertEquals(false, actual);
    }

    @Test

    void testPasswordContainsAlphaNumericLiteration() {
        //arange
        String password = "@2#uiregjofdubjnj@#@rkgm@";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //assert
        assertEquals(false, actual);
    }

    @Test

    void testPasswordContainsAlphaNumericEmpty() {
        //arrange
        String password = "";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //assert
        assertEquals(false, actual);
    }


    @Test

    void testPasswordContainsAlphaNumericTripleTrue() {
        //arrange
        String password = "hhh";
        //act
        boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertEquals(true, actual);
    }


   @Test
   
   void testPasswordContainsAlphaNumericTripleFalse() {
    //arrage
    String password = "password";
    //act
    boolean actual = PasswordUtils.containsTriple(password);
    //assert
    assertEquals(false, actual);
   }

   @Test

   void testPasswordContainsAlphaNumericTripleEnding() {
    //arrage
    String password = "password!!!";
    //act
    boolean actual = PasswordUtils.containsTriple(password);
    //assert
    assertEquals(true, actual);
   }

   @Test

void testCountSpecialCharacters() {
    //arrange
    String password = "hello!!";
    //act
    int actual = PasswordUtils.countSpecialCharacters(password);
    //assert
    assertEquals(2, actual);
}

@Test

void testCountSpecialCharactersNone() {
    //arrange
    String password = "hello123";
    //act
    int actual = PasswordUtils.countSpecialCharacters(password);
    //assert
    assertEquals(0, actual);
}

@Test

void testHasSufficientSpecialCharactersTrue() {
    //arrange
    String password = "hello!!";
    int minimum = 2;
    //act
    boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
    //assert
    assertEquals(true, actual);
}

@Test

void testHasSufficientSpecialCharactersFalse() {
    //arrange
    String password = "hello!";
    int minimum = 2;
    //act
    boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
    //assert
    assertEquals(false, actual);
}
}
