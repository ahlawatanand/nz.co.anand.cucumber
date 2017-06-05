package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features/trello.feature",
		glue = "stepDefinations",
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber/git.json",
		}
		)


public class RunTest {

}
