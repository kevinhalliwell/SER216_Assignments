/**
 * 
 */
package Week3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author kevinhalliwell
 *
 */
public class CustomerTest {
	private Customer instance;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		instance = new Customer();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests the displayAddress method
	 */
	@Test
	public void displayAddressTest() {
		assertNotNull("Address is not null", instance.displayAddress());
	}

	/**
	 * Tests the displayAddressLabel method
	 */
	@Test
	public void displayAddressTestLabel() {
		assertNotNull("Address Label is not null", instance.displayAddressLabel());
	}
}
