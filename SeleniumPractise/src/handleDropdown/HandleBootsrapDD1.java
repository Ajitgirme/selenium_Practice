package handleDropdown;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootsrapDD1 {

	public static void main(String[] args) throws InterruptedException {
		

			
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();


		       driver.manage().window().maximize();
		       driver.get("file:///C:/Users/girme/OneDrive/Desktop/boottrap.html");
		       
		       
		       driver.findElement(By.xpath("//button[@type='button']")).click();
		      
		      // driver.findElement(By.xpath("//a[text()='facebook']")).click();
		       
		       
		       
		     List<WebElement> dd_list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		     
		     for (WebElement ele: dd_list) {
		    	 if (ele.getText().equals("Yahoo")) {
		    		 ele.click();
		    		 break;
					
				}
				
			}
		  
		     Thread.sleep(5000);
		     driver.quit();
		  
	}
                
}
