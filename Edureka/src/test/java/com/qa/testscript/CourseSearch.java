package com.qa.testscript;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import com.qa.pages.EdurekaPage;


public class CourseSearch extends Base {
EdurekaPage Page;

@Test
public void Search() throws InterruptedException
{
	Page=new EdurekaPage(Driver);
//edureka title
//       String title=Driver.getTitle();
//	   System.out.println(title);
//	   Thread.sleep(3000);
	   //login
	   //Page.Signup().click();
	   //Thread.sleep(2000);
	   //Page.Login().click();
	   //Thread.sleep(2000);
	   //Page.Pw().sendKeys("Swetha21$");
	   //Thread.sleep(2000);
 //signup
	   
	   Page.Signup().click();
	   Page.Email().sendKeys("19l250@kce.ac.in");
       Thread.sleep(2000);
       Page.Phno().sendKeys("8870604426");
       Thread.sleep(2000);
       Page.SignUpNxt().click();
       Thread.sleep(3000);
      Driver.navigate().to("https://www.edureka.co/search?utm_source=Google-Search-Brand&utm_medium=cpc&utm_campaign=Brand:-Search:-IN:-Cust&gclid=Cj0KCQiAkMGcBhCSARIsAIW6d0AmosPd0q8AJFeu5yBHrn20oZ1m8tI7F3wh6k4cIigFiKKKRCAnL3saAjioEALw_wcB");
      Thread.sleep(3000);
      // Page.Search().click();
      Driver.navigate().to("https://www.edureka.co/search/cloud%20computing");
      
       Thread.sleep(2000);
     
     System.out.println( EdurekaPage.text.getText());
       Thread.sleep(2000);
//       Page.GetAllTxt();
//       System.out.println("Search text:");
     
      
}
}


	
	