package StepDefinition_LMS;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.graphbuilder.curve.Point;

import Driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.ConfigReader;
import PageObject.Dashboard;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.ConfigReader.getValidUsername;
import static Utilities.ConfigReader.getvalidPassword;

public class Dashboard_SD {
	

	WebDriver driver;

	private Dashboard Dash_Page = new Dashboard(DriverFactory.getDriver());



@Given("Admin is in login page")
public void admin_is_in_login_page() throws IOException {
	
	Dash_Page.Login(); 
	Assert.assertEquals("Login Page", Dash_Page.getCurrentPageTitle()); 
	} 


@When("Admin enter valid credentials  and clicks login button")
public void admin_enter_valid_credentials_and_clicks_login_button(String user, String pwd) throws IOException {
	String uname = getValidUsername(); 
	String pwds = getvalidPassword(); 
	
    Dash_Page.ValidCredentials(user, pwd);


    }

@Then("Admin should see manage program as header")
public void admin_should_see_manage_program_as_header(String header) {
	String DashPageHeader = Dash_Page.verifyHeaderText();

	Assert.assertEquals(DashPageHeader, header);
}


@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) throws InterruptedException {
	
	Dash_Page.ResponseTime();
    
}

@Then("HTTP response >= {int}.")
public void http_response() throws IOException {
	Dash_Page.verifyLink();
 
}


@Then("Admin should see LMS -Learning management system  as title")
public void admin_should_see_lms_learning_management_system_as_title(String LMSTitle) {
	String LMSHeader = Dash_Page.verifyLMSTitle();

	Assert.assertEquals(LMSHeader, LMSTitle);


    }

@Then("LMS title should be on the top left corner of page")
public void lms_title_should_be_on_the_top_left_corner_of_page() {
	
 Dash_Page.LMSTitleAlignment();
   }

@Then("Admin should see correct spelling in navigation bar text")
public void admin_should_see_correct_spelling_in_navigation_bar_text() {
	
	String[] correctSpellings = {"Student","Program","Batch","Class","User","Assignment","Attendance","Logout"};

	for (String spelling : correctSpellings)
	{
	Assert.assertTrue(Dash_Page.getNavigationBarText().contains(spelling));
	}

	}
@Then("Admin should see correct spelling and space in LMS title")
public void admin_should_see_correct_spelling_and_space_in_lms_title() {
	
	String expectedLmsTitle = "LMS-Learning Management System";
	Assert.assertEquals(expectedLmsTitle, Dash_Page.TitleText());
	}


@Then("Admin should see the navigation bar text on the top right side")
public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
	Dash_Page.NavigationAlignment();
}

@Then("Admin should see student in the 1st place")
public void admin_should_see_student_in_the_1st_place() {
	Dash_Page.Student_Positioning();
	}
 @Then("Admin should see program in the 2nd place")
public void admin_should_see_program_in_the_2nd_place() {
		Dash_Page.Program_Positioning();

}

@Then("Admin should see batch in the 3rd place")
public void admin_should_see_batch_in_the_3rd_place() {
	Dash_Page.Batch_Positioning();;

}

@Then("Admin should see class in the 4th place")
public void admin_should_see_class_in_the_4th_place() {
	Dash_Page.Class_Positioning();

}

@Then("Admin should see User in the 5th place")
public void admin_should_see_student_in_the_5th_user() {
	Dash_Page.User_Positioning();

   }

@Then("Admin should see Assingment in the 6th place")
public void admin_should_see_student_in_the_6th_assignment() {
	Dash_Page.Assignment_Positioning();;

}

@Then("Admin should see Attendance in the 7th place")
public void admin_should_see_student_in_the_7th_attendance() {
	Dash_Page.Attendance_Positioning();

}

@Then("Admin should see Logout in the 8th place")
public void admin_should_see_student_in_the_8th_logout() {
	Dash_Page.Logout_Positioning();

   }
@Given("Admin is in dashboard page")
public void admin_is_in_dashboard_page() {
	Assert.assertEquals("Dashboard Page", Dash_Page.getCurrentPageTitle()); 

}

@When("Admin click Logout button on navigation bar")
public void admin_click_logout_button_on_navigation_bar() {
    Dash_Page.Logout();
}

@Then("Admin should land on login in page")
public void admin_should_land_on_login_in_page() throws IOException {
 
	Assert.assertEquals("Login Page", Dash_Page.getCurrentPageTitle()); 
	
}


}
