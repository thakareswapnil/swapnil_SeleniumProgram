package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectListBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32.\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        
        driver.manage().window().minimize();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@class=\"form-control select-input\"]")).click();
        
        driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[5]")).click();
        
        Thread.sleep(5000);
        
        driver.close();
        
        
        
        
        
	}

}
