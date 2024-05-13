package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainsteps {
    @Given("User is on banking login page with {string} and password {string}")
    public void user_is_on_banking_login_page(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on banking login page with " + username + " and password " + password);
        //throw new io.cucumber.java.PendingException();
    }
    @When("User logins into application")
    public void user_logins_into_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logins into application");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Homepage is displayed")
    public void homepage_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Homepage is displayed");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User cards are displayed")
    public void user_cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User cards are displayed");
        //throw new io.cucumber.java.PendingException();
    }
}
