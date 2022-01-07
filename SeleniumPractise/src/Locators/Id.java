package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
	    driver.manage().window().maximize();
	    driver.get("https://www.orangehrm.com/");
	    
	    driver.findElement(By.id("myText")).sendKeys("Admin@12345");
	    
	    driver.findElement(By.className("home-tril-email-btn")).click();
	    
	    driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("Ajit");
	    driver.findElement(By.id("Form_submitForm_Name")).sendKeys("sonu girme");
	    
	   // driver.findElement(By.id("Form_submitForm_Email")).sendKeys("Admin@12345");
	    driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("8421265154");
	    driver.findElement(By.id("Form_submitForm_Country")).sendKeys("India");
	    driver.findElement(By.className("FormsubmitForm_State")).sendKeys("Maharashtra");
	    driver.findElement(By.id("Form_submitForm_action_request")).click(); 
	    
	   Thread.sleep(10000);
	    
	    driver.close();
	    
	    
	    
	    
	    
	    
	   //driver.findElement(null)
	   // driver.findElement(By.id("Form_submitForm_action_request")).click()
	    
	    driver.quit();
	    }

}
