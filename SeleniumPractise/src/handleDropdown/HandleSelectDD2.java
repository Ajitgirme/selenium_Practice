package handleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD2 {

	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\geckodriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	        
	       driver.findElement(By.linkText("Sign Up")).click();
	       
	       
	       WebElement dob_dd = driver.findElement(By.name("birthday_day"));
	       
	       Select Select = new Select(dob_dd);
	      WebElement before_select = Select.getFirstSelectedOption();
	     String before_Select_month = before_select.getText();
	     System.out.println("Already selected month= "+before_Select_month);
	     
	     Select.selectByIndex(5);
	     
	    WebElement after_select = Select.getFirstSelectedOption();
	  String after_Select_month = after_select.getText();
	       System.out.println("after selected month= "+after_Select_month);
	       
	       
	      

	}

}
