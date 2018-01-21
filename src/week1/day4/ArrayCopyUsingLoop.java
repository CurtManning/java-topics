package week1.day4;
/**
* Exercise: instead of copying from 0 to 7, 
* change the program to copy from  original string starting from 4 and ending at  9.
**/
public class ArrayCopyUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 4;
		int c = (a - 1) - (b - 1);

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[c];
		
		for (int i = 0; i < copyTo.length; i++) {
			copyTo[i] = copyFrom[i];
		}
		
		for(char ch: copyTo) {
			System.out.println("The CopyTo " +ch);
		}

	}

}