package StepDefinition_LMS;

import static Utilities.ConfigReader.getDashboardURL;
import static Utilities.ConfigReader.getHeaderName;
import static Utilities.ConfigReader.getProgramURL;
import static Utilities.ConfigReader.getAddProgramURL;
import static Utilities.ConfigReader.getdetailsURL;
import static Utilities.ConfigReader.getlastPageURL;
import static Utilities.ConfigReader.getfirstPageURL;
import static Utilities.ConfigReader.getAssignmentPageURL;
import static Utilities.ConfigReader.getAttendancePageURL;
import static Utilities.ConfigReader.getBatchPageURL;
import static Utilities.ConfigReader.getClassPageURL;
import static Utilities.ConfigReader.getStudentPageURL;
import static Utilities.ConfigReader.getUserPageURL;
import static Utilities.ConfigReader.getloginPage;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;
import static org.junit.matchers.JUnitMatchers.*;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Driver.DriverFactory;
import POM_LMS.Program_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_StepDefinition {
	
	WebDriver driver;
	Program_PageObject programpage = new Program_PageObject(DriverFactory.getDriver());
	//1
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() throws IOException {
		DriverFactory.getDriver().get(getDashboardURL());
		Loggerload.info("Website Opened");
	    
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		
	    programpage.click_program();
	}

	
	   @Then("Admin should see URL with Manage Class from {string} and {int}")
	   public void Admi_should_see_URL_with_Manage_Class_from(String SheetName,Integer RowNumber) throws IOException, InterruptedException {
		   ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);

			List<String> expectedProgramUrl = excel.getCellData(SheetName, 0, RowNumber);
			String actualProgramUrl = getProgramURL();
			 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
			 Assert.assertNotNull(actualProgramUrl);
			 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
			 if (!expectedProgramUrl.equals(actualProgramUrl))
			 {
				 Loggerload.info("Failed to reach the Program page.Expected Url: "+ expectedProgramUrl );
			 }
		   
	   }
	
//2
	@Then("Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String string) throws IOException {
		String expectedHeaderName = string;
		String actualHeaderName = getHeaderName();
		Assert.assertEquals(expectedHeaderName, actualHeaderName);
		if(!expectedHeaderName.equals(actualHeaderName)){
			Loggerload.info("Failed to see Program header");
		}
		
	   
	}

	
//3
	@Then("Admin should see the text as{string} and {int} along with Pagination icon below the table")
	public void admin_should_see_the_text_as_showing_to_of_entries_along_with_pagination_icon_below_the_table(String Sheetname,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);

		List<String> expectedProgramtext = excel.getCellData(Sheetname, 3, RowNumber);
		String actualProgramtext = programpage.pagination_text().getText();
		 Assert.assertEquals(expectedProgramtext, actualProgramtext);
		 Assert.assertNotNull(actualProgramtext);
		 Assert.assertTrue(actualProgramtext.startsWith("http://"));
		 if (!expectedProgramtext.equals(actualProgramtext))
		 {
			 Loggerload.info("Failed to see the pagination icon" );
		 }
		}
	

	
//4
	@Then("Admin should see the footer as on {string} and {int}")
	public void admin_should_see_the_footer_as(String Sheetname,Integer RowNumber) throws InterruptedException {
		
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);

		List<String> expectedFooterText = excel.getCellData(Sheetname, 4, RowNumber);
		String actualFooterText = programpage.footer_text().getText();
		 Assert.assertEquals(expectedFooterText, actualFooterText);
		 Assert.assertNotNull(actualFooterText);
				 if (!expectedFooterText.equals(actualFooterText))
		 {
			 Loggerload.info("Failed to see the footer text" );
		 }
		}
//5
	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() throws InterruptedException {
		WebElement delete_disable = programpage.DeleteAll_Displayed();
		Assert.assertTrue(delete_disable.isDisplayed());
		Loggerload.info("Delete icon is not displayed" );
		 WebElement delete_enable = programpage.DeleteAll_Enabled();
		 Assert.assertFalse(delete_enable.isEnabled(), "Delete icon is not disabled");
	   
	}
