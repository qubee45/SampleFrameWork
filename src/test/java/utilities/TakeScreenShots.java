package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShots {
	
	public void screenshots() throws Exception {
		String filename = "Walmart";
		
		DateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy h-m-s");
		Date date = new Date();
		
		File screenshot = ((TakesScreenshot) SetupDriver.driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File (System.getenv("user.dir")+"/screenshots"+ filename+dateformat.format(date)+".png"));
		
		System.out.println(">>>> ScreenShot Taken <<<<<<<<");
	}

	
}
