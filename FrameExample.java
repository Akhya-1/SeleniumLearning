package com.ibm.Akhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		 driver.switchTo().frame(0);
		 // can use the name or ID 
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		
		//driver.close();
		
		
		
		
		
	}

}
