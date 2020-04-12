package com.cts.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.cts.pages.RegisterAndLoginClass;
import com.cts.pages.SearchClass;
import com.cts.pages.SiteMapClass;
import com.cts.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SiteMap extends Wrapperclass {

	SiteMapClass spclofr;
	private static Logger logger = (Logger) LogManager.getLogger(SiteMapClass.class);    

	
	@Given("^user launches the chrome application$")
	public void the_user_launch_the_chrome_application() throws IOException  {
		  Browser_Launch("chrome");
	 	    logger.debug("the chrome launched");

		}
	@When("^the user click on the sitemap$")
	public void the_user_click_on_the_sitemap() throws Throwable {
	  spclofr = new SiteMapClass(driver);
	  spclofr.SiteMap();
	    logger.debug("sitemap is selected");

	}

	@Then("^select special offers$")
	public void select_special_offers() throws Throwable {
		   spclofr.SpecialOffers();
	   screenshot("src/main/resources/screenshot/specialofrs.png");
	    logger.debug("specialoffers opened");


	}
}
