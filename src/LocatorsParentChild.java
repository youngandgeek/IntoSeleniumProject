import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsParentChild {

	public static void main(String[] args) throws InterruptedException {

		//invoke the .exe of the browser driver manually or by using SeleniumManager
				
	    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//header/div/button[2]")).click();
	System.out.println(	driver.findElement(By.xpath("//header/div/button[1]")).getText());
	//System.out.println(driver.findElement(By.xpath("//header/div/button[3]/following-sibiling::button[3]")).getText());
	
	}

}
