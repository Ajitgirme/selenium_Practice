package testNGFramework;

import org.testng.annotations.Test;



public class TestNGTestDefaultExecutionOrder {

	@Test
	public void LoginTest() {
		System.out.println("loginTest");
	}
		
		
		@Test
		public void CreateAccountTest() {
		
		System.out.println("createAccountTest");
		}
		
		@Test
		public void UpdateAccountTest() {
		
		System.out.println("updateAccountTest");
		}
		    
		@Test
		public void LogoutTest() {
			System.out.println("logoutTest");
			
			
		}

}
