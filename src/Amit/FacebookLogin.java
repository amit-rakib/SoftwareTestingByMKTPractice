package Amit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class FacebookLogin {
	
	WebDriver driver;
	
	
	@BeforeTest() 
	@Parameters("browser")

	public void initilise(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if(browser.equals("edge")) {
			driver = new EdgeDriver();

		}		
		
		driver.get("https://www.facebook.com/login.php/");
		
	}
	
	
	@Test
	public void login() {
		
		driver.findElement(By.id("email")).sendKeys("amit@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.id("loginbutton")).click();
		
	}
	
	
	@AfterTest
	public void Quite() {
		driver.close();
	}
	
	

}
