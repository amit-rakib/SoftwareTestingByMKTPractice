package Amit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessMood {

    @DataProvider(name = "Search")
    public Object[][] data(){
    	
    	return new Object[][] {
    		{"Amit"},
    		{"Jess"},
    		{"hello"}
    	};
    	
    }
    
    
    
    @Test(dataProvider="Search")
    public void  SeachGoogle(String text) {
    	
    	
    	// HeadLess Mood
    	ChromeOptions options = new ChromeOptions();
    	
    	options.addArguments("--headless");
    	
    	
    	WebDriver driver = new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    	
    	driver.get("https://www.google.co.uk/");
    	
    	WebElement inputField = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    	inputField.sendKeys(text, Keys.ENTER);
    	
    	driver.close();
    	
    }
}
