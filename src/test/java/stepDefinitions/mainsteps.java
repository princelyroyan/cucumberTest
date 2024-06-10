package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class mainsteps {
    @Given("Setup entries in DB")
    public void setup_entries_in_db() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("*********************");
        System.out.println("Setup entries in DB");
        //throw new io.cucumber.java.PendingException();
    }
    @When("Launch the browser")
    public void launch_the_browser() {
        System.out.println("*********************");
        System.out.println("Launch the browser");
        //throw new io.cucumber.java.PendingException();
    }
    @When("Hit the URL for the application")
    public void hit_the_url_for_the_application() {
        System.out.println("*********************");
        System.out.println("Hit the URL for the application");
        //throw new io.cucumber.java.PendingException();
    }

//    @Given("User is on banking login page ")
//    public void user_is_on_banking_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("User is on banking login page);
//        //throw new io.cucumber.java.PendingException();

        @Given("User is on banking login page")
        public void user_is_on_banking_login_page() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("User is on banking login page");
            //throw new io.cucumber.java.PendingException();
    }
    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on Practice landing page");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User signup into application")
    public void user_signup_into_application(List<String> data) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        //throw new io.cucumber.java.PendingException();
    }
//    @When("User logins into application with {string} and password {string}")
//    public void user_logins_into_application(String username, String password) {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("User logins into application with \" + username + \" and password \" + password");
//        //throw new io.cucumber.java.PendingException();
//    }
    @When("^User logins into application with (.+) and password (.+)$")
    public void user_logins_into_application(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logins into application with " + username + " and password " + password);
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Homepage is displayed")
    public void homepage_is_displayed() {
        // Write code here that turns the phrase above into concrete action
        System.out.println("Homepage is displayed");
        //throw new io.cucumber.java.PendingException();
    }
    @And("User cards are displayed")
    public void user_cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User cards are displayed");
        //throw new io.cucumber.java.PendingException();
    }
}
