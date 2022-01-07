package handleAlertpopup;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAlert1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	       
	       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    
	       if (isAlertPresent(driver)) {
	    	   
	    	 Alert alert = driver.switchTo().alert();
	    	   
	    	   System.out.println(alert.getText());
			   alert.accept();
			   
		}
         driver.quit();
	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	
	
		
	}

}
