package Amit;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestionInSearch {
	
	
	
	@Test
	public void autoSearch() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("In");
		Thread.sleep(2000);
		 List<WebElement> elements = driver.findElements(By.cssSelector(".ui-menu-item"));
		 
//		int n = elements.size();
//		System.out.println(n);
//		elements.get(n-2).click();
		
		 for(WebElement i : elements) {
			 if(i.getText().equalsIgnoreCase("China")) {
				 i.click();
			 }
		 }
		 
		
		Thread.sleep(2000);
		driver.close();
		 
	}

}
