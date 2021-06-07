package TestNGConversion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AssignmentCases extends BaseClass {
	
	
	@Test
	public void Assignment() throws InterruptedException {
		
		
		WebElement Toggle = driver.findElement(By.className("slds-r4"));
		Toggle.click();  
		System.out.println("Toggle clicked");		
		Thread.sleep(5000);
		
		WebElement Viewall = driver.findElement(By.xpath("//button[@class='slds-button']"));
		Viewall.click();
		System.out.println("Viewall clicked");		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//p[text()='Service Console']")).click();
		System.out.println("Service Console clicked");
		Thread.sleep(10000);
		
		//WebElement dropdown = driver.findElement(By.xpath("//div[@class='oneConsoleNav navexConsoleNav']/div[3]/div/button/lightning-primitive-icon"));
		WebElement dropdown = driver.findElement(By.xpath("//button[@title='Show Navigation Menu']"));
		dropdown.click();
		Thread.sleep(3000);
		
		WebElement Home = driver.findElement(By.xpath("//span[text()='Home']"));
		Home.click();
		System.out.println("Home Clicked");
		Thread.sleep(3000);
		
		WebElement closed = driver.findElement(By.xpath("//div[@class='container homeLanding']/div/div/div[1]/div[1]/div/div/div[1]/ul/li/span[2]"));
		String value1 = closed.getText();
		String closedvalue = value1.replace("$", "");
		System.out.println(closedvalue);
		int a = Integer.parseInt(closedvalue);
		
		WebElement open = driver.findElement(By.xpath("//div[@class='container homeLanding']/div/div/div[1]/div[1]/div/div/div[1]/ul/li[2]/span[2]"));
		String value2 = open.getText();
		String openvalue = value1.replace("$", "");
		System.out.println(openvalue);
		int b = Integer.parseInt(openvalue);
		
	    int Totalvalue = 10000;
	    int amount = a+b;
	     if(amount<Totalvalue) {
	    	
	    	 WebElement Edit = driver.findElement(By.xpath("//button[@title='Edit Goal']"));
	 		Edit.click();
	 		Thread.sleep(2000);
	 		
	 		WebElement value = driver.findElement(By.xpath("//span[@id='currencyCode']/following::input"));
	 		value.clear();
	 		value.sendKeys("10000");
	 		WebElement Save = driver.findElement(By.xpath("//div[@class='buttonGroup']/button[2]/span"));
	 		Save.click();
	 		System.out.println("Goal Set to 10000");
	 		
	    	 
	    	 
	     }
		
				
		
		
		WebElement dropdown1 = driver.findElement(By.xpath("//div[@class='oneConsoleNav navexConsoleNav']/div[3]/div/button/lightning-primitive-icon"));
		dropdown1.click();
		Thread.sleep(3000);
		
		WebElement Dashboard = driver.findElement(By.xpath("//span[text()='Dashboards']"));
		Dashboard.click();
		System.out.println("Dashboard Clicked");
		Thread.sleep(5000);
		
		WebElement NewB = driver.findElement(By.xpath("//div[@title='New Dashboard']"));
		NewB.click();
		Thread.sleep(5000);
		
		WebElement Framewindow = driver.findElement(By.xpath("(//iframe[@title='dashboard'])[last()]"));
		driver.switchTo().frame(Framewindow);	
		Thread.sleep(5000);
		
		
		WebElement Name = driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
		Name.click();
		Name.sendKeys("Madhi_Workout");
		
		WebElement Desc = driver.findElement(By.xpath("//input[@id='dashboardDescriptionInput']"));
		Desc.click();
		Desc.sendKeys("Testing");
		
		WebElement Create = driver.findElement(By.xpath("//button[@id='submitBtn']"));
		Create.click();
		System.out.println("Dashbaord Created Successfully");
		driver.switchTo().defaultContent();
		
		Thread.sleep(8000);
		
		WebElement Framewindow2 = driver.findElement(By.xpath("(//iframe[@title='dashboard'])[last()]"));
		driver.switchTo().frame(Framewindow2);	
		Thread.sleep(5000);
		
		WebElement Done = driver.findElement(By.xpath("//button[text()='Done']"));
		Done.click();
		System.out.println("Done clicked successufully");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement Framewindow3 = driver.findElement(By.xpath("(//iframe[@title='dashboard'])[last()]"));
		driver.switchTo().frame(Framewindow3);	
		Thread.sleep(3000);
		
		//div[@class='slds-page-header__name-title']//span[contains(text(),'Dashboard')]/following-sibling::span
		//span[text()='Dashboard']/following::span[1]
		
		WebElement DashboardCreated = driver.findElement(By.xpath("//div[@class='slds-page-header__name-title']//span[contains(text(),'Dashboard')]/following-sibling::span"));
		
		//WebElement element = wait.until(ExpectedConditions.visibilityOf(DashboardCreated));
		String DashboardName = DashboardCreated.getText();
		System.out.println("Created Dashboard name is " + DashboardName);
		
		WebElement Subscribe = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		Subscribe.click();
		System.out.println("Subscribe Clicked Successfully");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		
		
		
		WebElement Freq = driver.findElement(By.xpath("//span[text()='Daily']"));
		Freq.click();
		System.out.println("Daily Selected");
		
		
		WebElement Time = driver.findElement(By.xpath("//select[@id='time']"));
		Time.click();
		Select select = new Select(Time);
		select.selectByValue("10");
		
		WebElement SaveButton = driver.findElement(By.xpath("//button[@title='Cancel']/following::button/span"));
		SaveButton.click();
		
		WebElement Message = driver.findElement(By.xpath("//span[contains(text(),'subscription')]"));
		String SubscriptionMessage = Message.getText();
		System.out.println("Subscription Message is " + SubscriptionMessage );
		
		Thread.sleep(4000);
		
//		WebElement CloseTab = driver.findElement(By.xpath("//div[@class='oneConsoleNav navexConsoleNav']/following::div[1]/div/div/ul/li[10]/div[2]/button/span"));
//		CloseTab.click();
		
		WebElement CloseTab = driver.findElement(By.xpath("//button[contains(@title,'"+DashboardName+"') and contains(@title,'Close')]"));
		CloseTab.click();
		
		
		WebElement DashboardMenu = driver.findElement(By.xpath("//span[text()='Dashboards']"));
		DashboardMenu.click();
		System.out.println("Dashboard Clicked");
		Thread.sleep(5000);
		
		WebElement PrivateDB = driver.findElement(By.xpath("//div[@class='folderNavigator']/div[2]/div/div[1]/div/nav/div[1]/ul/li[3]/a"));
		PrivateDB.click();
		System.out.println("Private Dasboard clicked successfully");
		
		Thread.sleep(4000);
		
		WebElement SearchFileName = driver.findElement(By.xpath("//span[@class='hidden uiOutputText']/following::div[1]/div[1]/div/input"));
		SearchFileName.sendKeys(DashboardName);
		Thread.sleep(5000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement ShowAction = driver.findElement(By.xpath("(//a[@title='"+DashboardName+"'])[1]//following::td[6]//button"));
		//WebElement ShowAction = driver.findElement(By.xpath("//div[@class='slds-scrollable_y']/table/thead/tr/th/following::tbody[1]/tr/td[6]/lightning-primitive-cell-factory/span/div"));
		js.executeScript("arguments[0].click();", ShowAction);
       // wait.until(ExpectedConditions.elementToBeClickable(ShowAction));
		//ShowAction.click();
		
		Thread.sleep(5000);
		
		WebElement Delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		Delete.click();
		Thread.sleep(5000);
		 
		WebElement Deletemsg = driver.findElement(By.xpath("//button[@title='Cancel']/following::button/span"));
		Deletemsg.click();
		System.out.println("Deleted Successfully");
		
		Thread.sleep(5000);
		
		//WebElement SuccessDelMsg = driver.findElement(By.xpath("//div[@class='forceVisualMessageQueue']"));
		WebElement SuccessDelMsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]"));
		String tabledelete = SuccessDelMsg.getText();
		System.out.println("Successful message is "+ tabledelete);
		
		Thread.sleep(5000);
		
		WebElement SearchFileName1 = driver.findElement(By.xpath("//span[@class='hidden uiOutputText']/following::div[1]/div[1]/div/input"));
		SearchFileName1.clear();
		SearchFileName1.sendKeys(DashboardName);
		Thread.sleep(3000);
		
		
		boolean displayed = driver.findElement(By.xpath("//span[@class='emptyMessageTitle']")).isDisplayed();
		
		
		
//	    boolean displayed = driver.findElement(By.xpath("(//a[@title='"+DashboardName+"'])[1]")).isDisplayed();
//		boolean CreateFileName = FileName.isDisplayed();
//		System.out.println(CreateFileName);
		
		if(displayed) {
			
			WebElement Norecords = driver.findElement(By.xpath("//span[@class='emptyMessageTitle']"));
			String Recordname = Norecords.getText();
	 		System.out.println("Search Result is "+Recordname);
			System.out.println("Created File is not available and your case is PASS");
		}
		else {
		System.out.println("Created File is not deleted and your test case is FAIL");
	 
	}
}
}