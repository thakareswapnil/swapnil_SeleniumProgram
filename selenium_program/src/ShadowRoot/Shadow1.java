package ShadowRoot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow1 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/shadowdom");
			
		    Thread.sleep(2000);
		    
		  System.out.println(  driver.findElement(By.xpath("//span[@slot=\"my-text\"]")).getText());

	}

}
