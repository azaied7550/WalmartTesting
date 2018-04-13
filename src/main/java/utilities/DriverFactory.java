package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static WebDriver openBrowser(String browserType) {
		if (browserType.equalsIgnoreCase("firefox")){
			System.setProperty("WebDriver.FirefoxDriver", "C:\\Users\\Ahmed\\workspace\\WalmartTesting\\geckodiver.exe");
			return new FirefoxDriver();
		}
		else{
			System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Ahmed\\workspace\\WalmartTesting\\chromedriver.exe");
			return new ChromeDriver();
		}
		
	}

}
