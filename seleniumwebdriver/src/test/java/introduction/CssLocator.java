package introduction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		/*Css selector
		 * Tag Id (tag#id)
		 * Tag Class (tag.class)
		 * Tag attribute (tag[attribute="Value"])
		 * Tag class attribute (tag.class[attribute="Value"])
		 */
		
		// tag id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
		
		// tag class tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
		
		//tag attribute
		driver.findElement(By.cssSelector("placeholder='Search store'")).sendKeys("T-shirt");
		
		
		//tag class attribute 
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
	}

}
