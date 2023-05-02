package commonmethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	protected static WebDriver driver;
	public  void LaunchBrowser(String browser) {
		
		
		if(browser.equals("firefox")) {
			
			 driver = new FirefoxDriver();
			 driver.get("https://easycom.quickeselling.com/categories/114707");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
		else if(browser.equals("chrome")) {
			
			 driver = new ChromeDriver();
			 driver.get("https://easycom.quickeselling.com/categories/114707");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}else if(browser.equals("edge")) {
			 driver = new EdgeDriver();
			 driver.get("https://easycom.quickeselling.com/categories/114707");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
		}
		
		
		
		
	}
	
	
	
	public void closebrowser() {
		driver.close();
		
	}
	

}
