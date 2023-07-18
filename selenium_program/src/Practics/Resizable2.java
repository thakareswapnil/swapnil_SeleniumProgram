package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Resizable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Resizable.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(ele, 200,200).build().perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
