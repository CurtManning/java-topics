package week2.day2.appcode;

/**
 * Add a function to the same class called check Condition that takes input of 2
 * numbers X and Y and returns String “x is less than Y” if x is less than y and
 * “X is less than or equal to Y” if X is less than or equal to Y and “X is
 * equal to Y” if X is equal to Y”.
 **/
// Test Add Condition for the x greater than y and change the input to print it.

public class ExampleIf {

	public static String checkConditionUgly(int x, int y) {
		// Deprecated: Poor initial business requirements
		String lt = "x is less than Y";
		String lteq = "X is less than or equal to Y";
		String eq = "X is equal to Y";

		String result = "";
		if (x < y) {
			result = lt + "\n" + lteq;
		}
		if (x == y) {
			result = lteq + "\n" + eq;
		}

		return result;
	}

	public static String checkCondition(int x, int y) {
		// checkCondition: replacement checkConditionUgly.
		// Initial requirements had no condition checking for x > y so we added it.
		String result = "";

		if (x < y) {
			result = "X is less than Y";
		} else if (x == y) {
			result = "X is equal to Y";
		} else if (x > y) {
			result = "X is greater than Y";
		}

		return result;
	}

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		System.out.println("***\ncheckCondition -> \n" + checkCondition(x, y));
		System.out.println("***\ncheckConditionUgly -> \n" + checkConditionUgly(x, y));
	}

}
