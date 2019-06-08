package stepDefinitions;




import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import constants.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolHomePage;
import pageObjects.TestEnvironmentPage;



public class StepDefinitions extends ConfigFileReader {

TekSchoolHomePage tsh;
TestEnvironmentPage tep;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		
	  
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {
	  
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {
	  
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {
	  
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() {
	  
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() {
	  
	}

	@Given("^User go to Tek School page$")
	public void user_go_to_Tek_School_page() {
		ConfigFileReader.initialization();
        tsh = new TekSchoolHomePage();
		tsh.getPageTitle();

	}

@Given("^User click on test environment$")
	public void user_click_on_test_environment() {
        tsh = new TekSchoolHomePage();
		tsh.clickOnTestEnvironment();
	}
		

	@When("^User see test environment page$")
	public void user_see_test_environment_page() {
	 tep = new TestEnvironmentPage();
	 String pageTitle = tep.getPageTitle();
	 String pageUrl = tep.getPageUrl();
	 String expectedPageTitle = "Tek School Of America Test Environment";
String expectedPageUrl = "https://www.tekschoolofamerica.com/test-environment/";

assertEquals(expectedPageTitle, pageTitle);	
assertEquals(expectedPageUrl, pageUrl);	
	}

	@Then("^User verify test environment title$")
	public void user_verify_test_environment_title() {
	  
	}

	@When("^User click on myAccount$")
	public void user_click_on_myAccount() {
	  
	}

	@When("^User select login from dropdown$")
	public void user_select_login_from_dropdown() {
	 
	}

	@Then("^User should see login page$")
	public void user_should_see_login_page() {
	 
	}
	
	@When("^User enter username (.+)$")
	public void user_enter_username_test_test_com( String passWord) {
	 
	}

	@When("^User enter password (.+)$")
	public void user_enter_password_test(int arg1) {
	  
	}

	@When("^Click continue button$")
	public void click_continue_button() {
	 
	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() {
	  
	}

  
}