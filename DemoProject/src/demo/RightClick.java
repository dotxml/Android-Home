package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.twitter.com");
		
		WebElement to=driver.findElement(By.xpath("//input[@type='submit' and @class='EdgeButton EdgeButton--secondary EdgeButton--medium submit js-submit']"));
		new Actions(driver).contextClick(to).build().perform();
		driver.close();
	}

}
