package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {
	
	public ViewLeadsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement comName;
	public ViewLeadsPage verifyCompanyName(String cName)
	{
		
		verifyPartialText(comName, cName);
		return this;
	}

}
