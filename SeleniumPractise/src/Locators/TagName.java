package Locators;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       
	       
	  //   driver.findElement(By.partialLinkText("UK")).click();
	       

      List<WebElement> list_a = driver.findElements(By.tagName("a"));
         int totallink = list_a.size();
         System.out.println("toatal num of link on facebook page are: "+totallink);
         
	}

}

