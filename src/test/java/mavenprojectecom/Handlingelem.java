package mavenprojectecom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonmethods.TestBase;
import exceldata.Exceldriven;

public class Handlingelem extends TestBase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  driver = new ChromeDriver();
		 driver.get("https://easycom.quickeselling.com/categories/114707");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='ajaxLoadData']/descendant::img[1]")).click();
		 Thread.sleep(5000);
		String etext=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[4]/div[2]/div/h1")).getText();
		for(int i=1;i<5;i++) {
			Exceldriven excel = new Exceldriven();
			String exp=excel.readdata(i, 0);
			System.out.println(exp);
			if(etext.contains(exp)) {
				
				excel.writedata(i, 1, "valid");
				
			}else {
				excel.writedata(i, 1, "invalid");

				
			}
			
		}
		
		
	}

}
