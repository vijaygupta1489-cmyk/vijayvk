package Crossbrowser_Compatible;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class FirefoxBrowserCompatible {
	
		@Test (priority=1)
		public void FirefoxBrowserAutomate()
		{
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
			d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			
			d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			
			d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
			
			
		}
		
	}
	
}
