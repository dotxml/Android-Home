package not.my.codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*In this section, we will understand how to interact with Check Box. We can select
a check box using the 'click' method and uncheck using the same 'click' method.
Let us understand how to interact with a check box using
http://www.calculator.net/mortgage-calculator.html. We can also check if a
check box is selected/enabled/visible.*/

public class Check_Box_Selection {

	public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	// Puts an Implicit wait, Will wait for 10 seconds
	// before throwing exception
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Launch website
	driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
	driver.manage().window().maximize();
	 // Click on check box
	System.out.println("Selected the Check box");
	
	 driver.findElement(By.id("caddoptional")).click();

	 System.out.println("The Output of the IsSelected " +
	driver.findElement(By.id("caddoptional")).isSelected());

	System.out.println("The Output of the IsEnabled " +
	driver.findElement(By.id("caddoptional")).isEnabled());

	System.out.println("The Output of the IsDisplayed " +
	driver.findElement(By.id("caddoptional")).isDisplayed());

	
	 }

}
