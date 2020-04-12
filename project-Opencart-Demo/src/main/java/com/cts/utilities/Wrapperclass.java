package com.cts.utilities;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapperclass {
	
	protected WebDriver driver;
	public void Browser_Launch(String browser) {
		
			
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:/Users/DELL/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:/CTS/chromedriver_win32/chromedriver.exe");
				driver=new ChromeDriver();
			}
      		driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get("https://demo.opencart.com/");
		}
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source,new File(path));
	}
	public void Quit() {
		driver.close();
	}
	
	
}

