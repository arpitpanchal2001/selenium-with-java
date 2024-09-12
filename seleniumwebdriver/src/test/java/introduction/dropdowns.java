package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) select dropdown
		// 2) Bootstrap dropdown
		// 3) hidden dropdwon
		
		// select dropdownm
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='country']"));
//		Select dropdown = new Select(countryDropdown);
//		// there are three way we can select dropdown
//		//selectByVisibleText()
//		//selectByValue();
//		//selectByIndex();
//		dropdown.selectByVisibleText("Canada");
//		dropdown.selectByValue("uk");
//		dropdown.selectByIndex(2);
//		
//		// how to get all options form dropdown
//		List<WebElement> options = dropdown.getOptions();
//		System.out.println(options.size());
//		for(WebElement opt:options) {
//			System.out.println(opt.getText());
//		}

		
		//bootstrap drop down
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		 driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		List<WebElement> bootdropdown = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label[@class='checkbox']"));
		for(WebElement boot:bootdropdown) {
			System.out.println(boot.getText());
		
		}
		
		//hidden drop down
		
	}

}

