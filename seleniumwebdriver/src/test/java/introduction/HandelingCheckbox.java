
package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		for (WebElement webElement : driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"))) {
			if(webElement.isSelected()) {
				System.out.println(webElement.getText());
			}else {
				webElement.click();
			}
		}
		
		

	}

}
