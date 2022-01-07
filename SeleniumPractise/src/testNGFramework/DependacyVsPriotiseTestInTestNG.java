package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependacyVsPriotiseTestInTestNG {

	@Test(priority = 1)
	public void test1() {
		System.out.println("Test1");
		Assert.assertTrue(false);
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("Test3");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test3"})
	public void test4() {
		System.out.println("Test4");
		Assert.assertTrue(true);
	}
}
