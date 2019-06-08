package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class TekSchoolHomePage extends ConfigFileReader {

	public TekSchoolHomePage () {
		PageFactory.initElements(driver, this);
	}	
		//@By annotation
		//@FindBy annotation
	
	@FindBy (how = How.XPATH , using ="(//a[text() = 'login'])[2]")
    private WebElement loginButton;
	
	@FindBy (how = How.XPATH , using ="(//a[text() = 'test environment'])[2]")
    private WebElement testEnvironment;
	
    public void clickOnLogin() {
        loginButton.click();
    }
    public void clickOnTestEnvironment() {
        testEnvironment.sendKeys(Keys.ENTER);
        //switch to new window
        for (String windowHandle: driver.getWindowHandles())
        	driver.switchTo().window(windowHandle);
    }
    
  public void getPageTitle () {
   String pageTitle = driver.getTitle() ;
   System.out.println(pageTitle);
}
		
}	

