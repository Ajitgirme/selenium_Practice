package testNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DDTestInTesrNG {

	@Test(dataProvider = "testdata")
	public void getdata(Object name,Object id,Object sal) {
		
		System.out.println(name+" "+id+" "+sal);
	}
	
	
		
		@DataProvider(name ="testdata")
		public Object[][] testdata() {
			
			Object[][] data = new Object[2][3];
			
			data[0][0]="ajit";
			data[0][1]="123";
		    data[0][2]="456.42f";
					
					
		   data[1][0]="vishal";
		   data[1][1]="458";
		   data[1][2]="145.6f";
		             
		   
		   return data;
		}
		
		
		
		
		
		@Test(dataProvider = "preparetestdata")
		public void createtest(String name1,String name2, String name3) {
			
			System.out.println(name1+" "+name2+" "+name3);
		}
		
		@DataProvider
		public Object[][] preparetestdata() {
		Object[][]data= {{"ajit","mayur","sachin"},{"avinash","santosh","Raju"}};
		return data;
		}
}