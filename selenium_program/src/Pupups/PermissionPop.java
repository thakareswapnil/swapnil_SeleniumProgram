package Pupups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PermissionPop {

	public static void main(String[] args) throws InterruptedException {
		
//	 ChromeOptions option=new ChromeOptions();
//	 
//	 option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://www.hdfcbank.com/");

		   	Thread.sleep(2000);
		   	
		   	driver.quit();
		   	
		   	
	}
}
