package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifytitlelink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Gmail")).click();
	       String expected = "Private and secure";
	       String actual = driver.getTitle();
	       System.out.println(actual);
	       System.out.println(actual.contains(expected)); 
	       if(actual.contains(expected))
	       {
	    	   System.out.println("pass");
	       }
	       else {
	    	   System.out.println("fail");
	       }
	       
	       driver.close();

		}

	}


