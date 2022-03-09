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
 * @author Kevin Halliwell
 *
 */
public class BankAccountTest {
	
	private BankAccount instance;

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
		instance = new BankAccount();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/*
	 * Tests the get interest rate method
	 */
	@Test
	public void getInterestRateTest() {
		double result = instance.getInterestRate();
		assertTrue(0 <= result && result <= 15);
		//fail("Interest rate is outside of the accepted values!");
	}
	
	/*
	 * Tests the get account type method
	 */
	@Test
	public void getAccountTypeTest() {
		int result = instance.getAccountType();
		assertTrue(0 <= result && result <= 5);
		//fail("Account type is outside of the accepted values!");
	}
	
	/*
	 * Tests the get account number method
	 */
	@Test
	public void getAccountNumberTest() {
		String result = instance.getAccountNumber();
		String result2 = "None";
		assertEquals(result2, result);
	}
	
	/*
	 * Tests the get balance method
	 */
	@Test
	public void getBalanceTest() {
		double result = instance.getBalance();
		assertTrue("Passed!", result >= 0);
	}
}
