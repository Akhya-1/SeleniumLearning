package com.ibm.Akhya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SubjectiveAssessment2 {
	


	    public static void main(String[] args) {
	        // Setup FirefoxDriver
	    	String path1 = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path1+"\\Geckodriver.exe");
	        FirefoxOptions options = new FirefoxOptions();
	        WebDriver driver = new FirefoxDriver(options);

	        try {
	            // a. Navigate to the website
	            driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");

	            // b. Use implicit wait
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	            // Use explicit wait to validate page title
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.titleIs("Google News"));

	            // c. Use explicit wait to validate attribute value or text for elements
	            // Example: Validate the presence of the "Top stories" section
	            WebElement topStoriesSection = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@aria-label='Top stories']")));
	            
	            // d. Print out the title of the landing page
	            System.out.println("Landing page title: " + driver.getTitle());

	            // e. In the "Top stories" section, click on the first link
	            List<WebElement> topStoriesLinks = topStoriesSection.findElements(By.tagName("a"));
	            String originalWindow = driver.getWindowHandle();
	            topStoriesLinks.get(0).click();

	            // f. Switch to the tabbed window opened by clicking the link and get the title of the tabbed window
	            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	            Set<String> allWindows = driver.getWindowHandles();
	            for (String windowHandle : allWindows) {
	                if (!windowHandle.equals(originalWindow)) {
	                    driver.switchTo().window(windowHandle);
	                    break;
	                }
	            }
	            System.out.println("Tabbed window title: " + driver.getTitle());

	            // g. Close only the browser window of the landing page; not the tabbed window
	            driver.switchTo().window(originalWindow);
	            driver.close();

	            // Switch back to the tabbed window
	            for (String windowHandle : driver.getWindowHandles()) {
	                driver.switchTo().window(windowHandle);
	            }

	            // Print the title of the remaining window to confirm it's the tabbed window
	            System.out.println("Remaining window title: " + driver.getTitle());

	        } finally {
	            // Close the driver to end the session
	            driver.quit();
	        }
	    }
	


}
