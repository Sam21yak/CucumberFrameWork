package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
    By searchField = By.xpath("//input[@id='search-field']");
    public void searchField(String name) {
    	driver.findElement(searchField).sendKeys(name);
    }
    
    By itemName = By.xpath("//tr/td[contains(text(),'Tomato')]");
    public String searchProductName() {
	return driver.findElement(itemName).getText();
    }
}