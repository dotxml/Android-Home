package not.my.codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*In this section, we will understand how to interact with Dropdown Boxes. We can
select an option using 'selectByVisibleText' or 'selectByIndex' or 'selectByValue'
methods.
Let us understand how to interact with a dropdown box using
http://www.calculator.net/interest-calculator.html. We can also check if a
dropdown box is selected/enabled/visible.*/

public class Drop_Down_Item_Selection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Puts an Implicit wait, Will wait for 10 seconds
		// before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.calculator.net/interest-calculator.html");
		driver.manage().window().maximize();
		// Selecting an item from Drop Down list Box
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		dropdown.selectByVisibleText("continuously");
		// you can also use dropdown.selectByIndex(1) to
		// select second element as index starts with 0.
		// You can also use dropdown.selectByValue("annually");

		System.out.println("The Output of the IsSelected " + driver.findElement(By.id("ccompound")).isSelected());
		System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("ccompound")).isEnabled());

		System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("ccompound")).isDisplayed());

		driver.close();
	}

}
