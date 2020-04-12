 package com.cts.pages;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.appender.rolling.FileSize;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAndLoginClass {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement Register;
	@FindBy(name="firstname")
	WebElement firstname;
	@FindBy(name="lastname")
	WebElement lastname;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(name="telephone")
	WebElement telephone;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="confirm")
	WebElement confirm;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement privacypolicy;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement Continue;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement Account;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement Login;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement login_bt;
	
	public  RegisterAndLoginClass(WebDriver driver) {
		this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	//This method is used to create a new account
	public void Register() {
		myaccount.click();
		Register.click();
		firstname.sendKeys("lakshmi");
		lastname.sendKeys("lucky");
		Email.sendKeys("lakshmichowdary440a@gmail.com");
		telephone.sendKeys("5588522");
		Password.sendKeys("liveat");
		confirm.sendKeys("liveat");
		privacypolicy.click();
		Continue.click();
	   
	}
	//This is used to pass the arguments from feature file
public void Login1(String un,String pw) throws IOException, InterruptedException {
		
		Account.click();
		Login.click();
	    email.sendKeys(un);
		password.sendKeys(pw);
		login_bt.click();
				
	}
	public void Login() throws IOException, InterruptedException {
		
		Account.click();
		Login.click();
	    email.sendKeys("lakshmichowdary440a@gmail.com");
		password.sendKeys("Glucky@196");
		login_bt.click();
	}


}


