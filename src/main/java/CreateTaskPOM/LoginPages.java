package CreateTaskPOM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesofPOM.LoginPageClasses;
import PagesofPOM.NewViewProfilePage;

public class LoginPages extends BasicReq{
	
	public LoginPages(ChromeDriver driver, Properties prop) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop=prop;
	}


	public LoginPages Username(String Username) {
		driver.findElement(By.id(prop.getProperty("LoginPages.Username.ID"))).sendKeys(Username);
		return this;
      }
	
	public LoginPages Password(String Password) {
		driver.findElement(By.id(prop.getProperty("LoginPages.Password.ID"))).sendKeys(Password);
		return this;
	}

	public SVGPage Login() throws InterruptedException {
		driver.findElement(By.id(prop.getProperty("SVGPage.Login.ID"))).click();
		Thread.sleep(5000);
		System.out.println("Login Successful");
		
		return new SVGPage(driver,prop);
		
	}
	
	

}
