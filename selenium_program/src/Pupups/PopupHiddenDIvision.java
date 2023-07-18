package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHiddenDIvision {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://www.flipkart.com/");
		   	
		   	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		   	
		   	Thread.sleep(4000);
	
	}

}
