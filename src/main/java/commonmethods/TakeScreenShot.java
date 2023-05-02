package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShot extends TestBase{
	
	
	public void scshot() throws IOException {
		
		
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("C:\\Users\\kiran\\eclipse-workspace\\mavenprojectecom\\resources\\scnshot\\errorimage1.png"));
	}
	

}
