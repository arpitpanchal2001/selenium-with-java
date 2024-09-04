package introduction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class WebdriverWaitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Thread.sleep() is provided by java itself not by webdriver
		
		//webdriver provides 
		// 1) implicit wait
		// 2) explicit wait/fluent wait 
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//NOSUCHELEMENT EXCEPTION when element is not present on page - due to syncronization problem
		//ELEMENTNOTFOUNS EXCEPTION when locator is not correct
//		Thread.sleep(3000); // pause the execution
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//disadvantages of Thread.sleep() - is after mention time if element is still not present we will again get exception 
		// if will wait for maximum timeout even if the element was get in 1sec therefore reduce the performance
		// every time we face this problem we need to write thread.sleep
		// not recomended
		
		//implicit wait 
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// we need to write implicit wait after we create driver object and we only define it once it will apply for all until we close the browser
		//dis is if element is not loaded in specific time it will throw an error
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin"); 
		
		//explicit wait
		// in this with time we also mention condition
		
//		WebDriver driver = new ChromeDriver();
//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		WebElement txtUser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
//		txtUser.sendKeys("Admin");
		
		
		// Fluent wait
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement txtUser = mywait.until(new Function<WebDriver , WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			}
		});
		txtUser.sendKeys("Admin");
		
		
		

	}

}
