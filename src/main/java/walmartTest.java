import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EndTest;
import pages.HomePage;
import pages.ItemPage;


public class walmartTest {

	public static void main(String[] args) {
		String baseUrl = "https://www.walmart.com/";
		// String browserType ="Chrome";
		// WebDriver driver;

		// Creating the environment
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Ahmed\\workspace\\WalmartTesting\\chromedriver.exe");
		// driver = utilities.DriverFactory.openBrowser(browserType);
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	
	HomePage.WmrtHome(driver);
	ItemPage.SrchResult(driver);
	ItemPage.AddToCart(driver);
	EndTest.stopTest(driver);
	

}
//		public static void WmrtHome(WebDriver driver) {
//
//		// Locate Elements
//		WebElement allDepartments = driver.findElement(By.id("listboxActive"));
//		WebElement homeDepartments = driver.findElement(By.id("header-SearchDropdown-option-11"));
//
//		WebElement searchBox = driver.findElement(By.id("global-search-input"));
//		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='header-GlobalSearch-submit btn']"));
//
//		// Perform Action
//		allDepartments.click();
//		homeDepartments.click();
//		searchBox.sendKeys("Light Bulb");
//		searchBtn.click();
//		}
		
//		public static void SrchResult (WebDriver driver){
//			WebElement item = driver.findElement(By.xpath(
//					"html/body/div[1]/div/div/div/div[1]/section/div[2]/div/div/div[2]/div[1]/div[4]/div[1]/div/div[2]/div[1]/span[2]/a/span"));
//			item.click();
//		}
//		public static void AddToCart (WebDriver driver){
//			WebElement addToCart = driver
//					.findElement(By.xpath("//button[@class='prod-ProductCTA--primary btn btn-primary btn-block']"));
//			addToCart.click();
//			}
//		
		
//		public static void EndTest (WebDriver driver){
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.close();
//	}
}
