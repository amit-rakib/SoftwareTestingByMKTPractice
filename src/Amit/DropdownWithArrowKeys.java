package Amit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithArrowKeys {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver (replace with your path or use WebDriverManager)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to Amazon's homepage
            driver.get("https://www.amazon.com");

            // Wait for the page to load completely
            Thread.sleep(2000);

            // Locate the dropdown element using its ID: 'searchDropdownBox'
            WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

            // Initialize the Select class
            Select select = new Select(dropdown);

            // 1️⃣ Select by VALUE
            select.selectByValue("search-alias=electronics");
            System.out.println("Selected 'Electronics' by value");
            Thread.sleep(1000);

            // 2️⃣ Select by VISIBLE TEXT
            select.selectByVisibleText("Books");
            System.out.println("Selected 'Books' by visible text");
            Thread.sleep(1000);

            // 3️⃣ Select by INDEX
            select.selectByIndex(5); // Select the sixth option (index starts at 0)
            System.out.println("Selected option at index 5");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Wait before closing the browser
            Thread.sleep(3000);
            driver.quit();
        }
    }
}

