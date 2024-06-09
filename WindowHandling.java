package com.ibm.Akhya;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		////String parent = driver.getWindowHandle();
		//System.out.println(wh);
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> wh2 = driver.getWindowHandles();
		
		Iterator<String> I = wh2.iterator();
		
		String pw = I.next();
		driver.switchTo().window( I.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(pw);


		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
			
		
		

	}

}


