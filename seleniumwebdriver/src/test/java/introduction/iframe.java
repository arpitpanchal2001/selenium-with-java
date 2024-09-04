package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://ui.vision/demo/webtest/frames/");
	
	//driver.SwitchTo.frame(name);
	//driver.SwitchTo.frame(id);
	//driver.SwitchTo.frame(WebElement);
	//driver.SwitchTo.frame(index);
	WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	//driver.SwitchTo.frame(WebElement)
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1");
	driver.switchTo().defaultContent(); 
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2");
	driver.switchTo().defaultContent();
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
	//switching to frame 2 before this we need to go back to default
	
	
}
}
