package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAssignment2 {

	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.linkText("Price - Low to High")).click();
		if ( !driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[4]/span[1]/div/label/input")).isSelected() )
		{
		     driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[4]/span[1]/div/label/input")).click();
		     
		  
		}
		Actions action= new Actions(driver);
		WebElement a= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[2]"));
		
		action.contextClick(a).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
}
