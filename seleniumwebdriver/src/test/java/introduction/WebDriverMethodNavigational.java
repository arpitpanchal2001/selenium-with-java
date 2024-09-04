package introduction;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodNavigational {
	public static void main(String[] args) throws MalformedURLException {
		// navigate.to(url)
		//navigate.back()
		//navigate.forward()
		//navigate.refresh()
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/"); // accept url in string format
//		driver.navigate().to("https://demo.nopcommerce.com/"); // accept url in String and Url format
		URL myurl = new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myurl);
		
		
		
	}

}
