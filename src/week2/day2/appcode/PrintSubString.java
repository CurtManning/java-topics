package week2.day2.appcode;
/**
 *
 * Given a string S and two indices. Start  and end , write a method to print a substring consisting of all characters in the inclusive range from start to end-1 . You'll find the String class' substring method helpful in completing this challenge. 
Input Format
Sample input 
 s=”helloworld” 
start=3
end=7
write the test code for this.
 *
 */
public class PrintSubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		int start = 1;
		int end = 5;
		System.out.println(" The substring is :" + str);
		System.out.println(printSubstring(str,start,end));
		
		
	}
	public static String printSubstring(String s, int start, int end) {
		return s.substring(start,end);
	}

}
