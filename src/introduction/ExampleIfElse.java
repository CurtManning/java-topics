package introduction;

public class ExampleIfElse {
	public static void main(String[] args) {

		int x = 30;
		int y = 30;

		if (x < y) {
			System.out.println("X is less than Y ");
		} else if (x <= y) {
			System.out.println("X is Less than or equal to Y ");
		} else if (x >= y) {
			System.out.println("X is greater than or equal to Y ");
		} else {
			System.out.println(" This should never run ");
		}

	}

}
