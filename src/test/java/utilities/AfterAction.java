package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterAction {
	TakeScreenShots TakeScreenShotsObj = new TakeScreenShots();
	
	@After
	public void AfterActions(Scenario Scenario) throws Exception {
		
		if (Scenario.isFailed()) {
			TakeScreenShotsObj.screenshots();
			Scenario.embed(((TakesScreenshot)SetupDriver.driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
		
		
		SetupDriver.teardownDriver();
		System.out.println("---Test Complete, Browser Closed");
		
	}

}
