package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleNaukri {

	public static void main(String[] args) throws InterruptedException {
	
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("usernameField")).sendKeys("s.rane24@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("shraddhatrupti24");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("parent window id is" + parentWindow);
		
		
		
		
		Actions services = new Actions (driver);
		
		services.moveToElement(driver.findElement(By.xpath("//a[@title = 'Naukri FastForward- Resume Services']"))).build().perform();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Resume Display")).click();
		
		
		
		//driver.findElement(By.xpath("//a[contains(@title, 'Jobs by Skill']")).click();
	
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
