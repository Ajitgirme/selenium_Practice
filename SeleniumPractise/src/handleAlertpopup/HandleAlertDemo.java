package handleAlertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	       
	       driver.findElement(By.name("proceed")).click();
	       

           Thread.sleep(5000);
	       
	       Alert Alert = driver.switchTo().alert();
	       
	       System.out.println(Alert.getText());
	       
	       Alert.accept();
	    
           Thread.sleep(5000);
	    
             driver.quit();
	}

}
