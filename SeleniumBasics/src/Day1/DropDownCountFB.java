package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCountFB {

	public static void  main (String []rgs ) {
		
  System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		
		Select day = new Select (driver.findElement(By.id("day")));
		
		//day.selectByIndex(24);
		
		
		List<WebElement> daylist = day.getOptions();
		
		
		for (WebElement element : daylist) {
			
			String daynumb = element.getText();
			
			System.out.println(daynumb);
			
			if (daynumb.contentEquals("20")) {
				
				element.click();
				
				break ;
				
				
				
				
				
			}
			
			
		
		//int daycount = daylist.size();
		
		//System.out.println(daycount);
		
		//for (int i =0; i<daycount; i++) {
			
			//String daynumb2  =daylist.get(i).getText();
			
			//System.out.println(daynumb2);
		}
		
		
		
		
		
		
		

	}

}
