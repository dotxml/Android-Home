package not.my.codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Day1_Intro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		//driver.close();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String i = driver.getCurrentUrl();
		System.out.println(i);
	
		}

}

/*User Interactions
Selenium WebDriver is the most frequently used tool among all the tools
available in the Selenium tool set. Therefore it is important to understand how to
use Selenium to interact with web apps. In this module, let us understand how
to interact with GUI objects using Selenium WebDriver.
We need to interact with the application using some basic actions or even some
advanced user action by developing user-defined functions for which there are
no predefined commands.
Listed below are the different kinds of actions against those GUI objects: 

 Text_Box_Interaction
 Radio Button Selection
 Check Box Selection
 Drop Down Item Selection
 Synchronization or differents types of  wait
 Drag_Drop
 Keyboard_Actions
 Mouse_Actions
 Multi_Select
 Find_All_Links
 Dynamic_Table



	

	Keyboard_Actions
	
	Find_All_Links

*/
