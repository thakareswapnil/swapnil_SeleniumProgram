package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
	//	driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		

		 driver.close();
	}

}
