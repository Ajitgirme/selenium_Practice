package handleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD {

	public static void main(String[] args) throws InterruptedException {
	

			System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();


		       driver.manage().window().maximize();
		       driver.get("https://www.facebook.com/");
		        
		       driver.findElement(By.linkText("Sign Up")).click();
		       
		       WebElement dob_dd = driver.findElement(By.name("birthday_day"));
		       
		       WebElement dom_dd = driver.findElement(By.name("birthday_month"));
		      
		     WebElement doy_dd = driver.findElement(By.name("birthday_year"));
		     
		       Select sel_dob = new Select(dob_dd);
		       
		       sel_dob.selectByIndex(0);
		       Thread.sleep(5000);
		       sel_dob.selectByValue("16");
		       Thread.sleep(5000);
		       sel_dob.selectByVisibleText("25");
		       
		      Thread.sleep(5000);
		       
		      Select sel_dom = new Select(dom_dd);
		      Select sel_doy = new Select(doy_dd);
		      
		      sel_dob.selectByIndex(20);
		      sel_dom.selectByVisibleText("May");
		      
		      sel_doy.selectByValue("1989");
		    
		      Thread.sleep(5000);
		      driver.quit();
		      
		     
		     
		     

	}

}
