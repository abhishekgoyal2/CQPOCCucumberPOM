package com.qa.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cqPlus.pages.LoginPage;

import org.junit.Assert;
import cpPlus.util.BaseUd;

public class HomePageStep extends BaseUd{
BaseUd base=new BaseUd();
public String url;

	@Given("^User Opens the Browser$")
	public void User_Opens_the_Browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		driver=base.intializeDriver();
		
	}

	@Then("^User is on login page$")
	public void User_is_on_login_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		
		url= geturl("url");
		 driver.get(url);
	}

	@Then("^User enter username and password$")
	public void User_enter_username_and_password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		
		LoginPage login=new LoginPage(driver);
		login.getemail().sendKeys("abhishek.goyal2@globallogic.com");
		login.getpassword().sendKeys("Welcome@12");
		login.loginbutton().click();
//		log.info(text);
		
		Thread.sleep(300);
	}
	
	@Then("^Close the Browser$")
	public void Close_Browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		driver.close();
		driver=null;
	}

	
}
