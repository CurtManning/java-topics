package week1.day3;

public class LoopsExercise {
	/**
	 * Given an integer, n print its first 10 multiples. Each multiple should be
	 * printed on a new line in the form: n x i = result.
	 */
	public static void main(String[] args) {

		int n = 2;
		for (int i = 1; i <= 10; i++) {
			System.out.format("%d x %d = %d%n", n, i, n * i);
		}
	}

}
