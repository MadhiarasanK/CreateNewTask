package EditClassicAccountPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import CreateTaskPOM.LoginPages;
import CreateTaskPOM.SVGPage;

public class EditLoginPages extends BasicPages {

	
	public EditLoginPages(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public EditLoginPages Username(String Username) {
		driver.findElement(By.id("username")).sendKeys(Username);
		return this;
      }
	
	public EditLoginPages Password(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}

	public ViewProfilePage Login() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		System.out.println("Login Successful");
		
		return new ViewProfilePage(driver);
		
	}

	
}
