package Amit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takeScreenshot {

	WebDriver driver;

	@Test
	public void screenshot() throws IOException {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("/Users/apple/Downloads/googleScreenshot.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.close();

	}

}
