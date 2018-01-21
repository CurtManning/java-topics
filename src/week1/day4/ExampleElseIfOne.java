package week1.day4;

public class ExampleElseIfOne {
	public static void main(String[] args) {

		int x = 30;
		int y = 40;

		if (x < y) {
			System.out.println("X is less than Y ");
		} else if (x == y) {
			System.out.println("X is equal to Y ");
		} else if (x > y) {
			System.out.println("X is greater than Y ");
		} else {
			System.out.println(" This should never run ");
		}

	}

}