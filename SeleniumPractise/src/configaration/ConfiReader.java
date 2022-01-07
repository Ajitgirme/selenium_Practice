package configaration;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfiReader {

	public static void main(String[] args) throws IOException {
		
		
		File fs = new File("./config/config.properties");
		
		FileInputStream fis = new FileInputStream(fs);
		
	       Properties prop = new Properties();
	       
	       prop.load(fis);
	       
	      String url = prop.getProperty("url");
          
	      System.out.println(url);
	      
  String uname = prop.getProperty("username");
          
	      System.out.println(uname);
	      
	      
  String pas = prop.getProperty("password");
          
	      System.out.println(pas);
	}

}
