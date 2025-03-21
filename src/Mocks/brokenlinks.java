package Mocks;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenlinks {
	
	WebDriver driver;
	
	
	@Test
	public void broken() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		List<WebElement> links = footer.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			link.sendKeys(Keys.COMMAND,Keys.ENTER);
		}
		
		Set<String> windows = driver.getWindowHandles();
		   Iterator<String> it = windows.iterator();
		   String parent = it.next();
		   
		   while(it.hasNext()) {
			String child = it.next();
			   driver.switchTo().window(child);
			  String title = driver.getTitle();
			  System.out.println(title);
		   }
		   
		   driver.switchTo().defaultContent();
		   driver.quit();
		
	}

}
