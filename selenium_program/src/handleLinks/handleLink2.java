package handleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleLink2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
	    Thread.sleep(2000);
	   
	    List<WebElement> alltags=driver.findElements(By.tagName("a"));
	    System.out.println("total number present on webpage are-->"+alltags.size());
	    
	    for(WebElement links:alltags) {
	    	//System.out.println(links.getText());
	    	System.out.println(links.getAttribute("href"));
	    }
	   
	    }
	    
	    
	}


