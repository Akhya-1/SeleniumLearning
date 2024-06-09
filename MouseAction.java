package com.ibm.Akhya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
		.sendKeys("hello").build().perform();
		
		a.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click()
		.build().perform();
		
		//a.dragAndDrop(null, null)
		
		driver.close();
		
		
	}

}
