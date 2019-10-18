

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PayMethodTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PayMethodTest
{
    /**
     * Default constructor for test class PayMethodTest
     */
    @Test
    public void PayMethod(){
        PayMethod payMethodTest1 = new PayMethod();
        
        assertEquals("Kris 215.00 10.75 204.25", payMethodTest1.sampleMethod("Kris", 21.5, 10.0, 0.05));
     
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
