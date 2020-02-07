package cucumbertest.testng;

// TestNG
import org.testng.annotations.AfterMethod;

// Cucumber imports
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// Selenium imports
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

// Galen imports
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;

// Java import
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StepDefinitions {
  // Selenium
  private static WebDriver driver;

  // Galen
  private static final String mainSpec = "src/test/resources/main.spec";
  private LayoutReport layoutReport;



  @Given("Go to Google Web Search")
  public void go_to_google(){
    System.out.println("go to google");

    try {
      // Optional. If not specified, WebDriver searches the PATH for chromedriver.
      System.setProperty("webdriver.chrome.driver", "D:/Sopra/04.Downloads/chromedriver_win32_79/chromedriver.exe");
      this.driver = new ChromeDriver();
      driver.get("http://www.google.com/");
    } catch (Exception e) {
      System.out.println("exception has occurred");
      e.printStackTrace();  
    }

  }

  @When("I say a word {string}")
  public void i_say_a_word(String string) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("I say a word" + string);

      try {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver"); 
        searchBox.submit();
        Thread.sleep(5000); // Let the user actually see something!
      } catch (Exception e) {
        System.out.println("exception has occurred");
        e.printStackTrace();  
      }
  }

  @Then("I should be getting {string} results")
  public void i_should_be_getting_results(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("I should be getting " + string + " results");
    //throw new io.cucumber.java.PendingException();

    try {

        //Executing Layout check and obtaining the Layout report
        this.layoutReport = Galen.checkLayout(driver, mainSpec, Arrays.asList("desktop"));


            //Creating a list of tests
            List<GalenTestInfo> tests = new LinkedList<>();
            //The object you create will be consisting the information regarding the test
            GalenTestInfo test = GalenTestInfo.fromString("Test Automation Using Galen Framework");
            //Adding layout report to the test report
            test.getReport().layout(layoutReport, "Verify logo present and log image comparison");
            tests.add(test);
            //Exporting all test report to html
            new HtmlReportBuilder().build(tests, "target/galen-html-reports");

        driver.quit();
    } catch (Exception e) {
        System.out.println("exception has occurred");
        e.printStackTrace();
        
    }
  }

  
  @AfterMethod
  public void reportUpdate() {
      try {
          //Creating a list of tests
          List<GalenTestInfo> tests = new LinkedList<>();
          //The object you create will be consisting the information regarding the test
          GalenTestInfo test = GalenTestInfo.fromString("Test Automation Using Galen Framework");
          //Adding layout report to the test report
          test.getReport().layout(layoutReport, "Verify logo present and log image comparison");
          tests.add(test);
          //Exporting all test report to html
          new HtmlReportBuilder().build(tests, "target/galen-html-reports");
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

  /*
    @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
 
    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
 
    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
 
    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
 
    @Then("^I should see the \"([^\"]*)\" button$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    /**/
 
}