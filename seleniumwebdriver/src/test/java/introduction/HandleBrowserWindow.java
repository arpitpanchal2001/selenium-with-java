package introduction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String originalWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> ids = driver.getWindowHandles();
		
		//approach 1
//		List<String> listIds = new ArrayList(ids);
//		String parentID = listIds.get(0);
//		String childId = listIds.get(1);
//		
//		//switch to child window
//		driver.switchTo().window(childId);
		
		//approach 2
		for(String id:ids)
		{
			 if (!id.equals(originalWindow)) {
                 // Switch to the new window
                 driver.switchTo().window(id);
                 break;
             }
		}

	}

}
