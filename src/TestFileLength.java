import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestFileLength {

    public static  ReadFileContents rfc;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        rfc = new ReadFileContents();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        rfc = null;
    }

    @Test
    public void testForFileLength() throws IOException {
        assertEquals(
                "Unsuccessful !", 575
                , rfc.fileHandle("/home/manik/Desktop/test"));
    }

}
