package week1.day3;

/**
 * Given an integer, n perform the following conditional actions: • If n is odd,
 * print Weird • If n is even and in the inclusive range of 2-5. print Not Weird
 * • If n is even and in the inclusive range of 6 to 20 print Weird • If is even
 * and greater than 20, print Not Weird. Sample Input: 3 Output: Weird. Input:
 * 24 Output: Not weird.
 **/
public class Task2 {

	public static void main(String[] args) {

		//  n=3;
		int n = 24;
		
		if (n % 2 == 1 || ((n % 2 == 0) && (n >= 6 && n <= 20))) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}

	}
}
