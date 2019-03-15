package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstAutomation {

	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "/Users/adityayadav/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.linkText("Assign Leave")).click();
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Bull");
		Select ab= new Select(driver.findElement(By.name("assignleave[txtLeaveType]")));
		
		ab.selectByVisibleText("Maternity US");
		driver.findElement(By.id("assignleave_txtFromDate")).clear();
	driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("22-12-2015");
		driver.findElement(By.id("assignleave_txtToDate")).clear();
	driver.findElement(By.id("assignleave_txtToDate")).sendKeys("30-12-2015");
	
	//	driver.findElement(By.linkText("Project Info")).click();
	//	driver.findElement(By.linkText("Projects")).click();
	//	driver.findElement(By.name("searchProject[customer]")).sendKeys("BUll");
	//	driver.findElement(By.name("searchProject[project]")).sendKeys("HORSE");
	//	driver.findElement(By.name("searchProject[projectAdmin]")).sendKeys("Dog");
	//	driver.findElement(By.id("btnSearch")).submit();
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.xpath("//*[contains(@href,'/index.php/auth/logout')]")).click();

		driver.close();
	}
}
