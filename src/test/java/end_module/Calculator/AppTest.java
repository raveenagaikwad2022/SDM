package end_module.Calculator;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@Test
	public void testSum() {
		// Given
		App calculator = new App();
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		App calculator = new App();
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		App calculator = new App();
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		App calculator = new App();
		calculator.divide(6, 0);
	}

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return (Test) new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
