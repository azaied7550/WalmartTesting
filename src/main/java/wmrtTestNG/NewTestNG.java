package wmrtTestNG;

import org.testng.annotations.Test;

import pages.EndTest;
import pages.HomePage;
import pages.ItemPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTestNG {
	WebDriver driver = new ChromeDriver();

	 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Ahmed\\workspace\\WalmartTesting\\chromedriver.exe");
  }
  
  @BeforeMethod
  public void beforMethod(){
	  	driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String expectedTitle = "Walmart.com | Save Money. Live Better.";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
  

  @AfterTest
  public void afterTest() {
	  System.out.println("Closing the test");
		EndTest.stopTest(driver);
}


  @Test
  public void testBody() {
	  	System.out.println("THis is the test method");
	  	HomePage.WmrtHome(driver);
		ItemPage.SrchResult(driver);
		ItemPage.AddToCart(driver);
  }
}
