package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RalativeXpath {

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
       
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       
       driver.findElement(By.xpath("")).click();
     //  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ajit@12345");
      // driver.findElement(By.xpath("//input[@id='continue']")).click();
       
       Thread.sleep(5000);
     
       
       driver.quit();
       
       

	}

}

//*[@id="navbtn_exercises"]/html/body/div[7]/a[4]


//html/body/div[3]/a[3]    