package TestNGConversion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	WebDriverWait wait;
	
	
	@Parameters("TestOne")
	@BeforeMethod
	public void basesetup(String Name) throws InterruptedException {
		
		if(Name.contains("Chrome")) {
			
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();	
		
		}
		else if(Name.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
				
		}
	    else if(Name.equalsIgnoreCase("Edge")){
	    	WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	    }
		
		
//	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//	driver = new ChromeDriver();
	
	
	
    driver.get("https://login.salesforce.com/");
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    wait = new WebDriverWait(driver, 30);
    
    
    WebElement Username = driver.findElement(By.id("username"));
	Username.sendKeys("cypress@testleaf.com");
	
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys("Selbootcamp@123");
	
	
	
	WebElement Login = driver.findElement(By.id("Login"));
	Login.click();
	System.out.println("Login should be successful");
	Thread.sleep(10000);
	
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
		System.out.println("After Method executed successfully");
	}
	
	
}
