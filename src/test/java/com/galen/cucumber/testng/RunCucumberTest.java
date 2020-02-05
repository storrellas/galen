package cucumber.testng;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = "json:target/cucumber-report.json")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
