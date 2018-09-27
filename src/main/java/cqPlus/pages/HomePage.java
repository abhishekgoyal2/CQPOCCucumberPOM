package cqPlus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public HomePage(WebDriver driver){
		this.driver=driver;
		
	}
	public WebDriver driver;
	
	By anaylizelink =By.xpath("//a[@class='analyze-link']");
	By Newslink = By.xpath("//a[contains (text(),'News & Analysis')]");
	
	
	public  WebElement getAnalyselink()
	{
		return driver.findElement(anaylizelink);
	}
	
	public  WebElement newslink()
	{
		return driver.findElement(Newslink);
	}
}
