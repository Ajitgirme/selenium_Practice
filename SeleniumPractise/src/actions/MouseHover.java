package actions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\driver2\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://opensource-demo.orangehrmlive.com/");
	       
	       
	       driver.findElement(By.id("txtUsername")).clear();
	       
	       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	       
	       driver.findElement(By.id("txtPassword")).clear();
	       
	       driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	       
	       driver.findElement(By.id("btnLogin")).click();
	       
	 
	       
	      WebElement Adminmenu = driver.findElement(By.id("menu_admin_viewAdminModule"));
	      
	    WebElement usermanagement = driver.findElement(By.id("menu_admin_UserManagement"));
	     WebElement viewsystemUsres = driver.findElement(By.id("menu_admin_viewSystemUsers"));
	     
	     
	     Actions action = new Actions(driver);
	     
	     action.moveToElement( Adminmenu).
	     moveToElement(usermanagement).
	     
	     moveToElement(viewsystemUsres).
	     click().build().perform();

	}

}

