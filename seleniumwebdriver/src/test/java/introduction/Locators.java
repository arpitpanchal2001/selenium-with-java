package introduction;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	public static void main(String[] args) {
	//	System.out.println("Testing");
		
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		// 2) open website
		driver.get("https://demo.opencart.com/");
		// locator with name
		driver.findElement(By.name("search")).sendKeys("Mac");
		// Locator with id
		boolean logoDisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
		
		// linktext and partial linktext
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Tab")).click();
		
		// class name
		List<WebElement> headerLink = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of header links are : " + headerLink.size());
		
		//tag name
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of link in home page : " + links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images in home page : " + images.size());
		
		
		
		
}
}
