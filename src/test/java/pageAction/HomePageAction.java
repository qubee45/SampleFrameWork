package pageAction;

import org.openqa.selenium.support.PageFactory;

import pageElement.HomePageElement;
import utilities.SetupDriver;

public class HomePageAction {
	
	HomePageElement HomePageElementObj;
	
	public HomePageAction() {
		HomePageElementObj = new HomePageElement();
		PageFactory.initElements(SetupDriver.driver, HomePageElementObj);
		
		}
	public void SearchCrisTree() {
		HomePageElementObj.Searchtxtbx.sendKeys("christmas tree");
		HomePageElementObj.SearchIcone.click();
	}

}