//6
	@Then("Admin should see a {string} button on the program page above the data table")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table(String string) throws InterruptedException {
		
		WebElement addnew = programpage.Addnew();
		Assert.assertTrue(addnew.isDisplayed(), "+Add New Button is not displayed on the class page");
		Loggerload.info("Add new button is not displayed" );
	}
//7
	@Then("Admin should see the number of records displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	    programpage.verifyElements();
	}
//8
	@Then("Admin should see data table on the Manage Program Page with following column headers")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers() throws InterruptedException {
		WebElement programName = programpage.programName();
		Assert.assertTrue(programName.isDisplayed(), "program name is not displayed on the class page");
		WebElement description = programpage.description();
		Assert.assertTrue(description.isDisplayed(), "Description is not displayed on the class page");
		WebElement status = programpage.status();
		Assert.assertTrue(status.isDisplayed(), "Status is not displayed on the class page");
		WebElement edit = programpage.EditClass();
		Assert.assertTrue(edit.isDisplayed(), "Edit is not displayed on the class page");
		WebElement delete = programpage.DeleteClass();
		Assert.assertTrue(delete.isDisplayed(), "Delete is not displayed on the class page");
	   
	}
//9
	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() throws InterruptedException {
		WebElement programNameArrow = programpage.programNameArrow();
		Assert.assertTrue(programNameArrow.isDisplayed(), "Program name Arrow is not displayed on the class page");
		WebElement descriptionArrow = programpage.descriptionArrow();
		Assert.assertTrue(descriptionArrow.isDisplayed(), "Description arrow is not displayed on the class page");
		WebElement statusArrow = programpage.statusArrow();
		Assert.assertTrue(statusArrow.isDisplayed(), "Status arrow is not displayed on the class page");
		}
//10
	@Then("Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
		WebElement checkbox_disable = programpage.checkbox();
		Assert.assertTrue(checkbox_disable.isDisplayed());
		Loggerload.info("Checkbox icon is not displayed" );
		
	    
	}
//11
	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
		WebElement editButton = programpage.editbuttonPresent();
		Assert.assertTrue(editButton.isDisplayed());
		Loggerload.info("Edit button icon is not displayed" );
		WebElement deleteButton = programpage.deletebuttonPresent();
		Assert.assertTrue(deleteButton.isDisplayed());
		Loggerload.info("Delete button icon is not displayed" );
		
	    
	}
