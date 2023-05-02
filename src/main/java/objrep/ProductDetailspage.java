package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailspage {
	
	static WebDriver driver;
	
	public ProductDetailspage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement producttext() {
		
		return driver.findElement(By.xpath("//*[@id=\"tt-pageContent\"]/div/div[2]/div[4]/div[2]/div/h1"));
	}
	
	

}
