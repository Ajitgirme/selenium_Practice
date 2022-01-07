package HandleiframeHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumbasic.NavigateCommands;

public class HandleFrames1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/iframe");
	   
	       
	       System.out.println(driver.findElement(By.linkText("Elemental Selenium")).getText());
	       
	   List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
	   
	   System.out.println(iframe.size());
	   
	   driver.switchTo().frame("mce_0_ifr");
	   WebElement para = driver.findElement(By.xpath("//p['text()=Your content goes here']"));
	   
	   System.out.println(para.getText());
	   
	   driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Elemental Selenium")).click();
	  
	  
	  
	  Thread.sleep(5000);
	   
	   driver.quit();
	   

	}

}
