package pageStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageAction.HomePageAction;

public class HomePageSetpDef {
	HomePageAction HomePageActionObj = new HomePageAction();

@Given("^Open Walmart Homepage$")
public void open_Walmart_Homepage() throws Throwable {
  
}

@When("^Search for Chrismas Tree$")
public void search_for_Chrismas_Tree() throws Throwable {
	HomePageActionObj.SearchCrisTree();
}
}
