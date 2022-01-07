package HandleiframeHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthi {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	     //  driver.get("https://the-internet.herokuapp.com/basic_auth");
	       
	       //syntex
	       
	       //http://username:password@url
	       //http://admin:admin@the-internet.herokuapp.com/basic_auth
	       
	       
	       driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); 
	        
	       
	       Thread.sleep(5000);
	     String text = driver.findElement(By.cssSelector("p")).getText();
	      
	      System.out.println(text);
	      
	      
	//   String name = driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).getText();  
	              //   System.out.println(name);
	                 driver.findElement(By.linkText("Elemental Selenium")).click();
	           	  
	           	  
	      
	      driver.quit();

	}

}
