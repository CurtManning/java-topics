package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import week2.day2.appcode.ExampleIf;

public class ExampleIfTest {
	
	@Test
	public void testCheckCondition() {
		int x = 1;
		int y = 2;
		System.out.println("\nExampleIfTest -> testCheckCondition - 0 ");
		String searchKey = "X is less than Y";
		String result = ExampleIf.checkCondition(x, y);
		Assert.assertEquals(result, searchKey);
	}
	@Test(testName = "ExampleIF.testCheckConditionLess")
	@Parameters({"xLessThanY"})
	public void testCheckConditionLess(String xLessThanY) {
		String[] stringArray = xLessThanY.split(",");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println("\nExampleIfTest -> testCheckConditionLess - 1 ");
		String searchKey = "X is less than Y";
		String result = ExampleIf.checkCondition(x, y);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test(testName = "ExampleIf.TestCheckConditionEqual")
	@Parameters({"xEqualsY"})
	public void testCheckConditionEqual(String xEqualsY) {
		String[] stringArray = xEqualsY.split(",");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println("\nExampleIfTest -> testCheckConditionEqual - 2");

		String searchKey = "X is equal to Y";
		String result = ExampleIf.checkCondition(x, y);
		Assert.assertEquals(result, searchKey);
	}
	@Test(testName = "ExampleIf.testCheckConditionGreater")
	@Parameters({"xGreaterThanY"})
	public void testCheckConditionGreater(String xGreaterThanY) {
		String[] stringArray = xGreaterThanY.split(",");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println("\nExampleIfTest -> testCheckConditionGreater - 3 ");
		String searchKey = "X is greater than Y";
		String result = ExampleIf.checkCondition(x, y);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test(testName = "ExampleIF.testCheckConditionUglyLess", dependsOnMethods={ "testCheckConditionLess" }, alwaysRun=true)
	@Parameters({"xLessThanY"})
	public void testCheckConditionUglyLess(String xLessThanY) {
		String[] stringArray = xLessThanY.split(",");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println("\nExampleIfTest -> testCheckConditionUglyLess - 4 ");
		String searchKey = "x is less than Y\nX is less than or equal to Y";
		String result = ExampleIf.checkConditionUgly(x, y);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test(testName = "ExampleIf.TestCheckConditionEqual")
	@Parameters({"xEqualsY"})
	public void testCheckConditionUglyEqual(String xEqualsY) {
		String[] stringArray = xEqualsY.split(",");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println("\nExampleIfTest -> testCheckConditionUglyEqual - 5");
		String searchKey = "X is less than or equal to Y\nX is equal to Y";
		String result = ExampleIf.checkConditionUgly(x, y);
		Assert.assertEquals(result, searchKey);
	}
	@Test(testName = "ExampleIf.testCheckConditionUglyGreater")
	@Parameters({"xGreaterThanY"})
	public void testCheckConditionUglyGreater(String xGreaterThanY) {
		String[] stringArray = xGreaterThanY.split(",");
		int x = Integer.parseInt(stringArray[0]);
		int y = Integer.parseInt(stringArray[1]);
		System.out.println("\nExampleIfTest -> testCheckConditionUglyGreater - 6 ");
		String searchKey = "";
		String result = ExampleIf.checkConditionUgly(x, y);
		Assert.assertEquals(result, searchKey);
	}


}