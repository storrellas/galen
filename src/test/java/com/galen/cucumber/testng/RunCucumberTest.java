package cucumbertest.testng;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = "json:target/cucumber-report.json", features="src/test/resources")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
