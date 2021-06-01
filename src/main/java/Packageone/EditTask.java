package Packageone;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTask {
	
	 WebDriver driver;

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
				
				
				WebElement Content = driver.findElement(By.xpath("(//p[@class='slds-truncate'])[5]"));
				Content.click();
				
				WebElement viewall = driver.findElement(By.xpath("(//span[@class='viewAllLabel'])[3]"));
			    viewall.click();
			    
			    
			    driver.findElement(By.xpath("//span[contains(@class,'triggerLinkText selectedListView')]")).click();
			    WebElement RecentlyView = driver.findElement(By.xpath("//div[@class='listContent']/div/div/ul/li[8]"));
			    RecentlyView.click();
			    System.out.println("Recently View Clicked");
			    
			    WebElement Searchbox = driver.findElement(By.xpath("//input[@class='slds-input']"));
			    Searchbox.sendKeys("Email" + Keys.ENTER);
			    System.out.println("Email Searched and clicked");
			    
			    
			    WebElement Firstelement = driver.findElement(By.xpath("//div[@class='forceRecordLayout'][1]/li"));
			    Firstelement.click();
			    System.out.println("Firstelement is selected");
			    
			    Thread.sleep(5000);
			    
			    WebElement dd = driver.findElement(By.xpath("//a[@title='Show 13 more actions']"));
			    dd.click();
			    WebElement Edit = driver.findElement(By.xpath("//div[@class='ng-charthover'][1]/following::li[3]/a"));
			    Edit.click();
			    
			    
			    WebElement DueDate = driver.findElement(By.xpath("//input[@class='inputDate input']"));
			    DueDate.click();
			    
			    WebElement Nextmonth = driver.findElement(By.xpath("//a[@class='navLink nextMonth']"));
			    Nextmonth.click();
			    WebElement date = driver.findElement(By.xpath("//div[@class='dateBar']/following::tbody/tr[3]/td[3]"));
			    date.click();
			    System.out.println("Due Date is clicked");
			    
			    WebElement Img = driver.findElement(By.xpath("//img[@title='Accounts']"));
			    Img.click();
			    
			    WebElement Accounts = driver.findElement(By.xpath("//span[@title='Accounts']"));
			    Accounts.click();
			    System.out.println("Accounts selected");
			    
			    WebElement Save = driver.findElement(By.xpath("//button[@title='Save']"));
			    Save.click();
			    System.out.println("Save clicked successfully");
			    			    
			    driver.findElement(By.xpath("//div[@class='full forcePageBlock forceRecordLayout']/div[1]/div/div/div[3]/div[1]/div/div[2]/span")).click();
			    driver.findElement(By.xpath("//div[@class='full forcePageBlock forceRecordLayout']/div[1]/div/div/div[3]/div[1]/div/div[2]/span")).click();
			    
			    String UpdatedDate = driver.findElement(By.xpath("//div[@class='full forcePageBlock forceRecordLayout']/div[1]/div/div/div[3]/div[1]/div/div[2]/span/span")).getText();
                System.out.println("ModifiedDate is" + UpdatedDate);
 	            System.out.println("Due Date Verified");
	
	}
}

