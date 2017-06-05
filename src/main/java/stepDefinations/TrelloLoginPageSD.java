package stepDefinations;	

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TrelloLoginPageSD {
	
	SeleniumFunctions sf = new SeleniumFunctions();
	
	@Given("^user is on trello homepage$")
	public void user_is_on_trello_homepage(){
	    sf.homepageDisplayed();
	}

	@When("^user clicks on Login button with '(.*)' and '(.*)'$")
	public void user_clicks_on_Login_button_with_username_and_password(String username, String password){
	    sf.clickLogin(username, password);
	   
	}

	@Then("^Login error message is displayed '(.*)'$")
	public void login_error_message_is_displayed(String errorShouldBeDisplayed) throws InterruptedException{
		String errorMessage = sf.checkErrorMessage();
		if (!errorMessage.equals(errorShouldBeDisplayed)){
			Assert.fail("Desired Error message is not displayed");
			System.out.println("Error Message displayed is - "+errorMessage);
		}
	}
}
