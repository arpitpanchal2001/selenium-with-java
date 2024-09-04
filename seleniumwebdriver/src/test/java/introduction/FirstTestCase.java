package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {
	public static void main(String[] args) {
	//	System.out.println("Testing");
		
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		// 2) open website
		driver.get("https://demo.opencart.com/");
		// validate title should be OpenCart
		String title = driver.getTitle();
		if(title.equals("Your Store")) { 
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
		}
}
}
