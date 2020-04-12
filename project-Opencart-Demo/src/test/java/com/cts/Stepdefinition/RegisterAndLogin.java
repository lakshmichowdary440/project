package com.cts.Stepdefinition;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.cts.pages.RegisterAndLoginClass;
import com.cts.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterAndLogin extends Wrapperclass {
	
	RegisterAndLoginClass Ral;
	private static Logger logger = (Logger) LogManager.getLogger(RegisterAndLoginClass.class);    
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws IOException  {
		Browser_Launch("firefox");
		logger.debug("Chrome is launched");
	   }

	@When("^the user creates a new account$")
	public void the_user_creates_a_new_account() throws Throwable {
		Ral = new RegisterAndLoginClass(driver);
		Ral.Register();
		screenshot("src/main/resources/screenshot/RegIST.png");         

		logger.debug("the account created ");
	}

	@Then("^the user enters \"([^\"]*)\" and \"([^\"]*)\" and clicks$")
	public void the_user_enters_and_and_clicks(String arg1, String arg2) throws Throwable {
	    Ral.Login1(arg1, arg2);
		screenshot("src/main/resources/screenshot/Login.png");  
	 	    logger.debug("the user logins using username and password");

	}
	




}