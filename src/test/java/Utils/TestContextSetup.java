package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String TrimmeditemNameOnLandingPage;
	public String itemNameOnLandingPage;
	public String quantityOnLandingPage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public ReusableMethod reusableMethods;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		reusableMethods = new ReusableMethod(testBase.WebDriverManager());
		
	}
}
