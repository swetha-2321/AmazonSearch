package com.qa.testscripts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;



import com.qa.pages.AmazonPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	AmazonPages Amazonp;
	WebDriver Driver;
	Actions act;
	@Parameters({"Browser","Url"})
	 @BeforeClass
	 public void Setup(String Browser,String Url)throws IOException, InterruptedException
	 {
	 
	 if(Browser.equalsIgnoreCase("Chrome"))
	 {
	 WebDriverManager.chromedriver().setup();
	 Driver=new ChromeDriver();
	 Thread.sleep(2000);
	 }
	 else if(Browser.equalsIgnoreCase("Edge"))
	 {
		 System.setProperty("webdriver.edge.driver","D:\\Google drivers\\edgedriver_win64\\msedgedriver.exe");
			
			
	// WebDriverManager.edgedriver().setup();
	 Driver=new EdgeDriver();
	 }
	 Amazonp=new AmazonPages(Driver);
	 Driver.manage().window().maximize();
	 Driver.get(Url);
	 JavascriptExecutor js = (JavascriptExecutor) Driver;
     //Scroll down till the bottom of the page
     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     Thread.sleep(2000);
     js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	 }

	 @AfterClass 
	 public void TearDown() throws InterruptedException {
	 Thread.sleep(5000); 
	 Driver.close(); }
	}