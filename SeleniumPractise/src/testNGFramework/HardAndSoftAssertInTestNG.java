package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HardAndSoftAssertInTestNG {
	 
	@Test
	public void hardAssert() {
		System.out.println("hardAssert()");
		Assert.assertTrue(true);
		System.out.println("statement after hard assert()pass");
		
		Assert.assertTrue(false);
		System.out.println("statement after hard assert() fail");
		
		
	}
    @Test
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softassert()");
		softAssert.assertTrue(true);
		System.out.println("statement after softassert pass");
		
		softAssert.assertTrue(false);
		System.out.println("statemenet after softassert fail");
		
		softAssert.assertAll();
		
	}
}
