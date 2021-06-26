package TestCasesofPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import CreateTaskPOM.BasicReq;
import CreateTaskPOM.LoginPages;

public class CreateTaskPOM extends BasicReq{
	
	@Test
	public void CreateTask() throws InterruptedException, IOException {
		
	 new LoginPages(driver,prop)
	 .Username("cypress@testleaf.com")
	 .Password("Selbootcamp@123")
	 .Login()
	 .SVG()
	 .NewTask()
	 .Subject("BootCamp")
	 .Contacts("sarath")
	 .Status()
	 .Selection1()
	 .Save()
	 .Messagedisp();	 ;
		
	}

}
