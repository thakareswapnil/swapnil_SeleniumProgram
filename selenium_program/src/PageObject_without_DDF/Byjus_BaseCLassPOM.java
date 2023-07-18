package PageObject_without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practics.Byjus_LoginPagePOM;

public class Byjus_BaseCLassPOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Byjus_LoginPagePOM lp=new Byjus_LoginPagePOM(driver);
		
		
		lp.URL();
		lp.Login();

	}

}
