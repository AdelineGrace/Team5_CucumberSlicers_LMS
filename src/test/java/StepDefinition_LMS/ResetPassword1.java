package StepDefinition_LMS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Driver.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.ResetPassword_PO1;
import Utilities.Loggerload;


public class ResetPassword1{
	

	WebDriver driver;

	private ResetPassword_PO1 Reset = new ResetPassword_PO1 (DriverFactory.getDriver());


@When("Admin clicks reset password link")
public void admin_clicks_reset_password_link() {
	Loggerload.info(" Validating reset password link");

	Reset.ResetClick();
}
	

@Then("Admin should land on reset password page")
public void admin_should_land_on_reset_password_page() throws IOException {
	Loggerload.info(" Validating if admin landed in correct page");

Reset.ResetPassword(); 
	
	Assert.assertEquals("Reset password Page", Reset.getCurrentPageTitle()); 
}
	

@Then("Admin should see correct spellings in all fields")
public void admin_should_see_correct_spellings_in_all_fields() {
	Loggerload.info(" Validating correct spelling");

	String[] correctSpellings = {"Reset Password Page","Type in new Password","ReType Password","Submit"};

	for (String spelling : correctSpellings)
	{
	Assert.assertTrue(Reset.getResetNavBarText().contains(spelling));
	}

	}

    
@Then("Admin should see {string} button")
public void admin_should_see_button(String string) throws InterruptedException {
	Loggerload.info(" Validating correct spelling");

	Loggerload.info(" Validating the submit Button in reset password page");
	WebElement submit = Reset.Submit();
	Assert.assertTrue(submit.isDisplayed(), "Cancel Button is not displayed on the class details page");    

 }

@Then("Admin should see submit button in center of the page")
public void admin_should_see_submit_button_in_center_of_the_page() {
		Reset.SubmitAlignment();
   }

@Then("Admin should see two text box")
public void admin_should_see_two_text_box() throws InterruptedException {
	WebElement value1 = Reset.user_txtvalue();
	WebElement value2 = Reset.password_txtvalue();

	Assert.assertTrue(value1.isDisplayed(), "Textbox1 is not displayed on the class page");
	Assert.assertTrue(value2.isDisplayed(), "Textbox2 is not displayed on the class page");

	
   }

@Then("Admin should see {string} in the first label text")
public void admin_should_see_in_the_first_label_text(String string) throws InterruptedException {
	
	WebElement label1 = Reset.label1_displayed();
	Assert.assertTrue(label1.isDisplayed(), "Type in new password not displayed");

   }

@Then("Admin should see {string} in the second label text")
public void admin_should_see_in_the_second_label_text(String string) throws InterruptedException {
	WebElement label2 = Reset.label2_displayed();
	Assert.assertTrue(label2.isDisplayed(), "Type in new password not displayed");

}

@Then("Admin should see text box in disabled state")
public void admin_should_see_text_box_in_disabled_state() throws InterruptedException {
	
	WebElement value1 = Reset.user_txtvalue();
	Assert.assertTrue(value1.isEnabled(), "Textbox is not displayed");

	
	WebElement value2 = Reset.password_txtvalue();
	Assert.assertFalse(value2.isEnabled(), "Textbox is not disabled");

}
}