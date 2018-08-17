package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	    // create  object of javascriptexecutor 
		
		JavascriptExecutor js = ((JavascriptExecutor)driver) ;
		
		// use method js.executescript and scroll
		
		js.executeScript("scroll (0,800)"); //  scroll down
		
		js.executeScript("scorll (0,-800)");
		
		
		
		
		Thread.sleep(500);
		
		
		driver.quit();
		

		
		
	}

}
