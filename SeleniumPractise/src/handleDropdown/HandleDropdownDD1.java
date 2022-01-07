package handleDropdown;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownDD1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	        
	       driver.findElement(By.linkText("Sign Up")).click();
	       
	       
	       WebElement dob_dd = driver.findElement(By.name("birthday_day"));
	       WebElement dom_dd = driver.findElement(By.name("birthday_month"));
	       WebElement doy_dd = driver.findElement(By.name("birthday_year"));
	      
	       HandleDropdownDD1.SelectDropDownByvisibleText(dob_dd,"22");
	       HandleDropdownDD1.SelectDropDownByvisibleText(dom_dd, "Apr");
	       HandleDropdownDD1.SelectDropDownByvisibleText(doy_dd, "1989");
	      
	       Thread.sleep(5000);
	       
	       HandleDropdownDD1.SelectDropDownByIndex(dob_dd, 7);
	       HandleDropdownDD1.SelectDropDownByIndex(dom_dd, 4);
	       HandleDropdownDD1.SelectDropDownByIndex(doy_dd, 32);
	       
	       Thread.sleep(5000);
	       
	       HandleDropdownDD1.SelectDropDownByValue(dob_dd, "16");
	       HandleDropdownDD1.SelectDropDownByValue(dom_dd, "10");
	       HandleDropdownDD1.SelectDropDownByValue(doy_dd,"1991");
	       
	       Thread.sleep(5000);
	       
	       
	        driver.quit();
	       

	}
     public static void SelectDropDownByvisibleText(WebElement dropdown,String visibleText) {
    	 new Select(dropdown).selectByVisibleText(visibleText);
     }
     
     public static void SelectDropDownByIndex(WebElement dropdown,int index) {
    	 new Select(dropdown).selectByIndex(index);
    	 }
     
     public static void SelectDropDownByValue(WebElement dropdown,String value) {
    	 new Select(dropdown).selectByValue(value);
     }
     
   
      
}

