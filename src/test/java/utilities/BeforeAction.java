package utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeAction {
	
	@Before
	public void beforeActions(Scenario scen) {
		System.out.println("----->>>Initializing Driver<<<-----");
		SetupDriver.SetupDriver();
		System.out.println("Test Scenario Name:  " + scen.getName());
		
	}

}
