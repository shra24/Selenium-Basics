package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNoOfLinks {

	
		
		public static void main(String[] args) {
			
			  System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
					
					WebDriver driver = new ChromeDriver () ;
					
					driver.manage().window().maximize();
					
					driver.manage().deleteAllCookies();
					
				     driver.get("https://in.yahoo.com/?p=us");
				     
				     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				     
				     
				     List <WebElement> linklist = driver.findElements(By.tagName("a"));
				     
				     int linkCount = linklist.size();
				     
				     System.out.println(linkCount);
				     
				     
				     for (int i = 0;  i<linkCount ; i++) {
				    	 
				            String linktext =  linklist.get(i).getText();
				    	 
				    	 System.out.println(linktext);
				    	 
				    	 
				    	 
				     }
					
					

	}

}
