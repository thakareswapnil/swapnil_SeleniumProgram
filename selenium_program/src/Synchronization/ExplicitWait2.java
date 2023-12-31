package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
	//	WebDriverWait Mywait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//WebElement ele=Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		By input1=By.id("src");
		waitforelement(driver,input1,30).sendKeys("pune");
		
		
		By input2=By.id("dest");
		waitforelement(driver,input2,30).sendKeys("mumbai");
		
		
		
	}
	public static WebElement waitforelement(WebDriver driver,By Locator,int timeout) {
		
		WebDriverWait Mywait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		Mywait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
		return driver.findElement(Locator);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
