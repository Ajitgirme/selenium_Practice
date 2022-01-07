package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.PojoReporterConfig;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		 
		  driver.findElement(By.linkText("Forgotten password?")).click();
		  
		  Thread.sleep(5000);
		  driver.quit();
		 
	}

}

