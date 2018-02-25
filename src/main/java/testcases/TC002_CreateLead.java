package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create a new lead with mandatory fields";
		testNodes="Leads";
		category="Smoke";
		authors="Greshma";
		browserName="chrome";
		dataSheetName="createleadinput";
}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String compName,String firName,String lasName, String cName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompName(compName)
		.enterFirstName(firName)
		.enterlastName(lasName)
		.clkSubmit()
		.verifyCompanyName(cName);
			
	}	
	
}
