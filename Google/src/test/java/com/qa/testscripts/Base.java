package com.qa.testscripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.qa.pages.GooglePage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
GooglePage Page;
WebDriver Driver;
@Parameters({"Browser","Url"})
@BeforeClass
public void Setup(String Browser,String Url)throws IOException,InterruptedException
{
	if(Browser.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		
	}
	else if(Browser.equalsIgnoreCase("Edge")) 
	{
		System.setProperty("webdriver.edge.driver","D:\\Google drivers\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriverManager.edgedriver().setup();
		Driver=new EdgeDriver();
		
    }
  else if(Browser.equalsIgnoreCase("Firefox"))
       {
		WebDriverManager.firefoxdriver().setup();
        Driver=new FirefoxDriver();
        }
	Page=new GooglePage(Driver);
	Driver.manage().window().maximize();
	Driver.get(Url);
}
@AfterClass 
	 public void TearDown()throws IOException{
		 Driver.close();
	 }
	
	
}




  