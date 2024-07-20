package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="@target/rerun/failed_scenarios.txt",
		glue="stepDefination",
		monochrome=true,
		plugin= {"html:report/html-report/cucumber.html","json:report/json-report/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		//dryRun=true,
		//tags="@CheckoutPage and @OffersPage"
		)

public class Failed_TestNGRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
