package Amit;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiUserUsingHashMap {
	
	
	WebDriver driver;
	
	
	@Test
	public void LoginUser() {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("student", "Password123");
		map.put("Amit", "Password123");
		map.put("Jess", "Password123");
		map.put("Kris", "Password123");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		
		driver.close();
	}
	

}
}
