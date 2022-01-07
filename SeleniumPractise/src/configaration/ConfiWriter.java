package configaration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfiWriter {

	public static void main(String[] args) throws Exception {
		
		File fs = new File("./config/prop.properties");
		
		Properties Prop = new Properties();
		
	     Prop.setProperty("Firstname","Ajit");
	      
	     Prop.setProperty("Lastname","Girme");
	     
	     Prop.setProperty("Location","Saswad");
	    FileOutputStream fos = new FileOutputStream(fs);
	    
	    Prop.store(fos, "Test Data");
	    
	    fos.close();
	    
  
	}

}
