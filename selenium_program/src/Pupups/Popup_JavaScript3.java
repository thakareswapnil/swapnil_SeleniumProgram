package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_JavaScript3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		   	
		   	driver.switchTo().alert().sendKeys("123456");
		   	
		   	Thread.sleep(4000);
		   	
		   	driver.switchTo().alert().accept();
		   	
		   	WebElement ele=driver.findElement(By.id("result"));
		   	
		   	Thread.sleep(2000);
		   	
		   	System.out.println(ele.getText());
		   	
		   	driver.close();

		   	
	}

}
