package week1.day4;

import java.util.*;

public class ArrayFill {
	
	public static void main(String[] args)
    {
		
        int array[] = new int[6];
        
        // To fill complete array with a particular
        // value
        Arrays.fill(array, 100);
 
		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}
		System.out.println("***");
		
		// fill (int[] a, int fromIndex, int toIndex, int val)
        Arrays.fill(array, 3,6,50);
		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}
    }

}
