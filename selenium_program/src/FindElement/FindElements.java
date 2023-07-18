package FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		
		   
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://www.amazon.com/");

		   	Thread.sleep(4000);
		   	
		   	List<WebElement> SearchBox=driver.findElements(By.id("twotabsearchtextbox"));
		   	
		   
		   	for(WebElement ele2:SearchBox) {
		   		System.out.println(ele2.getText());
		   		
		   	}
		    List<WebElement> links=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
		   	 System.out.println(links.size());
		   	 
		   	 for(WebElement ele:links) {
		   		 System.out.println(ele.getText());
		   	 
		   	 List<WebElement> links1=driver.findElements(By.xpath("//a[@class=\"navv-a  \"]"));
		   	 System.out.println(links1.size());
		   	 
		   	 

	}
	}
}
