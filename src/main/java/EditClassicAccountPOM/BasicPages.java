package EditClassicAccountPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicPages {
	
	public static ChromeDriver driver;
	public WebDriverWait wait;
  
	
	@BeforeMethod
	public void BaseClassPOM() {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
			driver.get("https://login.salesforce.com/");
		    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    wait = new WebDriverWait(driver, 30);
		   
	
	}
		
		@AfterMethod
		public void Closemethod() {
			
			System.out.println("After Method Executed");
			
		}


}
