package MainPackage;

import junit.framework.TestCase;

public class CCheckTest extends TestCase {
		
	public void testSum1() {
		
		assertEquals("Sum1 Should Yield to 37",37,CheckDigit.evenDigits("4388576018402626"));
		
	}
	
	public void testSum2() {
		
		assertEquals("Sum2 should Yield to 38",38,CheckDigit.oddDigits("4388576018402626"));
		
	}
	
	public void testSumOfBothSums() {
		
		assertEquals("Sum1 + Sum2 Must Yield to 75",75,CheckDigit.sumOfBothSums());
		
	}
	
	public void testcreditCardValidation() {
		
		assertEquals("Credit Card Must be INVALID [false]",false,CheckDigit.creditCardValidation());
		
	}
		
}