package calculator;

class StringCalculator {

//  kata Test  --->  Unknown amount of numbers to handle
	//Total tests run: 4, Passes: 4, Failures: 0, Skips: 0

	public int add(String input) {
		String[] numbers = input.split(",");
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
		for (int current = 0; current < numbers.length; current++) {
			sum = sum + Integer.parseInt(numbers[current]);
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