//12
	@Then("Admin should see Search bar on program page")
			public void admin_should_see_search_bar_on_program_page() throws InterruptedException {
			WebElement search = programpage.Search();
			Assert.assertTrue(search.isDisplayed());
			Loggerload.info("Search bar is not displayed");
		}
	   
	
	
	//================Feature 2 Steps=================
	
	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() throws IOException {
		DriverFactory.getDriver().get(getProgramURL());
		Loggerload.info("Manage Program page Opened");
		}

	@When("Admin enters <Program name phrase> into search box.")
	public void admin_enters_program_name_into_search_box() throws InterruptedException {
		programpage.program_add_name();
		}
		

	@SuppressWarnings("deprecation")
	@Then("Admin should see the Programs displayed based on the Program Name on {string} and {int}")
	public void admin_should_see_the_programs_displayed_based_on_the_program_name(String SheetName,Integer RowNumber) throws IOException, InterruptedException {
		
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> expectedprogramname = excel.getCellData(SheetName, 6, RowNumber);
		String actualSearchresults = programpage.SearchResults();
		for(String data:expectedprogramname)
		{
			assertThat(actualSearchresults, containsString(data));
		}
	   
	}

	@When("Admin enters <Program description phrase> into search box.")
	public void admin_enters_program_description_phrase_into_search_box() {
	    programpage.program_add_description();
	}

	@Then("Admin should see the Programs displayed based on the Program Description on {string} and {int}")
	public void admin_should_see_the_programs_displayed_based_on_the_program_description(String SheetName,Integer RowNumber) throws IOException, InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> expectedprogramdescription = excel.getCellData(SheetName, 7, RowNumber);
		String actualSearchresults = programpage.SearchResults();
		for(String data:expectedprogramdescription)
		{
			assertThat(actualSearchresults, containsString(data));
		}
		
		
	}

	@When("Admin enters <Program status phrase> into search box.")
	public void admin_enters_program_status_phrase_into_search_box() {
		programpage.program_add_Status();
	   
	}

	@Then("Admin should see the Programs displayed based on the Program Status on {string} and {int}")
	public void admin_should_see_the_programs_displayed_based_on_the_program_status(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> expectedprogramstatus = excel.getCellData(SheetName, 7, RowNumber);
		String actualSearchresults = programpage.SearchResults();
		for(String data:expectedprogramstatus)
		{
			assertThat(actualSearchresults, containsString(data));
		}
	    
	}

	@When("Admin enters the keywords not present in the data table on the Search box from {string} and {int}")
	public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box(String SheetName,Integer RowNumber ) throws InterruptedException {
		Loggerload.info(" Displaying Empty Data Table");
		
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 7, RowNumber);
		 programpage.Text(content);
	}
		
	

	@Then("Admin should see zero entries on the data table")
	public void admin_should_see_zero_entries_on_the_data_table() {
		Loggerload.info(" Displaying Zero entries in the Table");
		boolean isDataTableEmpty = programpage.DataTableEmpty();

        Assert.assertTrue(isDataTableEmpty, "Data table is not empty.");
	    
	}

	@When("Admin clicks <A New Program>button")
	public void admin_clicks_a_new_program_button() {
		Loggerload.info("Navigating to Program Details Page");
	   programpage.clickNewProgram();
	}

	@Then("Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
		WebElement Programdetails = programpage.ProgramDetails();
		Assert.assertTrue(Programdetails.isDisplayed(), "Program Details pop up not appeared");
	}

	@Then("Admin should see two input fields and their respective text boxes in the program details window")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() throws InterruptedException {
		WebElement programname = programpage.programName();
		Assert.assertTrue(programname.isDisplayed(), "Program Name is not displayed on the Program details page");
		WebElement description = programpage.description();
		Assert.assertTrue(description.isDisplayed(), "Description is not displayed on the Program details page");
		
	}

	@Then("Admin should see two radio button for Program Status")
	public void admin_should_see_two_radio_button_for_program_status() throws InterruptedException {
		WebElement status = programpage.status();
		Assert.assertTrue(status.isDisplayed(), "Status is not displayed on the Program details page");
		
	   
	}
	
	//=============Feature3 steps=======================
	
	@Given("Admin is on {string} Popup window")
	public void admin_is_on_popup_window(String string) throws IOException {
		String currentURL =DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = getAddProgramURL();
			 Assert.assertEquals(expectedURL, currentURL);
			 Assert.assertNotNull(currentURL);
			 Assert.assertTrue(currentURL.startsWith("http://"));
			 if (!expectedURL.equals(currentURL))
			 {
				 Loggerload.info("Failed to reach the Program detail page.Expected Url: "+ expectedURL );
			 }
	    
	}

	@When("Admin clicks <Save>button without entering any data")
	public void admin_clicks_save_button_without_entering_any_data() {
		programpage.clickOnSave();
	    
	}

	@Then("Admin gets a Error message alert as {string} and {int}")
	public void admin_gets_a_error_message_alert(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> expectederrormsg = excel.getCellData(SheetName, 9, RowNumber);
		String actualerrormsg = programpage.getErrorMsg();
		Assert.assertNotNull(actualerrormsg);
		 Assert.assertTrue(actualerrormsg.startsWith("http://"));
		 if (!expectederrormsg.equals(actualerrormsg))
		 {
			 Loggerload.info("Error message is"+expectederrormsg);
		 }
		
		
		
	    
	}

	@When("Admin enters only<Program Name> in text box from {string} {int} and clicks Save button")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Program name in Pogram Page");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> programName = excel.getCellData(SheetName, 13, RowNumber);
		programpage.programNameTextBox(programName);
	    programpage.clickOnSave();
	}

	@Then("Admin gets a message alert {string}")
	public void admin_gets_a_message_alert(String string) {
		String expectedmsg = string;
		String actualmsg = programpage.getAlertmsg();
		assertEquals(actualmsg,expectedmsg);
		Loggerload.info("Alert message not same");
		}

	@When("Admin enters only<Program description> in text box from {string} {int} and clicks Save button")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Program description in Pogram Page");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> programdescription = excel.getCellData(SheetName, 13, RowNumber);
		programpage.programDescriptionTextBox(programdescription);
		programpage.clickOnSave();
	    
	}

	@When("Admin selects only Status and clicks Save button")
	public void admin_selects_only_status_and_clicks_save_button() {
		
		Loggerload.info(" Entering Program status in Pogram Page");
		programpage.programStatus();
		programpage.clickOnSave();
		
	}

	@When("Admin enters only numbers or special char in name and desc column from {string} {int}")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column_from(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Special characters in Pogram Page");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> programName = excel.getCellData(SheetName, 17, RowNumber);
		programpage.programNameTextBox(programName);
	    
	}

	@When("Admin clicks Cancel/Close(X) Icon on Program Details form")
	public void admin_clicks_cancel_close_x_icon_on_program_details_form() {
	    programpage.clickOnCancel();
	}

	@Then("Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() {
	    
	}

	@When("Enter all the required fields with valid values and click Save button from {string} {int}")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button_from(String SheetName,Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering fields in Add Program Page");
		ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 6, RowNumber);
		List<String> description = excel.getCellData(SheetName, 7, RowNumber);
		programpage.programNameTextBox(programname);
		 programpage.programDescriptionTextBox(description);
		 programpage.programStatus();
		 programpage.clickOnSave();
		 
	    
	}

	@Then("Admin gets a message {string} alert and able to see the new program added in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table(String string) {
		String expectedmsg = string;
		String actualmsg = programpage.getAlertmsg();
		assertEquals(actualmsg,expectedmsg);
		Loggerload.info("Alert message not same");
		}
		
	    
	

	@When("Admin clicks <Cancel> button")
	public void admin_clicks_cancel_button() {
		programpage.clickOnCancel();
	   
	}

	@Then("Admin can see the Program details popup disappears without creating any program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() {
		WebElement Programdetails = programpage.ProgramDetails();
		Assert.assertTrue(Programdetails.isDisplayed(), "Program Details pop up not appeared");
		
	    
	}

