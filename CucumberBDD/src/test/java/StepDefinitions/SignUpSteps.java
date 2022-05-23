package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {

	@Given("user is on login page")
	public void user_on_signUP() {
		
		System.out.println("Login Page");
	}
	
	@When("user enter email and password")
	public void email_password() {
		
		System.out.println("Email and PAssword");
	}

	@And("click on login button")
	public void ckick_on_login_button() {
		
		System.out.println("Login Button");
		
	}
	
	@Then("user is navigated to the home page")
	public void user_navigated_to_home_page() {
		
		System.out.println("Home Page");
	}
	
}
