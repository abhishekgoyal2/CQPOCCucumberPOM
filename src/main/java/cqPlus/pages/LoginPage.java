package cqPlus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public  WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	By username =By.xpath(".//*[@id='username']");
	By password = By.xpath("html/body/div[2]/form/div[2]/input");
	By Loginbutton =By.xpath("html/body/div[2]/form/input");

	
	public  WebElement getemail()
	{
		return driver.findElement(username);
	}
	
	public  WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public  WebElement loginbutton()
	{
		return driver.findElement(Loginbutton);
	}
}