//=================feature4 steps=====================
	
	@When("Admin clicks <Edit> button on the data table for any row")
	public void admin_clicks_edit_button_on_the_data_table_for_any_row() {
		programpage.clickOnEdit();
	   
	}

	@Then("Admin should see a popup open for Program details to edit")
	public void admin_should_see_a_popup_open_for_program_details_to_edit() {
		WebElement Programdetails = programpage.ProgramDetails();
		Assert.assertTrue(Programdetails.isDisplayed(), "Program Details pop up not appeared");
	   
	}
//=======================feature5 steps========================
	
	@Given("Admin is on Program Details Popup window to Edit")
	public void admin_is_on_program_details_popup_window_to_edit() throws IOException {
		DriverFactory.getDriver().get(getdetailsURL());
		Loggerload.info("Website Opened");
		
	    
	}

	@When("Admin edits the Name column and clicks save button")
	public void admin_edits_the_name_column_and_clicks_save_button() {
		programpage.clickOnEditName();
		programpage.clickOnSave();
	    
	}
	@Then("Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
			    
	    Loggerload.info("Error message");
	}
	@Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String string) {
	    String expectedmsg = string;
	    String actualmsg = programpage.getSuccessAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    
	    Loggerload.info("Success message");
	    
	    
	}

	@When("Admin edits the Description column and clicks save button")
	public void admin_edits_the_description_column_and_clicks_save_button() {
		programpage.clickOnEditDescription();
		programpage.clickOnSave();
	}

	@Then("Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String string) {
		String expectedmsg = string;
	    String actualmsg = programpage.getSuccessAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    
	    Loggerload.info("Success message");
	}

	@When("Admin changes the Status and clicks save button")
	public void admin_changes_the_status_and_clicks_save_button() {
		programpage.clickOnEditStatus();
		programpage.clickOnSave();
	    
	}

	@Then("Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String string) {
		String expectedmsg = string;
	    String actualmsg = programpage.getSuccessAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    
	    Loggerload.info("Success message");
	}

	@When("Admin clicks <Cancel>button on edit popup")
	public void admin_clicks_cancel_button_on_edit_popup() {
		programpage.clickOnCancel();
	    
	}

	@Then("Admin can see the Program details popup disappears and can see nothing changed for particular program")
	public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
		boolean isalertpresent = programpage.isAlertPresent();
		Assert.assertTrue(isalertpresent,"Deletion alert is not present");

	    
	}

	@When("Admin clicks <Save>button on edit popup")
	public void admin_clicks_save_button_on_edit_popup() {
	   programpage.clickOnSave();
	}

	@Then("Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String string) {
		String expectedmsg = string;
	    String actualmsg = programpage.getSuccessAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    Loggerload.info("Table updated successfully");
	}
	
	
	//============feature6 steps==========================
	@When("Admin clicks <Delete> button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
	    programpage.clickOnDelete();
	}

	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
		String expectedmsg = string;
	    String actualmsg = programpage.getSuccessAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    Loggerload.info("Alert msg with Yes and No ");
	}

	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
		String expectedmsg = string;
	    String actualmsg = programpage.getSuccessAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    Loggerload.info("Are you sure you want to delete?");
		
	    
	}
	//===================feature7 steps=========================
	
	@Given("Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
		programpage.clickOnDelete();
	   
	}

	@When("Admin clicks <YES> button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
		programpage.acceptAlert();
	    
	}

	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
	    String expectedmsg =string;
	    String actualmsg = programpage.getAlertmsg();
	    assertEquals(actualmsg,expectedmsg);
	    Loggerload.info("Successful Program Deletion");
	    boolean isDataTableEmpty = programpage.DataTableEmpty();
          Assert.assertTrue(isDataTableEmpty, "Data table is not empty.");
	    
	    
	}

	@When("Admin clicks <NO> button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
	    programpage.dismissAlert();
	}

	@Then("Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
		boolean isalertpresent = programpage.isAlertPresent();
		Assert.assertTrue(isalertpresent,"Deletion alert is not present");
	    
	}

	@When("Admin clicks Cancel Close X Icon on Deletion alert")
	public void admin_clicks_cancel_close_x_icon_on_deletion_alert() {
		programpage.clickOnCancel();
	    
	}

	@Then("Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
		boolean isalertpresent = programpage.isAlertPresent();
		Assert.assertTrue(isalertpresent,"Deletion alert disappears");
		
		
	    
	}
