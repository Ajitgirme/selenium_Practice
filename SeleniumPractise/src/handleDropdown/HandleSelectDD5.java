package handleDropdown;

import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectDD5 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	        
	       driver.findElement(By.linkText("Sign Up")).click();
	       
	       String month_dd = "//select[@name='birthday_month']/option";
	       String day_dd = "//select[@name='birthday_day']/option";
	       String year_dd = "//select[@name='birthday_year']/option";
	       
	       selectDropdown(driver,month_dd,"May");
	       selectDropdown(driver,day_dd,"31");
	       selectDropdown(driver,year_dd,"1965");
	       
	       Thread.sleep(5000);
	       driver.quit();
	    }
	   
	     public static void selectDropdown(WebDriver driver,String xpath,String selectvalue) { 
	     
	       List<WebElement> dd_list = driver.findElements(By.xpath(xpath)); 
           for (WebElement ele : dd_list) {
		    String year = ele.getText();

		    if (year.equals(selectvalue)) {
				ele.click();
				break;
			}
	}

	     }
}