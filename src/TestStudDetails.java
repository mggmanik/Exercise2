import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudDetails {

    public static StudDetails sd;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sd = new StudDetails();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sd = null;

    }

    @Test
    public void testIfAvg()
    {
        int[] a = {23,67,45,67};
        assertEquals("Unsuccessful !",50.5,
                sd.avg(4,a),0.0);

    }

    @Test
    public void testIfMin()
    {
        int[] a = {23,67,45,67};
        assertEquals("Unsuccessful !",23,
                sd.min(4,a));

    }

    @Test
    public void testIfMax()
    {
        int[] a = {23,67,45,67};
        assertEquals("Unsuccessful !",67,
                sd.max(4,a));

    }
}
