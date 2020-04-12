package com.cts.pages;                                                                                                              
                                                                                                                                    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;                                                                                     
                                                                                                                                    
public class SearchClass { 
	WebDriver driver;  
	@FindBy(xpath="//input[@name='search'][@type='text']")
	WebElement Search;
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement search_btn;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a")
	WebElement product;
                                                                                                                               
	public SearchClass(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver,this);
	}

   //This is used to search the products
	public void SearchProduct() {                                                                                                   
		Search.sendKeys("macbook");                                                                   
		search_btn.click();   
		product.click();
		} 
	
	// used to close the browser
	public void ClosePage(){
		driver.close();
		                                                                                                          
                                                                                                                           
		                                                                                                                            
	}                                                                                                                               
	                                                                                                                                
	                                                                                                                                
}                                                                                                                                   
                                                                                                                                    