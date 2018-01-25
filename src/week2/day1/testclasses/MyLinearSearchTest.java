package week2.day1.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import week1.day4.MyLinearSearch;

public class MyLinearSearchTest {

	@Test(testName = "testlinear - searchKey exists")
	public void testLinearSearchInt() {
		System.out.println("\nMyLinearSearchTest -> testLinearSearchInt ");
		int[] arr1 = { 23, 45, 21, 55, 34, 1, 34, 90 };
		int searchKey = 34;
		int result = MyLinearSearch.linearSearch(arr1, searchKey);
		Assert.assertEquals(result, 4);
	}

	@Test(testName = "testlinear - searchKey does not exist")
	public void testLinearSearchArray() {
		System.out.println("\nMyLinearSearchTest -> testLinearSearchArray ");
		int[] arr1 = { 23, 45, 21, 55, 34, 1, 34, 90 };
		int searchKey = 65;
		int result = MyLinearSearch.linearSearch(arr1, searchKey);
		Assert.assertEquals(result, -1);
	}

}
