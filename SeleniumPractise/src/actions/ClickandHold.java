package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args) {
		

	
        System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();


         driver.manage().window().maximize();
         driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
  
        WebElement capital_washintong = driver.findElement(By.id("box3"));
         WebElement country_Unitedstates = driver.findElement(By.id("box103"));
         
         
         Actions action = new Actions(driver);
       //  action.clickAndHold(capital_washintong).release(country_Unitedstates).build().perform();
 
    action.clickAndHold(capital_washintong).moveToElement(country_Unitedstates).release().build().perform();
    
    
    driver.quit();
 
 
}
	
}