package StepDefinition_LMS;
import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Driver.DriverFactory;
import POM_LMS.LoginPage_PageObject;
import Utilities.ConfigReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Utilities.ConfigReader.getInValidUsername;
import static Utilities.ConfigReader.getInvalidPassword;
import static Utilities.ConfigReader.getValidUsername;
import static Utilities.ConfigReader.getvalidPassword;

public class LoginPage_StepDefinition {

	//WebDriver driver;
	private  LoginPage_PageObject Login_Page= new LoginPage_PageObject();
	private DriverFactory driver= new DriverFactory();
	  Properties prop=new Properties();

@Given("Admin is in home page")
public void admin_is_in_home_page() {
	
	String title=Login_Page.open_portallink();
	Loggerload.info(title);
    System.out.println("The title of launch portal is:"+title);
    String expectedtitle="LMS" ;
	Assert.assertEquals(title, expectedtitle);
}


@When("Admin clicks Login button")
public void admin_clicks_login_button() {
	Login_Page.login_Click();
    
}


@Then("Admin should land on the login page")
public void admin_should_land_on_the_login_page() {
	String loginTitle= Login_Page.verify_loginTitle();
	String ExpectedTitle="Login";
	Assert.assertEquals(ExpectedTitle, loginTitle);
    
}


@Then("HTTP response > equalto400 the link is broken")
public void http_response_equalto400_the_link_is_broken() throws IOException {
	Login_Page.check_brokenlinks();
	Loggerload.info("Broken Links in the homepage are verified" );
}




@Then("Admin should see Please login to LMS application in the header")
public void admin_should_see_please_login_to_lms_application_in_the_header() {
	Boolean display= Login_Page.header_verify();
	Loggerload.info("Element is Displayed: " + display);


  
}


@Then("Admin should see two text field")
public void admin_should_see_two_text_field() {
	Boolean display1=Login_Page.usertxtField_verify();
	Boolean display2=Login_Page.passtxtField_verify();
	Loggerload.info("Elements are Displayed: " + display1 + "," + display2);


   
}


@Then("Admin should user in the first text field")
public void admin_should_user_in_the_first_text_field() {
	String st=Login_Page.verify_defaultUsertxt();
	Loggerload.info("The default value of User TextBox is " + st);


}
@Then("Admin should see asterik symbol next to user text")
public void admin_should_see_asterik_symbol_next_to_user_text() {

	Boolean display= Login_Page.UsernameAsterik_Verify();
	Loggerload.info("asterik is Displayed: " + display);

   
}


@Then("Admin should password in the second text field")
public void admin_should_password_in_the_second_text_field() {
	String st1=Login_Page.verify_defaultPasstxt();
	Loggerload.info("The default value of Password TextBox is " + st1);
   
}


@Then("Admin should see asterik symbol next to password text")
public void admin_should_see_asterik_symbol_next_to_password_text() {
	
	Boolean display= Login_Page.PasswordAsterik_Verify();
	Loggerload.info("asterik is Displayed: " + display);

}


@Then("Admin should see input field on the centre of the page")
public void admin_should_see_input_field_on_the_centre_of_the_page() {
  String align = Login_Page.user_alignment();
  Assert.assertEquals("center", align);
  Loggerload.info("The user text alignment " + align);
String align1 = Login_Page.pass_alignment();
  Assert.assertEquals("center", align1);
  Loggerload.info("The password text alignment " + align1);

}

@Then("Admin should see login button on the centre of the page")
public void admin_should_see_login_button_on_the_centre_of_the_page() {
	String alignment = Login_Page.login_alignment();
	  Assert.assertEquals("center", alignment);
	  Loggerload.info("The button alignment " + alignment);
  
}


@Then("Admin should see forgot username or password link")
public void admin_should_see_forgot_username_or_password_link() {
	Boolean display=Login_Page.forgot_user_pass_verify();
	Loggerload.info("Element is Displayed: " +  display);
   
}


@Then("Admin should see reset password link")
public void admin_should_see_reset_password_link() {
	Boolean displayreset=Login_Page.reset_pass_verify();
	Loggerload.info("Element is Displayed: " +  displayreset);
   
}


@Then("Admin should see user in gray color")
public void admin_should_see_user_in_gray_color() {
	
	Loggerload.info("User text grey in color");

	String usercolor[]=Login_Page.user_text_color();
	Assert.assertTrue(usercolor[1].equals("808080"));
	 
}


@Then("Admin should see password in gray color")
public void admin_should_see_password_in_gray_color() {
	Loggerload.info("User text grey in color");

	String usercolor1[]=Login_Page.pass_text_color();
	Assert.assertTrue(usercolor1[1].equals("808080"));
}

@Given("Admin is in login page")
public void admin_is_in_login_page() throws IOException {
	String loginTitle= Login_Page.open_loginpage();
	String ExpectedTitle="Login";
	Assert.assertEquals(ExpectedTitle, loginTitle);
    
}


@When("Admin enter valid credentials  and clicks login button")
public void admin_enter_valid_credentials_and_clicks_login_button(String uname, String pwd) throws IOException {
	
	Loggerload.info("Validation valid credentials");

	String uname1 = getValidUsername(); 
	String pwd1 = getvalidPassword(); 
	Login_Page.valid_login_details(uname1, pwd1);
}


@Then("Admin should land on dashboard page")
public void admin_should_land_on_dashboard_page() {
	String dbTitle= Login_Page.dashboard_Title();
	String ExpectedTitle="Login";
	Assert.assertEquals(ExpectedTitle, dbTitle);
}


@When("Admin enter invalid credentials  and clicks login button")
public void admin_enter_invalid_credentials_and_clicks_login_button(String uname, String pwd) throws IOException {
	
	Loggerload.info("Validation invalid credentials");

	String uname1 = getInValidUsername(); 
	String pwd1 = getInvalidPassword(); 
	Login_Page.valid_login_details(uname1, pwd1);
	
	
}


@Then("Error message please check username\\/password")
public void error_message_please_check_username_password() throws IOException {
	Loggerload.info("Validation error message");

   String error= Login_Page.errormess_capture();
   String Expectederror= "please check username/password";
   Assert.assertEquals(Expectederror, error);
}


@When("Admin enter valid username  and clicks login button")
public void admin_enter_valid_username_and_clicks_login_button(String uname) throws IOException {
	Loggerload.info("Validation credentials");

	String uname1 = getValidUsername(); 
	Login_Page.valid_user_details(uname1);
    
}


@Then("Error message please check password")
public void error_message_please_check_password() throws IOException {
	Loggerload.info("Validation error message");

	String error= Login_Page.errormess_capture();
	   String Expectederror= "please check password";
	   Assert.assertEquals(Expectederror, error);
}


@When("Admin enter valid  password  and clicks login button")
public void admin_enter_valid_password_and_clicks_login_button( String pwd) throws IOException {
	Loggerload.info("Validation valid credentials");

	String pwd1 = getvalidPassword(); 
	Login_Page.valid_pass_details(pwd1);
}


@Then("Error message please check username")
public void error_message_please_check_username() throws IOException {
	Loggerload.info("Validation error message");

	String error= Login_Page.errormess_capture();
	   String Expectederror= "please check username";
	   Assert.assertEquals(Expectederror, error);
}


@When("Admin enter blank in username and clicks login button")
public void admin_enter_blank_in_username_and_clicks_login_button(String uname1) throws IOException {
	
	Loggerload.info("Validation  credentials");

	String uname=" ";
	String pwd = getvalidPassword(); 
	Login_Page.valid_login_details(uname, pwd);
}


@When("Admin enter blank in password  and clicks login button")
public void admin_enter_blank_in_password_and_clicks_login_button() throws IOException {
	
	Loggerload.info("Validation  credentials");

	String uname = getValidUsername(); 
	String pass = " ";
	Login_Page.valid_login_details(uname, pass);
}


@When("Admin clicks Login button with empty values in both columns")
public void admin_clicks_login_button_with_empty_values_in_both_columns(String uname1, String pwd) {
	
	Loggerload.info("Validation  credentials");

	String uname=" ";
	String pass = " ";
	Login_Page.valid_login_details(uname, pass);
}


@When("Admin enter valid credentials and clicks login button through keyboard")
public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() throws IOException {
	Loggerload.info("Validation  credentials");

	String uname1 = getValidUsername(); 
	String pwd1 = ConfigReader.getvalidPassword(); 
	Login_Page.valid_login_details_keyboardAction(uname1, pwd1);
}


@When("Admin enter valid credentials  and clicks login button through mouse")
public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse() throws IOException {
	Loggerload.info("Validation  credentials");

	String uname = getValidUsername(); 
	String pwd = getvalidPassword(); 
	
	Login_Page.valid_login_details(uname, pwd);
}

}