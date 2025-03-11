package Amit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchInGoogle {
	
	
	 WebDriver driver;
	
	@Test
	public void searchG() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("dollar");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.cssSelector(".sbct.PZPZlf"));
		
		int n = list.size();
		
		System.out.println(n);
		
		for(int i = 0; i< n; i++) {
			
			if(list.get(i).getText().equalsIgnoreCase("dollar rate")) {
				list.get(i).click();
			}
		}
	   
	   driver.close();
		
	}

}
