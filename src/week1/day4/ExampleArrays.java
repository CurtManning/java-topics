package week1.day4;

public class ExampleArrays {
	// Inefficient
	static int a = 10;
	static int b = 20;

	public static int sum(int a1, int b1) {
		int result = a1 + b1;
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println("result = : " + sum(a,b));
	}

}
