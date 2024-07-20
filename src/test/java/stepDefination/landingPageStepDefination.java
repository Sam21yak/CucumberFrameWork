package stepDefination;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class landingPageStepDefination {
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public landingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}

	
//	Single responsibilty principle
//	Loosely coupled 
	
	@Given("user is on Greencart landing page")
	public void user_is_on_greencart_landing_page() {
		String pageTitle = testContextSetup.reusableMethods.getPageTitle();
		Assert.assertTrue(pageTitle.contains("GreenKart"));
	}
	
	@When("^user searched with shortName (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws Exception {
		//LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		//Thread.sleep(5000);
		testContextSetup.itemNameOnLandingPage = landingPage.getSearchedItemName();
		testContextSetup.TrimmeditemNameOnLandingPage = landingPage.getSearchedItemName().split(" - ")[0].trim();
		System.out.println("Item name is extracted from homepage : "+testContextSetup.TrimmeditemNameOnLandingPage);
	}
	
	@When("^Added (.+) items of the searched item to the cart$")
	public void and_added_items_of_the_searched_item_to_the_cart(String qty) {
	 landingPage.enterQtyField(qty);
	 landingPage.addToCartButton();
	 landingPage.miniCartIcon();
	 landingPage.proceedToCheckout();
	}
	
	
}
