package week1.day2;

public class ExampleFor {

	public static void main(String[] args) {

		// i++
		// i=i+1
		// for(initialValue;condition;increment/decrement)

		for (int i = 2; i <= 20; i += 2) {
			System.out.println(" i = " + i);
		}

		// change the program to generate the following sequence
		// 10,9,8,7,6,5,4,3,2,1,0

		for (int i = 10; i >= 0; i--) {
			System.out.println(" i= " + i);
		}

	}

}
