package BeginingSelenium.FirstSelenium;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayAutomationPart2 {
	 @BeforeClass
	    public static void config(){
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Students\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    }
	 
	 @Test
	 public void ebayTest2() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.ebay.com");
		 WebElement el=driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		 List<WebElement> elList = el.findElements(By.tagName("a"));
		 
		for(WebElement subEl:elList) {
			if(subEl.isDisplayed()) {
				System.out.println(subEl.getText());
			}
		} 
		
		List<WebElement> li = el.findElements(By.tagName("a"));
		for(WebElement subEl:li) {
			if(subEl.isDisplayed()&&(subEl.getText().startsWith("E")||subEl.getText().startsWith("e"))){
				   System.out.print(subEl.getText());
			}		
			}
		
		 Thread.sleep(3000);
		 driver.close();
				 
				 
	 }
}
