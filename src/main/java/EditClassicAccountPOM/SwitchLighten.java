package EditClassicAccountPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesofPOM.EditClassicPages;

public class SwitchLighten extends BasicPages {
	
	public SwitchLighten(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	

	 public SwitchLighten SwitchLighten() {
	    	driver.findElement(By.xpath("//a[@class='switch-to-lightning']")).click();
	    	return this;
	    }
		
	    
	    public void close() {
	    	driver.close();
	    }
	
	
	
}
