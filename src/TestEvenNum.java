import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEvenNum {

    public static EvenNumTest ent;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        ent = new EvenNumTest();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        ent = null;

    }

    @Test
    public void testIfIsEven()
    {
        assertEquals(
                "Unsuccessful ! Not an even number",true
                , ent.isEven(64));

        assertEquals(
                "Unsuccessful ! Not an even number",true
                , ent.isEven(6));
    }
}
