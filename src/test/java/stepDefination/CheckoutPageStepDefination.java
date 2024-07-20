package stepDefination;

import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;

public class CheckoutPageStepDefination {

	TestContextSetup testContextSetup;
	LandingPage landingPage;
	CheckoutPage checkOutPage;
	
	public CheckoutPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		this.checkOutPage = testContextSetup.pageObjectManager.getCheckoutPage();
		
	}
	
	
	
	@Then("user proceeds to the checkout and validate the vegetable name in checkout page")
	public void user_proceeds_to_the_checkout_and_validate_the_vegetables_name_in_checkout_page() throws Exception {
		//Thread.sleep(2000);
	    String ItemNameOnCheckoutPage = checkOutPage.itemName();
	    System.out.println("Item Name on CheckOut is : "+ItemNameOnCheckoutPage);
		Assert.assertEquals(ItemNameOnCheckoutPage, testContextSetup.itemNameOnLandingPage);
//		String quantity = checkOutPage.quantity();
//	    Assert.assertEquals(quantity,);
	    
	}
	
	
	@Then("verify user has ability to apply coupon and place the order")
	public void verify_user_has_ability_to_apply_coupon_and_place_the_order() throws InterruptedException {
		//Thread.sleep(2000);
	    Assert.assertTrue(checkOutPage.applyCouponButton());
	    Assert.assertTrue(checkOutPage.placeOrder());
	}
}
