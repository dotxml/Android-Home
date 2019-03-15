package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[]args){
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php ");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Lion");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("52585252");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("usainbolt@worldrecord.com");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("bolt");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("bengaluru");
		WebElement a= driver.findElement(By.xpath("//select[@name='country']"));
		Select option=new Select(a);
		option.selectByVisibleText("India");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']")).click();
		
		
		
	}
}
