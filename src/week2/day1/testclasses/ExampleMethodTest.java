package week2.day1.testclasses;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import week1.day4.ExampleMethods;

public class ExampleMethodTest {

	@Test
	@Parameters({"sumstring"})
	public void testMethod1(String sumstring) {
		String[] stringArray = sumstring.split(",");
		int answer = Integer.parseInt(stringArray[0]);
		int a = Integer.parseInt(stringArray[1]);
		int b = Integer.parseInt(stringArray[2]);
		System.out.println("\nExampleMethodTest -> testMethod1 ");
		int result = ExampleMethods.sum(a, b);
		Assert.assertEquals(result, answer);
	}

	@Test
	public void testMethod2() {

		System.out.println("ExampleMethodTest -> testMethod2");
	}

	@Test
	public void testMethod3() {

		System.out.println("ExampleMethodTest -> testMethod3");
	}

}
