package week2.day3.appcode;

public class isLetter {

	public static void main(String[] args) {
		// char,int,double are wrapers
		//Character - char
		//Double - double
		//Integer - int
		
		char ch1 = 'b';
		
		
		
		//boxing
		Character ch2= ch1;
		Character ch='a';
		
		//unboxing
		char ch3= ch2;
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.isLetter('5'));
		

	}

}
