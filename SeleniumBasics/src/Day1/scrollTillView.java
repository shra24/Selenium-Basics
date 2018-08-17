package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollTillView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	    // create  object of javascriptexecutor 
		
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		
		// now scroll till end
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Thread.sleep(5000);
		
		// now scroll till up
		
		//js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		// scroll down tll pixel 
		
		
		//Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1500)");
		
		
		//scroll up till pixel
		
		//Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy (0,-1500)");
		
		
		
		WebElement abc = driver.findElement(By.xpath("//input[@id = 'newsletter-input']"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true);",abc);
		 
		abc.sendKeys("s.rane24@gmail.com");
		
		
		Thread.sleep(5000);
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
