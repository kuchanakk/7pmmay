package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageEle {
	
	
	static WebDriver driver;
	
	
	public HomePageEle(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public WebElement bestseller() {
		return driver.findElement(By.linkText("												Bestsellers												"));
		
	}
	
	public WebElement popup() {
		
		return driver.findElement(By.id("cn-accept-cookie"));
	}
	
	

}
