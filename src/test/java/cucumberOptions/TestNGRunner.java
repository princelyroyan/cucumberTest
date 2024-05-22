package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
