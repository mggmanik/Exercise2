import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMemberDetails {

    public static MemberVariable mv;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        mv = new MemberVariable("Manik Gupta",23,2500.3);

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        mv = null;
    }

    @Test
    public void testMemberDetails()
    {
        assertEquals("Unsuccessful !","Manik Gupta 23 2500.3",
                mv.memberDetails());
    }
}
