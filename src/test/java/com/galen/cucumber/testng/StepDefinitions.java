package cucumbertest.testng;
 
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 

public class StepDefinitions {

  @Given("Given today is Sunday")
  public void today_is_sunday(){
    System.out.println("Today is sunday");
  }

  @Given("today is Sunday")
  public void today_is_Sunday() {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("Today is sunday");
  }

  @When("I ask whether it's Friday yet")
  public void i_ask_whether_it_s_Friday_yet() {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("I ask whether it's Friday yet");
  }

  @Then("I should be told {string}")
  public void i_should_be_told(String string) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("I should be told");
      //throw new io.cucumber.java.PendingException();
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