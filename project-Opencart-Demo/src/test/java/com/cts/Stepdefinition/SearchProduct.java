package com.cts.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.cts.pages.RegisterAndLoginClass;
import com.cts.pages.SearchClass;
import com.cts.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProduct extends Wrapperclass {
	
	      
	    		  
	    		  SearchClass search;
	    			private static Logger logger = (Logger) LogManager.getLogger(SearchClass.class);    

	    		  
	    		  @Given("^the user launch chrome application$")
	    			public void the_user_launch_chrome_application() throws IOException  {
	    			  Browser_Launch("chrome");
	    		 	    logger.debug("the chrome launched");

	    			   }
	    		   @When("^click on the search button select the product$")
	    		  public void click_on_the_search_button_select_the_product() throws Throwable {
	    			  search = new SearchClass(driver);
	    			   search.SearchProduct();
	    			   screenshot("src/main/resources/screenshot/search.png");
	    		 	    logger.debug("the searched product opened");

	    		      	    		  }

	    		  @Then("^close the website$")
	    		  public void close_the_website() throws Throwable {
	    		      search.ClosePage();
	    		  }
	    		  }
	    		      
	    		  

