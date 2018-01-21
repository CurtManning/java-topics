package week1.day2;

public class ExampleAndOr {

	public static void main(String[] args) {
		
		// && is and
		// || is or
		
		int x=10;
		int y=-10;
		
		 if (x > 0 && y > 0) {
			 System.out.println(" Both numbers are positive");
		 } else if (x > 0 || y > 0) {
			 System.out.println(" One number is only positive");
		 } else if (x < 0 && y < 0) {
			 System.out.println(" Both are negative numbers");
		 } else if (x == 0 && y == 0) {
			 System.out.println(" Both numbers are 0");
		 }

	}

}
