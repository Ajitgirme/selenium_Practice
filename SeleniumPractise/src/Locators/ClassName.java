package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
	
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  
		   driver.findElement(By.className("_8esh")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.quit();
		   }


		

}
