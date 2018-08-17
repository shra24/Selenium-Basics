package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeniusXpath {

	public static void main(String[] args) {
	
		
    System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("https://www.freecrm.com/index.html");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getCurrentUrl());
		
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
