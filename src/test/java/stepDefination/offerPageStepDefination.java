package stepDefination;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;

public class offerPageStepDefination {
	TestContextSetup testContextSetup;	
	//PageObjectManager pageObjectManager;
	
	public offerPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	
	
	String itemNameOnOfferPage;
	
	@Then("^user searched for (.+) shortName in offers page$")
	public void user_searched_and_validate_for_the_same_short_name_on_offers_page(String shortName) throws Exception {
	  //String parantWindow = driver.getWindowHandle();
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.clickTopDealLink();
		testContextSetup.reusableMethods.switchWindowToChild();
		//Thread.sleep(10000);
		OffersPage offerPage = testContextSetup.pageObjectManager.getOffersPage();
		offerPage.searchField(shortName);
		//Thread.sleep(5000);
		itemNameOnOfferPage = offerPage.searchProductName();
		System.out.println("Item name is extracted from offer page : "+itemNameOnOfferPage);
	}
	@Then("validate item name in offers page matches with Landing page")
	public void validate_item_name_in_offers_page_matches_with_Landing_page() {
		assertEquals(itemNameOnOfferPage,testContextSetup.TrimmeditemNameOnLandingPage, "Item are mismatched on offers page");
	}
}
