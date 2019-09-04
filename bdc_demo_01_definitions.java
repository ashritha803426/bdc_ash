package bdcstepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class bdc_demo_01_definitions {

@Given("user access the signup page")
public void user_access_the_signup_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
System.out.println("code for signup");
}

@Given("gets the credentials")
public void gets_the_credentials() {
    // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
	System.out.println("code for getting credentials");
}

@Given("user has valid account creds for DemoWebShop")
public void user_has_valid_account_creds_for_DemoWebShop() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("code for valid account");
}

@Given("provide the valid creds as inputs for the login process")
public void provide_the_valid_creds_as_inputs_for_the_login_process() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.out.println("code to prvide valid credentials");
}

@Then("verifies the state for the login status")
public void verifies_the_state_for_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.out.println("code to verify state of login process");
}


}