//=====================feature8 steps=================
	@Given("Admin is in Manage Program page")
	public void admin_is_in_manage_program_page() throws IOException {
		DriverFactory.getDriver().get(getProgramURL());
		Loggerload.info("Manage Program page Opened");
	    
	}

	@When("Admin clicks any checK box in the data table")
	public void admin_clicks_any_chec_k_box_in_the_data_table() {
		programpage.clickOncheckbox();
	    
	}

	@Then("Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
		boolean delete = programpage.deleteisEnabled();
		Assert.assertTrue(delete, "Delete button is enabled");
	    
	}
	
	//=================feature9 steps=========================
	
	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
		boolean delete = programpage.isProgram1Present();
		Assert.assertTrue(delete, "Program  deleted");
	}

	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
		boolean delete = programpage.isProgram1Present();
		Assert.assertTrue(delete, "Program not deleted");
	}
//======================feature10 steps=======================
	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
		boolean delete1 = programpage.isProgram1Present();
		Assert.assertTrue(delete1, " First Program deleted");
		boolean delete2 = programpage.isProgram2Present();
		Assert.assertTrue(delete2, "Second Program deleted");
	    
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
		boolean delete1 = programpage.isProgram1Present();
		Assert.assertTrue(delete1, "Program not deleted");
		boolean delete2 = programpage.isProgram2Present();
		Assert.assertTrue(delete2, "Program not deleted");
	}
	//==============feature11 steps================

