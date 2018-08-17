package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverNaukri {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	     driver.get("https://www.naukri.com/");
	     
	    System.out.println(driver.getCurrentUrl());
	     
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     
	     
	     WebElement rcr = driver.findElement(By.linkText("RECRUITERS"));
	     
	     
	     Actions action = new Actions (driver);
	     
	     action.moveToElement(rcr).build().perform();
	     
	     driver.findElement(By.linkText("Go to NaukriRecruiter")).click();
	     
	     
	     
	     
	     driver.quit();

	}

}
