package PagesofPOM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicPOMClass.BasicClass;

public class AccountFormPage extends BasicClass{
	
	
	
	
	  public AccountFormPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver=driver;
	}

	public AccountFormPage AccountName(String Accountnames) {
	    	WebElement Accountname = driver.findElement(By.xpath("//div[@class='requiredBlock']/following-sibling::input"));
			Accountname.sendKeys(Accountnames);
			System.out.println("Account name Entered successfully");
		     AccountNameis = Accountname.getAttribute("value");
	    	return this;
	      }
	    
	    public AccountFormPage EnterAddress(String Address1) {
	    	driver.findElement(By.xpath("(//div[@class='pbSubsection'])[2]/table/tbody/tr[1]/td[2]/textarea")).sendKeys(Address1);
	    	Addressis = driver.findElement(By.xpath("(//div[@class='pbSubsection'])[2]/table/tbody/tr[1]/td[2]/textarea")).getAttribute("value");
	    	return this;
	    }
	    
	    
	    public AccountFormPage CopyAddress() {
	    	driver.findElement(By.xpath("//a[text()='Copy Billing Address to Shipping Address']")).click();
	    	return this;
	    }
	    
	    public AccountFormPage AddressVerification(String Address2) {
	    	driver.findElement(By.xpath("(//div[@class='pbSubsection'])[2]/table/tbody/tr[1]/td[2]/textarea")).sendKeys(Address2);
	    	String CopyAddress = driver.findElement(By.xpath("(//div[@class='pbSubsection'])[2]/table/tbody/tr[1]/td[2]/textarea")).getAttribute("value");	
	    	if (CopyAddress.contains(Addressis)) {
				System.out.println("Shipping Address reflects the Billing Address");
			}
	      return this;
	    }
	    
	    public AccountFormPage Dateselection() {
	    	WebElement Datepicker = driver.findElement(By.xpath("//span[@class='dateInput dateOnlyInput']/input"));
	    	Datepicker.click();
	    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

			Calendar now = Calendar.getInstance(); // gets current date

			now.setTime(new Date());

			now.add(Calendar.DATE, 20); // add twenty days

			String DateIs = dateFormat.format(now.getTime());

			Datepicker.sendKeys(DateIs);
			
			return this;
			
	    }
	    
	    
	    public RecentitemsPage SaveButton() {
	    	driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
	    	return new RecentitemsPage(driver);
	    	
	    }
	

}
