package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	
	public static WebDriver driver;
	
	public static void SetupDriver() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-notifications");
		//option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.get("https://www.walmart.com/");
			}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void teardownDriver() {
		driver.close();
		driver.quit();
	}

}
