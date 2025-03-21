package Amit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takescreenshots {
	
	
	
	WebDriver driver;
	
	
	@Test 
	public void takeScreenShot() throws IOException {
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("/Users/apple/Downloads/ts-1.png");
		
		
		FileUtils.copyFile(source, destination);
		
		driver.close();
	}

}
