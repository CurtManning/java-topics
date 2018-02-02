package week2.day1.appcode;

public class ExampleMethod {
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
