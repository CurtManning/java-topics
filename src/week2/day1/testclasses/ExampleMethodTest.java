package week2.day1.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import week1.day4.ExampleMethods;

public class ExampleMethodTest {

	@Test
	public void testMethod1() {
		System.out.println("\nExampleMethodTest -> testMethod1 ");
		int result = ExampleMethods.sum(10, 20);
		Assert.assertEquals(result, 30);
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
