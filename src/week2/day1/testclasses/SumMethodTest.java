package week2.day1.testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import week1.day4.SumMethod;

public class SumMethodTest {
	
	
	@Test
	public void testSumMethod1() {
		System.out.println("\nSumMethodTest -> testSumMethod1");
		Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
		String result = SumMethod.sumArray(intArray);
		Assert.assertEquals(result, "1 + 2 + 3 + 4 + 5 + 6 = 21");
	}
	
	@Test
	public void testSumMethod2() {
		System.out.println("\nSumMethodTest -> testSumMethod2");
		Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
		int result = SumMethod.sumMethod(intArray);
		Assert.assertEquals(result, 21);
	}
	
	
}