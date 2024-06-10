package com.ibm.Akhya;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class firstClas {


/* All drivers geckodriver, chromedriver, msedgedriver acts as an intermediator between
* the browsers in the machine and Selenium Webdriver.
* 
* The drivers finds the executable of the browser , most of the time automatically 
* 
* When browsers are opened by Selenium, it opens as though a new instance of browser is opening 
* . It like as though we are opening the browser for the first time after installation.
*/


public static void main(String[] args) throws InterruptedException {


//Path of the current project - Static code
//String path = "C:\\Users\\kaush\\OneDrive\\Desktop\\Workspace_Selenium_Batch2\\Session1";

//Path of the current project - dynamic code
String path1 = System.getProperty("user.dir");
//System.out.println(path1);

//Set the environment variable to tell the system the path of Chromedriver executable
//Environment variable may be used only when the browser is not able to open.
//Recommend to use the below code every time, as it is safe.
//System.setProperty("webdriver.chrome.driver", path+"\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", path1+"\\chromedriver.exe");

/*Create an object of ChromeDriver class to open the browser and methods/data members can 
* be used of this class to navigate, find elements, and perform actions on the element.*/
ChromeDriver driver = new ChromeDriver();

/*Browser should open in Maximize state as in minimize state, some element/control/UI,
remains hidden due to small window and Selenium will not find the element and perform 
action on the element and can show NO SUCH ELEMENT EXCEPTION.*/
driver.manage().window().maximize();


//Navigate to Google Website - get(String url) 
//Always give the protocol other wise will show exception. 
// org.openqa.selenium.InvalidArgumentException: invalid argument
//driver.get("www.google.co.in");
driver.get("https://www.google.co.in");

//Find the Edit box and type on it
/*findElement(By.id("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* findElement(By.className("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* findElement(By.name("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* findElement(By.tagName("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* findElement(By.linkText("String Value")) - String Value has to unique for the element in 
* the whole page.
* 
* findElement(By.partialLinkText("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* findElement(By.xpath("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* findElement(By.cssSelector("String Value")) - String Value has to unique for the element in 
* the whole page
* 
* These Eight static methods of the BY CLASS are eight different locators/locating
* strategy by which we can find element.
*/ 
//For typing - sendKeys(String CharSequence)
/*
* 1) id locator can be used if ID attribute is present in HTML script of the element.And its
* value is UNIQUE for the element in the whole page.
* 
* If a company is following INTERNATIONAL CODING STANDARD, id value will be UNIQUE 
* for every element. And most of the time ID value is UNIQUE , so we can use it 
* without any problem.
* 
* IF you see ID value is not UNIQUE , stop your automation and tell managers that automation
* is not possible until ID value is UNIQUE.
* 
* 2) className locator can be used if class attribute is present in HTML script of the 
* element. And its value is UNIQUE for the element in the whole page.
* 
* Generally class attribute values can be duplicated, we cannot tell the developers 
* to have UNIQUE values.
* 
* class = "gFyIJ"
* 
* If we find UNIQUENESS of the this value i.e. "gFyIJ"., go to the STYLE (CSS) part of 
* DEVELOPER TOOL and see if there is a section by the name "gFyIJ". Put mouse, over this 
* section and see how many elements gets highlighted?. If one elements is highlighted, then 
* the class value is UNIQUE.
* 
* Why does class value get duplicated? The values defines the look and feel of the control/
* UI/ELement. One element or more than one element may have the same look and feel , so the 
* their class value will be same.
* 
* 3) name locator can be used if NAME attribute is present in HTML script of the element.And its
* value is UNIQUE for the element in the whole page.
* 
* If a company is following INTERNATIONAL CODING STANDARD, name value will be UNIQUE 
* for every element. And most of the time NAME value is UNIQUE , so we can use it 
* without any problem.
* 
* IF you see NAME value is not UNIQUE , stop your automation and tell managers that automation
* is not possible until NAME value is UNIQUE.
* 
* id,class and name - are optional attributes . Either all will be present OR none of them 
* will be present OR one of them will be present.
* 
* 
*/

 //WebElement interface = to keep address of the element
//Address of element in WebElement interface can be kept by any of the eight locators
//WebElement w = driver.findElement(By.className("gLFyf"));
//For edit box, class, id and name attribute values are unique so any of these locator can be used.
//WebElement w = driver.findElement(By.id("APjFqb"));
WebElement w = driver.findElement(By.name("q"));
w.sendKeys("Selenium Grid");

//driver.findElement(By.className("gLFyf")).sendKeys("Selenium Grid");

//Static wait
Thread.sleep(2000L);


//Find the button and click on it - class and name attribute values are unique
//click()
//driver.findElement(By.name("btnK")).click();
driver.findElement(By.className("gNO89b")).click();

//Static wait
Thread.sleep(2000L);

//Get the title of the page - getTitle()
String str = driver.getTitle();
System.out.println("Title of the page is "+str); 

//Static wait
Thread.sleep(2000L);

//Close all browser open - quit()
driver.quit();



}
}




