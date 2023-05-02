package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellerpage {
	
	static WebDriver driver;
	
	
	public BestSellerpage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public WebElement firstbestitem() {
		
		
		return driver.findElement(By.xpath("//*[@id='ajaxLoadData']/descendant::img[1]"));
	}
	
	public WebElement secondbestitem() {
		
		
		return driver.findElement(By.xpath("//*[@id='ajaxLoadData']/descendant::img[2]"));
	}
	
	
	public WebElement thirdbestitem() {
		
		
		return driver.findElement(By.xpath("//*[@id='ajaxLoadData']/descendant::img[3]"));
	}
	
	public WebElement fourthbestitem() {
		
		
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[4]/div/div[1]/a[3]/span[2]/img"));
	}
	
	public WebElement fifthbestitem() {
		
		
		return driver.findElement(By.xpath("//*[@id='ajaxLoadData']/descendant::img[6]"));
	}
	
	
}
