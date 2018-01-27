package week2.day3.appcode;

/**
 * Write a method called splitString() that takes input as "Welcome:to-java.com-hello:world" and splits by the delimiter "-" and method returns array of Strings.
 * sample input:"Welcome:to-java.com-hello:world" 
 * output will be array of 3 Strings Str1=Welcome:to, Str2=java.com Str3=hello:world
 */
public class StringDemo {
	
	
	public static int searchString(String inputString, String searchString) {
		return inputString.indexOf(searchString);
	}
	
	public static String[] splitString(String input) {
		//Write a Java program to convert all the characters in a string to uppercase
		String inputString = "Hello Readers";
		String searchString = "Hello";
		System.out.println(searchString(inputString, searchString));
		
		String[] array = input.split("-");
		return array;
	}
	
	public static void main(String[] args) {
		
		String input = "Welcome:to-java.com-hello:world";
		String[] output = splitString(input);
		
		for (String item : output) { 
			System.out.println(item);
		}
	}
}
