package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenListBOx {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
	   driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("macbook");
	
	
	
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
