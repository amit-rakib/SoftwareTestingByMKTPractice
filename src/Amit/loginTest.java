package Amit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest {
	
	WebDriver driver;
	
	
	@DataProvider(name="users")
	public Object[][] Data(){
		
		return new Object[][] {
			{"student", "Password123"},
			{"user1", "123456"},
			{"user2", "user123"},
			{"user3", "hello123"},
		};
	}
	
	
	@Test(dataProvider="users")
	public void multiUserLoging(String user, String password) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
