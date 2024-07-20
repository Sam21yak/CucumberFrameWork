package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By itemName = By.cssSelector("p.product-name");
	public String itemName() {
		return driver.findElement(itemName).getText();
	}
	
	By quantity = By.cssSelector("p.quantity");
	public String quantity() {
		return driver.findElement(quantity).getText();
	}
	
	By applyCouponButton = By.xpath("//button[contains(text(),'Apply')]");
	public boolean applyCouponButton() {
		return driver.findElement(applyCouponButton).isDisplayed();
	}
	
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	public boolean placeOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
