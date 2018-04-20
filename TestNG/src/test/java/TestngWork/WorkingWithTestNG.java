package TestngWork;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTestNG {
	
	@BeforeTest
	 public void BeforeAll() {
   	 System.out.println("BeforeAll");
    }
	
	@BeforeMethod
	public void beforeEachTest() {
		System.out.println("Just Before");
	}
	@Test(dependsOnMethods= {"secondTestNGTest"}, alwaysRun=true)
     public void firstTestNGTest() {
    	 System.out.println("First TestNG");
     }
     
	@Test(timeOut=3000, enabled=true)
     public void secondTestNGTest() {
    	 System.out.println("Second TestNG");
     }
	
	@Test(groups="special")
	public void specialTest() {
		System.out.println("Special Test");
	}
}
