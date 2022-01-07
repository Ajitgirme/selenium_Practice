package testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserationInTestNg {
	
	@Test
	public void test1() {
		System.out.println("test1()");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("test2()");
		Assert.assertTrue(false,"Excepting true but gets false");
	}
	
	@Test
	public void test3() {
		System.out.println("test3()");
		String s1="Vasant";
		String s2="vasant";
.assertEquals(s1, s2);;//fail
	}
	
	@Test
	public void test4() {
		System.out.println("test4()");
		String s1="vasant";
		String s2="vasant";
		Assert.assertEquals(s1, s2, "S1 And S2 match");//pass
	}

	@Test
	public void test5() {
		System.out.println("test5()");
		Assert.assertFalse(true,"Excepting true but gets false");
	}
		 
		 @Test
		 public void test6() {
			 System.out.println("Test6()");
			 Assert.assertFalse(false,"expected true but get false");
		 }
		 
	 }


