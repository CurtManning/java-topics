package week2.day2.testclasses;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import week1.day4.MyLinearSearch;

public class MyLinearSearchTest {

	@Test(testName = "testlinear - key matches")
	@Parameters({"searchArray", "keyMatch", "arrayIndex"})
	public void testLinearSearchExists(String searchArray, String keyMatch, String arrayIndex ) {
	      String[] stringArray = searchArray.split(",");
	      int[] intArray = new int[stringArray.length];
	      int searchKey = Integer.parseInt(keyMatch);
	      int indexKey = Integer.parseInt(arrayIndex);
	      
	      for (int i = 0; i < stringArray.length; i++) {
	         String numberAsString = stringArray[i];
	         intArray[i] = Integer.parseInt(numberAsString);
	      }
		System.out.println("\nMyLinearSearchTest -> testLinearSearchInt ");
		int result = MyLinearSearch.linearSearch(intArray, searchKey);
		Assert.assertEquals(result, indexKey);
	}
	
	@Test(testName = "testlinear - key not matchmatching")
	@Parameters({"searchArray", "keyNoMatch", "arrayIndexNoMatch"})
	public void testLinearSearchNotExist(String searchArray, String keyNoMatch, String arrayIndexNoMatch ) {
	      String[] stringArray = searchArray.split(",");
	      int[] intArray = new int[stringArray.length];
	      int searchKey = Integer.parseInt(keyNoMatch);
	      int indexKey = Integer.parseInt(arrayIndexNoMatch);
	      
	      for (int i = 0; i < stringArray.length; i++) {
	         String numberAsString = stringArray[i];
	         intArray[i] = Integer.parseInt(numberAsString);
	      }
	      
		System.out.println("\nMyLinearSearchTest -> testLinearSearchInt ");
		int result = MyLinearSearch.linearSearch(intArray, searchKey);
		Assert.assertEquals(result, indexKey);
	}

}
