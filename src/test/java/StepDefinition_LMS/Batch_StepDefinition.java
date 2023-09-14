package StepDefinition_LMS;

import static Utilities.ConfigReader.getClassURL;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static Utilities.ConfigReader.getBatchURL;
import Driver.DriverFactory;
import POM_LMS.Batch_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;
import static Utilities.ConfigReader.ErrorMessage;
import static Utilities.ConfigReader.BatchIdError;

import static Utilities.ConfigReader.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Driver.DriverFactory;
import POM_LMS.Class_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;

public class Batch_StepDefinition {

	WebDriver driver;
	Batch_PageObject batchpage = new Batch_PageObject(DriverFactory.getDriver());

	// BatchModule_Main
	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) throws InterruptedException {
		batchpage.Click_Batch();
		Loggerload.info("Admin clicks  " + string + " from navigation bar");
	}

	@Then("Admin should see the Manage Batch from {string} and {int} in the URL")
	public void admin_should_see_the_manage_batch_from_and_in_the_url(String SheetName, Integer RowNumber)
			throws InterruptedException, IOException {

		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);

		List<String> expectedBatchUrl = excel.getCellData(SheetName, 0, RowNumber);
		String actualBatchUrl = getBatchURL();
		Assert.assertEquals(expectedBatchUrl, actualBatchUrl);
		Assert.assertNotNull(actualBatchUrl);
		Assert.assertTrue(actualBatchUrl.startsWith("http://"));
		if (!expectedBatchUrl.equals(actualBatchUrl)) {
			Loggerload.info("Failed to reach the Batch page.Expected Url: " + expectedBatchUrl);
		}

	}

	@Then("Admin should see header with Manage Batch from {string} and {int} in the header")
	public void manage_batch_header(String SheetName, Integer RowNumber) throws InterruptedException, IOException {

		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);

		List<String> expectedBatchHeader = excel.getCellData(SheetName, 0, RowNumber);
		WebElement actualBatchHeader = batchpage.BatchName();
		Assert.assertEquals(expectedBatchHeader, actualBatchHeader);
		Assert.assertNotNull(actualBatchHeader);
		if (!expectedBatchHeader.equals(actualBatchHeader)) {
			Loggerload.info("Failed to reach the Batch page header.Expected Header: " + expectedBatchHeader);
		}

	}

	@Then("Admin Should see the data table with the following headers")
	public void admin_should_see_the_data_table_with_the_following_headers() throws InterruptedException {

		WebElement batchName_Batch_Main = batchpage.batchName_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(), "Batch Name is displayed on the Manage Batch page");

		WebElement batchDescription_Batch_Main = batchpage.batchDescription_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(),
				"Batch Description is displayed on the Manage Batch page");

		WebElement batchStatus_Batch_Main = batchpage.batchDescription_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(), "Batch Status is displayed on the Manage Batch page");

		WebElement noOfClasses_Batch_Main = batchpage.noOfClasses_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(), "No. Of Classes is displayed on the Manage Batch page");

		WebElement programName_Batch_Main = batchpage.programName_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(), "Program Name is displayed on the Manage Batch page");

		WebElement edit_Batch_Main = batchpage.edit_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(), "Edit  is displayed on the Manage Batch page");

		WebElement delete_Batch_Main = batchpage.delete_Batch_Main();
		Assert.assertTrue(batchName_Batch_Main.isDisplayed(), "Delete is displayed on the Manage Batch page");

	}

	@Then("Admin should be able to see the Delete icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string)
			throws InterruptedException {

		WebElement delete_disable_batch = batchpage.DeleteAll_Displayed_Batch_Main();
		Assert.assertTrue(delete_disable_batch.isDisplayed(), "Delete icon is not disabled");
		Loggerload.info("Admin is able to see the headers");

	}

	@Then("Admin should be able to see the + Add New batch button")
	public void admin_should_be_able_to_see_the_button(String string) throws InterruptedException {

		WebElement AddNewBatch = batchpage.AddNewBatch();
		Assert.assertTrue(AddNewBatch.isDisplayed(), "+ Add New Batch is displayed");
		Loggerload.info("Admin is able to see + Add New Batch button");

	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() throws InterruptedException {

		WebElement CheckBoxHeader_Batch_main = batchpage.CheckBoxHeader_Batch_Main();
		Assert.assertTrue(CheckBoxHeader_Batch_main.isDisplayed(),
				"Check Box is not displayed on the header of the data table");
		WebElement CheckBox1_Batch_Main = batchpage.CheckBox1_Batch_Main();
		Assert.assertTrue(CheckBox1_Batch_Main.isDisplayed(),
				"Check Box is not displayed on the first row of the data table");
		WebElement CheckBox2_Batch_Main = batchpage.CheckBox2_Batch_Main();
		Assert.assertTrue(CheckBox2_Batch_Main.isDisplayed(),
				"Check Box is not displayed on the second row of the data table");
		WebElement CheckBox3_Batch_Main = batchpage.CheckBox3_Batch_Main();
		Assert.assertTrue(CheckBox3_Batch_Main.isDisplayed(),
				"Check Box is not displayed on the third row of the data table");
		Loggerload.info("Admin is able to see a checkbox for each row in the data table");
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() throws InterruptedException {

		WebElement Edit1_Batch_Main = batchpage.Edit1_Batch_Main();
		Assert.assertTrue(Edit1_Batch_Main.isEnabled(), "Edit icon is enable for first row of the data table");
		Loggerload.info("Edit icon for the first row of the data table is enabled");

		WebElement Edit2_Batch_Main = batchpage.Edit2_Batch_Main();
		Assert.assertTrue(Edit2_Batch_Main.isEnabled(), "Edit icon is enable for second row of the data table");
		Loggerload.info("Edit icon for the second row of the data table is enabled");

	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() throws InterruptedException {

		WebElement Delete1_Batch_Main = batchpage.Delete1_Batch_Main();
		Assert.assertTrue(Delete1_Batch_Main.isEnabled(), "Delete icon is enable for first row of the data table");
		Loggerload.info("Delete icon for the first row of the data table is enabled");

		WebElement Delete2_Batch_Main = batchpage.Delete2_Batch_Main();
		Assert.assertTrue(Delete2_Batch_Main.isEnabled(), "Delete icon is enable for second row of the data table");
		Loggerload.info("Delete icon for the second row of the data table is enabled");
	}

	@When("Admin clicks + A New Batch button")
	public void admin_clicks_button() throws InterruptedException {
		batchpage.Click_AddNewBatch_Batch();
		Loggerload.info("Admin clicks Add New Batch button");

	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {

		WebElement Batchdetails = batchpage.BatchDetails();
		Assert.assertTrue(Batchdetails.isDisplayed(), "Admins gets a new pop up with Batch Details");

	}

	// -----------------------BatchModule_AddNewBatch-----------------------------------------------------------------------//

	@Then("The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down,Status as radio button, Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box()
			throws InterruptedException {

		Loggerload.info(" Validating the fields in Batch Details Page");
		WebElement batchName = batchpage.BatchName();
		Assert.assertTrue(batchName.isDisplayed(), "Batch Name is displayed as Textbox on the Batch Details page");

		WebElement batchDescription = batchpage.BatchDescription();
		Assert.assertTrue(batchDescription.isDisplayed(),
				"Batch Description is displayed as Text box on the Batch Details page");

		WebElement programName = batchpage.ProgramName();
		Assert.assertTrue(programName.isDisplayed(), "Program Name is displayed as Text box on the Batch Details page");

		WebElement statusActive = batchpage.StatusActive();
		Assert.assertTrue(statusActive.isDisplayed(),
				"Status Active is displayed as Radio button on the Batch Details page");

		WebElement statusInactive = batchpage.StatusInactive();
		Assert.assertTrue(statusInactive.isDisplayed(),
				"Status Inactive is displayed as radio button on the Batch Details page");

		WebElement noClasses = batchpage.NoClasses();
		Assert.assertTrue(noClasses.isDisplayed(), "No. of Classes is displayed as Textbox on the Batch Details page");

	}

	@When("Fill in all the fields except description with valid values from {string} and {int} and click save")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save(String SheetName,
			Integer RowNumber) throws InterruptedException {

		Loggerload.info("Entering mandatory fields in Batch Details page");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);

		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> statusactiveradiobutton = excel.getCellData(SheetName, 19, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);

		batchpage.BatchNameTextBox(batchname);
		batchpage.ClassNoTextBox(noclasses);
		batchpage.ProgramNameDropDown(programname);
		batchpage.StatusActiveRadioButton(statusactiveradiobutton);
		batchpage.Click_Save();

	}

	@Then("The newly added batch should be present in the data table from {string} and {int} in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page(String SheetName,
			Integer RowNumber) throws InterruptedException {

		Loggerload.info("Entering mandatory fields in Batch Details page");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");

		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 17, RowNumber);
		String expectedfields = "Batch Name: " + batchname + ", Batch Description: " + batchdescription
				+ ", No. of Classes: " + noclasses;
		List<String> addedFields = batchpage.DataTableBatch();
		Assert.assertEquals(expectedfields, addedFields, "Admin should not see added new class in the data table");

	}

	@When("Fill in all the fields with valid values from {string} and {int} and click save")
	public void fill_in_all_the_fields_with_valid_values_and_click_save(String SheetName, Integer RowNumber)
			throws InterruptedException {

		Loggerload.info(" Entering All fields in Add Batch Details Page");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> statusactiveradiobutton = excel.getCellData(SheetName, 19, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);

		batchpage.BatchNameTextBox(batchname);
		batchpage.BatchDescriptionTextBox(batchdescription);
		batchpage.ProgramNameDropDown(programname);
		batchpage.ClassNoTextBox(noclasses);
		batchpage.StatusActiveRadioButton(statusactiveradiobutton);
		batchpage.Click_Save();

	}

	@When("Any of the fields have invalid values {string} and <RowNumber>")
	public void any_of_the_fields_have_invalid_values(String SheetName, Integer RowNumber) throws InterruptedException {

		Loggerload.info(" Any of the fields have invalid values in Add Batch Details Page");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		List<String> batchname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> statusactiveradiobutton = excel.getCellData(SheetName, 19, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);

		batchpage.BatchNameTextBox(batchname);
		batchpage.BatchDescriptionTextBox(batchdescription);
		batchpage.ProgramNameDropDown(programname);
		batchpage.ClassNoTextBox(noclasses);
		batchpage.StatusActiveRadioButton(statusactiveradiobutton);
		batchpage.Click_Save();
	}

	@Then("Error message should appear")
	public void error_message_should_appear() throws IOException, InterruptedException {
		Loggerload.info("Error message should appear");
		String expectedErrormessage = ErrorMessage();
		String actualErrorMessage = batchpage.Alert();
		assertTrue(actualErrorMessage.contains(expectedErrormessage));
	}

	@When("Any of the mandatory fields are blank from {string} and {int}")
	public void any_of_the_mandatory_fields_are_blank_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Missing any mandatory fields in Add Batch Details Page");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> statusactiveradiobutton = excel.getCellData(SheetName, 19, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);

		batchpage.BatchDescriptionTextBox(batchdescription);
		batchpage.ProgramNameDropDown(programname);
		batchpage.ClassNoTextBox(noclasses);
		batchpage.StatusActiveRadioButton(statusactiveradiobutton);
		batchpage.Click_Save();
	}

//----------------------BatchModule_DeleteBatch-----------------------------------------------------------------------------

	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() throws InterruptedException {
		WebElement deleteA = batchpage.DeleteA_Batch();
		Assert.assertTrue((deleteA).isEnabled(), "Delete icon on first row level is not Enabled");

		WebElement deleteB = batchpage.DeleteB_Batch();
		Assert.assertTrue((deleteB).isEnabled(), "Delete icon on second row level is not Enabled");

		WebElement deleteC = batchpage.DeleteC_Batch();
		Assert.assertTrue((deleteC).isEnabled(), "Delete icon on third row level is not Enabled");
		Loggerload.info("Delete icon on row level is enabled");
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() throws InterruptedException {
		Loggerload.info(" Admin clicks Delete icon");
		batchpage.DeleteA_Batch();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() throws InterruptedException {
		Alert alert = batchpage.DeleteAlertBatch();
		Assert.assertTrue(((WebElement) alert).isDisplayed());

		WebElement yes = batchpage.YesBatchDelete();
		Assert.assertTrue((yes).isDisplayed(), "Yes button does not appear ");

		WebElement no = batchpage.NoBatchDelete();
		Assert.assertTrue((no).isDisplayed(), "No button does not appear ");
	}

	@When("You click yes option")
	public void you_click_yes_option() throws InterruptedException {
		Loggerload.info("Admin clicks yes option");
		batchpage.Click_Yes_Batch();

	}

	@Then("Batch deleted alert pops and batch is no more available in data table from {string} and {int}")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table(String SheetName,
			Integer RowNumber) throws InterruptedException {

		Loggerload.info("Batch deleted alert pops and batch is not avaiable in data table");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");

		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 17, RowNumber);
		String expectedfields = "Batch Name: " + batchname + ", Batch Description: " + batchdescription
				+ ", No. of Classes: " + noclasses;
		List<String> addedFields = batchpage.DataTableBatch();
		Assert.assertEquals(expectedfields, addedFields, "Admin should not see added new class in the data table");

	}

	@When("you click No option")
	public void you_click_no_option() throws InterruptedException {
		Loggerload.info("Admin clicks no option");
		batchpage.Click_No_Batch();
	}

	@Then("Batch is still listed in data table from {string} and {int}")
	public void batch_is_still_listed_in_data_table(String SheetName, Integer RowNumber) throws InterruptedException {
		List<String> dataTableBatch = batchpage.DataTableBatch();
		Loggerload.info("Batch is still listed in  data table");

		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> status = excel.getCellData(SheetName, 19, RowNumber);
		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);
		String expectedfields = "Batch Name: " + batchname + ", Batch Description: " + batchdescription
				+ ", No. of Classes: " + noclasses + ", Program Name: " + programname;
		List<String> addedFields = batchpage.DataTableBatch();
		for (String field : addedFields) {
			assertTrue(expectedfields.contains((CharSequence) field));
		}

	}

	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() throws InterruptedException {
		Loggerload.info("Checkboxes are not selected");
		WebElement checkBox1_Batch_Main = batchpage.CheckBox1_Batch_Main();
		Assert.assertFalse(checkBox1_Batch_Main.isSelected(), "Check box for the first row is selected");

		WebElement checkBox2_Batch_Main = batchpage.CheckBox2_Batch_Main();
		Assert.assertFalse(checkBox2_Batch_Main.isSelected(), "Check box for the second row is selected");

		WebElement checkBox3_Batch_Main = batchpage.CheckBox3_Batch_Main();
		Assert.assertFalse(checkBox3_Batch_Main.isSelected(), "Check box for the third row is selected");
	}

	@Then("The delete icon under {string} header should be disabled")
	public void the_delete_icon_under_header_should_be_disabled(String string) throws InterruptedException {
		
		Loggerload.info("Delete icon under Batch Details header is disabled");
		WebElement deleteA_Batch = batchpage.DeleteA_Batch();
		Assert.assertFalse((deleteA_Batch).isEnabled(), "Delete icon is not disabled");
	}

	@Given("One of the checkbox row is selected")
	public void one_of_the_checkbox_row_is_selected() throws InterruptedException {
		Loggerload.info("Checkbox in the row is selected");
		WebElement checkBox1_Batch_Main = batchpage.CheckBox1_Batch_Main();
		Assert.assertTrue((checkBox1_Batch_Main).isSelected(),"One of the checkbox row is not selected");
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
		batchpage.Click_DeleteHeaderBatch();
		Loggerload.info("Admin clicks delete icon below"+string+"header");
	}

	@Then("The respective row in the data table is deleted from {string} and {int}")
	public void the_respective_row_in_the_data_table_is_deleted_from_and(String SheetName, Integer RowNumber) throws InterruptedException {
	
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
  		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
  		List<String> batchstatus = excel.getCellData(SheetName, 19, RowNumber);
  		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);  
  		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);  
  		String expectedfields = "Batch name: " + batchname + ", Batch Description: " + batchdescription +
                ", Batch status: " + batchstatus+ ", No of classes: " + noclasses;
          List<String> addedFields = batchpage.DataTableBatch();
          for (String field : addedFields) {
        	  Assert.assertFalse(expectedfields.contains((CharSequence) field));
        	  }
		   
	}
	

	@Given("Two or more checkboxes row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
		Loggerload.info("Two or more checkboxes row is selected");
		batchpage.Click_CheckBox1_Batch();
		batchpage.Click_CheckBox2_Batch();
		
	}

	@Then("The respective row in the data table is deleted  from {string} and <RowNumber>")
	public void the_respective_row_in_the_data_table_is_deleted_from_and_row_number(String SheetName, Integer RowNumber) throws InterruptedException {
		
		Loggerload.info("The respective row in the data table is deleted");
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
  		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
  		List<String> batchstatus = excel.getCellData(SheetName, 19, RowNumber);
  		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);  
  		List<String> programname = excel.getCellData(SheetName, 17, RowNumber);  
  		String expectedfields = "Batch name: " + batchname + ", Batch Description: " + batchdescription +
                ", Batch status: " + batchstatus+ ", No of classes: " + noclasses;
          List<String> addedFields = batchpage.DataTableBatch();
          for (String field : addedFields) {
        	  Assert.assertFalse(expectedfields.contains((CharSequence) field));
        	  }
	}
	
	//------------------------ BatchModule_EditBatch----------------------------------------------------------------------------
	
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() throws InterruptedException {
	   
		Loggerload.info("The edit icon on row level in data table is enabled");
		WebElement Edit1_Batch_Main = batchpage.Edit1_Batch_Main();
		Assert.assertTrue((Edit1_Batch_Main).isEnabled(), "Edit icon on first row level is not Enabled");
		
		WebElement Edit2_Batch_Main = batchpage.Edit2_Batch_Main();
		Assert.assertTrue((Edit2_Batch_Main).isEnabled(), "Edit icon on second row level is not Enabled");
		
		WebElement Edit3_Batch_Main = batchpage.Edit3_Batch_Main();
		Assert.assertTrue((Edit3_Batch_Main).isEnabled(), "Edit icon on third row level is not Enabled");
	}

	@Given("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() throws InterruptedException {
	 
		Loggerload.info("Admin clicks the edit icon");
		batchpage.Click_Edit1_Batch_Main();
	}

	@When("Update the fields with valid values and click save")
	public void update_the_fields_with_valid_values_and_click_save() throws InterruptedException {

		       WebElement batchname = batchpage.batchName_Batch_Main();
		       WebElement batchdescription =batchpage.BatchDescription();
		       WebElement programname = batchpage.ProgramName();
		       WebElement status =batchpage.StatusActive();
		       WebElement noclasses =batchpage.NoClasses();
		       batchpage.Click_Save();
		       Loggerload.info("Admin updated the fields and saved");
	}

	@Then("The updated batch details should appear on the data table from {string} and {int}")
	public void the_updated_batch_details_should_appear_on_the_data_table_from(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);
 		List<String> batchname = excel.getCellData(SheetName, 13, RowNumber);
 		List<String> batchdescription = excel.getCellData(SheetName, 15, RowNumber);
 		List<String> programname = excel.getCellData(SheetName, 19, RowNumber);
 		List<String> status = excel.getCellData(SheetName, 21, RowNumber); 
 		List<String> noclasses = excel.getCellData(SheetName, 21, RowNumber);  
 		String expectedfields = "Batch name: " + batchname + ", Batch Description: " + batchdescription +
                ", Batch status: " + status+ ", No of classes: " + noclasses;
         List<String> editedFieldsBatch = batchpage.DataTableBatch();
 		 Assert.assertEquals(expectedfields, editedFieldsBatch,
		            "Admin should not see edited class details in the data table");
		}
	

	@When("Update the fields with invalid values from {string} and {int} and click save")
	public void update_the_fields_with_invalid_values_and_click_save(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);
 		List<String> batchname = excel.getCellData(SheetName, 14, RowNumber);
 		List<String> batchdescription = excel.getCellData(SheetName, 16, RowNumber);
 		List<String> programname = excel.getCellData(SheetName, 18, RowNumber);
 		List<String> status = excel.getCellData(SheetName, 20, RowNumber); 
 		List<String> noclasses = excel.getCellData(SheetName, 22, RowNumber);  
 		String expectedfields = "Batch name: " + batchname + ", Batch Description: " + batchdescription +
                ", Batch status: " + status+ ", No of classes: " + noclasses;
         List<String> editedFieldsBatch = batchpage.DataTableBatch();
 		 Assert.assertNotEquals(expectedfields, editedFieldsBatch,
		            "Admin should  see edited class details in the data table");
	}

	@When("Erase data from mandatory field from {string} and {int}")
	public void erase_data_from_mandatory_field_from(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);
 	
  		List<String> programname = excel.getCellData(SheetName, 18, RowNumber);
 		List<String> status = excel.getCellData(SheetName, 20, RowNumber); 
 		List<String> noclasses = excel.getCellData(SheetName, 22, RowNumber);  
 		String expectedfields = 
                " Batch status: " + status+ ", No of classes: " + noclasses;
         List<String> editedFieldsBatch = batchpage.DataTableBatch();
         batchpage.Click_Save();
 		
	}

	@When("Erase data from description field from {string} and {int}")
	public void erase_data_from_description_field_from(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("./ExcelData/LMS_excel_R.xlsx");
		Thread.sleep(1000);
 		List<String> batchname = excel.getCellData(SheetName, 14, RowNumber);
  		List<String> programname = excel.getCellData(SheetName, 18, RowNumber);
 		List<String> status = excel.getCellData(SheetName, 20, RowNumber); 
 		List<String> noclasses = excel.getCellData(SheetName, 22, RowNumber);  
 		String expectedfields = "Batch name: " + batchname +
                " Batch status: " + status+ ", No of classes: " + noclasses;
         List<String> editedFieldsBatch = batchpage.DataTableBatch();
         batchpage.Click_Save();
 		 Assert.assertNotEquals(expectedfields, editedFieldsBatch,
		            "Admin should  see edited class details in the data table");
	}


}
