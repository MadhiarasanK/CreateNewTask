package CreateTaskPOM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTaskPage extends BasicReq{

	public NewTaskPage(ChromeDriver driver,Properties prop) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop=prop;
		
	}

	public NewTaskPage Subject(String AutomationName) {
		 WebElement Subject = driver.findElement(By.xpath(prop.getProperty("NewTaskPage.Subject.xpath")));
		 Subject.sendKeys(AutomationName);		
		 return this;
	}
	
	public NewTaskPage Contacts(String Subname) throws InterruptedException {
	WebElement Contacts = driver.findElement(By.xpath(prop.getProperty("NewTaskPage.Contacts.xpath")));
	Contacts.sendKeys(Subname);
	Thread.sleep(3000);
	WebElement Selection = driver.findElement(By.xpath(prop.getProperty("NewTaskPage.Selection.xpath")));
	Selection.click();
	return this;
	}
	
	
	public NewTaskPage Status() throws InterruptedException {
	WebElement Status = driver.findElement(By.xpath(prop.getProperty("NewTaskPage.Status.xpath")));
	Status.click();
	Thread.sleep(3000);
	return this;
	}
	
	public NewTaskPage Selection1() {
	WebElement Selection1 = driver.findElement(By.xpath(prop.getProperty("NewTaskPage.Selection1.xpath")));
	Selection1.click();
	return this;
	}
	
	public Message Save() throws InterruptedException {
	WebElement Save = driver.findElement(By.xpath(prop.getProperty("Message.Save.xpath")));
	Save.click();
	Thread.sleep(2000);
	return new Message(driver,prop);
	
	}
	
	
	
	
	
	
	
}
