package calculator;

class StringCalculator {

//  kata Test  ---> semi colon separator
	// Total tests run: 6, Passes: 6, Failures: 0, Skips: 0

	private final String delimiter = ",|\n|;";

	public int add(String input) {
		String[] numbers = input.split(delimiter);
		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return stringToInt(input);
		}
		return getSum(numbers);
	}

	private int getSum(String[] numbers) {
		int sum = 0;
		for (String current : numbers) {
			sum = sum + Integer.parseInt(current);
		}
		return sum;
	}

	private boolean isEmpty(String input) {
		return input.isEmpty();

	}

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}