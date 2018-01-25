package week2.day2.appcode;

public class RemoveCharAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Healo is Java";
		String subStr=str.substring(0,5);
		System.out.println(" The substring is " + subStr);
		System.out.println(removeCharAt(str,3));
		
		
	}
	public static String removeCharAt(String s, int pos) {
		return s.substring(0,pos) + s.substring(pos + 1);
	}

}
