package not.my.codes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

/*As a tester, you might be in a situation to perform a 'Drag & drop' operation. We
will perform a drag and drop operation by picking up a tree grid that is available
for us on
http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html.
In the example, we would like to drag an element 'Disable Node' from 'initially
open' folder to 'Parent Node' Folder.
*/
public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		// Puts an Implicit wait, Will wait for 10 seconds
		// before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
		driver.manage().window().maximize();
	
		WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
		new Actions(driver).clickAndHold(driver.findElement(By.xpath(".//*[@id='j3_7']/a"))).moveToElement(To).release(To).build().perform();
		
		//driver.close();
	}
}

// Minimise these code from line 29 to line no 34

//   
