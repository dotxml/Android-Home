package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoClass {

	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		WebElement txt=driver.findElement(By.id("email"));
		
		Actions builder= new Actions(driver);
		Action series = builder.moveToElement(txt).click().keyUp(txt, Keys.SHIFT).sendKeys(txt, "hello").doubleClick(txt).contextClick(txt).build();
		series.perform();
		
		driver.close();
	}
}