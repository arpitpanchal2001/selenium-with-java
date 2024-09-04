package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
    public static void main(String[] args) {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Wikipedia's main page
        driver.get("https://www.wikipedia.org/");

        // Locating an element using Relative XPath and extracting text as a String
        String searchInputType = driver.findElement(By.xpath("//input[@type='search']")).getAttribute("type");

        // Extracting text content as String
        String mainHeading = driver.findElement(By.xpath("//h1[@class='central-textlogo__image']")).getText();

        // Extracting ID attribute as String
        String languageDropdownId = driver.findElement(By.xpath("//select[@id='searchLanguage']")).getAttribute("id");

        // Extracting boolean state: Checking if the search button is displayed
        boolean isSearchButtonDisplayed = driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).isDisplayed();

        // Extracting an attribute value using Relative XPath
        String englishLinkHref = driver.findElement(By.xpath("//a[@id='js-link-box-en']")).getAttribute("href");

        // Using multiple attributes and getting class attribute as String
        String multiAttrClass = driver.findElement(By.xpath("//a[@class='link-box' and @id='js-link-box-en']")).getAttribute("class");

        // Using XPath contains method and extracting href attribute
        String partialAttrHref = driver.findElement(By.xpath("//a[contains(@class, 'js-link-box')]")).getAttribute("href");

        // Extracting inner text using XPath and storing as String
        String englishLinkText = driver.findElement(By.xpath("//strong[text()='English']")).getText();

        // Handling dynamic attributes and extracting attribute value
        String dynamicAttrValue = driver.findElement(By.xpath("//input[contains(@class, 'search')]")).getAttribute("name");

        // Using chained XPath and extracting the href attribute
        String chainedXPathHref = driver.findElement(By.xpath("//div[@id='www-wikipedia-org']//a[@id='js-link-box-en']")).getAttribute("href");

        // Print out the extracted values
        System.out.println("Search Input Type: " + searchInputType);
        System.out.println("Main Heading: " + mainHeading);
        System.out.println("Language Dropdown ID: " + languageDropdownId);
        System.out.println("Is Search Button Displayed: " + isSearchButtonDisplayed);
        System.out.println("English Link Href: " + englishLinkHref);
        System.out.println("Multi Attribute Class: " + multiAttrClass);
        System.out.println("Partial Attribute Href: " + partialAttrHref);
        System.out.println("English Link Text: " + englishLinkText);
        System.out.println("Dynamic Attribute Value: " + dynamicAttrValue);
        System.out.println("Chained XPath Href: " + chainedXPathHref);

        // Close the browser
        driver.quit();
    }

}
