package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRep {
	
	static ExtentReports extent ;
	static ExtentTest test;;

	public void extentsetup() {
		
		
		 extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test=extent.createTest("myseleniumtest");

		//ExtentTest test;
		//test.log(Status.PASS, "info");
		//.log(Status.FAIL, "This is a logging event for MyFirstTest, and it passed!");
	}
	
	
	public void passtest() {
		
		test.log(Status.PASS, "test is pass");
	

	}
	
public void testfail() {
		
		test.log(Status.FAIL, "test is fail");
		
		test.addScreenCaptureFromPath("C:\\\\Users\\\\kiran\\\\eclipse-workspace\\\\mavenprojectecom\\\\resources\\\\scnshot\\\\errorimage1.png");
	
}
	
	
	public  void genrep() {
		
		extent.flush();
	}

}
