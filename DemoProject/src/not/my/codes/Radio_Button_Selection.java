package not.my.codes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*In this section, we will understand how to interact with Radio Buttons. We can
select a radio button option using the 'click' method and unselect using the same
'click' method.
Let us understand how to interact with radio buttons using
http://www.calculator.net/mortgage-payoff-calculator.html. We can also check if
a radio button is selected or enabled.*/


public class Radio_Button_Selection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Puts an Implicit wait, Will wait for 10 seconds
		// before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html\\");

		driver.manage().window().maximize();
		// Click on Radio Button
		driver.findElement(By.id("cpayoff1")).click();
		System.out.println("The Output of the IsSelected " + driver.findElement(By.id("cpayoff1")).isSelected());
		System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("cpayoff1")).isEnabled());
		System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("cpayoff1")).isDisplayed());
		driver.close();

		// Close the Browser.
		driver.close();
	}

}
