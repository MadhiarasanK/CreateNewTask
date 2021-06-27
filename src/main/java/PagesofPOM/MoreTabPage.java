package PagesofPOM;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicPOMClass.BasicClass;

public class MoreTabPage extends BasicClass{

	
	 public MoreTabPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	}


	public MoreTabPage Moretab() {
	    	driver.findElement(By.xpath("//li[@id='MoreTabs_Tab']")).click();
	    	return this;
	    }
	    
	    public MoreTabPage AccountsTab() {
	    	WebElement Accountstab = driver.findElement(By.xpath("//a[text()='Accounts']"));
			Accountstab.click();
			System.out.println("Accouts tab selected");
			return this;
	    }
	    
	    public LightentingPage CreatedAccountName() {
	    	WebElement CreatedAccountName = driver.findElement(By.xpath("//table[@class='list']//tr[2]/th/a"));
			String AccountnameinAccounts = CreatedAccountName.getText();
			System.out.println("Account name in accounts as " + AccountnameinAccounts);

			if (AccountnameinAccounts.contains(AccountNameis)) {
				System.out.println("Created Account name is displayed");
				 
			}
			return new LightentingPage(driver);

	    }
	   
}
