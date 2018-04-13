package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {
	
	
	public static void SrchResult (WebDriver driver){
		WebElement item = driver.findElement(By.xpath(
				"html/body/div[1]/div/div/div/div[1]/section/div[2]/div/div/div[2]/div[1]/div[4]/div[1]/div/div[2]/div[1]/span[2]/a/span"));
		item.click();
	}
	public static void AddToCart (WebDriver driver){
		WebElement addToCart = driver
				.findElement(By.xpath("//button[@class='prod-ProductCTA--primary btn btn-primary btn-block']"));
		addToCart.click();
		}
	
}
