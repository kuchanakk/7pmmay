package mavenprojectecom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonmethods.TestBase;
import objrep.BestSellerpage;
import objrep.HomePageEle;

public class BLaunch extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase tb = new TestBase();
		tb.LaunchBrowser("edge");
		HomePageEle hp = new HomePageEle(driver);
		//System.out.println(hp.bestseller().getText());
		//System.out.println(hp.bestseller().getAttribute("text"));
		//Thread.sleep(15000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.elementToBeClickable(hp.bestseller())).click();
		 * //hp.bestseller().click();
		 */		
		driver.findElement(By.xpath("//*[@id=\"cn-accept-cookie\"]")).click();
		Thread.sleep(5000);
		BestSellerpage bp = new BestSellerpage(driver);
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",bp.fourthbestitem());
		
		Actions ac = new Actions(driver);
		//ac.moveToElement(bp.fourthbestitem()).build().perform();
		//bp.fourthbestitem().sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(5000);

		bp.fourthbestitem().click();
		
		
		
	}

}
