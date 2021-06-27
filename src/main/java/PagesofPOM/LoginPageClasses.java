package PagesofPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicPOMClass.BasicClass;

public class LoginPageClasses extends BasicClass{

	public LoginPageClasses(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public LoginPageClasses Username(String Username) {
		driver.findElement(By.id("username")).sendKeys(Username);
		return this;
      }
	
	public LoginPageClasses Password(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}

	public NewViewProfilePage Login() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		System.out.println("Login Successful");
		
		return new NewViewProfilePage(driver);
		
	}
	
	
	
	
}
