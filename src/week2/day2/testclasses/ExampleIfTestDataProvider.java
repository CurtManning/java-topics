package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import week2.day2.appcode.ExampleIf;

public class ExampleIfTestDataProvider {

	@Test(testName = "ExampleIF.testCheckConditionLess", dataProvider="checkCondition", dataProviderClass=TestData.class)
	public void testCheckCondition(String searchKey, String strX, String strY) {
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		System.out.println("\nExampleIfTest -> x = " + strX + ": y = " + strY + " " + searchKey );
		String result = ExampleIf.checkCondition(x, y);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test(testName = "ExampleIF.testCheckConditionLess", dataProvider="checkConditionUgly", dataProviderClass=TestData.class)
	public void testCheckConditionUgly(String searchKey, String strX, String strY) {
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		System.out.println("\nExampleIfTest -> x = " + strX + ": y = " + strY + " " + searchKey );
		String result = ExampleIf.checkConditionUgly(x, y);
		Assert.assertEquals(result, searchKey);
	}

}
