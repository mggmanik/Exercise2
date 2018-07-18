import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestFactorial {

    public static Factorial fact;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fact = new Factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fact = null;

    }

    @Test
    public void testIfIntFactorialSuccess()
    {
        assertEquals("Unsuccessful !",479001600,
                fact.intFactorials(1,1));
    }

    @Test
    public void testIfLongFactorialSuccess()
    {
        assertEquals("Unsuccessful !",2432902008176640000L,
                fact.longFactorials(1L,1L));
    }

}
