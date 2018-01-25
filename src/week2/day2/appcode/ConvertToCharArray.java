package week2.day2.appcode;
/**
* write  a String Method called copy() taking input as String s and copy the string to character array called cArray and return  cArray as a String
* Sample inputString ="Hello"
* cArray should be copied with "Hello" and return CArray as String
 */
public class ConvertToCharArray {

	public static String copy(String s) {
		char[] cArray = s.toCharArray();
		return String.valueOf(cArray);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString ="Hello";
		System.out.println(copy(inputString));
			
	}

}
