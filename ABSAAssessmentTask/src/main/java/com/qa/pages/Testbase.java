package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	public static WebDriver driver;
	

	public static void initialization() {
		   // Launching the geco driver
			 System.setProperty("webdriver.gecko.driver","Need to give your local gecho Driver Path or can pull the gechodirver from your resources folder from your project");
			 
			// Launching the firefox browser
			 driver = new FirefoxDriver();
			 
			 //maxmize the browser
			 driver.manage().window().maximize();
			 
			 //it will delete all the cookies
			 driver.manage().deleteAllCookies();
			 
			 //entering the URL
			 driver.navigate().to("http://www.way2automation.com/angularjs-protractor/webtables/");
			

}
}
