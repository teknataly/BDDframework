package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class TestEnvironmentPage extends ConfigFileReader{

public TestEnvironmentPage()	{
	
	PageFactory.initElements(driver, this);}
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'My Account']")
	private WebElement myAccount;
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'Register']")
	private WebElement register;
	
	public void clickOnMyAccount ()
{myAccount.click();}
	
	public void clickOnRegister (){
		myAccount.click();}
	
		public void clickOnLogin () {
			myAccount.click();}

	public String getPageTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	
	public String getPageUrl() {
		String actualURL = driver.getCurrentUrl();
		return actualURL;
	}
}