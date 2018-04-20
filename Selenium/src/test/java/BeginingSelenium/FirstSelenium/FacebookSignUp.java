package BeginingSelenium.FirstSelenium;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
	 @BeforeClass
	    public static void config(){
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Students\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    }
	 
	 
	 @Test
	 public void signUpTest() throws InterruptedException {
		 
		 WebDriver driver = new ChromeDriver(); 
		 //driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.facebook.com/");
		 Select sel=null;
		 driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("Biron");
		 WebElement el1=driver.findElement(By.xpath("//input[@name='lastname']"));
		 WebElement el2=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		 WebElement el3=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		 
		
     	
		 el1.sendKeys("23131");
		 el2.sendKeys("fanyy@wesw");
		 el3.sendKeys("fanyang712@hotmail.com");
		 
		 WebElement el4= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 sel=new Select(el4);
		 sel.selectByIndex(2);
		 
		 WebElement el5= driver.findElement(By.xpath("//select[@name='birthday_day']"));		
         sel=new Select(el5);
	     sel.selectByIndex(28);
	     
	     WebElement el6= driver.findElement(By.xpath("//select[@name='birthday_year']"));		
         sel=new Select(el6);
	     sel.selectByVisibleText("2008");
	     
	    WebElement el7 = driver.findElement(By.xpath("//input[@id='u_0_b']"));

		el7.click();

		WebElement el8 = driver.findElement(By.xpath("//button[@name='websubmit']"));
		el8.submit();
		 Thread.sleep(3000);
		 driver.close();
		 
		 		
	 }
}
