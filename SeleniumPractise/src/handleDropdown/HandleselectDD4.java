package handleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleselectDD4 {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();


		       driver.manage().window().maximize();
		       driver.get("https://www.facebook.com/");
		        
		       driver.findElement(By.linkText("Sign Up")).click();
		       
		       
		      WebElement dom_dd = driver.findElement(By.name("birthday_month"));
		      WebElement dob_dd = driver.findElement(By.name("birthday_day"));
		      
		      HandleselectDD4.SelectDropDownvalue(dom_dd,"jun");
		      HandleselectDD4.SelectDropDownvalue(dom_dd,"Apr");
		      HandleselectDD4.SelectDropDownvalue(dom_dd,"Mar");
		      
		      HandleselectDD4.SelectDropDownvalue(dob_dd,"23");
		      Thread.sleep(5000);
		      driver.quit();
		      
		     
	}

	private static void SelectDropDownvalue(WebElement dropdown, String month) {
		List<WebElement> list_dd = new Select(dropdown).getOptions();
		for(WebElement element:list_dd) {
			if(element.getText().equals(month)) {
				System.out.println(month);
				element.click();
				break;
			}
		}
		
	}

}
