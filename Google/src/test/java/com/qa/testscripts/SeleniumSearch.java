package com.qa.testscripts;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import com.qa.pages.GooglePage;


public class SeleniumSearch extends Base {
GooglePage Page;

@Test
public void Search() throws InterruptedException
{
	Page=new GooglePage(Driver);
    Page.Search().sendKeys("selenium");
    Thread.sleep(2000);
    System.out.println( GooglePage.dropdown
    		.getText());
}
}
	   