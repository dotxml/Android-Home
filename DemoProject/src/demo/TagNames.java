package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNames {
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
		List<WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println("total number of links in wikipedia page are"+list.size());
		for (int i = 0; i < list.size(); i++) {			
			System.out.println("the link number"+(i+1)+"="+ list.get(i));
		}
	}
}
