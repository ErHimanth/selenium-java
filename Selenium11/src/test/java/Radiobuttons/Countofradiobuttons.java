package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countofradiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	     List<WebElement>radios= driver.findElements(By.xpath("//input[@type='radio']"));
	     System.out.println("no of total radios"+""+radios.size());
	     driver.close();

	}

}
