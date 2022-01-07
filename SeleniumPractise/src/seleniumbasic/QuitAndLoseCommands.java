package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitAndLoseCommands {

	public static void main(String[] args) throws InterruptedException  {


		 System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
	
		 // System.setProperty("webdriver.gecko.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\geckodriver.exe");
		 // WebDriver driver= new FirefoxDriver();
		  
		//  System.setProperty("webdriver.edge.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\msedgedriver.exe");
		  //WebDriver driver= new EdgeDriver();
				
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();	
		
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(5000);
		  driver.quit();
				  
				 
	}

}
