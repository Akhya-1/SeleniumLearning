
package com.ibm.Akhya;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

public class fluentWait {
    public static void main(String[] args) {
        // Set system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://example.com");

        // Create a FluentWait instance with a timeout of 30 seconds and a polling interval of 2 seconds
        Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);

        // Wait until an element with id 'username' is visible
        WebElement element = wait.until(driverr -> driverr.findElement(By.id("username")));

        // Perform actions on the element
        element.sendKeys("username");

        // Close the browser
        driver.quit();
    }
}
