package PagesofPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import BasicPOMClass.BasicClass;

public class EditClassicPages extends BasicClass {
	
	
	public EditClassicPages(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public EditClassicPages Username(String Username) {
		driver.findElement(By.id("username")).sendKeys(Username);
		return this;
      }
	
	public EditClassicPages Password(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}

	public EditClassicPages Login() {
		driver.findElement(By.id("Login")).click();
		return this;
	}
	
	public EditClassicPages Viewprofile() {
			
	driver.findElement(By.xpath("(//span[@class='photoContainer forceSocialPhoto'])[1]/div/span")).click();
    return this;
	}
    
    public EditClassicPages Classic() {
    driver.findElement(By.xpath("//a[text()='Switch to Salesforce Classic']")).click();
    return this;
    }
    
    public EditClassicPages Moretab() {
    	driver.findElement(By.xpath("//li[@id='MoreTabs_Tab']")).click();
    	return this;
    	 }
    public EditClassicPages Accounttab() {
    	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
    	return this;
    }
    public EditClassicPages Account() {
    	driver.findElement(By.xpath("//a[text()='Accounts']")).getText();
    	return this;
    }
    	
    public EditClassicPages NameofAccount() {
    	driver.findElement(By.xpath("//table[@class='list']//tr[2]/th/a")).click();
    	return this;
    }
    	
    public EditClassicPages Edit() {
    	driver.findElement(By.xpath("(//input[@title='Edit'])[2]")).click();
    	return this;
    }
    public EditClassicPages ShippingAddr(String Address) {
    	driver.findElement(By.xpath("(//table[@class='detailList'])[2]//tr[1]/td[4]/textarea")).clear();
    	driver.findElement(By.xpath("(//table[@class='detailList'])[2]//tr[1]/td[4]/textarea")).sendKeys(Address);
        return this;  
      
    }
    
    public EditClassicPages Save() {
    	driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
    	return this;
    }
    
    public EditClassicPages ChangeAddr() {
    	driver.findElement(By.xpath("//td[text()='Shipping Address']/following::td[1]/div")).getText();
    	return this;
    }
    
    public EditClassicPages SwitchLighten() {
    	driver.findElement(By.xpath("//a[@class='switch-to-lightning']")).click();
    	return this;
    }
	
    
    public void close() {
    	driver.close();
    }
    	
}   

    	
    	
    	
    	
    	
