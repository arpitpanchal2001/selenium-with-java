package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorTwo {
	    public static void main(String[] args) {

	            // Initialize WebDriver
	            WebDriver driver = new ChromeDriver();

	            // Navigate to Wikipedia's main page
	            driver.get("https://www.wikipedia.org/");

	            //Locating an element using tag and attribute (search input)
	            WebElement searchInput = driver.findElement(By.cssSelector("input[type='search']"));

	            //Using CSS Selector with class name (main heading)
	            WebElement mainHeading = driver.findElement(By.cssSelector(".central-textlogo__image"));

	            //Demonstrating CSS selector with ID (search language dropdown)
	            WebElement languageDropdown = driver.findElement(By.cssSelector("#searchLanguage"));

	            //Using tag, class, and attribute combination (search button)
	            WebElement searchButton = driver.findElement(By.cssSelector("button.pure-button-primary-progressive[type='submit']"));

	            //Chaining CSS Selectors (link inside the list)
	            WebElement firstLinkInList = driver.findElement(By.cssSelector("div.central-featured-lang > a.link-box"));

	            //Using multiple attributes (input box for search with language dropdown)
	            WebElement inputWithAttributes = driver.findElement(By.cssSelector("input[type='search'][name='search']"));

	            //Various locators and attributes (English link)
	            WebElement englishLink = driver.findElement(By.cssSelector("a#js-link-box-en"));

	            //Understanding tag and attribute usage (span inside a link)
	            WebElement spanInLink = driver.findElement(By.cssSelector("a#js-link-box-en span"));
	           
	            WebElement logo = driver.findElement(By.cssSelector("div.central-textlogo > img"));

	          
	            driver.quit();
	}
	    }
