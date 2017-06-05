package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;*/


@RunWith(Cucumber.class)
/*@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 3,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true,
excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@RunWith"},
outputFolder = "target")*/
@CucumberOptions(
		features = "features/trello.feature",
		glue = "stepDefinations",
		plugin = {
				"pretty:target/cucumber-pretty.txt",
				"html:target/cucumber-html",
				"json:target/cucumber.json",
				"junit:target/cucumber-result.xml",
				"usage:target/cucumber-usage.json"
		},
		tags = { },
		dryRun = false
		)

public class RunTest {
/*	@BeforeSuite
	public static void setUp() {
		// TODO: Add setup code
	}
	@AfterSuite
	public static void tearDown() {
		// TODO: Add tear down code
	}*/
}
