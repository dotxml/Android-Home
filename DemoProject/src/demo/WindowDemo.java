package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String mainWindow=driver.getWindowHandle();
		
		Set<String> name=driver.getWindowHandles();
		Iterator<String> it=name.iterator();
		
		while(it.hasNext()){
			
		String currentWindow= it.next();
		if(!mainWindow.equalsIgnoreCase(currentWindow)){
			driver.switchTo().window(currentWindow);
			 driver.findElement(By.name("emailid"))
             .sendKeys("gmail.gmail.com");                			
             
             driver.findElement(By.name("btnLogin")).click();
             driver.close();
		}
		}
		driver.switchTo().window(mainWindow);
		//driver.close();
	}
}
