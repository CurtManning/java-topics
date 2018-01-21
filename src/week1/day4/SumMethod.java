package week1.day4;

/**
* Write a method call sumArray() that takes integer Array 
* as argument and computes the sum of the numbers and returns
* the string "1 + 2 + 3 + 4 + 5 + 6 = 21"
* you can call this method from main()
* the input integer array will be like this
* Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
* 1+2+3+4+5+6 =21 and 21 will be output
**/
public class SumMethod {

	public static String sumArray(Integer[] input) {
		int sum = 0;
		String returnString = "";

		for (int in : input) {
			if (sum != 0) {
				returnString = returnString + " + " + in;
			} else {
				returnString = returnString + in;
			}
			sum = sum + in;
		}

		return returnString + " = " + sum;
	}

	public static int sumMethod(int x, int y) {
		return (x + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
		int a = 2;
		int b = 4;
		System.out.println("The Output is " + sumMethod(a, b));
		System.out.println(sumArray(intArray));

	}

}
