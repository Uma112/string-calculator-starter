package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
class StringCalculatorShould {
	StringCalculator stringCalculator = new StringCalculator();

	@Test
	void empty_string_should_return_0() throws Exception {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() throws Exception {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	public void twoNumbers_Comma_Delimited_Returns_Sum() throws Exception {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	// Test 2 :handle an unknown amount of numbers
	@Test
	public void amountofNumbers_CommaDelimited_ReturnsSum() throws Exception {
		assertEquals(7, stringCalculator.add("1,2,1,3"));
	}

	// Test 3:Allow the Add method to handle new lines between numbers
	@Test
	public void Numbers_NewLine_Delimited_ReturnsSum() throws Exception {
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	// Test 4:Semi colon separator
	@Test
	public void Numbers_semicol_Delimited_ReturnsSum() throws Exception {
		assertEquals(3, stringCalculator.add("1;2"));
	}

	// Test 5: Negative number throws exception
	@Test(expectedExceptions = Exception.class)
	public void negative_Input_Returns_Exception() throws Exception {
		stringCalculator.add("-1");
	}

	// Test 6:Numbers bigger than 1000 should be ignored
	@Test
	public void Numbers_GreaterThan_1000() throws Exception {
		assertEquals(2, stringCalculator.add("2,1001"));
	}
	
	// Test 6:Numbers bigger than 1000 should be ignored
		@Test
		public void Numbers_GreaterThan_1000_10000() throws Exception {
			assertEquals(6, stringCalculator.add("1,2,9999,3"));
		}
	

}
