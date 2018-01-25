package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import week2.day2.appcode.StringExercise;

public class StringExerciseTest {
	@Test
	public void testStringExercise() {

		String str = "The Quick BroWn FoX!";;
		System.out.println("\nExampleIfTest -> testCheckCondition - 0 ");
		String searchKey = "THE QUICK BROWN FOX!";
		String result = StringExercise.convertToUpperCase(str);
		Assert.assertEquals(result, searchKey);
	}
}
