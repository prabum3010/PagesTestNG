package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])")
	private WebElement frmLead;
	
	public MergeLeadsPage enterFromLead(String fromLead)
	{
		type(frmLead, fromLead);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement clkMergeLead;
	
	public MergeLeadsPage clickMergeLead()
	{
		click(clkMergeLead);
		return new MergeLeadsPage();
		
	}

}
