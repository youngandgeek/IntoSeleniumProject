import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
//this is complete login forgetpassword re-login logout flow 
	public static void main(String[] args) throws InterruptedException {

	      System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");

			
				//add browser driver 	 
			WebDriver driver=new ChromeDriver();	
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			String password= getPassword(driver);
			

			driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
			driver.findElement(By.id("inputUsername")).sendKeys("Eman");
			
			driver.findElement(By.name("inputPassword")).sendKeys("password");
		
	          Thread.sleep(2000);


			driver.findElement(By.className("signInBtn")).click();
			
		
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			//click the forget password text link
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			//so selenium waits for page to slide 
            Thread.sleep(2000);
			
            
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("lama");


           driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("lama@gmail.com");
	
            driver.findElement(By.xpath("//form/input[3]")).sendKeys("01088377744");
			
         //   Thread.sleep(1000);
            
            Thread.sleep(3000);

    
         driver.findElement(By.className("go-to-login-btn")).click();
          
          Thread.sleep(2000);
			driver.findElement(By.id("inputUsername")).sendKeys("eman");
			driver.findElement(By.name("inputPassword")).sendKeys(password);
			
	          
	          driver.findElement(By.id("chkboxOne")).click();
	          Thread.sleep(1000);

	          driver.findElement(By.xpath("//button[@type='submit']")).click();

	          Thread.sleep(2000);

				driver.findElement(By.xpath("//*[text()='Log Out']")).click();

				driver.close();
	          
	}
	public static String getPassword(WebDriver driver) throws InterruptedException{
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//so selenium waits for page to slide 
        Thread.sleep(1000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();

		String passwordText= driver.findElement(By.cssSelector("form p")).getText();
//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray = passwordText.split("'");
	    
		String password=passwordArray[1].split("'")[0];

		
		return password;
		
		
	}

}
