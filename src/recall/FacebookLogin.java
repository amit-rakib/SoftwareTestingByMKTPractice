package recall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	
	
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters("Browser")
	public void initate(String browser) {
		
		if(browser.equals("chrome") ) {
			driver = new ChromeDriver();
		}
		if(browser.equals("firefox") ) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void Test1() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("loginbutton"));
		
		
		email.sendKeys("amit@gmail.com");
		pass.sendKeys("12345");
		login.click();
		
		
	}
	
	
	@AfterTest
	public void teardown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
	

}
