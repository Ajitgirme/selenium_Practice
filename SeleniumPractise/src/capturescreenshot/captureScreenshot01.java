package capturescreenshot;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class captureScreenshot01 {
	

	

	public static void main(String[]args) throws InterruptedException, IOException {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();


       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       
       captureScreenshot(driver,"facebook_login");
       
       driver.findElement(By.name("email")).sendKeys("vasant@123$");
       
       captureScreenshot(driver,"facebook_login1");
       
       driver.findElement(By.name("pass")).sendKeys("admin123");
       captureScreenshot(driver,"facebook_login2");
       
       driver.findElement(By.name("login")).click();
        captureScreenshot(driver,"facebook_login3");
        
        
        
        Thread.sleep(5000);
        driver.quit();
	}

	public static void captureScreenshot(WebDriver driver, String screenshotname) throws IOException {
		
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	 FileUtils.copyFile(src,new File ("./Screenshot/"+screenshotname+System.currentTimeMillis()+"scre.png"));
	}

}
