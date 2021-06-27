package PagesofPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicPOMClass.BasicClass;

public class AccountCreationPage extends BasicClass {
	
	
    
    public AccountCreationPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}

	public AccountCreationPage CreateNewButton() {
    	driver.findElement(By.xpath("//div[@id='createNewButton']")).click();
    	return this;
    }
    
    public AccountFormPage SelectAccount() {
    	driver.findElement(By.xpath("//a[text()='Account']")).click();
    	return new AccountFormPage(driver);
    }

}
