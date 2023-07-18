package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		

	}

}
/*package MainMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RKENDRE\\Desktop\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://chromedriver.chromium.org/");
		
	}

}*/