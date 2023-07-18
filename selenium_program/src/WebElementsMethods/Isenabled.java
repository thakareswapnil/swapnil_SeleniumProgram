package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException {
		
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
			
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	 	
			
	    	driver.get("http://omayo.blogspot.com/");
	    	
	    	Thread.sleep(4000);
	    	
	    	
	    	Boolean b1=driver.findElement(By.id("but1")).isEnabled();
	    	
	    	
		    System.out.println(b1);
		
		    driver.close();
		
		    
		/*    driver.get("https://app.hubspot.com/login")
		    
		    
			Thread.sleep(4000);
		    
		    Boolean b1=driver.findElement(By.id("loginBtn")).isEnabled();
		    
		    System.out.println(b1);
		    
		    driver.close();
		
		
		*/
	}
}
