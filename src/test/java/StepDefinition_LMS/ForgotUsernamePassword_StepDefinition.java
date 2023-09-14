package StepDefinition_LMS;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.testng.Assert;
import Driver.DriverFactory;
import POM_LMS.ForgotUsernamePassword_PageObject;

import Utilities.ConfigReader;

import Utilities.Loggerload;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import static Utilities.ConfigReader.getvalidEmail;

import static Utilities.ConfigReader.getInvalidEmail;


public class ForgotUsernamePassword_StepDefinition {

		WebDriver driver;

		private ForgotUsernamePassword_PageObject Forgot_UP = new ForgotUsernamePassword_PageObject ();


@Given("Admin is in loginpage")

public void admin_is_in_loginpage() throws IOException

	{

	Loggerload.info(" Validating reset password link");

	Forgot_UP.Login(); 

	Assert.assertEquals("login page", Forgot_UP.getCurrentPageTitle());

	}

@When("Admin clicks forgot username or password link")

public void admin_clicks_forgot_username_or_password_link() throws IOException

	{

	Loggerload.info(" Validating forgot username click");

   	Forgot_UP.linkclick();

	}

@Then("Admin should land on forgot username or password page")

public void admin_should_land_on_forgot_username_or_password_page() throws IOException

	{

	Loggerload.info(" Admin on forgot username or password");
	Forgot_UP.Forgot_Username(); 

	Assert.assertEquals("forgot username", Forgot_UP.getCurrentPageTitle());

	}

@Then("HTTP response >= {int} the link is broken")

public void http_response_the_link_is_broken(Integer int1) throws IOException 

	{
	Loggerload.info("Verifying broken Link");

    Forgot_UP.verifyhttplink();
	}

@Then("Admin should see {string} text in gray color")

public void admin_should_see_text_in_gray_color() 

	{
	
	Loggerload.info("Validating text color");

	String usercolor[]=Forgot_UP.user_text_color();

	Assert.assertTrue(usercolor[1].equals("808080"));

		}


@Then("Admin should see {string} in text field")

public void admin_should_see_in_text_field(String string) throws InterruptedException 

	{

	Loggerload.info("Validating text content");

	WebElement EmailDisplay = Forgot_UP.EmailText();

	Assert.assertTrue(EmailDisplay.isDisplayed(), "Email text in the page");

	}


@Then("Admin should see {string}  button")

public void admin_should_see_button(String string) throws InterruptedException 

	{

	Loggerload.info("Validating button");

	WebElement sendlink = Forgot_UP.SendLink();

	Assert.assertTrue(sendlink.isDisplayed(), "Sendlink is not displayed");

}

@Then("Admin should see asterik symbol need Email")

public void admin_should_see_asterik_symbol_need_email() {

		Loggerload.info("Validating * symbol");

	Boolean display= Forgot_UP.Asterik_Verify();

	Loggerload.info("asterik is Displayed: " + display);

}

@Then("Admin should see correct spellings in every fields")

public void admin_should_see_correct_spellings_in_every_fields() {

	Loggerload.info("Validating spellings");
	
	String ActualText= Forgot_UP.verifySendLinkText();

	String ExpectedText="Send Link";

	Assert.assertEquals(ExpectedText, ActualText);

	String ActualText1= Forgot_UP.verifyEmaiText();

	String ExpectedText1="Email";

	Assert.assertEquals(ExpectedText1, ActualText1);
	

}

@Then("Admin should see send link button in center of the page")

public void admin_should_see_send_link_button_in_center_of_the_page() 
{
	Loggerload.info("Validating if link displayed");

	String align = Forgot_UP.SendLinkAlignment();

	  Assert.assertEquals("center", align);

	  Loggerload.info("The button alignment " + align);

}


@Given("Admin is in forgot username and password page")

public void admin_is_in_forgot_username_and_password_page() {

	Loggerload.info("Validating if Admin is in correct page");

	String title=Forgot_UP.Forgotpage();

    Loggerload.info(title);

    System.out.println("Admin in forgot username and password page:"+title);

    String expectedtitle="Forgot username / password" ;

	Assert.assertEquals(title, expectedtitle);

}

@When("Admin enters valid email id and clicks send link button")

public void admin_enters_valid_email_id_and_clicks_send_link_button() throws IOException {
	
	Loggerload.info("Validating field values");

	String email = getvalidEmail(); 

	Forgot_UP.valid_EmailId(email);

}
@Then("Admin should receive link in mail for reset username / password")

public void admin_should_receive_link_in_mail_for_reset_username_password() {
	
	Loggerload.info("Validating email link");

	Forgot_UP.Email_Verification();

	}

@When("Admin enters invalid email id and clicks send link button")

public void admin_enters_invalid_email_id_and_clicks_send_link_button() throws IOException {


	Loggerload.info("Validating invalid input");


	String email = getInvalidEmail(); 

	Forgot_UP.valid_EmailId(email);


	}

@Then("Admin should not receive link in mail for reset username / password")

public void admin_should_not_receive_link_in_mail_for_reset_username_password() {


	Loggerload.info("Validating email link");

	Forgot_UP.Email_Verification_invalid();

}

}