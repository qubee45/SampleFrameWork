package pageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElement {
	@FindBy(xpath="//input[@aria-label='Search']")
	public WebElement Searchtxtbx;
	
	@FindBy(xpath="//i[@class='ld ld-Search absolute']")
	public WebElement SearchIcone;
	
	
}
