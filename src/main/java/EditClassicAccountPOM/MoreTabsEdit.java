package EditClassicAccountPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesofPOM.EditClassicPages;

public class MoreTabsEdit extends BasicPages {
	
	
	
	public MoreTabsEdit(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


    public MoreTabsEdit Moretab() {
    	driver.findElement(By.xpath("//li[@id='MoreTabs_Tab']")).click();
    	return this;
    	 }
    
    public EditAccountDetails Accounttab() {
    	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
    	return new EditAccountDetails(driver);
    }

}
