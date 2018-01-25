package week2.day2.testclasses;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="checkCondition")
	public Object[][] getData() {
		return new Object[][] {
			{"X is less than Y", "10","20"},
			{"X is less than Y", "10","800"},
			{"X is less than Y", "-1", "1"},
			{"X is greater than Y", "100","20"},
			{"X is greater than Y", "1000","800"},
			{"X is greater than Y", "-1", "-1100"},
			{"X is equal to Y", "1", "1"},
			{"X is equal to Y", "65", "65"},
			{"X is equal to Y", "8000001", "8000001"}
		};
		
		
	}
	@DataProvider(name="checkConditionUgly")
	public Object[][] getDataUgly() {
		return new Object[][] {
			{"x is less than Y\nX is less than or equal to Y", "10","20"},
			{"x is less than Y\nX is less than or equal to Y", "10","800"},
			{"x is less than Y\nX is less than or equal to Y", "-1", "1"},
			{"", "100","20"},
			{"", "1000","800"},
			{"", "1", "-1"},
			{"X is less than or equal to Y\nX is equal to Y", "10","10"},
			{"X is less than or equal to Y\nX is equal to Y", "800","800"},
			{"X is less than or equal to Y\nX is equal to Y", "-1", "-1"}
		};
		
		
	}
}
