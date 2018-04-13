package smokeTest;

import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EndTest;
import pages.HomePage;
import pages.ItemPage;

public class NewTestJUnit {

	@Test
	public void mainTestJUnit() {
		String baseUrl = "https://www.walmart.com/";
		
		// Creating the environment
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Ahmed\\workspace\\WalmartTesting\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String expectedTitle = "Walmart.com | Save Money. Live Better.";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

		HomePage.WmrtHome(driver);
		ItemPage.SrchResult(driver);
		ItemPage.AddToCart(driver);
		EndTest.stopTest(driver);

	}

}
