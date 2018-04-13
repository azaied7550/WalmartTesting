package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
	
	public static void WmrtHome(WebDriver driver) {
System.out.println("Hello this is WmrtHOme");
		// Locate Elements
		WebElement allDepartments = driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div[1]/div/div/div[4]/form/div/div[1]/div/button"));
		WebElement homeDepartments = driver.findElement(By.id("header-SearchDropdown-option-11"));

		WebElement searchBox = driver.findElement(By.id("global-search-input"));
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='header-GlobalSearch-submit btn']"));

		// Perform Action
		allDepartments.click();
		homeDepartments.click();
		searchBox.sendKeys("Light Bulb");
		searchBtn.click();
		}
}