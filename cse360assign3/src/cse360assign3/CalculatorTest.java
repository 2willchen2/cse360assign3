package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	/* Test if the construct is null*/
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	/* Test if the total is correct*/
	@Test
	public void testTotal() {
		Calculator calc = new Calculator();
		calc.getTotal();
		assertTrue("The getTotal returned isn't 0.",calc.getTotal() == 0);
	}
	
	/* Test if the added amount is correct */
	@Test 
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(12);
		calc.add(23);
		assertTrue("The added total doesn't sum up to 40.",calc.getTotal() ==  40);
	}
	
	/* Test if the subtracted amount is correct */
	@Test
	public void testSub(){
		Calculator calc = new Calculator();
		calc.add(40);
		calc.subtract(15);
		calc.subtract(1);
		calc.subtract(3);
		calc.subtract(2);
		assertTrue("The subtracted total doesn't euqat 19", calc.getTotal() == 19);
	}
	
	/* Test if the multiplied amount is correct */
	@Test
	public void testMult(){
		Calculator calc = new Calculator();
		calc.add(13);
		calc.multiply(2);
		calc.multiply(1);
		calc.multiply(3);
		assertTrue("The multiplied total doesn't equal 78.",calc.getTotal() == 78);
	}
	
	/* Test if the divided amount is correct */
	@Test
	public void testDiv(){
		Calculator calc = new Calculator();
		calc.add(1000);
  		calc.divide(5);
 		calc.divide(2);
 		calc.divide(10);
 		assertTrue("The divided total doesn't equal 10", calc.getTotal() ==  10);

	}
	
	/* Test if the divided by 0 is equal to 0 */
	@Test
	public void testDivZero(){
		Calculator calc = new Calculator();
		calc.add(1000);
  		calc.divide(5);
 		calc.divide(2);
 		calc.divide(0);
 		assertTrue("The divided total doesn't equal to 0", calc.getTotal() ==  0);

	}
	
	
	/* Test if the history is correct */
	@Test
	public void testHistory(){
		Calculator calc = new Calculator();
		calc.getHistory();
		fail("Default Fail");
	}




}
