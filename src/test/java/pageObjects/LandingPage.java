package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	By search = By.xpath("//input[@type='search']");
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	By itemName = By.cssSelector("h4.product-name");
	public String getSearchedItemName() {
		return driver.findElement(itemName).getText();	
	}
	
	By TopDeals =  By.xpath("//a[contains(text(),'Top Deals')]");
	public void clickTopDealLink() {
	    driver.findElement(TopDeals).click();
	}
	
	By enterQtyField = By.cssSelector("input.quantity");
	public String enterQtyField(String qty) {
		driver.findElement(enterQtyField).clear();
		driver.findElement(enterQtyField).sendKeys(qty);
		return driver.findElement(enterQtyField).getText();
	}
	
	By addToCartButton = By.xpath("//button[contains(text(),'ADD TO CART')]");
	public void addToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	
	By miniCartIcon = By.cssSelector("a.cart-icon img");
	public void miniCartIcon() {
		driver.findElement(miniCartIcon).click() ;
	}
	
	By proceedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public void proceedToCheckout() {
		driver.findElement(proceedToCheckout).click();
	}
}
