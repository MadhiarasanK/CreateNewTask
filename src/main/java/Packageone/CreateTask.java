package Packageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTask {

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
		
		WebElement SVG = driver.findElement(By.xpath("//header[@id='oneHeader']/div[2]/div[2]/div/div/following::span[1]/div[2]/ul/li[3]/div/div/div[1]/div/div/a"));
		SVG.click();
		
		WebElement NewTask = driver.findElement(By.xpath("//span[text()='New Task']"));
		NewTask.click();
		
	   WebElement Subject = driver.findElement(By.xpath("//label[text()='Subject']/following::div[1]/div/lightning-base-combobox/div/div/input"));
	   Subject.sendKeys("BootCamp");
		
		WebElement Contacts = driver.findElement(By.xpath("//label[text()='Subject']/following::div[21]/div/div/div/div/div/div/div[1]/div[2]/input"));
		Contacts.sendKeys("sarath");
		Thread.sleep(3000);
		WebElement Selection = driver.findElement(By.xpath("//div[@title='Sarath lesley']"));
		Selection.click();
		
		WebElement Status = driver.findElement(By.xpath("//a[@class='select']"));
		Status.click();
		Thread.sleep(3000);
		WebElement Selection1 = driver.findElement(By.xpath("//a[@title='Waiting on someone else']"));
		Selection1.click();
		
		WebElement Save = driver.findElement(By.xpath("//a[@class='select']/following::div[2]/div[2]/button/span"));
		Save.click();
		
		Thread.sleep(2000);
		String Message = driver.findElement(By.xpath("//div[@class='forceVisualMessageQueue']")).getText();
		System.out.println("Created Message is" + Message);
		
		
				
		
	}

}
