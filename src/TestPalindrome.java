import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPalindrome {

    public static CheckPalindrome cp;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        cp = new CheckPalindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        cp = null;

    }

    @Test
    public void testCheckIfPalindromeSuccess() {

        assertEquals(
                "Unsuccessful ! It should be a string",
                "manam", cp.checkIfPalindrome("manam"));

        assertEquals(
                "Unsuccessful ! It should be a number",
                "12321", cp.checkIfPalindrome("12321"));

    }

    @Test
    public void testCheckIfPalindromeFailure() {

        assertNotEquals(
                "Unsuccessful !",
                "manan", cp.checkIfPalindrome("manam"));

        assertNotEquals(
                "Unsuccessful !",
                "1232",cp.checkIfPalindrome("12321"));

    }



}
