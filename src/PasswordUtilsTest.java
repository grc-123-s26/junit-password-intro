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
}
