package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", dryRun = false,
        glue = "stepDefinitions",
        monochrome = true,
        tags = "not @exception", plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests {
}