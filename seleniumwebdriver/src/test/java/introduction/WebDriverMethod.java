package introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		// 1) get methods
		// 2) conditional methods
		// 3) browser methods
		// 4) navigational methods
		// 5) wait methods
		
		//1) get methods - we can access this methods through webdriver instances
		// get(url) - open the url on the browser
		// getTitle() - return the title of the page]
		// getCurrentUrl() - returns url of the page
		// getPageSource() - returs source code of the page
		// getWindowHandle() - return id of the single browser window
		// getWindowHandles() - return id of the multiple browser window
		
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		//getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource
		System.out.println(driver.getPageSource());
		
		//getWindowHandle
		
		String windowId = driver.getWindowHandle();
		System.out.println("window id : " + windowId);
		
		//getWindowHandles
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		
		//close and quit 
		//close will close only one browser window
		//quit will close all browser window
		
		//with the help of window id we can swith focus of selenium from one browser to another
		

		
		
		
		
		
		

	}

}
