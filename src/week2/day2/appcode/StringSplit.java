package week2.day2.appcode;

public class StringSplit {

	public static void main(String[] args) {

		String Str = new String("Welcome-to-java.com");
		System.out.println("Return Value :");
		String[] splits = Str.split("-");
		System.out.println(splits[0]);
		System.out.println(splits[1]);
		System.out.println("************");

		for (String retval : Str.split("-")) {
			System.out.println(retval);
		}
	}

}
