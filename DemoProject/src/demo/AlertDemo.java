package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		 driver.findElement(By.name("cusid")).sendKeys("120");					
	     driver.findElement(By.name("submit")).submit();	
	     
	     Alert alert = driver.switchTo().alert();
	     String msg= driver.switchTo().alert().getText();
	     System.out.println(msg);
	     
	     Thread.sleep(5000);
	     
	     alert.accept();
	     driver.close();
		
	}
}
