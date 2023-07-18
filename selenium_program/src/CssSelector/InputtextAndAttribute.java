package CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputtextAndAttribute {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();

		
		driver.get("https://app.hubspot.com/login");
		
		


	}

}
