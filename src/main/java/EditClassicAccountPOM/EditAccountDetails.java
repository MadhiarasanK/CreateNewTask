package EditClassicAccountPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesofPOM.EditClassicPages;

public class EditAccountDetails extends BasicPages{

	public EditAccountDetails(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	 public EditAccountDetails Account() {
	    	driver.findElement(By.xpath("//a[text()='Accounts']")).getText();
	    	return this;
	    }
	    	
	    public EditAccountDetails NameofAccount() {
	    	driver.findElement(By.xpath("//table[@class='list']//tr[2]/th/a")).click();
	    	return this;
	    }
	    	
	    public EditAccountDetails Edit() {
	    	driver.findElement(By.xpath("(//input[@title='Edit'])[2]")).click();
	    	return this;
	    }
	    public EditAccountDetails ShippingAddr(String Address) {
	    	driver.findElement(By.xpath("(//table[@class='detailList'])[2]//tr[1]/td[4]/textarea")).clear();
	    	driver.findElement(By.xpath("(//table[@class='detailList'])[2]//tr[1]/td[4]/textarea")).sendKeys(Address);
	        return this;  
	      
	    }
	    
	    public EditAccountDetails Save() {
	    	driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
	    	return this;
	    }
	    
	    public SwitchLighten ChangeAddr() {
	    	driver.findElement(By.xpath("//td[text()='Shipping Address']/following::td[1]/div")).getText();
	    	return new SwitchLighten(driver);
	    }

}
