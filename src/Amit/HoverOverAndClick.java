package Amit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverOverAndClick {
	
	WebDriver driver;
	
	
	@Test
	public void HoverOver() {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://www.amazon.in/stores/page/FB61ADA2-F77A-413C-97C9-BB74C754829D?channel=Search_store_AMZ&gad_source=1&gclid=CjwKCAiAiOa9BhBqEiwABCdG8zIevHaOfufPyX14JFHBTyjP7y6em22GMbUwI1vQAgQoNOl9Q5KYBhoCuQoQAvD_BwE");
	
	    Actions a = new Actions(driver);
	    
	  WebElement button =  driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    
	    a.moveToElement(button).build().perform();
	    
	    driver.findElement(By.xpath("(//span[@class='nav-action-inner'][normalize-space()='Sign in'])[1]")).click();
	    
	    
	    driver.close();
	
	
	}
	

}
