package Packageone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateNewTask {
     WebDriver driver;
	
        public static void main(String[] args) throws InterruptedException, AWTException {  
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
		
		
		WebElement Content = driver.findElement(By.xpath("(//p[@class='slds-truncate'])[5]"));
		Content.click();
		
		WebElement viewall = driver.findElement(By.xpath("(//span[@class='viewAllLabel'])[3]"));
	    viewall.click();
	    
	    Thread.sleep(10000);
	    
	    WebElement dd = driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]"));
	    dd.click();
	    
	    WebElement NewTask = driver.findElement(By.xpath("//a[@role='menuitem']"));
	    NewTask.click();
	    
	    WebElement AssignedTo = driver.findElement(By.className("pillText"));
	    AssignedTo.click();
	    System.out.println("Clicked Assigned Name");
	    
	    WebElement Subject = driver.findElement(By.xpath("//*[@class='slds-has-error']//following::div[19]/input[1]"));
	    Subject.sendKeys("Email"+ Keys.TAB);
	    System.out.println("Email Selected");
	    
	    WebElement Priority = driver.findElement(By.xpath("(//a[@class='select'])[2]"));
	    Priority.click();
	    Thread.sleep(3000);
	    System.out.println("List box selected");
	    WebElement High = driver.findElement(By.xpath("//div[@class='ng-charthover'][1]/following::ul/li[2]/a"));
	    High.click();
	    Thread.sleep(3000);
	    System.out.println("Priority High selected");
	    
	    
	    WebElement Status = driver.findElement(By.xpath("(//a[@class='select'])[1]"));
	    Status.click();
	    Thread.sleep(3000);
	    System.out.println("List box selected");
	    WebElement InProgress = driver.findElement(By.xpath("//*[@title='In Progress']"));
	    InProgress.click();
	    Thread.sleep(3000);
	    System.out.println("Status In Progress selected");
	    
	    
	    WebElement Contacts = driver.findElement(By.xpath("(//a[contains(@class,'entityMenuTrigger slds-button')])[2]"));
	    Contacts.click();
	    System.out.println("Contact selected");
	    
	    WebElement Save = driver.findElement(By.xpath("(//span[@class=' label bBody'])[3]"));
	    Save.click();
	    
	    System.out.println("Email notification sent");
	    
	}

}
