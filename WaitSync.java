package com.ibm.Akhya;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSync {

	public static void main(String[] args) {
		
		String path1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(path1)));
		

	}

}
