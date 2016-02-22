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
		fail("Default Fail");
	}
	
	/* Test if the added amount is correct */
	@Test 
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		fail("Default Fail");
	}
	
	/* Test if the subtracted amount is correct */
	@Test
	public void testSub(){
		Calculator calc = new Calculator();
		calc.subtract(5);
		fail("Default Fail");
	}
	
	/* Test if the multiplied amount is correct */
	@Test
	public void testMult(){
		Calculator calc = new Calculator();
		calc.multiply(5);
		fail("Default Fail");
	}
	
	/* Test if the divided amount is correct */
	@Test
	public void testDiv(){
		Calculator calc = new Calculator();
		calc.divide(5);
		fail("Default Fail");
	}
	
	/* Test if the history is correct */
	@Test
	public void testHistory(){
		Calculator calc = new Calculator();
		calc.getHistory();
		fail("Default Fail");
	}




}
