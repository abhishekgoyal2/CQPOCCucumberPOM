package com.qa.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cqPlus.pages.HomePage;
import cqPlus.pages.LoginPage;

import org.openqa.selenium.interactions.Actions;

import cpPlus.util.BaseUd;

public class HomePageStep extends BaseUd{
BaseUd base=new BaseUd();
public String url;

//Opens the Browser and intailse driver
	@Given("^User Opens the Browser$")
	public void User_Opens_the_Browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		driver=base.intializeDriver();
		}

	//Login Page Opens
	@Then("^User is on login page$")
	public void User_is_on_login_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		
		url= geturl("url");
		 driver.get(url);
	}

	
	//User enters the login credentials and login to the application
	@Then("^User enter \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void  User_enter_and(String username, String password) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		
		LoginPage login=new LoginPage(driver);
		login.getemail().sendKeys(username);
		login.getpassword().sendKeys(password);
		login.loginbutton().click();
//		log.info(text);
		
		Thread.sleep(300);
	}
	
	
	@Then("^click on News and Anyalze$")
	public void click_on_News_and_Anyalze() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		HomePage hp=new HomePage(driver);
	
		Actions action=new Actions(driver);
		action.moveToElement(hp.getAnalyselink()).build().perform();
		
		hp.newslink().click();
	}
	
	//Browser is closed
	
	@Then("^Close the Browser$")
	public void Close_Browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		driver.close();
//		driver=null;
	}

	
}
