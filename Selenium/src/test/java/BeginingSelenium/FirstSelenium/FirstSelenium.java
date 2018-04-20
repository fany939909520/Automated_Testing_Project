package BeginingSelenium.FirstSelenium;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.not;

public class FirstSelenium {
	    @BeforeClass
	    public static void config(){
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Students\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    }
	    
        @Test
        public void firstSeleniumTest() throws InterruptedException {
        	
        	String username="Biron";
        	String password="myPassword";
        	String expected=" ";
        	String actual=" ";
        	WebDriver driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.facebook.com/");
        	
        	
        	//expected = driver.getTitle();
        	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        	//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
        	//driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
        	//actual = driver.getTitle();
        	//assertThat(expected, not(equalTo(actual)));
        	
        	//expected = driver.getTitle();
            //driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys(username);
        	//driver.findElement(By.xpath("//input[id='u_0_g']")).sendKeys(password);
        	//driver.findElement(By.xpath("//input[@id='u_0_w']")).click();
        	//actual = driver.getTitle();
        	//assertThat(expected, not(equalTo(actual)));
        	
        	WebElement el= driver.findElement(By.xpath("//select[@id='month']"));
        	Select sel=new Select(el);
        	sel.selectByIndex(2);
        	
        	el= driver.findElement(By.xpath("//select[@id='day']"));
        	sel=new Select(el);
        	sel.selectByIndex(29);
        	
        	Thread.sleep(3000);
        	driver.close();
        	
        	
        	
        }
}
