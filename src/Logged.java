import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Logged {

	public static void main(String[] args) throws InterruptedException {

		//invoke the .exe of the browser driver manually or by using SeleniumManager
				
	    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//add browser driver 	 
		//	WebDriver driver=new ChromeDriver();	
			
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String username="eman";
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");

			driver.findElement(By.id("inputUsername")).sendKeys(username);

			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
			
	          
	          driver.findElement(By.id("chkboxOne")).click();
	          Thread.sleep(1000);

	          driver.findElement(By.xpath("//button[@type='submit']")).click();
	          Thread.sleep(2000);

	          driver.findElement(By.tagName("p")).getText();
	         
      //check if 2 values are matching exactly(actual,expected)        
	          
	   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+username+",");	}
}