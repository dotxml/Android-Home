package not.my.codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PartialLinkList {
	

	


	       public static void main (String [] args){
	    	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   		WebDriver driver = new ChromeDriver();
	               driver.get("https://www.gmail.com");
	               driver.findElement(By.partialLinkText("Create")).click();
	      }
	}


