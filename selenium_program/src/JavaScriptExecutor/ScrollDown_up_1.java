package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_up_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		        
		        driver.manage().window().maximize();
		        
                Thread.sleep(4000);
                
                JavascriptExecutor js=(JavascriptExecutor)driver;
                
                //for scroll down
    
                js.executeScript("window.scrollBy(0,9000)", "");
                
                Thread.sleep(4000);
                //for scrollup
                js.executeScript("window.scrollBy(0,-2000)", "");
                
                Thread.sleep(4000);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	}
	
	
	

}
