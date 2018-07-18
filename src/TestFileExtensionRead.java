import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFileExtensionRead {

    public static FileExtensionRead fer;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fer = new FileExtensionRead();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fer = null;

    }

    @Test
    public void testIfFileNameExists()
    {
        assertEquals("Unsuccessful !",new String[] {"test.html"},
                fer.listOfFiles("/home/manik/Desktop/TestFolder"));
    }
}
