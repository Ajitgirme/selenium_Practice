package testNGFramework;

import org.testng.annotations.Test;

public class GroupsInTestNG {

	@Test(groups={"smoke"})
	public void loginTest() {
		System.out.println("smoke Test Group");
  }
	
	@Test(groups ={"regression"})
	public void register() {
		System.out.println("regression Test Group");
		
	}
	 @Test(groups = {"sanity"})
    public void createAccount() {
		 System.out.println("sanity Test Group");
		
	}
	
}

