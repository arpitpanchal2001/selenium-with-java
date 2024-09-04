package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Alert is not webelement
		 WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[normalize-space()= 'Click for JS Alert']")).click();
//		org.openqa.selenium.Alert myalert = driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		//confirmation alert - ok and cancle
//		driver.findElement(By.xpath("//button[normalize-space()= 'Click for JS Confirm']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		//prompt alert
//		driver.findElement(By.xpath("//button[normalize-space()= 'Click for JS Prompt']")).click();
//		org.openqa.selenium.Alert promptAlert = driver.switchTo().alert();
//		promptAlert.sendKeys("hello");
//		promptAlert.accept();
		
		//suppose we are getting authentication when we visit site and alerts comes where we need to enter username and password
		//http://the-internet.herokuapp.com/basic_auth
		//here we directly attach username and password to the url 
		//http://username:password@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
