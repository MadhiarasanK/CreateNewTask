package CreateTaskPOM;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Message extends BasicReq {

	public Message(ChromeDriver driver,Properties prop) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop=prop;
	}

	
	public  void Messagedisp() throws IOException {
		
		String Message = driver.findElement(By.xpath(prop.getProperty("Message.Messagedisp.xpath"))).getText();
		System.out.println("Created Message is" + Message);
		
	    File Source = driver.getScreenshotAs(OutputType.FILE);
	    File target = new File("./MessageScreenshot.jpeg");
	    FileUtils.copyFile(Source, target);
		
		
		
		
		driver.close();
	}
	
	
}
