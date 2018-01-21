package week1.day3;

public class ExampleArrays {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 40 };

		System.out.println(a[2] + " " + a[3]);
		System.out.println("*****");

		for (int temp : a) {
			System.out.println(temp);
		}
		
		// creating an empty array with default values.
		int[] x = new int[5];
		// assign the values later.
		x[3] = 25;
		x[0] = 10;
		System.out.println("-------------------------");
		for (int temp2 : x) {
			System.out.println(" print " + temp2);
		}

	}
}
