package Packageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refund {

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
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='navMenuList']/div/ul/li[10]/div/a/span[2]/span")).click();
		
		Thread.sleep(10000);
		
        driver.findElement(By.xpath("//div[@class='oneConsoleObjectHome']/div/div[1]/div[1]/div[2]/ul/li/a/div")).click();
		System.out.println("New clicked");
        
		driver.findElement(By.xpath("//input[@title='Search Accounts']")).click();
		
		driver.findElement(By.xpath("//div[@class='listContent']/ul/li[1]/a/div[1]/following::div[1]/div[1]")).click();

        driver.findElement(By.xpath("//div[@class='pillContainerWrapper singlePill noSeparator']/following::div[1]/div/div/div/div/div[1]/div/div/a")).click();
        
        driver.findElement(By.xpath("//a[@title='Canceled']")).click();
        
        driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber']")).sendKeys("50000");
        
        driver.findElement(By.xpath("//div[@class='full forcePageBlock forceRecordLayout']/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/a")).click();
        
        driver.findElement(By.xpath("//a[@title='Referenced']")).click();
        
        driver.findElement(By.xpath("//div[@class='actionBody']/div[1]/article/div[3]/div/div[1]/div/div/div[4]/div[1]/div/div/div/span/following::div[1]/div[1]/div/div/a")).click();
        
        driver.findElement(By.xpath("//a[@title='External']")).click();
        
        driver.findElement(By.xpath("//div[@class='actionsContainer']/div[2]/button[3]/span")).click();
        
	}

}
