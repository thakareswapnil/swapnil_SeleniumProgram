package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://www.facebook.com/");
	    	
	    	
	    	driver.findElement(By.id("email")).sendKeys("asdfasdf");
	    	
	    	driver.findElement(By.id("pass")).sendKeys("123456");
	    	
	    	Thread.sleep(4000)
;	    	
	    	driver.findElement(By.id("email")).clear();
	    	
	    	driver.findElement(By.id("pass")).clear();
	    	
	    	driver.close();
	    	
	    	
	    	

	}

}
