package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.cts.pages.AddToCartClass;
import com.cts.pages.EditAcntClass;
import com.cts.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditAcnt extends Wrapperclass {
	
	EditAcntClass edit;
	private static Logger logger = (Logger) LogManager.getLogger(EditAcntClass.class);    
	 
	@Given("^user launch the chrome app$")
	public void user_launch_the_chrome_app() throws Throwable {
		Browser_Launch("chrome");
		logger.debug("The chrome launched");
	}

	@When("^user login using un and pw$")
	public void user_login_using_un_and_pw() throws Throwable {
		edit= new EditAcntClass(driver);
		edit.LoginDetails();
		logger.debug("The user logins into account");
	   	}

	@Then("^click on edit your accont details$")
	public void click_on_edit_your_accont_details() throws Throwable {
		edit.Editaccount();
		screenshot("src/main/resources/screenshot/EditAcnt.png");
		logger.debug("The account details are updated");
	   
	}

}
