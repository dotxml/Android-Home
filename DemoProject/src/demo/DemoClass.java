package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoClass {

	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement link=driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr")); 
		Actions builder = new Actions(driver);
		Action mouse= builder.moveToElement(link).build();
		 String bgColor = td_Home.getCssValue("background-color");
         System.out.println("Before hover: " + bgColor);        
        // mouseOverHome.perform();        
         mouse.perform();
         bgColor = td_Home.getCssValue("background-color");
         System.out.println("After hover: " + bgColor);
         driver.close();
			
		
		
	}
}
