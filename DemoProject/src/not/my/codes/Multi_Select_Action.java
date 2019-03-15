package not.my.codes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

/*Multi Select Action
Sometimes we would be in a situation to select two or more items in a list box or
text area. To understand the same, we would demonstrate multiple selection
from the list using*/
//"http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx"
//Example Let us say, we want to select 3 items from this list as shown below:

public class Multi_Select_Action {
	public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	//driver.manage().window().maximize();
	driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
	driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
			Thread.sleep(5000);
			// Perform Multiple Select
			Actions builder = new Actions(driver);
			WebElement select =
			driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
			List<WebElement> options = select.findElements(By.tagName("td"));
			System.out.println(options.size());
			Action multipleSelect = builder.keyDown(Keys.CONTROL)
			.click(options.get(2))
			.click(options.get(4))
			.click(options.get(6))
			.build();
			multipleSelect.perform();
			driver.close();
			 }


}
