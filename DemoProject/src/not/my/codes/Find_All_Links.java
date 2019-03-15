package not.my.codes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_All_Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.calculator.net");
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links in the Page is " + links.size());
		for (int i = 1; i <= links.size(); i = i + 1) {
			System.out.println("Name of Link# " + i + "--" + links.get(i).getText());

		}
	}
}
