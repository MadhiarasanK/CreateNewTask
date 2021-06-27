package PagesofPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicPOMClass.BasicClass;

public class RecentitemsPage extends BasicClass {
	
	
	 public RecentitemsPage(ChromeDriver driver) {
	
		 this.driver=driver;
		 }

	public RecentitemsPage RecentItems() {
	    	WebElement RecentItems = driver.findElement(By.xpath("(//span[text()='" + AccountNameis + "'])[1]"));
			String NameinRecent = RecentItems.getText();
			System.out.println(NameinRecent);

			if (NameinRecent.contains(AccountNameis)) {
				System.out.println("Created Accountname is displayed under Recent items");

			}
			return this;
			}
			
	    public MoreTabPage AccountNameinForm() {
	    	
	    	WebElement AccountnameinForm = driver.findElement(By.xpath("(//div[@id='ep']//table)[2]/tbody/tr[2]/td[2]"));
			String AccountnameasinForm = AccountnameinForm.getText();
			String AccountNameinForm = AccountnameasinForm.replaceAll(" [View Hierarchy]", "");
			System.out.println(AccountnameasinForm);

			if (AccountNameinForm.contains(AccountNameis)) {
				System.out.println("Created Account Form is displayed");
			}
			return new MoreTabPage(driver);
	    	
	    }

	
	
	
	
}
