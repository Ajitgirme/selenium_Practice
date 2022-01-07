package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterfaceCommands {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.instagram.com/");
	       
	       
	       driver.findElement(By.name("username")).sendKeys("ajit");
	       
	     //  System.out.println("Display status:"+searchstore.isDisplayed());
	       //System.out.println("Enabled status:"+searchstore.isEnabled());
	       
	}
	      

}

