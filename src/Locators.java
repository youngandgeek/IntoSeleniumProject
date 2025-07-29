import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
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
			 * 1-tagname.classname > Button.signinBtn
			 * 2-tagname#id > input#inputUsername
			 * 3-tagname[attribute='value'] > input[placeholder='username']
			 */
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			//click the forget password text link
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			//so selenium waits for page to slide 
            Thread.sleep(1000);
			
			//xpath syntax, the attribute(id,name,placeholder) and its value should be unique : //tagtype[@attribute='value']  <input type="text" placeholder="Name">
			/**you can search the xpath in console|selectorhub to see if it's unique or not
			by entering $x('//tag@attr="val"]') or if it's css selector remove x > $("attrb='value']") **/
			
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("lama");

		//			//driver.findElement(By.xpath(//input[@placeholder='Phone Number])).sendKeys("01088377744");

           driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("lama@gmail.com");
	
            driver.findElement(By.xpath("//form/input[3]")).sendKeys("01088377744");
			//driver.findElement(By.className("forgot-pwd-btn-conainer")).click();
			
            Thread.sleep(1000);
			driver.findElement(By.className("reset-pwd-btn")).click();
            
            Thread.sleep(3000);

           System.out.println(driver.findElement(By.cssSelector("p.infoMsg")));
           
            
			/**you can identify a tag with same tags names with xpath by passing the index number **Not Ideal**
			 * if you have 3 inputs name,email,password and you want the second 
			 *<input type="text" placeholder="Email">
			 * "//tagname[@attrbname='value'][index no]"			*/
	 
			//.clear clears the input u entered in text field   
			//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			
           //or you can use xpath comibination with paretnt-to-child and index syntax
         /**
          * <div class="forgot-pwd-btn-conainer">
          * <button class="go-to-login-btn">Go to Login</button>
          * <button class="reset-pwd-btn">Reset Login</button></div>
          * //  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]"));
          */
         driver.findElement(By.className("go-to-login-btn")).click();
          
          Thread.sleep(2000);
			driver.findElement(By.id("inputUsername")).sendKeys("eman");

			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
			
	          
	          driver.findElement(By.id("chkboxOne")).click();
	          Thread.sleep(1000);

	          driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
