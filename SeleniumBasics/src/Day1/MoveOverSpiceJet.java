package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOverSpiceJet {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.spicejet.com/");
		
		WebElement menu = driver.findElement(By.cssSelector("#highlight-addons"));
		
		Actions action = new Actions (driver);
		
		action.moveToElement(menu).build().perform();
		
		
		//driver.findElement(By.xpath("//a[contains(text(), 'You 1st')]")).click();
		
	Thread.sleep(3000);
	
	
    WebElement lgn =  driver.findElement(By.cssSelector("#Login"));
    
    action.moveToElement(lgn).build().perform();
		
		
	driver.quit();
	}

}
