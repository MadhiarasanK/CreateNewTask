package PagesofPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicPOMClass.BasicClass;

public class NewViewProfilePage extends BasicClass {

	
	 public NewViewProfilePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
	}


	 public NewViewProfilePage ViewProfile() {
		 
		
		 
	    	driver.findElement(By.xpath("(//span[@class='photoContainer forceSocialPhoto'])[1]/div/span")).click();
	    	return this;
	    }
		
	 public AccountCreationPage SwitchSalesforceClassic() throws InterruptedException {
		   Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Switch to Salesforce Classic']")).click();
			return new AccountCreationPage(driver);
		}	
	
}





//public NewViewProfilePage switchtoLightening() {
//try {
//driver.findElement(By.xpath("//a[@class='switch-to-lightning']")).click();	
//}
//catch(Exception E) {
//	E.getMessage();
//}
//return ViewProfile();
//}	
