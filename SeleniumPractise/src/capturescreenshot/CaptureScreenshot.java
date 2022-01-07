package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       
	       //for Full page Screenshot
	      
	   /*  File Screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     FileUtils.copyFile(Screenshotfile,new File("./Screenshot/screen.png"));*/
	    
	       
	       
	       
	       
	       
	       
	       
	    driver.close();

	}

}
