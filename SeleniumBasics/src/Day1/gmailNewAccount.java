package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailNewAccount {
	 

	

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		
		  driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	        
		driver.get("http://www.google.com");
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        
        WebElement Fname = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        Fname.sendKeys("test100");
        
        WebElement Lname = driver.findElement(By.id ("lastName"));
        Lname.sendKeys("test200");
        
        WebElement Uname = driver.findElement(By.name("Username"));
        Uname.sendKeys("wiremobo");
        
        WebElement Pwd = driver.findElement(By.name("Passwd"));
        Pwd.sendKeys("Password@123");
        
        WebElement CPwd = driver.findElement(By.name("ConfirmPasswd"));
        CPwd.sendKeys("Password@123");
        
        WebElement NxtBtn = driver.findElement(By.xpath("//content[contains(@class, 'CwaK9')]"));
        NxtBtn.click();
        
      
        WebElement phn = driver.findElement(By.id("phoneNumberId"));
        phn.sendKeys("998850786");
        
        
        WebElement n1 = driver.findElement(By.cssSelector("#gradsIdvPhoneNext > content"));
        n1.click();
        
       // #gradsIdvPhoneNext > content > span
  
        
        
        
        
	}

}
