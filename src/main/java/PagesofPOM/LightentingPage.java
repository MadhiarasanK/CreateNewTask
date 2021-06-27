package PagesofPOM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicPOMClass.BasicClass;

public class LightentingPage extends BasicClass{


   
    public LightentingPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}

	public LightentingPage switchlink() {
    	WebElement Switchlink = driver.findElement(By.linkText("Switch to Lightning Experience"));
		Switchlink.click();
		return this;
    }
    
    public void CloseBrowser() {
    	driver.close();
      }
    	
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	

  
