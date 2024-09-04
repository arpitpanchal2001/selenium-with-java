package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodConditional {
	public static void main(String[] args) {
		//conditional methods
		// we can access these command through Webelement returns boolean(True/False)
		// isDisplayed
		// isEnabled
		// isSelected
		
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//get(url)
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed
		WebElement logo =  driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled
		
//		WebElement firstName = driver.findElement(By.xpath("//input[type='text']"));
//		System.out.println("first name is enabled or not " + firstName.isEnabled());
		
		//isSelected
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("beofre selected " + male_rd.isSelected());
		
		male_rd.click();
		
		System.out.println("after selected " + male_rd.isSelected());
		
		//browser commands close and quit 
		//close will close only one browser window
		//quit will close all browser window
	}

}
