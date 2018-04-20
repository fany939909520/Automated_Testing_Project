package TestngWork;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Programs {
    @DataProvider
    public Object[][] data(){
    	Object[][] obj= {
    			{"Luke"},{"Mike"}
    			
    	};
    	
    	return obj;
    	
    }
    
    @Test(dataProvider="data")
    public void Tester(String name) 
    {
    	System.out.println(name);
    }
}
