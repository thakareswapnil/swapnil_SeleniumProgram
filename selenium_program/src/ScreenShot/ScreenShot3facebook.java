package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot3facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(7);
		
		String Imagename ="facebook";
		
		File Dest=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\"+Imagename+" "+Random+".jpg");
		
		FileHandler.copy(source, Dest);
		
		
		driver.quit();
	}

}
