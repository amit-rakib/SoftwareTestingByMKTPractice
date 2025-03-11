package Amit;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.bytebuddy.description.field.FieldList.Explicit;

public class hdfcBankAutomation {

	// for Inspect Press Command+option+i

	WebDriver driver;

	@Test
	public void hdfcBankTest() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		
		// I thought it was an alert but later found out that it was a browser based popup
		// So i disabled  it 
		
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");

		
		Actions ac = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("(//button[@class='desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope'])[1]"));

		ac.moveToElement(button).build().perform();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='NetBanking']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child); // Switch to child window

		
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		//WebElement frame = driver.findElement(By.xpath("//div[@class='welcmewrap']"));
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");
		driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
		
		driver.findElement(By.id("fldPasswordDispId")).sendKeys("12345");
		driver.findElement(By.id("chksecmod")).click();
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		
		
		

		driver.close();

	}

}