@Given("Admin is on Manage Program page")
//public void admin_is_on_manage_program_page() {
    
//}

@When("Admin clicks the sort icon of program name column")
public void admin_clicks_the_sort_icon_of_program_name_column() {
    programpage.clickProgramNameAsec();
}

@Then("The data get sorted on the table based on the program name column values in ascending order")
public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order() {
             programpage.programNameAscendingSort();
             Loggerload.info("Program name is in Ascending order");
}

@Given("The data is in the ascending order on the table based on Program Name column")
public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
                  programpage.clickProgramNameDesc();       
}

@Then("The data get sorted on the table based on the program name column values in descending order")
public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() throws InterruptedException {
	programpage.programNameDescendingSort();
	Loggerload.info("Program name is in Descending order");
	
     }

@When("Admin clicks the sort icon of program Desc column")
public void admin_clicks_the_sort_icon_of_program_desc_column() {
	programpage.clickProgramDescriptionAsec();
    
}

@Then("The data get sorted on the table based on the program description column values in ascending order")
public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {
	programpage.programDescriptionAscendingSort();
	Loggerload.info("Program description is in Ascending order");
}

@Given("The data is in the ascending order on the table based on Program Description column")
public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
	programpage.clickProgramDescriptionDesc();
}

@Then("The data get sorted on the table based on the program description column values in descending order")
public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
               
               programpage.programDescriptionDescendingSort();
               Loggerload.info("Program description is in Descending order");
}

@When("Admin clicks the sort icon of program Status column")
public void admin_clicks_the_sort_icon_of_program_status_column() {
   programpage.clickProgramStatusAsec();
}

@Then("The data get sorted on the table based on the program status column values in ascending order")
public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order() {
    programpage.programStatusAscendingSort();
    Loggerload.info("Program Status is in Ascending order");
}

@Given("The data is in the ascending order on the table based on Program Status column")
public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column() {
	programpage.clickProgramStatusDesc();
}

@Then("The data get sorted on the table based on the program status column values in descending order")
public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
    
    programpage.programStatusDescendingSort();
    Loggerload.info("Program Status is in Descending order");
}

//===========feature12 steps==================
@When("Admin clicks Next page link on the program table")
public void admin_clicks_next_page_link_on_the_program_table() {
	programpage.clickOnNextpage();
    
}

@Then("Admin should see the Pagination has {string} link")
public void admin_should_see_the_pagination_has_link(String string) {
	String expectedlink=string;
	String actuallink= programpage.paginationElement().getText();
	Assert.assertNotNull(actuallink, "Pagination link with text '" + expectedlink + "' is not present.");
	}

@When("Admin clicks Last page link")
public void admin_clicks_last_page_link() {
	programpage.clickOnLastpage();
    
}

@Then("Admin should see the last page record on the table with Next page link are disabled")
public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
	boolean nextpage = programpage.nextPageisdisabled();
	Assert.assertTrue(nextpage, "Next page is disabled");
    
}

@Given("Admin is on last page of Program table")
public void admin_is_on_last_page_of_program_table() throws IOException {
	DriverFactory.getDriver().get(getlastPageURL());
	Loggerload.info("Last Program page Opened");
	}

@When("Admin clicks First page link")
public void admin_clicks_first_page_link() {
	programpage.clickOnfirstpage();
    }

@Then("Admin should see the previous page record on the table with pagination has previous page link")
public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
	boolean nextpage = programpage.previousPageEnabled();
	Assert.assertTrue(nextpage, "Previous page is enabled");
	}

@Given("Admin is on Previous Program page")
public void admin_is_on_previous_program_page() throws IOException {
	DriverFactory.getDriver().get(getfirstPageURL());
	Loggerload.info("Previous Program page Opened");
    
}

@When("Admin clicks Start page link")
public void admin_clicks_start_page_link() {
	programpage.clickOnNextpage();
    
}

@Then("Admin should see the very first page record on the table with Previous page link are disabled")
public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
	boolean previouspage = programpage.previousPageisdisabled();
	Assert.assertTrue(previouspage, "Previous page link are disabled");
    
}
//==================feature13 steps==========================

