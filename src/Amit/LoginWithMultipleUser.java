package Amit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginWithMultipleUser {
	WebDriver driver;
    public LoginWithMultipleUser() { }

	public LoginWithMultipleUser(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="submit")
	WebElement submit;
       
	@DataProvider(name="loginData")
	public Object[][] Data(){
		
		return new Object[][] {
			{"student", "Password123"},
			{"Amit", "Password123"},
			{"Rakib", "Password123"},
			{"Jess", "Password123"}
		};
	}
	 
	
	
	
	@Test(dataProvider="loginData")
	public void Login(String userName, String Password) {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		PageFactory.initElements(driver, this);
		
		user.sendKeys(userName);
		pass.sendKeys(Password);
		submit.click();
		
		
		driver.close();
		
		
	}
	
	
}
