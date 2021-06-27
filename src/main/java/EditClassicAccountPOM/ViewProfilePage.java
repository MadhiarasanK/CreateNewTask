package EditClassicAccountPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesofPOM.EditClassicPages;

public class ViewProfilePage extends BasicPages{

	public ViewProfilePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
	}
	
	
	public ViewProfilePage Viewprofile() {
		
		driver.findElement(By.xpath("(//span[@class='photoContainer forceSocialPhoto'])[1]/div/span")).click();
	    return this;
		}
	    
	    public MoreTabsEdit Classic() {
	    driver.findElement(By.xpath("//a[text()='Switch to Salesforce Classic']")).click();
	    return new MoreTabsEdit(driver);
	    
	    }

}
