package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicCheckAndRadio {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		
		List <WebElement> radio =driver.findElements(By.xpath("//input[@name = 'lang' and @type = 'radio']"));
		
		 for (int i = 0 ; i< radio.size () ;  i ++) {
			
			WebElement r1 =  radio.get(i);
			
		String allvalue	= r1.getAttribute("value");
		
		System.out.println("radio button values " + allvalue);
			
			
			if (allvalue.equalsIgnoreCase("Ruby")) {
				
				
				r1.click();
				
			}
				
			}
		
		Thread.sleep(4000);
		
		System.out.println("##############################");
		
	   List <WebElement> chk = driver.findElements(By.xpath("//input[@name = 'lang' and @type = 'checkbox']"));
		 
		 
		 for (WebElement ele : chk) {
			 
			 String elename = ele.getAttribute("id") ;
			 
			System.out.println(elename);
			
			
			if (elename.equalsIgnoreCase("Code")) {
				
				ele.click();
				
				break ;
				
				}
				
				
			}
		 }
		 
		 
		 
		 
		 
		 
		 
	}


