package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAssignment {

	public static void main(String[]args){
		WebElement a= null;
	
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.className("a-dropdown-prompt")).click(); 
        driver.findElement(By.linkText("Price - High to Low")).click();
		driver.findElement(By.xpath("//*[@id='widgetFilters']/div[4]/span[4]/div/label/input")).click();
		//driver.findElement(By.linkText("Amazon Pay")).click();
     a=driver.findElement(By.id("dealTitle"));
       new Actions(driver).contextClick(a).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		}
//		finally{
//			System.out.println(a);
//		}
//		
//		new Actions(driver).contextClick(e).moveByOffset(1, 0).click().build().perform();
//		driver.close();

}}
