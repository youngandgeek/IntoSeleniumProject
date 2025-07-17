import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoking browser and it's methods by creating an obj of browserDriver class
				//invoke the .exe of the browser driver manually or by using SeleniumManager
				
	      System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
			
				//add browser driver 	 
			WebDriver driver=new ChromeDriver();	
			
			/*implicitlyWait(Duration duration) sets the amount of time WebDriver waits when trying to find an element
			*if it’s not immediately available.
			*This tells WebDriver to wait up to 5 seconds for elements to appear before throwing a NoSuchElementException
			* **/
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			/*Pass the id value of the tag you want trigger from html page (or inspect in browser ) 
			*<input type="text" placeholder="Username" id="inputUsername" value="">
			*value is empty because you'll fill it 
			*you can fill fields with senKeys method
			*/
			//	<input type="text" placeholder="Username" id="inputUsername" value="">
			driver.findElement(By.id("inputUsername")).sendKeys("Eman");
			
			driver.findElement(By.name("inputPassword")).sendKeys("hello123");
			
			//if there are 2 classes choose any one
			//<button class="submit signInBtn" type="submit">Sign In</button>

			driver.findElement(By.className("signInBtn")).click();
			
			//use selectorsHub extension in chrome to check whether this css selector name is unique or not
			//this returns the error message when negative scenario
		    
			/**<p class="error" css="1">* Incorrect username or password </p>
			 * you can identify css selector by 3 diff syntax but the css selector has to be unique and used only once in this page
			 * 1-tagname.classname : Button.signinBtn
			 * 2-tagname#id : input#inputUsername
			 * 3-tagname[attribute='value'] : input[placeholder='username']
			 */
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			
			
	}

}
