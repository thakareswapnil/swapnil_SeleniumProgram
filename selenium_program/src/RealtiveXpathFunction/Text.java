package RealtiveXpathFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		
		
		
	//	driver.findElement(By.xpath("//*[text()=\"Try it for Free\"]")).click();
		
		driver.findElement(By.xpath("//p[text()=\"Supercharge your HR team & empower your people with powerful HR software\"]")).click();
		
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
	}

}
