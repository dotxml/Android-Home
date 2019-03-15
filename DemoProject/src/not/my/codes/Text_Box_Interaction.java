package not.my.codes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Box_Interaction {
	
	/*In this section, we will understand how to interact with text boxes. We can put
	values into a text box using the 'sendkeys' method. Similarly, we can also
	retrieve text from a text box using the getattribute("value") command. Take a
	look at the following example.*/

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			// Puts an Implicit wait, Will wait for 10 seconds
			// before throwing exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Launch website
			driver.navigate().to("http://www.calculator.net/percent-calculator.html");

			// Maximize the browser
			driver.manage().window().maximize();
			// Enter value 10 in the first number of the percent Calculator
			driver.findElement(By.id("cpar1")).sendKeys("10");

			Thread.sleep(5000);
			// Get the text box from the application
			String result = driver.findElement(By.id("cpar1")).getAttribute("value");

			// Print a Log In message to the screen
			System.out.println(" The Result is " + result);

			// Close the Browser
			driver.close();
		}
	}


}
