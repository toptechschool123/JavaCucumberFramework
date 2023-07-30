package stepDefinitions;



import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPageObjects;

public class LoginSteps extends BaseClass {
	LoginPageObjects Lobject = new LoginPageObjects();

@Given("the user is on the homepage")
public void the_user_is_on_the_homepage() {
   BaseClass.initializeDriver();
   	logger.info("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
   	System.out.println("outttttttttttttttttt");
}

@When("user clicks on MyAccount")
public void user_clicks_on_my_account() {
	Lobject.clickMyAccount();
}

@When("user click on login")
public void user_click_on_login() {
	Lobject.clickLogin();
}

@When("user enters {string}  and {string}")
public void user_enters_and(String email, String password) {
	Lobject.enterEmail(email);
	Lobject.enterPassword(password);
}

@When("user clicks login button")
public void user_clicks_login_button() {
  Lobject.clickLoginBttn();
}

@Then("user is navigated to the login page")
public void user_is_navigated_to_the_login_page() {
	String ExpectedPageTitle =driver.getTitle();
	String actualTitle = "";
	
}



}