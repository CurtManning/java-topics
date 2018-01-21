package week1.day2;

public class ExampleWhile {

	public static void main(String[] args) {
		int a = -10;

		while (a <= 0) {
			System.out.println("The x value " + a);
			a++;
		}
		System.out.println("*********************");
		//write a while loop to generate the following sequence.
		//2,4,6,8,10,12,14,16,18,20,22,24,26,28,30		
		int x = 2;

		while (x <= 30) {
			System.out.println("The x value " + x);
			x+=2;
		}
	}
	
}
