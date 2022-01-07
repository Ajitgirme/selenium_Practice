package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.navigate().to("https://www.amazon.in/");
		  
		 
		  
		 driver.navigate().back();
		  Thread.sleep(5000);
		 driver.navigate().forward();
		 
		  Thread.sleep(5000);
		 driver.navigate().refresh();
		 
		 
		 driver.close();
		 
		  
		  

	}

}
