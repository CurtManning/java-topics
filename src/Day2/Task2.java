package Day2;

public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 99;
		int even = 2;
		int result = n % even;
		System.out.println(result);

		if (result > 0) {
			// n is odd, print Weird
			System.out.println("Weird");
		} else if (n >= 2 && n <= 5) {
			// If n is even and in the inclusive range of 2-5. print Not Weird
			System.out.println("Not Weird");
		} else if (n >= 6 && n < 20) {
			// • If n is even and in the inclusive range of 6 to 20 print Weird
			System.out.println("Weird");
		} else if (n > 20) {
			// If is even and greater than 20, print Not Weird.
			System.out.println("Not Weird");
		}

		// n=3;
		if (n % 2 == 1 || ((n % 2 == 0) && (n >= 6 && n <= 20))) {
			System.out.println(" Weird");
		}

		else {
			System.out.println(" Not Weird");
		}

	}
}
