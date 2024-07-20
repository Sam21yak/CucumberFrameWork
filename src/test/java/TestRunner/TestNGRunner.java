package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/java/featuresFile",
		glue="stepDefination",
		monochrome=true,
		plugin= {"html:report/html-report/cucumber.html","json:report/json-report/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/rerun/failed_scenarios.txt"}
		//dryRun=true,
		//tags="@CheckoutPage and @OffersPage"
		)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
