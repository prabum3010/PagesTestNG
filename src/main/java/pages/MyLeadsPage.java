package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (how=How.LINK_TEXT,using="Create Lead")
	private WebElement clkCreateLead;
	
	public CreateLead clickCreateLead()
	{
		click(clkCreateLead);
		return new CreateLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement clkMergeLead;
	
	public MergeLeadsPage clickMergeLead()
	{
		click(clkMergeLead);
		return new MergeLeadsPage();
		
	}
	

}
