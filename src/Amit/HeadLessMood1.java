package Amit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessMood1 {
	
	
	WebDriver driver;
	
	
	@Test
	public void headlessMood() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
	}

}
