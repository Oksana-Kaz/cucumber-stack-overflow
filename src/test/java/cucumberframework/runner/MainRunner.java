package cucumberframework.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/java/cucumberframework/featureFiles"},
			glue = {"cucumberframework.steps"},
			monochrome = true,
			plugin = {"pretty", "html:targetRepot", "json:targetReport/cucumber.json"})

	public class MainRunner {

}
