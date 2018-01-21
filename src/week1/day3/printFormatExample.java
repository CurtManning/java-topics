package week1.day3;

public class printFormatExample {

	public static void main(String[] args) {
		int i = 4602;
		double d=0.9;
		
		System.out.format("The value of i using format: %d%n" , i); 
		System.out.format("The value of f using format: %f%n" , d);
		System.out.format("The value of f using format with " 
				+ "rounding: %.2f%n", d); 
		System.out.printf("The value of i using printf: %d%n" , i); 
		System.out.printf("The value of f using printf: %f%n" , d); 
		System.out.printf("The value of f using printf: %.2f" , d); 


	}

}
