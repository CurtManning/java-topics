package week1.day3;

public class BasicMathDemo {
	public static void main(String[] arguments) {
		
		double a = -191.635;
		double b = 43.74;
		int c = 16, d = 45;
		
		// Returns the absolute value of the argument.
		System.out.printf("The absolute value " + "of %.3f is %.3f%n", a, Math.abs(a));
		
		// Returns the smallest integer that is greater than or equal to the argument.
		// Returned as a double.
		System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(a));
		
		// Returns the largest integer that is less than or equal to the argument.
		// Returned as a double.
		System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));
		System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));
		System.out.printf("The min of %d " + "and %d is %d%n", c, d, Math.min(c, d));

	}
}
