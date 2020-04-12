package com.cts.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.cts.pages.AddToCartClass;
import com.cts.pages.SiteMapClass;
import com.cts.utilities.Wrapperclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart extends Wrapperclass {
	
	
	AddToCartClass Add; 
	private static Logger logger = (Logger) LogManager.getLogger(AddToCartClass.class);    

	
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() throws Throwable {
		Browser_Launch("chrome");
	    logger.debug("the chrome launched");
}
	   
	
	@When("^user login using username and password$")
	public void the_user_login_using_username_and_password() throws IOException, InterruptedException  {
		Add = new AddToCartClass(driver);
		Add.LoginDetails();
	    logger.debug("the user logged to the account ");

	   	}

	@Then("^go to wishlist$")
	public void go_to_wishlist() throws Throwable {
		Add.Wishlist();
	    logger.debug("items added to the wishlist");

	  
	}

	@Then("^add the product to cart$")
	public void add_the_product_to_cart() throws Throwable {	 
	    Add.Addtocart();
	    screenshot("src/main/resources/screenshot/AddToCart.png");
	    logger.debug("selected products added to the cart");

	}


}
