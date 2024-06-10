package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", monochrome = true, tags = "not @exception")

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
