package testNGFramework;

import org.testng.annotations.Test;

public class PriotiseTestInTestNG {
	
	@Test(priority=1)
	public void LoginTest() {
		System.out.println("login Test");
	}
		
		
	@Test(priority=2)
		public void CreateAccountTest() {
		
		System.out.println("createAccountTest");
		}
		
		@Test(priority=3)
		public void UpdateAccountTest() {
		
		System.out.println("updateAccountTest");
		}
		    
		@Test(priority=4)
		public void LogoutTest() {
			System.out.println("logoutTest");
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
