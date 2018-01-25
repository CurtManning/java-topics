package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import week1.day4.MyLinearSearch;

public class ParallelLinearSearch {

	@Test(testName = "testlinear - searchKey exists")
	@Parameters({"searchArray", "key", "arrayIndex"})
	public void testLinearSearchExists(String searchArray, String key, String arrayIndex ) throws InterruptedException {
	      String[] stringArray = searchArray.split(",");
	      int[] intArray = new int[stringArray.length];
	      int searchKey = Integer.parseInt(key);
	      int indexKey = Integer.parseInt(arrayIndex);
	      Thread.sleep(5000);
	      for (int i = 0; i < stringArray.length; i++) {
	         String numberAsString = stringArray[i];
	         intArray[i] = Integer.parseInt(numberAsString);
	      }
		System.out.println("\nMyLinearSearchTest -> testLinearSearchInt ");
		int result = MyLinearSearch.linearSearch(intArray, searchKey);
		Assert.assertEquals(result, indexKey);
	}


}
