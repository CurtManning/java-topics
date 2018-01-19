package Day2;

public class ArrayExcersize {
	public static void main(String[] arguments) {
		double[] a = {10.5, 12.5, 13.5, 15.6};
		for(double temp:a){
			System.out.println(temp);
		}
		int[] x=new int[5];
		//assign the values later.
		x[0]=10;
		x[4]=60;
		for(int temp1:x){
			System.out.println(temp1);
		}
	}
}
/*
1.Create an array to hold following 5 values using 
and print the values.
10.5,12.5,13.5,15.6.

2.initialize an empty integer array of 5 values and assign 10,60 in positions 0,5 respectively.
*/