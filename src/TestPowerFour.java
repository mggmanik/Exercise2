import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPowerFour {

    public static CheckPower cp;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        cp = new CheckPower();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        cp = null;

    }

    @Test
    public void testCheckPowerOfFour() {

        assertEquals(
                "Unsuccessful ! Not a power of four",true
                , cp.isPowerOfFour(64));

        assertEquals(
                "Unsuccessful ! Not a power of four",true
                , cp.isPowerOfFour(16));

    }
}
