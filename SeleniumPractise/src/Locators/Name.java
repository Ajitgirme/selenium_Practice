package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
	
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.name("email")).sendKeys("vasant@gamil.com");
		  driver.findElement(By.name("pass")).sendKeys("vasant@123$");
		  driver.findElement(By.name("login")).click();
		  
		  Thread.sleep(10000);
		  driver.quit();
	}

}
