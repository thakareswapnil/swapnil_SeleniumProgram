package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getposition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
		driver.close();
	}

}
