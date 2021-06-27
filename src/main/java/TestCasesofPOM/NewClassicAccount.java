package TestCasesofPOM;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasicPOMClass.BasicClass;
import PagesofPOM.LightentingPage;
import PagesofPOM.LoginPageClasses;
import PassingDataofPOM.PassingDataforClassicAccount;

public class NewClassicAccount extends BasicClass {


	@Test
	public void NewClassic() throws InterruptedException {
		
	new LoginPageClasses(driver)
		.Username("cypress@testleaf.com")
		.Password("Selbootcamp@123")
		.Login()
		.ViewProfile()
		.SwitchSalesforceClassic()
		.CreateNewButton()
		.SelectAccount()
		.AccountName("BootCamp_Madhi")
		.EnterAddress("#123, ABC Street, New York, America")
		.CopyAddress()
		.AddressVerification("#123, ABC Street, New York, America")
		.Dateselection()
		.SaveButton()
		.RecentItems()
		.AccountNameinForm()
		.Moretab()
		.AccountsTab()
		.CreatedAccountName()
		.switchlink()
		.CloseBrowser();	
	}
	

}

















//@BeforeTest
//public void setFile() {
//	ExcelFileName = "ClassicAccount";
//}


//@Test(dataProvider="ClassicDataProvider")
//public void NewClassic(String Username,String Password, String Accountnames, String Address1, String Address2) {

