package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.orangehrm.com/");
	
	Thread.sleep(2000);
	String Url=driver.getCurrentUrl();
	
	System.out.println(Url);
	
	if(Url.equals("https://www.orangehrm.com/")){
		System.out.println("coreect");
	}
	 else 
	 	System.out.println("incorrect");
		
	
	
     driver.close();
	}

}
