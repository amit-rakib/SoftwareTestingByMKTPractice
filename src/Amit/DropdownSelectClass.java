package Amit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownSelectClass {
	
	WebDriver driver;
	
	
	@Test
	public void dropdown() throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(drop);
		
		// Select By Index
		
		//select.selectByIndex(5);
		
		// Select By Value
		
	//	select.selectByValue("search-alias=baby-products-intl-ship");
		
		// Select By Visible Text
		
		select.selectByVisibleText("Deals");
		
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
