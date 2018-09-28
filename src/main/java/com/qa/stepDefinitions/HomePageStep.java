package com.qa.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cqPlus.pages.HomePage;
import cqPlus.pages.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import cpPlus.util.BaseUd;

public class HomePageStep extends BaseUd {
	BaseUd base = new BaseUd();
	public String url;

	// Opens the Browser and intailse driver
	@Given("^User Opens the Browser$")
	public void User_Opens_the_Browser() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		driver = base.intializeDriver();
	}

	// Login Page Opens
	@Then("^User is on login page$")
	public void User_is_on_login_page() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();

		url = geturl("url");
		driver.get(url);
		driver.manage().window().maximize();
	}

	// User enters the login credentials and login to the application
	@Then("^User enter \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void User_enter_and(String username, String password) throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();

		LoginPage login = new LoginPage(driver);
		login.getemail().sendKeys(username);
		login.getpassword().sendKeys(password);
		login.loginbutton().click();
		// log.info(text);

		Thread.sleep(300);
	}

	// Click on News and Analyse link
	@Then("^click on News and Anyalze$")
	public void click_on_News_and_Anyalze() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		HomePage hp = new HomePage(driver);

		Actions action = new Actions(driver);
		action.moveToElement(hp.getAnalyselink()).build().perform();

		hp.newslink().click();
	}

	// click on More link to see more news
	@Then("^click on More link to see more news$")
	public void click_on_moreNews() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.morelink().click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(4000);
		}

	// Browser is closed

	@Then("^Close the Browser$")
	public void Close_Browser() throws Throwable {
	
	
	// Express the Regexp above with the code you wish you had
		// throw new PendingException();
//	driver.manage().timeouts().implicitlyWait(BaseUd.wait, TimeUnit.SECONDS);
		driver.close();
		// driver=null;
	}

}
