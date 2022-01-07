package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;



public class SeleniumFirst {

	public static void main(String[] args) {

	      System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	
	     WebDriver driver=new ChromeDriver();
	     
	     
	      
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	  try {
		  Thread.sleep(3000);
		  
	} catch (Exception e) {
		System.out.println(e);
	}
	      
		   
	      

	     
	  
	      
	      String pTitle = driver.getTitle();
	       System.out.println(pTitle);
	       
	       
	       
	       
	       String crrUrl = driver.getCurrentUrl();
	       System.out.println(crrUrl);
	       
	       String pageSource = driver.getPageSource();
	       System.out.println(pageSource);
	      
	       //driver.close();
	      
	       
	       driver.quit();
	       
	       
	       
	         
	       
	       
	       
	      
	      
	      
	      
	}

}

