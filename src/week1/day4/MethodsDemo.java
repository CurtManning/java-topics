package week1.day4;

public class MethodsDemo {

	public static void printArray(Integer[] input) {
		for (Integer element : input) {
			System.out.printf("%d ", element);
			System.out.println();
		}
	}

	public static void printArray(Double[] inputArray) {
		for (Double element : inputArray) {
			System.out.printf("%s ", element);
			System.out.println();
		}
	}

	public static void printArray(Character[] charArray) {
		for (Character element : charArray) {
			System.out.printf("%s ", element);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6, };
		Double[] doubleArray = { 1.1, 2.2222, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] charArray = { 'a', 'b', 'c', 'd' };

		System.out.println("Array integerArray contains:");
		printArray(integerArray);

		System.out.println("Array doubleArray contains:");
		printArray(doubleArray);

		System.out.println("Array charArray contains:");
		printArray(charArray);

	}

}
