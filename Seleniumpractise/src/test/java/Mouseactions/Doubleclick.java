package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleclick {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		WebElement Gmail =driver.findElement(By.xpath("//a[text()='Gmail']")); 
		Actions ac = new Actions(driver);
		ac.doubleClick(Gmail).build().perform();
		Thread.sleep(1000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
