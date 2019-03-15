/*package Day1stIntroduction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Wait_tech {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		// Puts an Implicit wait, Will wait for 10 seconds
		// before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.calculator.net/interest-calculator.html");
		driver.manage().window().maximize();
	Synchronization
	To synchronize between script execution and application, we need to wait after
	performing appropriate actions. Let us look at the ways to achieve the same.
	Thread.Sleep
	Thread.Sleep is a static wait and it is not a good way to use in scripts, as it is
	sleep without condition.
	Thread.Sleep(1000); //Will wait for 1 second.
	Explicit Waits
	An 'explicit wait' waits for a certain condition to occur before proceeding further.
	It is mainly used when we want to click or act on an object once it is visible.
	

	driver.get("Enter an URL");
	WebElement DynamicElement = 
	(new WebDriverWait(driver,10)).
	until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));

	
	Implicit Wait
	Implicit wait is used in cases where the WebDriver cannot locate an object
	immediately because of its unavailability. The WebDriver will wait for a specified
	implicit wait time and it will not try to find the element again during the specified
	time period.
	Once the specified time limit is crossed, the WebDriver will try to search the
	element once again for one last time. Upon success, it proceeds with the
	execution; upon failure, it throws an exception.
	It is a kind of global wait which means the wait is applicable for the entire driver.
	Hence, hardcoding this wait for longer time periods will hamper the execution
	time.

	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("Enter an URL");
	WebElement DynamicElement = driver.findElement(By.id("DynamicElement"));
	
	Fluent Wait
	A FluentWait instance defines the maximum amount of time to wait for a
	condition to take place, as well as the frequency with which to check the
	existence of the object condition.
	Let us say we will 60 seconds for an element to be available on the page, but we
	will check its availability once in every 10 seconds.
	
	Wait wait = new FluentWait(driver).withTimeout(60, SECONDS).pollingEvery(10, SECONDS)
			.ignoring(NoSuchElementException.class);
	WebElement dynamicelement = wait.until(new
			Function<webdriver,webElement>()
			{ public WebElement apply(WebDriver driver)
			 {
				 return driver.findElement(By.id("dynamicelement"));
				 }
				}
				);

}
*/