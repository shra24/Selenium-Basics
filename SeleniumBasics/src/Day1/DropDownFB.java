package Day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFB {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Anand\\Study Videos\\ChromeDriver\\Compressed\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Chao");
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Zinga");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("9082836109");
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("Password@123");
		
		
	  
		WebElement month=(driver.findElement(By.xpath("//select[@id='month']")));
		
			  Select month_mm = new Select(month);
			  
			 //System.out.println(month.getFirstSelectedOption());
			 
			 	  
	        month_mm.selectByVisibleText("Nov");
	        
	        WebElement kk = month_mm.getFirstSelectedOption();
	        System.out.println(kk.getText());
	        
	       
	        
	        
	        
	        
	  
	  Select day =  new Select (driver.findElement(By.xpath("//select[@id='day']")));
	  day.selectByValue("10");
	  
	  
	  Select yr =  new Select (driver.findElement(By.xpath("//select[@id='year']")));
	  yr.selectByValue("2000");
	  
	  driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
	  
		
		
		

	}

}
