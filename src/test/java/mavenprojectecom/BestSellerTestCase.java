package mavenprojectecom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.ExtentRep;
import commonmethods.TakeScreenShot;
import commonmethods.TestBase;
import exceldata.Exceldriven;
import objrep.BestSellerpage;
import objrep.HomePageEle;
import objrep.ProductDetailspage;

public class BestSellerTestCase extends TestBase{
	static ExtentRep ex ;
	static TestBase tb;
	@BeforeTest
	public void setup() {
		 ex = new ExtentRep();
		ex.extentsetup();
		
	}
	@AfterTest
	public void repgen() {
		ex.genrep();
		
	}
	
	
	@BeforeMethod
	public void openbrowser() {
		 tb = new TestBase();
		tb.LaunchBrowser("firefox");
		
	}
	@AfterMethod
	public void closeb() {
		tb.closebrowser();
		
	}
	@Test
	public static void test1() throws InterruptedException, IOException {
		HomePageEle hp = new HomePageEle(driver);
		Thread.sleep(5000);
		//hp.bestseller().click();
		BestSellerpage bsp = new BestSellerpage(driver);
		Thread.sleep(5000);
		hp.popup().click();
		bsp.firstbestitem().click();
		Thread.sleep(10000);
		ProductDetailspage pdp=new ProductDetailspage(driver);
		String Actualproducttext=pdp.producttext().getText();
		Exceldriven excel = new Exceldriven();
		String expectedtext=excel.readdata(1, 0);
		if(Actualproducttext.contains(expectedtext)) {
			
			excel.writedata(1, 1, "valid data");
			ex.passtest();
		}else {
			
			excel.writedata(1, 1, "invalid data");
			TakeScreenShot sh= new TakeScreenShot();
			sh.scshot();
			ex.testfail();

		}
		
		
	}
	
	
	@Test
	public static void test2() throws InterruptedException, IOException {
		
		HomePageEle hp = new HomePageEle(driver);
		//hp.bestseller().click();
		BestSellerpage bsp = new BestSellerpage(driver);
		Thread.sleep(5000);
		hp.popup().click();

		bsp.secondbestitem().click();
		Thread.sleep(10000);
		ProductDetailspage pdp=new ProductDetailspage(driver);
		String Actualproducttext=pdp.producttext().getText();
		Exceldriven excel = new Exceldriven();
		String expectedtext=excel.readdata(2, 0);
		if(Actualproducttext.contains(expectedtext)) {
			
			excel.writedata(2, 1, "valid data");
			ex.passtest();
		}else {
			
			excel.writedata(2, 1, "invalid data");
			TakeScreenShot sh= new TakeScreenShot();
			sh.scshot();
			ex.testfail();

		}
		
		
		
	}
	
	
	@Test(enabled=false)
	public static void test3() throws InterruptedException, IOException {
		HomePageEle hp = new HomePageEle(driver);
		//hp.bestseller().click();
		BestSellerpage bsp = new BestSellerpage(driver);
		Thread.sleep(5000);
		hp.popup().click();

		bsp.thirdbestitem().click();
		Thread.sleep(10000);
		ProductDetailspage pdp=new ProductDetailspage(driver);
		String Actualproducttext=pdp.producttext().getText();
		Exceldriven excel = new Exceldriven();
		String expectedtext=excel.readdata(3, 0);
		if(Actualproducttext.contains(expectedtext)) {
			
			excel.writedata(3, 1, "valid data");
			ex.passtest();
		}else {
			
			excel.writedata(3, 1, "invalid data");
			TakeScreenShot sh= new TakeScreenShot();
			sh.scshot();
			ex.testfail();
		}
		
		
	}
	
	@Test(enabled=false)
	public static void test4() throws InterruptedException, IOException {
		
		HomePageEle hp = new HomePageEle(driver);
		//hp.bestseller().click();
		BestSellerpage bsp = new BestSellerpage(driver);
		Thread.sleep(5000);
		hp.popup().click();

		bsp.fourthbestitem().click();
		Thread.sleep(5000);
		ProductDetailspage pdp=new ProductDetailspage(driver);
		String Actualproducttext=pdp.producttext().getText();
		Exceldriven excel = new Exceldriven();
		String expectedtext=excel.readdata(4, 0);
		if(Actualproducttext.contains(expectedtext)) {
			
			excel.writedata(4, 1, "valid data");
			ex.passtest();
			
		}else {
			
			excel.writedata(4, 1, "invalid data");
			TakeScreenShot sh= new TakeScreenShot();
			sh.scshot();
			ex.testfail();
		}
		
	}
	
	@Test(enabled=false)
	public static void test5() throws InterruptedException, IOException {
		
		HomePageEle hp = new HomePageEle(driver);
		//.bestseller().click();
		BestSellerpage bsp = new BestSellerpage(driver);
		Thread.sleep(5000);
		hp.popup().click();

		bsp.fifthbestitem().click();
		Thread.sleep(10000);
		ProductDetailspage pdp=new ProductDetailspage(driver);
		String Actualproducttext=pdp.producttext().getText();
		Exceldriven excel = new Exceldriven();
		String expectedtext=excel.readdata(5, 0);
		if(Actualproducttext.contains(expectedtext)) {
			
			excel.writedata(5, 1, "valid data");
			ex.passtest();
			
		}else {
			
			excel.writedata(5, 1, "invalid data");
			TakeScreenShot sh= new TakeScreenShot();
			sh.scshot();
			ex.testfail();
		}
		
		
		
	}

}
