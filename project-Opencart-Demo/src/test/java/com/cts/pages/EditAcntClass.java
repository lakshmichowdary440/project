package com.cts.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAcntClass {
WebDriver driver;   
	@FindBy(xpath="//a[@class='dropdown-toggle'][@title='My Account']")
	WebElement myaccount;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement login;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement login_btn;
	@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[1]/a")
	WebElement Editaccount;
	@FindBy(name="firstname")
	WebElement firstname;
	@FindBy(name="firstname")
	WebElement erase;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	WebElement continue_btn;
	
	
	public EditAcntClass(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver,this);
	}
	//This is used to login to the website
	public void LoginDetails() throws IOException, InterruptedException {
		
	myaccount.click();
	login.click();
	Email.sendKeys("lakshmichowdary440a@gmail.com");
    Password.sendKeys("Glucky@196");
    login_btn.click();
   }
	// This is used edit the account details
    public void Editaccount() {
	 Editaccount .click();
     firstname.clear();
     erase.sendKeys("SHANMUKHRUDAY");
	 continue_btn.click();
    
}

}
