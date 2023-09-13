package StepDefinition_LMS;



import static Utilities.ConfigReader.getUserPageURL;
import static Utilities.ConfigReader.getHeaderUserName;
import static Utilities.ConfigReader.getAddUserURL;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Driver.DriverFactory;
import POM_lms.User_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_StepDefinition {
	
	WebDriver driver;
	User_PageObject userpage = new User_PageObject(DriverFactory.getDriver());
	
	
//======================feature1 steps===========================	
	
	@When("Admin clicks User from navigation bar")
	public void admin_clicks_from_navigation_bar() {
		userpage.clickOnUser();
	    
	}

	@Then("Admin should see the Manage User in the URL from {string} and {int}")
	public void admin_should_see_the_in_the_url(String SheetName,Integer RowNumber) throws InterruptedException, IOException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);

		List<String> expectedProgramUrl = excel.getCellData(SheetName, 1, RowNumber);
		String actualProgramUrl = getUserPageURL();
		 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
		 Assert.assertNotNull(actualProgramUrl);
		 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
		 if (!expectedProgramUrl.equals(actualProgramUrl))
		 {
			 Loggerload.info("Failed to reach the User page.Expected Url: "+ expectedProgramUrl );
		 }
	    
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) throws IOException {
		String expectedHeaderName = string;
		String actualHeaderName = getHeaderUserName();
		Assert.assertEquals(expectedHeaderName, actualHeaderName);
		if(!expectedHeaderName.equals(actualHeaderName)){
			Loggerload.info("Failed to see User header");
		}
	    
	    
	}

	@Then("Admin should see the pagination controls under the data table as{string} and {int}")
	public void admin_should_see_the_pagination_controls_under_the_data_table(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);

		List<String> expectedProgramtext = excel.getCellData(SheetName, 2, RowNumber);
		String actualProgramtext = userpage.pagination_text().getText();
		 Assert.assertEquals(expectedProgramtext, actualProgramtext);
		 Assert.assertNotNull(actualProgramtext);
		 Assert.assertTrue(actualProgramtext.startsWith("http://"));
		 if (!expectedProgramtext.equals(actualProgramtext))
		 {
			 Loggerload.info("Failed to see the pagination icon" );
		 }
}

	@Then("Admin Should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
		WebElement userId = userpage.userId();
		Assert.assertTrue(userId.isDisplayed(), "User Id is not displayed on the user page");
		WebElement name = userpage.userName();
		Assert.assertTrue(name.isDisplayed(), "Name is not displayed on the user page");
		WebElement location = userpage.userLocation();
		Assert.assertTrue(location.isDisplayed(), "Location is not displayed on the user page");
		WebElement phoneNo = userpage.userPhoneno();
		Assert.assertTrue(phoneNo.isDisplayed(), "Phone number is not displayed on the user page");
		WebElement edit = userpage.EditClass();
		Assert.assertTrue(edit.isDisplayed(), "Edit is not displayed on the user page");
		WebElement delete = userpage.DeleteClass();
		Assert.assertTrue(delete.isDisplayed(), "Delete is not displayed on the user page");
		}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
		WebElement delete = userpage.DeleteClass();
		Assert.assertTrue(delete.isEnabled(), "Delete is not disabled on  the user page");
	    
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) throws InterruptedException {
		WebElement addnew = userpage.Addnew();
		Assert.assertTrue(addnew.isDisplayed(), "+Add New Button is not displayed on the user page");
		Loggerload.info("Add new button is not displayed" );
	    
	}

	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box() throws InterruptedException {
		WebElement search = userpage.Search();
		Assert.assertTrue(search.isDisplayed());
		Loggerload.info("Search bar is not displayed");
	    }

    @Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		userpage.checkbox();
		Loggerload.info("Checkbox icon is not displayed" );
	   
	}

	@Given("Admin is on dashboard page after Login and Admin clicks {string} from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_from_navigation_bar(String string) {
		userpage.clickOnUser();
		}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) throws InterruptedException {
		WebElement addUser= userpage.Addnew();
		addUser.click();
	    
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears() throws IOException {
		String currentURL =DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = getAddUserURL();
			 Assert.assertEquals(expectedURL, currentURL);
			 Assert.assertNotNull(currentURL);
			 Assert.assertTrue(currentURL.startsWith("http://"));
			 if (!expectedURL.equals(currentURL))
			 {
				 Loggerload.info("Failed to reach the User detail page.Expected Url: "+ expectedURL );
			 }
	    
	}
//===========================feature2=======================
	@Given("A new pop up with user details appears")
	public void new_pop_up_with_user_details_appears() throws IOException {
		String currentURL =DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = getAddUserURL();
			 Assert.assertEquals(expectedURL, currentURL);
			 Assert.assertNotNull(currentURL);
			 Assert.assertTrue(currentURL.startsWith("http://"));
			 if (!expectedURL.equals(currentURL))
			 {
				 Loggerload.info("Failed to reach the User detail page.Expected Url: "+ expectedURL );
			 }
	  }
    @Then("The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as text box User Role, Role status, visa status as drop down")
	public void the_pop_up_should_include_the_fields_first_name_middle_name_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_and_user_comments_as_text_box_user_role_role_status_visa_status_as_drop_down() throws InterruptedException {
    	
    	WebElement fname = userpage.isFirstnamePresent();
		Assert.assertTrue(fname.isDisplayed(), "first name not displayed");
		WebElement mName = userpage.middlename();
		Assert.assertTrue(mName.isDisplayed(), "Middle name not displayed");
		WebElement lName = userpage.lastname();
		Assert.assertTrue(lName.isDisplayed(), "Last name not displayed");
		WebElement location = userpage.locationDisplayed();
		Assert.assertTrue(location.isDisplayed(), "Location not displayed");
		WebElement phone = userpage.phoneNo();
		Assert.assertTrue(phone.isDisplayed(), "PhoneNo not displayed");
    	WebElement email = userpage.emailDisplayed();
		Assert.assertTrue(email.isDisplayed(), "Email not displayed");
		WebElement undergrad = userpage.undergraduateD();
		Assert.assertTrue(undergrad.isDisplayed(), "undergraduate not displayed");
		WebElement postgrad = userpage.postgraduateD();
		Assert.assertTrue(postgrad.isDisplayed(), "Postgradute not displayed");
		WebElement timezone = userpage.timezoneD();
		Assert.assertTrue(timezone.isDisplayed(), "Time zone not displayed");
		WebElement usercom = userpage.usercommentsD();
		Assert.assertTrue(usercom.isDisplayed(), "User comments not displayed");
		}

	@When("Fill in all the fields except optional fields with valid values from {string} {int} and click submit")
	public void fill_in_all_the_fields_except_optional_fields_with_valid_values_and_click_submit(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info("Popup have all the fields");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
    	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
    	List<String> lastName = excel.getCellData(SheetName, 4, RowNumber);
       List<String> Location = excel.getCellData(SheetName, 5, RowNumber);
    	List<String> phone = excel.getCellData(SheetName, 6, RowNumber);
    	
    	userpage.first_name(firstName);
    	userpage.last_name(lastName);
    	userpage.location(Location);
    	userpage.phone(phone);
        userpage.clickOnSubmit();
	    
	}

	@Then("The newly added user should be present in the data table in Manage User page")
	public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page() throws InterruptedException {
		
		WebElement newuser = userpage.Addnew();
		Assert.assertTrue(newuser.isDisplayed(), "User is not added");
	    
	}

	@When("Fill in all the fields with valid values and click submit")
	public void fill_in_all_the_fields_with_valid_values_and_click_submit(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info("Popup have all the fields");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
    	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
    	List<String> lastName = excel.getCellData(SheetName, 4, RowNumber);
    	List<String> middleName = excel.getCellData(SheetName, 3, RowNumber);
    	List<String> Location = excel.getCellData(SheetName, 5, RowNumber);
    	List<String> phone = excel.getCellData(SheetName, 6, RowNumber);
    	List<String> linkedinurl = excel.getCellData(SheetName, 7, RowNumber);
    	List<String> email = excel.getCellData(SheetName, 8, RowNumber);
    	List<String> undergraduate = excel.getCellData(SheetName, 9, RowNumber);
    	List<String> postgraduate = excel.getCellData(SheetName, 10, RowNumber);
    	List<String> timeZone = excel.getCellData(SheetName, 11, RowNumber);
    	List<String> userComments = excel.getCellData(SheetName, 12, RowNumber);
    	
    	
    	userpage.first_name(firstName);
    	userpage.last_name(lastName);
    	userpage.middle_name(middleName);
    	userpage.location(Location);
    	userpage.phone(phone);
    	userpage.linkedinurl(linkedinurl);
    	userpage.email(email);
    	userpage.undergraduate(undergraduate);
    	userpage.postgraduate(postgraduate);
    	userpage.timezone(timeZone);
    	userpage.usercomments(userComments);
	    userpage.clickOnSubmit();
	    
	    
	}

	@When("any of the fields have invalid values from {string} and {int}")
	public void any_of_the_fields_have_invalid_values(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info("Popup have all the fields");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
    	List<String> firstName = excel.getCellData(SheetName, 13, RowNumber);
    	List<String> lastName = excel.getCellData(SheetName, 14, RowNumber);
       List<String> Location = excel.getCellData(SheetName,15, RowNumber);
    	List<String> phone = excel.getCellData(SheetName, 16, RowNumber);
    	
    	userpage.first_name(firstName);
    	userpage.last_name(lastName);
    	userpage.location(Location);
    	userpage.phone(phone);
          }

	@Then("Error message should appear")
	public void error_message_should_appear() {
		Loggerload.error("Enter valid values");
		}

	@When("Any of the mandatory fields are blank")
	public void any_of_the_mandatory_fields_are_blank() {
		Loggerload.info(" Blank fields in the Table");
		boolean isDataTableEmpty = userpage.DataTableEmpty();
		Assert.assertTrue(isDataTableEmpty, "Data table is not empty.");
	    
	}

	//===============================feature3==================
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
		Loggerload.info(" Edit button enabled");
	WebElement isEditbuttonEnabled = userpage.editButton();
		Assert.assertTrue(isEditbuttonEnabled.isEnabled(), "Data table is not empty.");
	    
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
		WebElement edit = userpage.EditClass();
		edit.click();
	    
	    
	}

	@Given("Admin clicks the edit icon")
	public void admin_clicks_the_edit() {
		WebElement edit = userpage.EditClass();
		edit.click();
	    
	}

	@When("Update the fields with valid values from {string} {int} and click submit")
	public void update_the_fields_with_valid_values_and_click_submit(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
   	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
      List<String> Location = excel.getCellData(SheetName, 5, RowNumber);
      userpage.first_name(firstName);
  	userpage.location(Location);
  	userpage.clickOnSubmit();
  	
		}

	@Then("The updated user details should appear on the data table")
	public void the_updated_user_details_should_appear_on_the_data_table() {
		String firstName = userpage.updatedfirstName().getText();
		String location = userpage.updatedLocation().getText();
		Assert.assertEquals(firstName, "UpdatedFirstName", "First name does not match.");
        Assert.assertEquals(location, "UpdatedLocation", "Location does not match.");
	    
	    
	}

	@When("Update the fields with invalid values from {string} {int} and click submit")
	public void update_the_fields_with_invalid_values_and_click_submit(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
  	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
     List<String> Location = excel.getCellData(SheetName, 5, RowNumber);
     userpage.first_name(firstName);
 	userpage.location(Location);
 	userpage.clickOnSubmit();
	    }

	@When("Erase data from mandatory field")
	public void erase_data_from_mandatory_field() {
		userpage.deleteMandotaryfields();
		}

	@When("Erase data from description field")
	public void erase_data_from_description_field() {
	    //There is no such field on user page
	    
	}

	//===========================feature4========================
	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
		boolean delete = userpage.deleteisEnabled();
		Assert.assertTrue(delete, "Delete button is enabled");
	}
	
	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon(){
		userpage.clickOnDelete();
		
	}
   @Then("Alert appears with yes and No option")
    public void alert_appears_with_yes_and_no_option() {
	   String alert = userpage.alertMsg().getText();
	   Assert.assertTrue(alert.contains("Alert with yes and no"), "Alert message doesn't match expected text.");
  }
	@When("Admin click yes option")
	public void admin_click_yes_option() {
		userpage.acceptAlert();
		
	}
	@Then("User deleted alert pops and user from {string} and {int} is no more available in data table")
	public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
	           userpage.isRecordPresentInTable(firstName);
	            Loggerload.info("Record is still there");
		
	}
	
	@When("Admin click No option")
	public void admin_click_no_option() {
		userpage.dismissAlert();
	}
	
	@Then("User from {string} and {int} is still listed in data table")
	public void user_is_still_listed_in_data_table(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
	           userpage.isRecordPresentInTable(firstName);
  Loggerload.info("Record is not there");
		
		
	}
	
	//==================feature5==========================
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
		userpage.checkBoxDisabled();
		
		
	}
	@Then("The delete icon under the Manage User header should be disabled")
	public void the_delete_icon_under_the_manage_user_header_should_be_disabled() {
		WebElement delete = userpage.deleteisdisabled();
		Assert.assertTrue(delete.isEnabled(), "Delete button is not disabled"); 
		 }
	
	@Given("One of the checkbox/ row is selected")
	public void one_of_the_checkbox_row_is_selected() {
		 boolean isSelected = userpage.checkboxIsSelected().isSelected();
		 Assert.assertTrue(isSelected, "Checkbox/row is not selected.");
	}
	@When("Click delete icon below Manage User header")
	public void click_delete_icon_below_user_header() {
		userpage.clickOnLeftDelete();
		}
	@Then("The respective row from {string} and {int} in the data table is deleted")
	public void the_respective_row_in_the_table_is_deleted(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
 	List<String> firstName = excel.getCellData(SheetName, 2, RowNumber);
 	           userpage.isRecordPresentInTable(firstName);
   Loggerload.info("Record is still there");
		
	}
	@Given("Two or more checkboxes row is selected")
	public void two_or_more_checkboxes_row_is_selected() throws InterruptedException {
		
		WebElement checkbox1 = userpage.CheckBox1();
		Assert.assertTrue(checkbox1.isDisplayed(), "Check Box is not displayed on the first row of the data table");
		WebElement  checkbox2 = userpage.CheckBox2();
		Assert.assertTrue(checkbox2.isDisplayed(), "Check Box is not displayed on the second row of the data table");
		WebElement checkbox3 = userpage.CheckBox3();
		Assert.assertTrue(checkbox3.isDisplayed(), "Check Box is not displayed on the third row of the data table");
		
		
	}
	
	
	
	
}
