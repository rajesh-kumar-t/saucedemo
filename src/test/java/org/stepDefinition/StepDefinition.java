package org.stepDefinition;

import org.base.HelperClass;
import org.locat.SauceLoginPojo;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends HelperClass {
	
	public WebDriver driver;
	
	@Given("User is in Sourcedemo login page through Chrome browser")
	public void user_is_in_Sourcedemo_login_page_through_Chrome_browser() {
		
		launchbrowser();
		loadUrl("https://www.saucedemo.com/");
		maxBrowser();

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String user, String pass) {
	   
		SauceLoginPojo S = new SauceLoginPojo();
		filltextbox(S.getUserid(), user);
		filltextbox(S.getPasswd(), pass);
		
	}

	
	@Given("User is in Sourcedemo login page")
	public void user_is_in_Sourcedemo_login_page() {
		
		launchbrowser();
		loadUrl("https://www.saucedemo.com/");
		maxBrowser();
		
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		
		SauceLoginPojo S=new SauceLoginPojo();
		filltextbox(S.getUserid(), "standard_user");
		filltextbox(S.getPasswd(), "secret_sauce");
		
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		
		SauceLoginPojo S=new SauceLoginPojo();
		loginbtn();
		
	    
	}

	@Then("User should receive invalid credentials error")
	public void user_should_receive_invalid_credentials_error() {
	    
	}



}
