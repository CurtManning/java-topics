package week1.day2;

// Test Add Condition for the x greater than y and change the input to print it.

public class ExampleIf {

	public static void main(String[] args) {

		int x = 30;
		int y = 20;

		if (x < y) {
			System.out.println("X is less than Y ");
		}

		if (x > y) {
			System.out.println("X is greater than Y ");
		}

		if (x == y) {
			System.out.println("X is equal to Y ");
		}

		System.out.println("X = " + x + " Y = " + y);
	}

}
