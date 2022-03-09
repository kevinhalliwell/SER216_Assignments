package Week6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {
	
	/*
	 * Variables used in testing
	 */
	private MagicSquare instance;
	int tmpArray[] = new int[] {8,1,6,3,5,7,4,9,2};
	int appearanceTmpArrayFail[] = new int[] {8,1,6,3,5,7,4,8,2}; //Should cause the duplicate value method to fail
	int firstDiagTmpArrayFail[] = new int[] {8,1,6,3,5,7,4,9,0}; //Should cause the first diagonal and the rows to fail
	int secondDiagTmpArrayFail[] = new int[] {8,1,6,3,5,7,0,9,2}; //Should cause the second diagonal and the columns to fail

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance = new MagicSquare();
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * Checks the input for the error check method. 
	 * Also touches the square root method.
	 */
	@Test
	public void inputTest() {
		//valid test proper number of inputs.
		int num = 9;
		int zero = 0;
		instance.setSize(num);
		assertEquals(zero, instance.errorCheck(instance.getSize(), instance.squareRoot(instance.getSize())), zero);
	}
	
	/*
	 * Causes the program to fail.
	 */
	@Test
	public void inputTestFail() {
		//failing test improper number of inputs. sqrt of 10 is not a whole number.
		int num = 10;
		int zero = 0;
		instance.setSize(num);
		assertEquals(zero, instance.errorCheck(instance.getSize(), instance.squareRoot(instance.getSize())), zero);
	}
	
	/*
	 * Checks for duplicate values in the input array.
	 */
	@Test
	public void appearanceTest() {
		assertTrue(instance.duplicateValues(tmpArray));
	}
	
	/*
	 * Inputs a duplicate value in the array. Expected to fail.
	 */
	@Test
	public void appearanceTestFail() {
		assertTrue(instance.duplicateValues(appearanceTmpArrayFail));
	}
	
	/*
	 * Checks the first diagonal from the top left value to bottom right value.
	 */
	@Test
	public void firstDiagSumTest(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.firstDiagonal(tmpArray);
		assertEquals(sum, rowSum, 0);
	}
	
	/*
	 * Checks the first diagonal from the top left value to bottom right value. Expected to fail.
	 */
	@Test
	public void firstDiagSumTestFail(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.firstDiagonal(firstDiagTmpArrayFail);
		assertEquals(sum, rowSum, 0);	
	}
	
	/*
	 * Checks the first diagonal from the top right value to the bottom left value. 
	 */
	@Test
	public void secondDiagSumTest(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.secondDiagonal(tmpArray);
		assertEquals(sum, rowSum, 0);	
	}
	
	/*
	 * Checks the first diagonal from the top right value to the bottom left value. Expected to fail.
	 */
	@Test
	public void secondDiagSumTestFail(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.secondDiagonal(secondDiagTmpArrayFail);
		assertEquals(sum, rowSum, 0);	
	}
	
	/*
	 * Checks the rows from top to bottom.
	 */
	@Test
	public void RowSumTest(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.rows(tmpArray);
		assertEquals(sum, rowSum, 0);	
	}
	
	/*
	 * Checks the rows from top to bottom. Expected to fail.
	 */
	@Test
	public void RowSumTestFail(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.rows(firstDiagTmpArrayFail);
		assertEquals(sum, rowSum, 0);	
	}
	
	/*
	 * Checks the columns from left to right.
	 */
	@Test
	public void columnSumTest(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.columns(tmpArray);
		assertEquals(sum, rowSum, 0);	
	}
	
	/*
	 * Checks the columns from left to right. Expected to fail.
	 */
	@Test
	public void columnSumTestfail(){
		instance.setSize(tmpArray.length);
		double total = instance.getSize();
		double totalSqRt = instance.squareRoot(total);
		double sum = instance.sum(total, totalSqRt);
		double rowSum = instance.columns(secondDiagTmpArrayFail);
		assertEquals(sum, rowSum, 0);	
	}

}

