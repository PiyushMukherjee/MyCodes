package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement eleupdecpmnme;
private ViewLeadPage  verifycompname(String expectedText) {
	verifyPartialText(eleupdecpmnme, expectedText);
	return this;
	
}
	
	//click edit
	//Click on edit
		@FindBy(how=How.LINK_TEXT, using="Edit")
		private WebElement eleedit;
		public EditLeadPage Clickedit()
		{
			click(eleedit);
			return new EditLeadPage(driver, test) ;
		}
	//Click on uodate option
	@FindBy(how=How.XPATH   , using="//input[@value='Update']")
	private WebElement eleupdate;
	public ViewLeadPage Clickupdatebtn	()
	{
		click(eleupdate);
		return new ViewLeadPage(driver, test) ;
	}
		
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement eleViewLead;
	
	public ViewLeadPage verifyViewLead(String expectedText)
	{
		verifyPartialText(eleViewLead, expectedText);
		return this;
	}
	
	
	
	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eledeleteLead;
	
	public MyLeadsPage deletelead()
	{	click(eledeleteLead);
		return new MyLeadsPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
