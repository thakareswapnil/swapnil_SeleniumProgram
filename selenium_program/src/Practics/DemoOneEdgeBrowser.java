package Practics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoOneEdgeBrowser {
	public static void main(String[] args) {
		 {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\Microsoft Edge.exe");

			WebDriver driver=new EdgeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	}
}
