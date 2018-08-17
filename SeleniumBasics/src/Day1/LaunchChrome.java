package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("http://www.google.com");
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		if (Title.equals("Google")){
			
		System.out.println("Title is correct");
		
		}
		
		else { 
			
			System.out.println("Title is incorrect");
		}
			
        System.out.println(driver.getCurrentUrl());
   
       driver.close();
   

	}

}
