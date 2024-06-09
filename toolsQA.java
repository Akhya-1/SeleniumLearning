package com.ibm.Akhya;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class toolsQA {

	public static void main(String[] args) throws InterruptedException {
	
		
		String path1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h5[contains(text(),'Alerts')]")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
				
	}

}
