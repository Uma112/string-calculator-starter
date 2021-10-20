package calculator;

class StringCalculator {

//  kata Test  ---> Numbers bigger than 1000 should be ignored
	// Total tests run: 8, Passes: 8, Failures: 0, Skips: 0
	
//	Ignore all the numbers between 1000 and 10000
//	Input: “1,2,9999,3” output: 6
//	Input: “//[;]\n1000;2000;3000;10000” output: 11000

	private final String delimiter = ",|\n|;";

	public int add(String input) throws Exception {
		String[] numbers = input.split(delimiter);
		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return stringToInt(input);
		}
		
		return getSum(numbers);
	}

	private int getSum(String[] numbers) throws Exception {
		checkNegativeNumber(numbers);
		int sum = 0;
		for (String current : numbers) {
			if (stringToInt(current) > 1000) {
				continue;
			}
			sum = sum + stringToInt(current);
		}
		return sum;
	}

	private void checkNegativeNumber(String[] numbers) throws Exception {
		for (String current : numbers) {
			if (stringToInt(current) < 0) {
				throw new Exception("negatives not allowed");
			}
		}

	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}