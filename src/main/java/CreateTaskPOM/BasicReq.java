package CreateTaskPOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicReq {
	
	public static ChromeDriver driver;
	public WebDriverWait wait;
	public Properties prop;
  
	
	@BeforeMethod
	public void BaseClassPOM() throws IOException {
		// TODO Auto-generated method stub
		    FileInputStream file = new FileInputStream("./src/main/java/CreateTaskPOM/Config.properties");
		    prop = new Properties();
		    prop.load(file);
		   		
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
