package com.cts.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartClass {

WebDriver driver;   
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement MyAccount;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement Login;
	@FindBy(name="email")
	WebElement name;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement Login_btn;     
	@FindBy(xpath="//*[@id=\"wishlist-total\"]/span")
	WebElement Wishlist_btn;    
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/button")  
	WebElement Product;    
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/i")
	WebElement shoppingcart;
	
	public AddToCartClass(WebDriver driver) {
		
		this.driver=driver;                        
		  PageFactory.initElements(driver,this);
	}
 // This is used to login to the account
public void LoginDetails() throws IOException, InterruptedException {
		
		MyAccount.click();
		Login.click();
	    name.sendKeys("lakshmichowdary440a@gmail.com");
		Password.sendKeys("Glucky@196");
		Login_btn.click();
				
	}
	// This is used to select wishlist option
	public void Wishlist() {
		Wishlist_btn.click();
	}
	// This is used to add the product to shopping cart
	public void Addtocart() {
		Product.click();
		shoppingcart.click();
	}
}
