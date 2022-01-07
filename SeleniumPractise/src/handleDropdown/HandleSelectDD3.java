package handleDropdown;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandleSelectDD3 {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\girme\\OneDrive\\Desktop\\selenium\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();


	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	        
	       driver.findElement(By.linkText("Sign Up")).click();
	       
	       
	      WebElement dom_dd = driver.findElement(By.name("birthday_month"));
	      
	     Select Select = new Select(dom_dd);
	      List<WebElement> dd_list = Select.getOptions();
	      int total_month = dd_list.size();
	    		  System.out.println("total number of month:"+total_month);
	    		  
	    	//	 for (int i = 0;i<total_month; i++) {
	    		//	   String month = dd_list.get(i).getText();
	    		//	   System.out.println("Month is: "+month);
	    			   
	    		//	  if (month.equals("May")) {
	    		//	      dd_list.get(i).click();
	    		//		   break;
						
	    		//		}
					  
					
	    		//		}
	       
	    		//  for (WebElement webElement : dd_list) {
					// String month = webElement.getText();
					 //System.out.println(month);
					 //if (month.equals("Jun")) {
						// webElement.click();
						 //break;
	    		  
				//	}
						 

			//	}
					 
					 
					 
			Iterator<WebElement> itr = dd_list.iterator();
			while(itr.hasNext()) {
				WebElement month = itr.next();
				System.out.println(month.getText());
				 if (month.getText().equals("feb")) {
					month.click();
					break;
					
				}
					
				}
				
			}

	}


