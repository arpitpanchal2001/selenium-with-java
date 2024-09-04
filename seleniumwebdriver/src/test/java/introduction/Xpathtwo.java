package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtwo {

	public static void main(String[] args) {
		//xpath is derived from XML  
		// It represent address of the element
		
		// Types of Xpath
		// 1 Absolute Xpath (Full Xpath-only tag name) start from the root node till address node eg:/html/body/header/div/div/div[2]/div/input
		// 2 Relative Xpath (Partial Xpath)//*[@id="search"]/input
		
		// open chrome browser
				WebDriver driver = new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				// 2) open website
				driver.get("https://demo.opencart.com/");
				
				
				//xpath with single attribute
				driver.findElement(By.xpath("//*[@name='search']")).sendKeys("Tshirt");
				
				//xpath with multiple attribute
				driver.findElement(By.xpath("//*[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");
				
				//xpath with 'and' 'or' operators
				driver.findElement(By.xpath("//*[@name='search'and @placeholder='Search']")).sendKeys("Tshirt");
				driver.findElement(By.xpath("//*[@name='search'or @placeholder='Search']")).sendKeys("Tshirt");
				
				//xpath with innertext - text()
				driver.findElement(By.xpath("//a[text() = 'Desktops]")).click();
				
				//xpath with text() and getText()
				driver.findElement(By.xpath("//h3[text() = 'Featured']")).getText();
				
				//xpath with contains
				driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
				
				//xpath with starts-with
				driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");
				
				//handling dynamic attribute //*[@id = 'start' or @id = 'stop'] or //*[contains(@id,'st') or //*[starts-with(@id,'st')]
				
				
				//chained xpath
				// suppose we dont have attribute for particular element then we start from there parent element 
				// ex: //div[@id = 'logo']/a/imp
				boolean statusImage = driver.findElement(By.xpath("//div[@id = 'logo']/a/imp")).isDisplayed();
				System.out.println(statusImage);
				
				
				
				
		
		
		
		

	}

}
