package StepDefinition_LMS;

import static org.testng.Assert.assertEquals;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.ResetPassword_PO;
import Utilities.ConfigReader;
import Utilities.Loggerload;
import static Utilities.ConfigReader.getInValidUsername;
import static Utilities.ConfigReader.getInvalidPassword;
import static Utilities.ConfigReader.getValidUsername;
import static Utilities.ConfigReader.getvalidPassword;



public class ResetPassword{
	

	WebDriver driver;

	private ResetPassword_PO Reset = new ResetPassword_PO (DriverFactory.getDriver());


@When("Admin clicks reset password link")
public void admin_clicks_reset_password_link()
	{
	Loggerload.info(" Validating reset password link");

	Reset.ResetClick();
	}
	

@Then("Admin should land on reset password page")
public void admin_should_land_on_reset_password_page() throws IOException
	{
	Loggerload.info(" Validating if admin landed in correct page");
	Reset.ResetPassword(); 
	Assert.assertEquals("Reset password Page", Reset.getCurrentPageTitle()); 
	}
	

@Then("Admin should see correct spellings in all fields")
public void admin_should_see_correct_spellings_in_all_fields() 
	{
	Loggerload.info(" Validating correct spelling");
	
	String[] correctSpellings = {"Reset Password Page","Type in new Password","ReType Password","Submit"};
	for (String spelling : correctSpellings)
	{
	Assert.assertTrue(Reset.getResetNavBarText().contains(spelling));
	}
	}

    
@Then("Admin should see {string} button")
public void admin_should_see_button(String string) throws InterruptedException
	{
	Loggerload.info(" Validating the submit Button in reset password page");
	
	WebElement submit = Reset.Submit();
	Assert.assertTrue(submit.isDisplayed(), "Cancel Button is not displayed on the class details page");    
	}

@Then("Admin should see submit button in center of the page")
public void admin_should_see_submit_button_in_center_of_the_page()
	{
	Loggerload.info(" Validating submit button");
	
	Reset.SubmitAlignment();
	}

@Then("Admin should see two text box")
public void admin_should_see_two_text_box() throws InterruptedException
	{
	Loggerload.info(" Validating submit button");

	WebElement value1 = Reset.user_txtvalue();
	WebElement value2 = Reset.password_txtvalue();

	Assert.assertTrue(value1.isDisplayed(), "Textbox1 is not displayed");
	Assert.assertTrue(value2.isDisplayed(), "Textbox2 is not displayed");

	
   }

@Then("Admin should see {string} in the first label text")
public void admin_should_see_in_the_first_label_text(String string) throws InterruptedException 
	{
	Loggerload.info(" Validating first label text");

	WebElement label1 = Reset.label1_displayed();
	Assert.assertTrue(label1.isDisplayed(), "Type in new password not displayed");
	}

@Then("Admin should see {string} in the second label text")
public void admin_should_see_in_the_second_label_text(String string) throws InterruptedException 
	{
	Loggerload.info(" Validating second label text");

	WebElement label2 = Reset.label2_displayed();
	Assert.assertTrue(label2.isDisplayed(), "Type in new password not displayed");
	}

@Then("Admin should see text box in disabled state")
public void admin_should_see_text_box_in_disabled_state() throws InterruptedException 
	{
	Loggerload.info(" Validating disabled state");

	WebElement value1 = Reset.user_txtvalue();
	Assert.assertTrue(value1.isEnabled(), "Textbox is disabled");

	WebElement value2 = Reset.password_txtvalue();
	Assert.assertFalse(value2.isEnabled(), "Textbox is disabled");
	}

@Given("Admin reset password page")
public void admin_reset_password_page() throws IOException
	{
	Loggerload.info(" Validating ifadmin is in reset password page");

	Reset.ResetPassword(); 
	Assert.assertEquals("Reset password Page", Reset.getCurrentPageTitle()); 
	}

@When("Admin clicks on type in new password field")
public void admin_clicks_on_type_in_new_password_field()
	{
	Loggerload.info(" Validating clicks on field");

	Reset.type_password();
	}

@Then("Admin should see text box is enabled state")
public void admin_should_see_text_box_is_enabled_state() throws InterruptedException
	{
	Loggerload.info(" Validating if field is enabled");

	WebElement value1 = Reset.user_txtvalue();
	Assert.assertTrue(value1.isEnabled());
	}

@When("Admin clicks on retype password field")
public void admin_clicks_on_retype_password_field() 
	{
	Loggerload.info(" Validating clicks on field");

		Reset.retype_password();
	}


@Given("Admin is in the login page")
public void admin_is_in_the_login_page() throws IOException
	{
	Loggerload.info(" Validating if admin in login page");

	Reset.Login(); 
	Assert.assertEquals("Login Page", Reset.getCurrentPageTitle());
	}


@When("Admin enters same password on both field and clicks submit button")
public void admin_enters_same_password_on_both_field_and_clicks_submit_button(String pwd1, String pwd2) throws IOException
	{
	String pwd = getvalidPassword();
	String pwdconfirm = getvalidPassword();
	   Reset.validPassword(pwd,pwdconfirm);
	}
@Then("Admin should recieve Your password has been reset Please click here to login")
public void admin_should_recieve_your_password_has_been_reset_please_click_here_to_login() throws IOException 
	{
    Reset.message();
	}
@When("Admin enters same password on both field with invalid details and clicks submit button")
public void admin_enters_same_password_on_both_field_with_invalid_details_and_clicks_submit_button(String pwd1, String pwd2) throws IOException 
	{
	String pwds = getInvalidPassword();
	String pwdconfirms = getInvalidPassword();
	
	   Reset.invalidPassword(pwds,pwdconfirms);
	}

@Then("Error message Please try agin")
public void error_message_please_try_agin() throws IOException 
	{
	Reset.error_message();
	}
@When("Admin enters  empty details on both fieldand clicks submit button")
public void admin_enters_empty_details_on_both_fieldand_clicks_submit_button(String pwd1, String pwd2) 
	{
	String pwd = "";
	String pwdconfirm = "";
	
	Reset.emptyPassword(pwd,pwdconfirm);
	}
@When("Admin enters  mismatch values and clicks submit button")
public void admin_enters_mismatch_values_and_clicks_submit_button(String pwd1, String pwd2) throws IOException
	{
	String pwd = ConfigReader.getvalidPassword();
	String pwdconfirm = ConfigReader.getInvalidPassword();
	
	 Reset.mismatchPassword(pwd,pwdconfirm);
	}
}