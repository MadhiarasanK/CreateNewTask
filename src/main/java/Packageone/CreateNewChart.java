package Packageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewChart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   
	    
	    
	    WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("cypress@testleaf.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Selbootcamp@123");
		
		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		System.out.println("Login should be successful");
	
		Thread.sleep(10000);
		WebElement Toggle = driver.findElement(By.className("slds-r4"));
		Toggle.click();  
		System.out.println("Toggle clicked");
		
		Thread.sleep(5000);
		WebElement Viewall = driver.findElement(By.xpath("//button[@class='slds-button']"));
		Viewall.click();
		System.out.println("Viewall clicked");
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//p[text()='Service Console']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
		
		driver.findElement(By.xpath("//div[@id='navMenuList']/div/ul/li[10]/div/a/span[2]/span")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='oneConsoleObjectHome']/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/h1/div/div/a")).click();
		
		Thread.sleep(10000);
		
		driver.findElement((By.xpath("//div[@class='scroller']/ul/li[2]/a"))).click();
		
		driver.findElement(By.xpath("//button[@title='Show charts']")).click();
		System.out.println("Show charts clicked");
		
		Thread.sleep(10000);
	 	WebElement Settings = driver.findElement(By.xpath("//a[@title='Settings']/lightning-icon/lightning-primitive-icon/*"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Settings).click().perform();		
		//Settings.click();
		System.out.println("Settings clicked");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='chartSettings uiMenu']/div[2]/div/ul/li[6]/a")).click();
		System.out.println("New Chart Clicked");
		
		driver.findElement(By.xpath("//input[@class='chartNameInputBox input']")).sendKeys("Madhi");
	
		WebElement ChartType = driver.findElement(By.xpath("//div[@class='forceListviewChartsSetupPage']/div[2]/div/span/following::div[1]/div[1]/div/div/a"));
		ChartType.click();
		System.out.println("Chart Type Selected");
		
		driver.findElement(By.className("selected")).click();
		System.out.println("Vertical Bar Selected");
		
		driver.findElement(By.xpath("//div[@class='forceListviewChartsSetupPage']/div[3]/div/span/following::div[1]/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Average']")).click();
		System.out.println("Average Selected");
		
		WebElement Aggregate = driver.findElement(By.xpath("//div[@class='forceListviewChartsSetupPage']/div[3]/div/following::div[1]/div/div/div[1]/div/div/a"));
		Aggregate.click();
		driver.findElement(By.xpath("//a[@title='Amount']")).click();
		System.out.println("Amount Selected");
		
		driver.findElement(By.xpath("//div[@class='forceListviewChartsSetupPage']/div[5]/div/div/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Account']")).click();
		
		driver.findElement(By.xpath("//div[@class='forceListviewChartsSetupPage']/div[5]/following::div[1]/button[2]/span")).click();
		System.out.println("Save button clicked");
		
		Thread.sleep(10000);
		
		WebElement Settings1 = driver.findElement(By.xpath("//a[@title='Settings']/lightning-icon/lightning-primitive-icon/*"));
		
		action.moveToElement(Settings1).click().perform();		
		//Settings.click();
		System.out.println("Settings clicked");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Donut Chart']")).click();
		System.out.println("Chart type changed from vertical to donut");
		
		driver.close();
		
	}

}
