package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BhanuLec1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

        driver.get("http://www.google.com");
        
        driver.navigate().to("https://www.phptravels.net/");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//div[@id = 's2id_autogen8']")).click();
        
        driver.findElement(By.xpath("//div[@id='select2-drop']//div//input")).sendKeys("and");
        
        driver.findElement(By.xpath("//div[@id='dpd1']//input")).click();
        
        
        
        
        
        
        
 
	}

}
