package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
				
		   	driver.get("http://omayo.blogspot.com/");
		  
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
	WebElement ele =driver.findElement(By.xpath("//button[@ondblclick=\"dblclickAlert()\"]"));
	
	Actions act=new Actions(driver);
	
	act.doubleClick(ele).build().perform();
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();

	Thread.sleep(3000);
	}

}
