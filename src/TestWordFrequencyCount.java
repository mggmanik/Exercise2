import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWordFrequencyCount {

    public static WordFrequencyCount wfc;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        wfc = new WordFrequencyCount();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wfc = null;

    }

    @Test
    public void testForNumberOfWords()
    {
        assertEquals("Unsuccessful !",11,
                wfc.countWordFrequency("/home/manik/Desktop/FileDemo.txt"));
    }
}
