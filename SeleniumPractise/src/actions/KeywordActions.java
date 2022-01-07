package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordActions {

	public static void main(String[] args) {
	
		

        System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();


         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         
          Actions action = new Actions(driver);
        //  action.sendKeys(Keys.ENTER).perform();
     // action.sendKeys(Keys.TAB).perform();
              // action.sendKeys("Vasant@123").sendKeys(Keys.TAB).build().perform();
          
          action.sendKeys("Vasant@gamil.com")
        //  .pause(2)
          .sendKeys(Keys.TAB)
          .sendKeys("vasant123")
         // .pause(2)
          .sendKeys(Keys.ENTER)
          .build().perform();
          
	}

}
