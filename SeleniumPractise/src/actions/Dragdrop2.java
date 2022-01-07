package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	      
	      WebElement capital_washinton = driver.findElement(By.id("box3"));
	     WebElement country_Unitedstates = driver.findElement(By.id("box103"));
	     
	     
	      WebElement capital_Rome = driver.findElement(By.id("box6"));
	     WebElement country_Italy = driver.findElement(By.id("box106"));
	     
	     
	      WebElement capital_seoul = driver.findElement(By.id("box5"));
	     WebElement country_SouthKorea = driver.findElement(By.id("box105"));
	     

	   dragDropActions(capital_washinton, country_Unitedstates, driver);
	    dragDropActions(capital_Rome, country_Italy, driver);
	     dragDropActions(capital_seoul, country_SouthKorea, driver);
	     
	     Thread.sleep(5000);
	     driver.quit();
	     
	     
	}
  
	public static void dragDropActions(WebElement source,WebElement target,WebDriver driver) {
		new Actions(driver).dragAndDrop(source, target).build().perform();
		
		
	}
	
	
}
