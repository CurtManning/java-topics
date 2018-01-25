package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import week2.day2.appcode.ConvertToCharArray;

public class ConvertToCharArrayTest {
	@Test
	public void testCopyStrings() {
	
		System.out.println("\ntestCopyStrings -> copy ");
		String searchKey = "Hello";
		String result = ConvertToCharArray.copy(searchKey);
		Assert.assertEquals(result, searchKey);
	}
}
