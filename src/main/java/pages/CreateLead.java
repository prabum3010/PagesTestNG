package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement comName;
	public CreateLead enterCompName(String compName)
	{
		type(comName,compName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	public CreateLead enterFirstName(String firName)
	{
		type(firstName,firName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastName;
	public CreateLead enterlastName(String lasName)
	{
		type(lastName,lasName);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement clkSubmit;
	public ViewLeadsPage clkSubmit()
	{
		clickWithNoSnap(clkSubmit);
		return new ViewLeadsPage();
	}

}
