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
	By More = By.xpath("//div/a[@class='show-more-button']");
	
	
	public  WebElement getAnalyselink()
	{
		return driver.findElement(anaylizelink);
	}
	
	public  WebElement newslink()
	{
		return driver.findElement(Newslink);
	}
	
	public  WebElement morelink()
	{
		return driver.findElement(More);
	}
	
	
}
