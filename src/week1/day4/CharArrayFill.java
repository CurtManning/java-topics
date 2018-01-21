package week1.day4;

import java.util.Arrays;

/******
 * create a empty char array of length 7 and fill the array using fill method
 * with character 'c' from 0th index to the length of the array.
 *****/

public class CharArrayFill {
	public static void main(String[] args) {
		char array[] = new char[7];

		// To fill complete array with a particular
		// value
		Arrays.fill(array, 'c');

		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}

	}

}
