package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EdurekaPage {
	WebDriver Driver;
	@FindBy(xpath="/html/body/header/nav/ul/li[5]/span")
	WebElement signup;
	public WebElement Signup() {
		return signup;
	}
	/*@FindBy(xpath="/html/body/div[2]/header/section/nav/div/span[2]")
	WebElement login;
	public WebElement Login(){
		return login;
		
	}
	@FindBy(xpath="//*[@id=\"si_popup_passwd\"]")
	WebElement pwrd;
	public WebElement Pw() {
		return pwrd;
	}*/
	
	@FindBy(xpath="//*[@id=\"sg_popup_email\"]")
	WebElement email;
	public WebElement Email() {
		return email;
	}
	@FindBy(xpath="//*[@id=\"sg_popup_phone_no\"]")
	WebElement phno;
	public WebElement Phno() {
		return phno;
	}
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[1]/form/button")
	WebElement signupnxt;
	public WebElement SignUpNxt() {
		return signupnxt;
	}
	/*@FindBy(xpath="/html/body/div[12]/div/div/div[2]/div[1]/p/span")
	WebElement login;
	public WebElement Login(){
		return login;
		
	}
	@FindBy(xpath="//*[@id=\"si_popup_passwd\"]")
	WebElement pwrd;
	public WebElement Pw() {
		return pwrd;
	}*/
	
	@FindBy(xpath="//html/body/div[2]/div[3]/section[1]/div/span[1]/div/div/span/input")
	WebElement search;
	public WebElement Search() {
		return search;
	}
	/*@FindBy(xpath="//Body")
	WebElement getalltext;
	public WebElement GetAllTxt() {
		return getalltext;
	}*/
	@FindBy(xpath="/html/body/section[2]/div[2]/div[2]/div/div[1]")
	public static WebElement text;
	public EdurekaPage(WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }

}

	 