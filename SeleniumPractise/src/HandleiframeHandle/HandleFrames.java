package HandleiframeHandle;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/iframe");
	       
	         List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	       
	       System.out.println(iframes.size());
	      
	     //  driver.switchTo().frame(0);
	       
	       driver.switchTo().frame("mce_0_ifr");
	       
	  //    WebElement Frameele = driver.findElement(By.xpath("//iframe[@title='Rich Text Area.press ALT-0 for help']")); some issue here
	      
	   //   driver.switchTo().frame(Frameele);
	       
	       WebElement para = driver.findElement(By.xpath("//p['text=Your content goes here']"));
	       
	       System.out.println(para.getText());
	       
	        para.clear();
	        
	        para.sendKeys("hello all");
	         Thread.sleep(5000);
	       
	         
	        driver.quit();

	}

}
