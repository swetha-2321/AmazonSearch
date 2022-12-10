package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	WebDriver Driver;
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement search;
	public WebElement Search() {
		return search;
	}
	
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")
	public static WebElement dropdown ;

public GooglePage(WebDriver Driver)
{
	 this.Driver=Driver;
	PageFactory.initElements(Driver,this); 
}

}
