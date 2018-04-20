package BeginingSelenium.FirstSelenium;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAutomation {
	 @BeforeClass
	    public static void config(){
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Students\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    }
	 
	 @Test
	 public void ebayTest() throws InterruptedException {
		 WebDriver driver = new ChromeDriver(); 
		 //driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.ebay.com/");
		 
		 WebElement el = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		 int count=el.findElements(By.tagName("a")).size();
		 System.out.println(count);
		 int Entirecount=driver.findElements(By.tagName("a")).size();
		 System.out.println(Entirecount);
		 
		 List<WebElement> elList = driver.findElements(By.tagName("a"));
		 
		 for(WebElement li:elList) {
			 System.out.println(li.getText());
		 }
		 
		 driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[2]/a")).click();
		 int counterID=driver.findElements(By.xpath("//div[@id='something']")).size();
		 
     		driver.findElement(By.xpath("//div[@id='something']")).isDisplayed();
     		
     		 System.out.println("Found"+counterID);
		 Thread.sleep(3000);
		 driver.close();
	 }
}
