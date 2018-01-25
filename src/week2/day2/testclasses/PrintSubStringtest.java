package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import week2.day2.appcode.PrintSubString;

public class PrintSubStringtest {

	@Test
	public void testStringExercise() {
		String str = "helloworld";
		System.out.println("\nExampleIfTest -> testCheckCondition - 0 ");
		String searchKey = "ello";
		String result = PrintSubString.printSubstring(str, 1, 5);
		Assert.assertEquals(result, searchKey);
	}
}
