package StepDefinition_LMS;
import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Driver.DriverFactory;
import POM_LMS.HomePage_PageObject;

import Utilities.ConfigReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utilities.ConfigReader.gethomepagevalid;
import static Utilities.ConfigReader.getbrowser;


public class HomePage_StepDefinition {

	WebDriver driver;

	//private ForgotUsernamePassword_PO Forgot_UP = new ForgotUsernamePassword_PO ();

	private  HomePage_PageObject Home_Page= new HomePage_PageObject();

	

	@Given("Admin launch the browser")
	public void admin_launch_the_browser() throws IOException {
		String URL = getbrowser(); 
		driver.get(URL);

	}


	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() throws IOException {
	  
		String URL = gethomepagevalid(); 
		driver.get(URL);
	}


	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		
		String title=Home_Page.open_portallink();
	    Loggerload.info(title);
	    System.out.println("The title of launch portal is:"+title);
	    String expectedtitle="LMS" ;
		Assert.assertEquals(title, expectedtitle);
   
	}


	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() throws IOException {
		String URL = ConfigReader.gethomepageinvalid(); 
		driver.get(URL);


	}

	@Then("Admin should recieve https404 page not found error")
	public void admin_should_recieve_https404_page_not_found_error() {
		String title= Home_Page.open_portallink();
	    System.out.println("The title of launch portal is:"+title);
	    Assert.assertTrue(title.contains("404"));
	   
	}

@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		String ActualText= Home_Page.verifyLoginText();
		String ExpectedText="Login";
		Assert.assertEquals(ExpectedText, ActualText);
		   
	}


	@Then("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
		Home_Page.Verify_Logo();
	   
	}


	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
		int X =Home_Page.verify_logo_alignment_X();
		int Y=Home_Page.verify_logo_alignment_Y();
		String XY= "("+ X + ", "+ Y+")";
		int GetX= Home_Page.verify_logo_X();
		int GetY=Home_Page.verify_logo_Y();
		String GetXY= "("+ GetX + ", "+ GetY+")";
        Assert.assertEquals(XY, GetXY);		
			}


	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		Boolean display= Home_Page.login_visible();
		Loggerload.info("Element is Displayed: " + display);	    
	}


	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
		Home_Page.button_click();
	   
	}


}