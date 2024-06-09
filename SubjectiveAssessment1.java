package com.ibm.Akhya;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class SubjectiveAssessment1 {
		

	    public static void main(String[] args) {
	      
	    	String path1 = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        WebDriver driver = new ChromeDriver(options);

	        try {
	            // a. Navigate to the website
	            driver.get("https://echoecho.com/htmlforms10.htm");

	            // b. Use implicit wait
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	            // Use explicit wait to validate page title
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.titleIs("Forms : Radio Button - HTML Tutorial"));

	            // c. Use explicit wait to validate attribute value or text for radio buttons
	            List<WebElement> radioButtons = driver.findElements(By.name("group1"));
	            for (WebElement radioButton : radioButtons) {
	                wait.until(ExpectedConditions.attributeToBeNotEmpty(radioButton, "value"));
	            }

	            // d. Check which radio button is selected by default
	            for (WebElement radioButton : radioButtons) {
	                if (radioButton.isSelected()) {
	                    System.out.println("Default selected radio button: " + radioButton.getAttribute("value"));
	                }
	            }

	            // e. Print the text/inner text/attribute values of Water, Beer, Wine
	            for (WebElement radioButton : radioButtons) {
	                System.out.println("Radio button value: " + radioButton.getAttribute("value"));
	            }

	            // f. Select each radio button one after another and take a screenshot
	            for (WebElement radioButton : radioButtons) {
	                radioButton.click();
	                System.out.println(radioButton.getAttribute("value") + " is selected.");
	               
	            }
	        } finally {
	            // g. Close the browser
	            driver.quit();
	        }
	    }

	   
	    
	    }
	