@When("Admin clicks on Student link on Manage Program page")
public void admin_clicks_on_student_link_on_manage_program_page() {
    programpage.clickOnstudent();
}

@Then("Admin is re-directed to Student page on {string} and {int}")
public void admin_is_re_directed_to_student_page(String SheetName,Integer RowNumber) throws InterruptedException, IOException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 12, RowNumber);
	String actualProgramUrl = getStudentPageURL();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the Student page.Expected Url: "+ expectedProgramUrl );
	 }
   
}

@When("Admin clicks on Batch link on Manage Program page")
public void admin_clicks_on_batch_link_on_manage_program_page() {
    programpage.clickOnBatch();
}

@Then("Admin is re-directed to Batch page on {string} and {int}")
public void admin_is_re_directed_to_batch_page(String SheetName,Integer RowNumber) throws InterruptedException, IOException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 15, RowNumber);
	String actualProgramUrl = getBatchPageURL();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the Batch page.Expected Url: "+ expectedProgramUrl );
	 }
	
    
}

@When("Admin clicks on Class link on Manage Program page")
public void admin_clicks_on_class_link_on_manage_program_page() {
    programpage.clickOnClass();
}

@Then("Admin is re-directed to Class page on {string} and {int}")
public void admin_is_re_directed_to_class_page(String SheetName,Integer RowNumber) throws InterruptedException, IOException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 14, RowNumber);
	String actualProgramUrl = getClassPageURL();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the Batch page.Expected Url: "+ expectedProgramUrl );
	 }
	
    
}

@When("Admin clicks on User link on Manage Program page")
public void admin_clicks_on_user_link_on_manage_program_page() {
	programpage.clickOnUser();
    
}

@Then("Admin is re-directed to User page on {string} and {int}")
public void admin_is_re_directed_to_user_page(String SheetName,Integer RowNumber) throws IOException, InterruptedException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 13, RowNumber);
	String actualProgramUrl = getUserPageURL();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the User page.Expected Url: "+ expectedProgramUrl );
	 }
    
}

@When("Admin clicks on Assignment link on Manage Program page")
public void admin_clicks_on_assignment_link_on_manage_program_page() {
	programpage.clickOnAssignment();
    
}

@Then("Admin is re-directed to Assignment page on {string} and {int}")
public void admin_is_re_directed_to_assignment_page(String SheetName,Integer RowNumber) throws IOException, InterruptedException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 16, RowNumber);
	String actualProgramUrl = getAssignmentPageURL();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the Assignment page.Expected Url: "+ expectedProgramUrl );
	 }
}

@When("Admin clicks on Attendance link on Manage Program page")
public void admin_clicks_on_attendance_link_on_manage_program_page() {
    programpage.clickOnAttendance();
}

@Then("Admin is re-directed to Attendance page on {string} and {int}")
public void admin_is_re_directed_to_attendance_page(String SheetName,Integer RowNumber) throws InterruptedException, IOException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 17, RowNumber);
	String actualProgramUrl = getAttendancePageURL();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the Attendance page.Expected Url: "+ expectedProgramUrl );
	 }
    
}

@When("Admin clicks on Logout link on Manage Program page")
public void admin_clicks_on_logout_link_on_manage_program_page() {
    programpage.clickOnLogout();
}

@Then("Admin is re-directed to Login page on {string} and {int}")
public void admin_is_re_directed_to_login_page(String SheetName,Integer RowNumber) throws InterruptedException, IOException {
	ExcelReader excel = new ExcelReader("Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
	 Thread.sleep(1000);

	List<String> expectedProgramUrl = excel.getCellData(SheetName, 1, RowNumber);
	String actualProgramUrl = getloginPage();
	 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
	 Assert.assertNotNull(actualProgramUrl);
	 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
	 if (!expectedProgramUrl.equals(actualProgramUrl))
	 {
		 Loggerload.info("Failed to reach the Assignment page.Expected Url: "+ expectedProgramUrl );
	 }
	
    
}
	
	
	
	
	
	
	
	
}