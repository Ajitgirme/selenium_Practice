package handleDropdown;

import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootsrapDD2 {

	public static void main(String[] args) throws InterruptedException {
		

		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("file:///C:/Users/girme/OneDrive/Desktop/boottrap.html");
	       
	       
	       driver.findElement(By.xpath("//button[@type='button']")).click();
	      
	       
		     List<WebElement> dd_list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		     HandleBootsrapDD(dd_list,"Gmail");
		     
		     Thread.sleep(5000);
		      driver.quit();
		  
}
          public static void HandleBootsrapDD(List<WebElement>list,String selectvalue) {
        	   for (WebElement ele:list) {
    	          if (ele.getText().equals(selectvalue)) {
    		          ele.click();
    		          break;
			
    	 }

	}

          }
}
