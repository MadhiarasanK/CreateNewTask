package CreateTaskPOM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGPage extends BasicReq{

	public SVGPage(ChromeDriver driver, Properties prop) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop = prop;
	}

	public SVGPage SVG() {
	WebElement SVG = driver.findElement(By.xpath(prop.getProperty("SVGPage.SVG.xpath")));
	SVG.click();
	return this;

	}
	
	public NewTaskPage NewTask() {
		WebElement NewTask = driver.findElement(By.xpath(prop.getProperty("NewTaskPage.NewTask.xpath")));
		NewTask.click();
		return new NewTaskPage(driver,prop);
		
	}
	

}
