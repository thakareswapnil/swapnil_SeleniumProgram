package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
	
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("swapnilmachhindra.thakare23@gmail.com");

	}

}
