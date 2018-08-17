package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mosterRegi {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://my.monsterindia.com/create_account.html?r=1481333332");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id = 'firstName_id']")).sendKeys("suppliertwo");
		driver.findElement(By.xpath("//input[@id = 'lastName_id']")).sendKeys("buyerone");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("098765@xy.com");
        driver.findElement(By.xpath("//input[@id='passwd_id']")).sendKeys("password@123");
		
		//driver.findElement(By.xpath("//span[text()= 'Current location' and @class = 'select2-chosen']")).click();
		
		//driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).sendKeys("Ahmedabad");
		
		//driver.findElement(By.xpath(")
	
		
		driver.findElement(By.xpath("//input[@id='mobile2']")).sendKeys("9988776654");
		
		
		driver.findElement(By.xpath("//div[@id = 'expYrMonth']")).click();
		
		
	}

}
