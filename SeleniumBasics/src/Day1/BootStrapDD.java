package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDD {

	public static void main(String[] args) throws InterruptedException {
		

	
		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.id("menu1")).click();
		
		Thread.sleep(3000);
		
		
		List <WebElement> dd_menu=driver.findElements(By.xpath("//ul[contains(@class, 'dropdown-menu test')]//li//a"));
		
		for(WebElement element: dd_menu) {
			
			 String innerHTML = element.getAttribute("innerHTML");
       
			 System.out.println("values of dropdown" +innerHTML);
			 
			 Thread.sleep(3000);
			 
			 if (innerHTML.contentEquals("CSS")) {
				 
				 element.click();
				 
				 break;
				 
				 
			 }
		}
	      
		driver.quit();
	}
	
}
		
		
	