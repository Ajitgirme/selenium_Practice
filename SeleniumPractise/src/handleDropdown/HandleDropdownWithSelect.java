package handleDropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleDropdownWithSelect {

	public static void main(String[] args) throws InterruptedException {
	
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	        
	       driver.findElement(By.linkText("Sign Up")).click();
	       
	           List<WebElement> dd_list = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
	            List<WebElement> dd_list1 = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
	            List<WebElement> dd_list2 = driver.findElements(By.xpath("//select[@name='birthday_year']/option"));
	              
	            for (WebElement webElement : dd_list1) {
			     if (webElement.getText().equals("8")) {
				  webElement.click();
				  break;
				  
				  
			  }
				
		
		}
	               
	                for (WebElement webElement : dd_list) {
	     			  if (webElement.getText().equals("May")) {
	     				  webElement.click();
	     				  break;
	     			  }
	               }
	               
	                
	                
	               for (WebElement webElement : dd_list2) {
	     			  if (webElement.getText().equals("1989")) {
	     				  webElement.click();
	     				  break;
	     			  }
	              }
	               
	               
	        Thread.sleep(5000);
	         driver.quit(); 
	}

}