package StepDefinition_LMS;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import static Utilities.ConfigReader.getDashboardURL;
import static Utilities.ConfigReader.getAssignmentURL;
import static Utilities.ConfigReader.getStudentURL;
import static Utilities.ConfigReader.getBatchURL;
import static Utilities.ConfigReader.getProgramURL;
import static Utilities.ConfigReader.getClassURL;
import static Utilities.ConfigReader.getAttendanceURL;
import static Utilities.ConfigReader.getLoginURL;
import static Utilities.ConfigReader.getUserURL;
import static Utilities.ConfigReader.assignmentHeader;
import static Utilities.ConfigReader.assignmentFields;
import static Utilities.ConfigReader.assignmentField1;
import static Utilities.ConfigReader.assignmentField2;
import static Utilities.ConfigReader.assignmentField3;
import static Utilities.ConfigReader.assignmentField4;
import static Utilities.ConfigReader.assignmentField5;
import static Utilities.ConfigReader.assignmentField6;
import static Utilities.ConfigReader.assignmentField7;
import static Utilities.ConfigReader.assignmentField8;
import static Utilities.ConfigReader.assignmentField9;
import static Utilities.ConfigReader.assignmentField10;
import static Utilities.ConfigReader.NumberEntry;
import static Utilities.ConfigReader.NoofAssignments;
import static Utilities.ConfigReader.getAddAssignmentURL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static Utilities.ConfigReader.ErrorMessage;
import static Utilities.ConfigReader.AssignmentNameError;
import static Utilities.ConfigReader.ProgramNameError;
import static Utilities.ConfigReader.BatchNumberError;
import static Utilities.ConfigReader.AssignmentgradebyError;
import static Utilities.ConfigReader.AssignmentDueDateError;
import static Utilities.ConfigReader.PassedDateError;
import static Utilities.ConfigReader.expectedDate;
import static Utilities.ConfigReader.expectedMonthDatePicker;
import static Utilities.ConfigReader.DeleteSuccessMessage;

import java.util.Date;




import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Driver.DriverFactory;
import POM_LMS.Assignment_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.*;


public class Assignment_StepDefinition
{
	WebDriver driver;
	Assignment_PageObject assignmentpage = new Assignment_PageObject(DriverFactory.getDriver()); 
//#1	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() throws IOException 
	{
		DriverFactory.getDriver().get(getDashboardURL());
		Loggerload.info("Website Opened");
	}
	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) throws InterruptedException 
	{
		assignmentpage.Click_Assignment();
	}
	@Then("Admin should see URL with Manage Assignment from {string} and {int}")
	public void admin_should_see_url_with_manage_assignment_from_and(String SheetName, Integer RowNumber) throws InterruptedException, IOException 
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
     
		List<String> expectedAssignmentUrl = excel.getCellData(SheetName, 0, RowNumber);
		String actualAssignmentUrl = getAssignmentURL();
		 Assert.assertEquals(expectedAssignmentUrl, actualAssignmentUrl);
		 Assert.assertNotNull(actualAssignmentUrl);
		 Assert.assertTrue(actualAssignmentUrl.startsWith("http://"));
		 if (!expectedAssignmentUrl.equals(actualAssignmentUrl))
		 {
			 Loggerload.info("Failed to reach the Class page.Expected Url: "+ expectedAssignmentUrl );
		 }
			
	    		}
	
	  
	
	
     //#2
	
	@Then("Admin should see  the response time for navigation from dashboard page to manage assignment page")
	public void admin_should_see_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() throws InterruptedException 
	{
		DriverFactory.getDriver().navigate().back();
		Thread.sleep(1000);
		long startTime = System.currentTimeMillis();
		assignmentpage.Click_Assignment();
		
		 WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		 WebElement manage_class = assignmentpage.Manage_Assignment();
		 WebElement manageClassElement = wait.until(ExpectedConditions.presenceOfElementLocated((By) manage_class));
		 Assert.assertTrue(manageClassElement.isDisplayed(), "Manage class is not displayed");
		 long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;

		System.out.println("Response Time: " + totalTime + " milliseconds");
	    long expectedResponseTime = 2000;
	    Assert.assertTrue(totalTime <= expectedResponseTime, "Response time is longer than expected");
	}
	
   //#3
	@Then("Admin should see a heading with text Manage Assignment from {string} and {int}")
	public void admin_should_see_a_heading_with_text_manage_assignment_from_and(String SheetName, Integer RowNumber) throws InterruptedException, IOException 
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
    
		List<String> expectedHeader = excel.getCellData(SheetName, 1, RowNumber);
		String actualHeader = assignmentHeader();
		
		Assert.assertEquals(expectedHeader, actualHeader);
		 Assert.assertNotNull(actualHeader);
		 Assert.assertTrue(actualHeader.contains("Manage Class"));
		 if (!expectedHeader.equals(actualHeader))
		 {
			 Loggerload.info("Failed to see the Manage Class Header.Expected Header: "+ expectedHeader );
		 }
			
	    		}
	
   //#4
	@When("Admin clicks Assignment button on the navigation bar and get all text from the portal page {string} and {int}")
	public void admin_clicks_assignment_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page_and(String SheetName, Integer RowNumber) throws InterruptedException, IOException
	{
		DriverFactory.getDriver().navigate().back();
		Thread.sleep(1000);
		
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		 assignmentpage.Click_Assignment();
		List<String> expectedFields = excel.getCellData(SheetName, 12, RowNumber);
		String actualFields = assignmentFields();
		Assert.assertEquals(expectedFields, actualFields);
		 Assert.assertNotNull(actualFields);
		
		 if (!expectedFields.equals(actualFields))
		 {
			 Loggerload.info("Failed to get all the fields from the Manage Class Page.Expected Fields: "+ expectedFields );
		 }
	}
	
//#5
	@Then("Admin should see correct spelling for the all the fields from {string} and {int}")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_from_and(String SheetName, Integer RowNumber) throws IOException, InterruptedException
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		 List<String> expectedField1 = excel.getCellData(SheetName,2,RowNumber);
			List<String> expectedField2 = excel.getCellData(SheetName,3,RowNumber);
			List<String> expectedField3 = excel.getCellData(SheetName,4,RowNumber);
			List<String> expectedField4 = excel.getCellData(SheetName,5,RowNumber);
			List<String> expectedField5 = excel.getCellData(SheetName,6,RowNumber);
			List<String> expectedField6 = excel.getCellData(SheetName,7,RowNumber);
			List<String> expectedField7 = excel.getCellData(SheetName,8,RowNumber);
			List<String> expectedField8 = excel.getCellData(SheetName,9,RowNumber);
			List<String> expectedField9 = excel.getCellData(SheetName,10,RowNumber);
		    List<String> expectedField10 = excel.getCellData(SheetName,11,RowNumber);
			         String actualField1 = assignmentField1();
			         String actualField2 =assignmentField2();
			       	 String actualField3 = assignmentField3();
			         String actualField4 = assignmentField4();
			         String actualField5 =assignmentField5();
			         String actualField6 = assignmentField6();
			         String actualField7 = assignmentField7();
			         String actualField8 = assignmentField8();
			         String actualField9 = assignmentField9();
			         String actualField10 = assignmentField10();
			         Assert.assertEquals(expectedField1, actualField1);
			         Assert.assertEquals(expectedField2, actualField2);
			         Assert.assertEquals(expectedField3, actualField3);
			         Assert.assertEquals(expectedField4, actualField4);
			         Assert.assertEquals(expectedField5, actualField5);
			         Assert.assertEquals(expectedField6, actualField6);
			         Assert.assertEquals(expectedField7, actualField7);
			         Assert.assertEquals(expectedField8, actualField8);
			         Assert.assertEquals(expectedField9, actualField9);
			         Assert.assertEquals(expectedField10, actualField10);		   
			
			
	}
	

//#6
	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) throws InterruptedException 
	{
		WebElement delete_disable = assignmentpage.DeleteAll_Displayed();
		Assert.assertTrue(delete_disable.isDisplayed(), "Delete icon is not displayed");
		
		 WebElement delete_enable = assignmentpage.DeleteAll_Enabled();
		 Assert.assertFalse(delete_enable.isEnabled(), "Delete icon is not disabled");
		 				      			
	}
//#7
	@Then("Admin should see search bar on the manage assignment page")
	public void admin_should_see_search_bar_on_the_manage_assignment_page() throws InterruptedException 
	{
		WebElement search = assignmentpage.Search();
		Assert.assertTrue(search.isDisplayed(), "Search bar is not displayed on the class page");
	}

//#8
	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() throws InterruptedException
	{
		WebElement addnew = assignmentpage.Addnew();
		Assert.assertTrue(addnew.isDisplayed(), "+Add New Button is not displayed on the class page");
	}
//#9
	@Then("Admin should see data table on the manage assignment page With following column headers")
	public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers() throws InterruptedException
	{
		WebElement assignmentname = assignmentpage.AssignmentName();
		Assert.assertTrue(assignmentname.isDisplayed(), "Assignment Name is not displayed on the assignment page");
		WebElement assignmentdescription = assignmentpage.AssignmentDescription();
		Assert.assertTrue(assignmentdescription.isDisplayed(), "AssignmentDescription is not displayed on the assignment page");
		WebElement assignmentduedate = assignmentpage.AssignmentDueDate();
		Assert.assertTrue(assignmentduedate.isDisplayed(), "AssignmentDueDate is not displayed on the assignment page");
		WebElement assignmentgrade = assignmentpage.AssignmentGrade();
		Assert.assertTrue(assignmentgrade.isDisplayed(), "AssignmentGrade is not displayed on the assignment page");
		
		WebElement edit = assignmentpage.EditAssignment();
		Assert.assertTrue(edit.isDisplayed(), "Edit is not displayed on the assignment page");
		WebElement delete = assignmentpage.DeleteAssignment();
		Assert.assertTrue(delete.isDisplayed(), "Delete is not displayed on the assignment page");
		  
	}
//#10
	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() throws InterruptedException
	{
		WebElement editA = assignmentpage.EditA();
		Assert.assertTrue(editA.isDisplayed(), "Edit Icon is not displayed on the first row of the data table");
		WebElement editB = assignmentpage.EditB();
		Assert.assertTrue(editB.isDisplayed(), "Edit Icon is not displayed on the second row of the data table");
		WebElement editC = assignmentpage.EditC();
		Assert.assertTrue(editC.isDisplayed(), "Edit Icon is not displayed on the third row of the data table");
	}
	
	//#11

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() throws InterruptedException 
	{
		WebElement editA = assignmentpage.EditA();
		Assert.assertFalse(editA.isDisplayed(), "Edit Icon should not be present in the first row of the data table");
		WebElement editB =  assignmentpage.EditB();
		Assert.assertFalse(editB.isDisplayed(), "Edit Icon should not be present in the second row of the data table");
		WebElement editC =  assignmentpage.EditC();
		Assert.assertFalse(editC.isDisplayed(), "Edit Icon should not be present in the third row of the data table");
	} 
	
//#12
	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() throws InterruptedException 
	{
		WebElement deleteA = assignmentpage.DeleteA();
		Assert.assertTrue(deleteA.isDisplayed(), "Delete Icon is not displayed on the first row of the data table");
		WebElement deleteB = assignmentpage.DeleteB();
		Assert.assertTrue(deleteB.isDisplayed(), "Delete Icon is not displayed on the second row of the data table");
		WebElement deleteC = assignmentpage.DeleteC();
		Assert.assertTrue(deleteC.isDisplayed(), "Delete Icon is not displayed on the third row of the data table");
	}
//#13
	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() throws InterruptedException 
	{
		WebElement deleteA = assignmentpage.DeleteA();
		Assert.assertFalse(deleteA.isDisplayed(), "Delete Icon should not be present in the first row of the data table");
		WebElement deleteB = assignmentpage.DeleteB();
		Assert.assertFalse(deleteB.isDisplayed(), "Delete Icon should not be present in the second row of the data table");
		WebElement deleteC = assignmentpage.DeleteC();
		Assert.assertFalse(deleteC.isDisplayed(), "Delete Icon should not be present in the third row of the data table");
	}
	
//#14
	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() throws InterruptedException 
	{
		WebElement assignmentnamesort = assignmentpage.AssignmentNameSort();
		Assert.assertTrue(assignmentnamesort.isDisplayed(), "Assignment Name Sort is not displayed on the class page");
		WebElement assignmentdescriptionsort = assignmentpage.AssignmentDescriptionSort();
		Assert.assertTrue(assignmentdescriptionsort.isDisplayed(), "Assignment Description Sort is not displayed on the class page");
		WebElement assignmentduedatesort = assignmentpage.AssignmentDueDateSort();
		Assert.assertTrue(assignmentduedatesort.isDisplayed(), "Assignment Due Date Sort  is not displayed on the class page");
		WebElement assignmentgradesort = assignmentpage.AssignmentGradeSort();
		Assert.assertTrue(assignmentgradesort.isDisplayed(), "Assignment Grade Sort  is not displayed on the class page");
		
	}
	
//#15
	@Then("Admin should see check box in the all rows  of data table when entries available")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() throws InterruptedException
	{
		WebElement checkboxheader = assignmentpage.CheckBoxHeader();
		Assert.assertTrue(checkboxheader.isDisplayed(), "Check Box is not displayed on the header of the data table");
		WebElement checkbox1 = assignmentpage.CheckBox1();
		Assert.assertTrue(checkbox1.isDisplayed(), "Check Box is not displayed on the first row of the data table");
		WebElement  checkbox2 = assignmentpage.CheckBox2();
		Assert.assertTrue(checkbox2.isDisplayed(), "Check Box is not displayed on the second row of the data table");
		WebElement checkbox3 = assignmentpage.CheckBox3();
		Assert.assertTrue(checkbox3.isDisplayed(), "Check Box is not displayed on the third row of the data table");  
	}
//#16
	@Then("Above the footer Admin should see the text as {string} below the table.")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) throws IOException
	{
		Loggerload.info("Validating Number Entries");
		String expectedNumberEntry = NumberEntry();
		    String actualNumberEntry = assignmentpage.NumberEntry();
		    Assert.assertEquals(expectedNumberEntry, actualNumberEntry);
	}
//#17

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() throws InterruptedException
	{
		Loggerload.info("Validating Pagination Control");
		WebElement pagination = assignmentpage.Pagination();
		Assert.assertTrue(pagination.isDisplayed(), "Pagination Control is not displayed under the data table");
	}
//#18
	@Then("Admin should see the text with total number assignments in the data table. \\( {string})")
	public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table(String string) throws IOException
	{
		Loggerload.info("Validating Number of Classes");
		String expectedNoofAssignment = NoofAssignments();
		    String actualNoofAssignment = assignmentpage.NoofAssignment();
		    Assert.assertEquals(expectedNoofAssignment, actualNoofAssignment);
		    }
	//#19- Manage Program Validation part2
	@Given("Admin is on manage assignment page")
	public void admin_is_on_manage_assignment_page() throws IOException 
	{
		Loggerload.info("Admin is on the Manage Assignment Page.Expected Url: "+ getAssignmentURL() );  
	}

	@When("Admin enters assignment  name into search box from {string} and {int}")
	public void admin_enters_assignment_name_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		Loggerload.info(" Search Box Validation with Assignment Name");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
  		List<String> content = excel.getCellData(SheetName, 13, RowNumber);
		 assignmentpage.Text(content);
	}

	@Then("Displays entries with that assignment  name from {string} and {int}")
	public void displays_entries_with_that_assignment_name_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> expectedassignmentname = excel.getCellData(SheetName, 13, RowNumber);
		String actualSearchresults = assignmentpage.SearchResults();
		for(String assignmentname:expectedassignmentname)
		{
			assertThat(actualSearchresults, containsString(assignmentname));
		}
		   		    		  
	}
private boolean containsString(String assignmentname) {
		// TODO Auto-generated method stub
		return false;
	}
	//#20
	@When("Admin enters assignment name which is not existing the table into search box from {string} and {int}")
	public void admin_enters_assignment_name_which_is_not_existing_the_table_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 14, RowNumber);
		 assignmentpage.Text(content);
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table()
	{
		Loggerload.info(" Displaying Empty Data Table");
		boolean isDataTableEmpty = assignmentpage.DataTableEmpty();

        Assert.assertTrue(isDataTableEmpty, "Data table is not empty.");
	}
//#21
	@When("Admin enters assignment description into search box from {string} and {int}")
	public void admin_enters_assignment_description_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		Loggerload.info(" Search Box Validation with AssignmentDescription");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 14, RowNumber);
		 assignmentpage.Text(content);
	}

	@Then("Displays entries with that assignment  description from {string} and {int}")
	public void displays_entries_with_that_assignment_description_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> expectedassignmentdescription = excel.getCellData(SheetName, 14, RowNumber);
		String actualSearchresults = assignmentpage.SearchResults();
		for(String data: expectedassignmentdescription)
		{
			assertThat(actualSearchresults, containsString(data));
		}
	}
//#22
	@When("Admin enters assignment description which is not existing the table into search box from {string} and {int}")
	public void admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		Loggerload.info(" Displaying Empty Data Table");
		
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 14, RowNumber);
		 assignmentpage.Text(content);  
	}
//#23
	@When("Admin enters assignment due date into search box from {string} and {int}")
	public void admin_enters_assignment_due_date_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		Loggerload.info(" Search Box Validation with Assignment Due Date");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 15, RowNumber);
		 assignmentpage.Text(content);
	}

	@Then("Displays entries with that assignment  due date from {string} and {int}")
	public void displays_entries_with_that_assignment_due_date_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> expectedassignmentduedate = excel.getCellData(SheetName, 15, RowNumber);
		String actualSearchresults = assignmentpage.SearchResults();
		for(String data:expectedassignmentduedate)
		{
			assertThat(actualSearchresults, containsString(data));
		}
	}
//#24
	@When("Admin enters assignment due date which is not existing the table into search box from {string} and {int}")
	public void admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		Loggerload.info(" Displaying Empty Data Table");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 16, RowNumber);
		 assignmentpage.Text(content); 
	}
//#25
	@When("Admin enters assignment grade into search box from {string} and {int}")
	public void admin_enters_assignment_grade_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		Loggerload.info(" Search Box Validation with Assignment Grade");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> content = excel.getCellData(SheetName, 17, RowNumber);
		 assignmentpage.Text(content);
	}

	@Then("Displays entries with that assignment grade from {string} and {int}")
	public void displays_entries_with_that_assignment_grade_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> expectedassignmentgrade = excel.getCellData(SheetName, 17, RowNumber);
		String actualSearchresults = assignmentpage.SearchResults();
		for(String data:expectedassignmentgrade)
		{
			assertThat(actualSearchresults, containsString(data));
		}   
	}
//#26
	@When("Admin enters assignment grade which is not existing the table into search box from {string} and {int}")
	public void admin_enters_assignment_grade_which_is_not_existing_the_table_into_search_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		 Loggerload.info(" Displaying Empty Data Table");
		 ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
			
 		List<String> content = excel.getCellData(SheetName, 18, RowNumber);
			 assignmentpage.Text(content);
	}
//#27--Assignment details Popup window verification
	
	@Given("Admin is on manage assignment Page")
	public void admin_is_on_manage_assignment_Page() throws IOException 
	{
		DriverFactory.getDriver().get(getAssignmentURL());
	}
   @When("Admin click +Add new assignment button")
	public void admin_click_add_new_assignment_button() throws InterruptedException
	{
	   Loggerload.info(" Navigating to Add assignment page");
		assignmentpage.Click_AddNew();
	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) throws InterruptedException
	{
		WebElement assignmentdetails = assignmentpage.AssignmentDetails();
		Assert.assertTrue(assignmentdetails.isDisplayed(), "Assignment Details pop up not appeared");   
	}
//#28
	@Then("Admin should see input fields Text \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_should_see_input_fields_text_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) throws InterruptedException
	{
		Loggerload.info(" Validating the fields in Assignment Details Page");
		WebElement programnamedropdown = assignmentpage.ProgramNameDropDown();
		Assert.assertTrue(programnamedropdown.isDisplayed(), "ProgramNameDropDown is not displayed on the Assignment details page");
		WebElement batchNumberdropdown = assignmentpage.BatchNumberDropDown();
		Assert.assertTrue(batchNumberdropdown.isDisplayed(), "BatchNumberDropDown is not displayed on the  Assignment details page");
		WebElement assignmentnumber = assignmentpage.AssignmentNumber();
		Assert.assertTrue(assignmentnumber.isDisplayed(), "AssignmentNumber is not displayed on the  Assignment details page");
		WebElement assignmentdescription = assignmentpage.AssignmentDescription();
		Assert.assertTrue(assignmentdescription.isDisplayed(), "AssignmentDescription is not displayed on the  Assignment details page");
		WebElement assignmentgradetxt = assignmentpage.AssignmentGradeTxt();
		Assert.assertTrue(assignmentgradetxt.isDisplayed(), "AssignmentGradeTxt is not displayed on the  Assignmentdetails page");
		WebElement assignmentduedate =assignmentpage.AssignmentDueDate();
		Assert.assertTrue(assignmentduedate.isDisplayed(), "AssignmentDueDate is not displayed on the Assignment details page");
		WebElement assignment1 = assignmentpage.Assignment1();
		Assert.assertTrue(assignment1.isDisplayed(), "Assignment1 is not displayed on the  Assignment details page");
		WebElement assignment2 = assignmentpage.Assignment2();
		Assert.assertTrue(assignment2.isDisplayed(), "Assignment2 is not displayed on the  Assignment details page");
		WebElement assignment3 = assignmentpage.Assignment3();
		Assert.assertTrue(assignment3.isDisplayed(), "Assignment3 is not displayed on the  Assignment details page");
		WebElement assignment4 = assignmentpage.Assignment4();
		Assert.assertTrue(assignment4.isDisplayed(), "Assignment4 is not displayed on the  Assignment details page");
		WebElement assignment5 = assignmentpage.Assignment5();
		Assert.assertTrue(assignment5.isDisplayed(), "Assignment5 is not displayed on the  Assignment details page");
	}
//#29
	@Then("{int} textbox should be  present in Assignment details popup window")
	public void textbox_should_be_present_in_class_details_popup_window(Integer NoofTextBoxes ) throws InterruptedException
	{
		Loggerload.info(" Validating the Number of Text Boxes in Assignment Details Page");
		List<WebElement> textboxes = assignmentpage.TextBox();
	  int totaltextboxes = textboxes.size();
	  Assert.assertEquals(totaltextboxes, NoofTextBoxes,
	            "Number of textboxes in the popup window doesn't match the expected value.");  
	}
//#30
	@Then("Admin should see  dropdown option for Batch Number")
	public void admin_should_see_dropdown_option_for_batch_number() throws InterruptedException
	{
		Loggerload.info(" Validating the Batch number Drop down in Assignment Details Page");
		WebElement batchnumberdropdown = assignmentpage.BatchNumberDropDown();
		Assert.assertTrue(batchnumberdropdown.isDisplayed(), "Batch Number Drop Down is not displayed on the Assignment details page");
	}
	
//#31
	@Then("Admin should see  dropdown option for Program name")
	public void admin_should_see_dropdown_option_for_program_name() throws InterruptedException
	{
		Loggerload.info(" Validating the Program name Drop down in Class Details Page");
		WebElement programnamedropdown = assignmentpage.ProgramNameDropDown();
		Assert.assertTrue(programnamedropdown.isDisplayed(), "Program name Drop Down is not displayed on the Assignment details page"); 
	}
//#32

	@Then("Admin should see  calendar icon for assignment due date")
	public void admin_should_see_calendar_icon_for_assignment_due_date() throws InterruptedException
	{
		Loggerload.info(" Validating the Calender Icon in Assignment Details Page");
		WebElement calender = assignmentpage.Calender();
		Assert.assertTrue(calender.isDisplayed(), "Calender Icon is not displayed on the assignment details page");  
	}
//#33
	@Then("Admin should see  save button in the Assignment detail popup window")
	public void admin_should_see_save_button_in_the_assignment_detail_popup_window() throws InterruptedException
	{
		Loggerload.info(" Validating the Save Button in Class Details Page");
		WebElement save = assignmentpage.Save();
		Assert.assertTrue(save.isDisplayed(), "Save Button is not displayed on the assignment details page");    
	  
	}
//#34
	@Then("Admin should see  cancel button in the Assignment detail popup window")
	public void admin_should_see_cancel_button_in_the_assignment_detail_popup_window() throws InterruptedException
	{
		Loggerload.info(" Validatind the Cancel Button in Class Details Page");
		WebElement cancel = assignmentpage.Cancel();
		Assert.assertTrue(cancel.isDisplayed(), "Cancel Button is not displayed on the assignment details page");
	}
//#35
	@Then("Admin should see  close button on the Assignment details popup window")
	public void admin_should_see_close_button_on_the_assignment_details_popup_window() throws InterruptedException
	{
		Loggerload.info(" Validatind the Close Button in Class Details Page");
		WebElement close = assignmentpage.Close();
		Assert.assertTrue(close.isDisplayed(), "Close Button is not displayed on the assignment details page");    
	
	}
//#36---Add new Assignment
	@Given("Admin is in assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() throws IOException
	{
		String currentURL =DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = getAddAssignmentURL();
			 Assert.assertEquals(expectedURL, currentURL);
			 Assert.assertNotNull(currentURL);
			 Assert.assertTrue(currentURL.startsWith("http://"));
			 if (!expectedURL.equals(currentURL))
			 {
				 Loggerload.info("Failed to reach the Assignment detail page.Expected Url: "+ expectedURL );
			 }
				
	}

	@When("Admin enters all mandatory field values with valid data and clicks save button \\( Program name, batch number,Assignment Name, grade by, Assignment due date)from {string} and {int}")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save(); 
	}

	@Then("Admin should see new class details is added in the data table from {string} and {int}")
	public void admin_should_see_new_class_details_is_added_in_the_data_table_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
		String expectedfields = "programname: " + programname + ",batchnumber: " + batchnumber +
           ", assignmentname: " + assignmentname + ", assignmentduedate: " + assignmentduedate;
     List<String> addedFields =assignmentpage.DataTable();
		 Assert.assertEquals(expectedfields, addedFields,
	            "Admin shoukd not see added new assignment in the data table");
	}
//#37
	@When("Admin enters all mandatory field values with invalid data and clicks save button \\(Program name, batch number,Assignment Name, grade by, Assignment due date )from {string} and {int}")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date_from_and(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() throws InterruptedException, IOException
	{
		String expectedErrormessage = ErrorMessage();
	    String actualErrorMessage = assignmentpage.Alert();
	    assertTrue(actualErrorMessage.contains(expectedErrormessage));
	}
//38
	@When("Admin enters values in all fields with valid data and clicks save button Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file2, Assignment file3, Assignment file4, Assignment file5 from {string} and {int}")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file2_assignment_file3_assignment_file4_assignment_file5_from (String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save();
	}

	@When("Admin enters with invalid data in optional fields and clicks save button Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 from {string} and {int}")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_assignment_file1_assignment_file2_assignment_file3_assignment_file4_assignmentfile5_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save();
	}

	@When("Admin enters data missing value in program name and clicks save button batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5	from {string} and {int}")
	public void admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file2_assignment_file3_assignment_file4_assignment_file5_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save();
	}

	@Then("Program Name is missing")
	public void program_name_is_missing() throws InterruptedException, IOException {
		String expectedBatchidErrormessage = BatchNumberError();
	    String actualBatchIdErrorMessage = assignmentpage.Alert();
	    assertTrue(actualBatchIdErrorMessage.contains(expectedBatchidErrormessage));
	}

	@When("Admin enters data missing value in Batch number and clicks save button Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 from {string} and {int}")
	public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button_program_name_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file2_assignment_file3_assignment_file4_assignment_file5_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Missing Class No in Add Class Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		List<String> batchid = excel.getCellData(SheetName, 14, RowNumber);
		List<String> classdate = excel.getCellData(SheetName, 20, RowNumber);
		List<String> staffid = excel.getCellData(SheetName, 22, RowNumber);
		
		assignmentpage.BatchNumberDropDownText(batchid);
		assignmentpage.ClassDateCalender(classdate);
		assignmentpage.StaffIdDropDownText(staffid);
		assignmentpage.Click_Save();
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() throws InterruptedException, IOException {
		String expectedBatchNoErrormessage = ErrorMessage();
	    String actualBatchNoErrorMessage = assignmentpage.Alert();
	    assertTrue(actualBatchNoErrorMessage.contains(expectedBatchNoErrormessage));
	}

	@When("Admin enters data missing value in Assignment name and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date from {string} and {int}")
	public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date_from (String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save();
	}

	@Then("Assignment name is missing")
	public void assignment_name_is_missing() throws IOException, InterruptedException
	{
		String expectedAssignmentNameErrormessage = ErrorMessage();
	    String actualAssignmentNameErrorMessage = assignmentpage.Alert();
	    assertTrue(actualAssignmentNameErrorMessage.contains(expectedAssignmentNameErrormessage));
	}

	@When("Admin enters data missing value in Assignment due date and clicks save button Program name, batch number,Assignment Name, grade by	from {string} and {int}")
	public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.Click_Save();
	}

	@Then("Assignment Due date is missing")
	public void assignment_due_date_is_missing() throws IOException, InterruptedException {
		String expectedAssignmentDuedateErrormessage = ErrorMessage();
	    String actualAssignmentDuedateErrorMessage = assignmentpage.Alert();
	    assertTrue(actualAssignmentDuedateErrorMessage.contains(expectedAssignmentDuedateErrormessage));
	}

	@When("Admin enters data missing value in  grade by and clicks save button Program name, batch number,Assignment Name, Assignment due date from {string} and {int}")
	public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save();
	}

	@Then("grade byis missing")
	public void grade_byis_missing() throws InterruptedException, IOException {
		String expectedGradeByErrormessage = ErrorMessage();
	    String actualGradeByErrorMessage = assignmentpage.Alert();
	    assertTrue(actualGradeByErrorMessage.contains(expectedGradeByErrormessage));
	}

	@When("Admin enters passed date in the due date field and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date from {string} and {int}")
	public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date_from (String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		 assignmentpage.Click_Save(); 
	}

	@Then("Assignment cannot be created for the passed date")
	public void assignment_cannot_be_created_for_the_passed_date() throws InterruptedException, IOException {
		String expectedPassedDateErrormessage = PassedDateError();
	    String actualPassedDateErrorMessage = assignmentpage.Alert();
	    assertTrue(actualPassedDateErrorMessage.contains(expectedPassedDateErrormessage));
	}

	@When("Admin clicks date from date picker	from {string} and {int}")
	public void admin_clicks_date_from_date_picker_from_and(String SheetName, Integer RowNumber) throws InterruptedException
	{
		Loggerload.info(" Clicking Date from date picker in class Date field in Add Class Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		List<String> classdate = excel.getCellData(SheetName, 25, RowNumber);
		assignmentpage.ClassDateCalender(classdate);
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() throws IOException, InterruptedException {
		String expectedDate = expectedDate();
	    String actualDateintextbox = assignmentpage.ClassDateTextBox();
	    assertTrue(actualDateintextbox.contains(expectedDate));
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() throws InterruptedException, ParseException {
		Loggerload.info(" selected date should be in  mm\\\\/dd\\\\/yyyy format");
		
		  String actualDateintextbox = assignmentpage.ClassDateTextBox();
		   String formattedDate = assignmentpage.Date();
      Assert.assertEquals(actualDateintextbox, formattedDate, "Date format is not as expected");
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() throws InterruptedException {
		Loggerload.info(" Admin clicks right arrow in the date picker near month");
        assignmentpage.DatePickerClick();
		assignmentpage.DatePickerRightArrow();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() throws InterruptedException, ParseException {
		String nextmonth =assignmentpage.DateNextMonth();
		 Assert.assertTrue(nextmonth.contains("MM"), "Next Month is not visible on the date picker of class details page");  
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() throws InterruptedException {
		Loggerload.info(" Admin clicks left arrow in the date picker near month");
		 assignmentpage.DatePickerClick();
		assignmentpage.DatePickerLeftArrow();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() throws InterruptedException, ParseException {
		String previousmonth =assignmentpage.DatePreviousMonth();
		 Assert.assertTrue(previousmonth.contains("MM"), "Previous Month is not visible on the date picker of class details page");
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() throws InterruptedException {
		Loggerload.info(" Admin validates current date in the date picker ");

		assignmentpage.DatePickerClick();
	}

	@Then("Admin should see current date is highlighted in the date picker")
	public void admin_should_see_current_date_is_highlighted_in_the_date_picker() throws InterruptedException {
		String currentdate = assignmentpage.CurrentDate();
		String datapickerdate = assignmentpage.DatePickerdate();
		 Assert.assertTrue(datapickerdate.contains(currentdate), "current date is not  highlighted in the date picker");
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() throws InterruptedException {
		Loggerload.info(" Admin validates future date in the date picker ");

		assignmentpage.DatePickerClick();
		   assignmentpage.FutureDate();
	}

	@Then("Admin should see selected date is highlighted in the date picker")
	public void admin_should_see_selected_date_is_highlighted_in_the_date_picker() throws InterruptedException {
		String futuredate = assignmentpage.CurrentDate();
		String datapickerdate = assignmentpage.DatePickerdate();
		Assert.assertEquals(futuredate, datapickerdate,
	            "Admin should not see future date in the data picker");
	}

	@When("Admin clicks Cancel button without entering values in the fields	")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields () throws InterruptedException {
		Loggerload.info(" Admin clicks Cancel button without entering values in the fields ");

		assignmentpage.Click_Cancel();
	}

	@Then("Admin should land on manage assignment page {string} and {int}")
	public void admin_should_land_on_manage_assignment_page(String SheetName, Integer RowNumber) throws IOException
	{
		ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
        
		List<String> expectedClassUrl = excel.getCellData(SheetName, 0, RowNumber);
		String actualClassUrl = getClassURL();
		 Assert.assertEquals(expectedClassUrl, actualClassUrl);
		 Assert.assertNotNull(actualClassUrl);
		 Assert.assertTrue(actualClassUrl.startsWith("http://"));
		 if (!expectedClassUrl.equals(actualClassUrl))
		 {
			 Loggerload.info("Failed to reach the Class page.Expected Url: "+ expectedClassUrl );
		 }
	}

	@When("Admin clicks Cancel button entering values in the fields from {string} and {int}")
	public void admin_clicks_cancel_button_entering_values_in_the_fields_from(String SheetName, Integer RowNumber) throws InterruptedException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 14, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 16, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 18, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 20, RowNumber);
		
		
		 assignmentpage.ProgramNameDropDownText(programname);
		 assignmentpage.BatchNumberDropDownText(batchnumber);
		 assignmentpage.AssignmentName(assignmentname);
		 assignmentpage.AssignmentDueDate( assignmentduedate);
		assignmentpage.Click_Cancel();
	}

	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table from {string} and {int}")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table_from(String SheetName, Integer RowNumber) throws InterruptedException, IOException {
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
		String expectedfields = "programname: " + programname + ",batchnumber: " + batchnumber +
           ", assignmentname: " + assignmentname + ", assignmentduedate: " + assignmentduedate;
     List<String> addedFields =assignmentpage.DataTable();
		 Assert.assertEquals(expectedfields, addedFields,
	            "Admin shoukd  see added new assignment in the data table");
	}

	
//#54---	Edit assignment Validation Part1
	
	
	@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() throws IOException
	{
		Loggerload.info("Admin is on the Manage Assignment Page.Expected Url: "+ getAssignmentURL() );
	}

	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() throws InterruptedException
	{
		Loggerload.info("Admin clicks Edit Button");

		assignmentpage.Click_Edit();
	}

	@Then("Edit popup window appears with heading Assignment Details")
	public void edit_popup_window_appears_with_heading_assignment_details() throws InterruptedException
	{
		WebElement assignmentdetails = assignmentpage.AssignmentDetails();
		Assert.assertTrue(assignmentdetails.isDisplayed(), "Assignment Details pop up not appeared");
	}
//#55
	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() throws InterruptedException
	{
		Loggerload.info("Admin clicks Edit Button from one row in data table");

		assignmentpage.Click_EditA();  
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields()
	{
		
	}
	
	
//#55---Edit assignment Validation Part2
	@Given("Admin is in Edit assignment detail popup window")
	public void admin_is_in_edit_assignment_detail_popup_window() throws InterruptedException 
	{
		Loggerload.info("Admin is in  Edit assignment detail popup window");
		assignmentpage.AssignmentDetails(); 
	}

	@Then("Admin should see updated assignment details is added in the data table {string} and {int}")
	public void admin_should_see_updated_assignment_details_is_added_in_the_data_table(String SheetName, Integer RowNumber) throws InterruptedException 
	{
		Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		 Thread.sleep(1000);
		List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
		List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
		List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
		List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
		String expectedfields = "programname: " + programname + ",batchnumber: " + batchnumber +
           ", assignmentname: " + assignmentname + ", assignmentduedate: " + assignmentduedate;
     List<String> addedFields =assignmentpage.DataTable();
		 Assert.assertEquals(expectedfields, addedFields,
	            "Admin shoukd  see updated  assignment in the data table");

	}


	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() throws InterruptedException
	{
		Loggerload.info(" Admin clicks Delete button");

		assignmentpage.Click_Delete(); 
	}

	@Then("Admin should see dialog box")
	public void admin_should_see_dialog_box() throws InterruptedException
	{
		 Alert alert = (Alert) assignmentpage.DeleteA();
			Assert.assertTrue(((WebElement) alert).isDisplayed(), "Alert is not seen on the manage assignment page");
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) throws InterruptedException 
	{
		WebElement yes = assignmentpage.Yes();
		Assert.assertTrue((yes).isDisplayed(), "Yes Button is not seen on the Delete Alert");
	}
	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) throws InterruptedException 
	{
		WebElement no = assignmentpage.No();
		Assert.assertTrue((no).isDisplayed(), "No Button is not seen on the Delete Alert");
	}
	
//Delete Assignment Validation Part2
	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() throws InterruptedException 
	{
		Loggerload.info(" Admin is in delete alert");
		assignmentpage.Click_Delete(); 
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() throws InterruptedException
	{
		assignmentpage.Click_Yes();
	}

	@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() throws IOException
	{
		String actualsuccessmsg = DeleteSuccessMessage();
		 Assert.assertTrue(actualsuccessmsg.contains("Assignment deleted"), "Success message is not visible");    
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() throws InterruptedException 
	{
		  assignmentpage.Click_No();   
	}

	@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() throws IOException 
	{
		String actualsuccessmsg = DeleteSuccessMessage();
		 Assert.assertTrue(actualsuccessmsg.contains("Assignment not deleted"), "Success message is not visible"); 
	}
//Delete Multiple Class Validation Part1
	

	@When("Admin clicks single row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() throws InterruptedException
	{
		Loggerload.info(" Delete All icon Enabled");

		assignmentpage.CheckBox1();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() throws InterruptedException
	{
		WebElement delete = assignmentpage.DeleteA();
	    Assert.assertTrue((delete).isEnabled(), "Deleta All Button is not Enabled");
	}
	//Delete Multiple Class Validation Part2
	
	@Then("Redirected to assignment page and selected assignment details are deleted from the data tablefrom {string} and {int}")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_tablefrom_and(String string, Integer int1) throws InterruptedException
	{
		WebElement checkbox1 = assignmentpage.CheckBox1();
		WebElement checkbox2 = assignmentpage.CheckBox2();
		WebElement checkbox3 = assignmentpage.CheckBox3();

		Assert.assertTrue((checkbox1).isEnabled(), "CheckBox 1 is not Enabled");
		Assert.assertTrue((checkbox2).isEnabled(), "CheckBox 2 is not Enabled");
		Assert.assertTrue((checkbox3).isEnabled(), "CheckBox 3 is not Enabled");

	}

	
	@Then("Redirected to assignment page and selected assignment details are not deleted from the data tablefrom {string} and {int}")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_tablefrom_and(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
		
  		List<String> batchid = excel.getCellData(SheetName, 13, RowNumber);
  		List<String> classno = excel.getCellData(SheetName, 15, RowNumber);
  		List<String> classdate = excel.getCellData(SheetName, 19, RowNumber);
  		List<String> staffid = excel.getCellData(SheetName, 21, RowNumber);  
  		String expectedfields = "Batch ID: " + batchid + ", Class Date: " + classdate +
                ", Class No: " + classno + ", Staff ID: " + staffid;
          List<String> addedFields = assignmentpage.DataTable();
          for (String field : addedFields) {
        	  assertFalse(expectedfields.contains((CharSequence) field));
        	  }
		   
	}
	
	
	//Delete Multiple Class Validation Part3
	

@Then("Redirected to assignment page and selected assignment details are not deleted from the data table from {string} and {int}")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table_from_and(String SheetName, Integer RowNumber) throws InterruptedException {
	Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
	ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
	 Thread.sleep(1000);
	List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
	List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
	List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
	List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
	String expectedfields = "programname: " + programname + ",batchnumber: " + batchnumber +
       ", assignmentname: " + assignmentname + ", assignmentduedate: " + assignmentduedate;
 List<String> addedFields =assignmentpage.DataTable();
	 Assert.assertEquals(expectedfields, addedFields,
            "Admin shoukd  see added new assignment in the data table");
}

//Verify sort function in manage assignment page


@When("Admin click on assignment name column header to sort")
public void admin_click_on_assignment_name_column_header_to_sort() throws InterruptedException
{
	Loggerload.info("Sorted in Descending Order");

	assignmentpage.AssignmentNameSortedList();
}

@Then("Admin should see data table sorted in descending order")
public void admin_should_see_data_table_sorted_in_descending_order() throws InterruptedException
{
	List<String> tablesortedlist = assignmentpage.DataTableDescendingSort();
    Assert.assertTrue(tablesortedlist.equals(assignmentpage.AssignmentDescriptionSort()), "Data table is not sorted in descending order");

}

@When("Admin double click on assignment name column header to sort")
public void admin_double_click_on_assignment_name_column_header_to_sort() throws InterruptedException
{
	assignmentpage.Click_Batch();
}

@Then("Admin should see data table sorted in ascending order")
public void admin_should_see_data_table_sorted_in_ascending_order() throws InterruptedException
{
	List<String> tablesortedlist = assignmentpage.DataTableAscendingSort();
    Assert.assertTrue(tablesortedlist.equals(assignmentpage.DataTableAscendingSort()), "Data table is not sorted in ascending order");
}

//Pagination in manage assignment Part1


@When("Admin clicks {string} button on the navigation bar")
public void admin_clicks_button_on_the_navigation_bar(String string) throws InterruptedException
{
	assignmentpage.DataTable(); 
}

@Then("Data table should display {int} page when entries available")
public void data_table_should_display_page_when_entries_available(Integer int1) throws InterruptedException
{
	WebElement page1 =  assignmentpage.PageNo1();
	Assert.assertTrue((page1).isDisplayed(), "Page 1 is not displayed"); 
}

@Then("Right arrow should be enabled in page one when entries are more than {int} available")
public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) throws InterruptedException 
{
	boolean rightarrow =  assignmentpage.RightArrowPagination();
	Assert.assertTrue(rightarrow, "Right Arrow is not enabled in Pagination");
}

@Then("Left arrow should be disabled in page one when entries are more than {int} available")
public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) throws InterruptedException 
{
	boolean leftarrow =  assignmentpage.LeftArrowPagination();
	Assert.assertFalse(leftarrow, "Left Arrow is enabled in Pagination");
}

@Then("Right arrow should be enabled in page two when entries are more than {int} available")
public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) throws InterruptedException
{
	WebElement page2 =  assignmentpage.PageNo2();
	Assert.assertTrue((page2).isDisplayed(), "Page 2 is not displayed");
	   boolean rightarrow =  assignmentpage.RightArrowPage2();
Assert.assertTrue(rightarrow, "Right Arrow is not enabled in Pagination");
}

@Then("Left arrow should be enabled in page two")
public void left_arrow_should_be_enabled_in_page_two() throws InterruptedException 
{
	WebElement page2 =  assignmentpage.PageNo2();
	Assert.assertTrue((page2).isDisplayed(), "Page 2 is not displayed");
	   boolean leftarrow =  assignmentpage.LeftArrowPage2();
Assert.assertTrue(leftarrow, "Left Arrow is not enabled in Pagination");
}

@Then("When entries are more than {int} in data table pagination controls enabled")
public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) throws InterruptedException 
{
	boolean pagination =  assignmentpage.PaginationEnable();
	Assert.assertTrue(pagination, "Pagination is not enabled");
}



@Then("When entries are less than {int} in data table pagination controls disabled")
public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) throws InterruptedException
{
	boolean pagination =  assignmentpage.PaginationDisable();
	Assert.assertTrue(pagination, "Pagination is enabled"); 
}

//Pagination in manage assignment Part2
@Given("Admin is in add assignment details popup window")
public void admin_is_in_add_assignment_details_popup_window() throws IOException 
{
	DriverFactory.getDriver().navigate().to(getAddAssignmentURL());
}

@When("Admin creates six new assignment from {string} and {int}")
public void admin_creates_six_new_assignment_from_and(String SheetName, Integer RowNumber) throws InterruptedException
 {
	Loggerload.info(" Adding 6 new classes");
	 int startrow = 2;
	 for (int i = 0; i < 6; i++) {
		 Loggerload.info(" Entering Mandatory fields in Add Assignment Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\praka\\git\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData");
			 Thread.sleep(1000);
			List<String> programname = excel.getCellData(SheetName, 13, RowNumber);
			List<String> batchnumber = excel.getCellData(SheetName, 15, RowNumber);
			List<String> assignmentname = excel.getCellData(SheetName, 17, RowNumber);
			List<String> assignmentduedate = excel.getCellData(SheetName, 19, RowNumber);
							assignmentpage.Click_Save();
		}

           
	 
		startrow++;

}

@Then("When total class entries above five next page is enabled \\( On multiples of five new page will be enabled)")
public void when_total_class_entries_above_five_next_page_is_enabled_on_multiples_of_five_new_page_will_be_enabled() throws InterruptedException
 {
   WebElement nextpage = assignmentpage.NextPageEnable();
	Assert.assertTrue((nextpage).isEnabled(), "Next Page is not enabled");  
}

@When("Admin creates less than or equal to five new assignment	from {string} and {int}")
public void admin_creates_less_than_or_equal_to_five_new_assignment_from_and(String SheetName, Integer RowNumber) throws InterruptedException
 {
  int startrow = 2;
	for (int i = 0; i <= 5; i++) {
        	ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
List<String> programnamedropdown = excel.getCellData(SheetName, 14, startrow);
List<String> batchnumber= excel.getCellData(SheetName, 16, startrow);
List<String> classtopic = excel.getCellData(SheetName, 18, startrow);
List<String> assignmentnumber = excel.getCellData(SheetName, 20, startrow);
List<String> assignmentdescription = excel.getCellData(SheetName,24, startrow);
List<String> assignmentgradetxt= excel.getCellData(SheetName, 25, startrow);
List<String> assignmentduedate = excel.getCellData(SheetName, 26, startrow);
List<String> assignment1 = excel.getCellData(SheetName, 21, startrow);
List<String> assignment2 = excel.getCellData(SheetName, 22, startrow);
List<String> assignment3 = excel.getCellData(SheetName, 23, startrow);
List<String> assignment4 = excel.getCellData(SheetName, 27, startrow);
List<String> assignment5 = excel.getCellData(SheetName, 28, startrow);


 assignmentpage.ProgramNameDropDownText(programnamedropdown);
 assignmentpage.BatchNumberDropDownText(batchnumber);
 assignmentpage.Assignment1(assignmentnumber);
 assignmentpage.AssignmentDescriptionTextBox(assignmentdescription);
 assignmentpage.Assignment2(assignmentgradetxt);
 assignmentpage.AssignmentDueDate(assignmentduedate);
 assignmentpage.Assignment1(assignment1);
 assignmentpage.Assignment2(assignment2);
 assignmentpage.Assignment3(assignment3);
 assignmentpage.Assignment4(assignment4);
 assignmentpage.Assignment5(assignment5);
 assignmentpage.Click_Save();
 }
	startrow++;  
}

@Then("When total class entries  five or below next page is disabled")
public void when_total_class_entries_five_or_below_next_page_is_disabled() throws InterruptedException
 {
   WebElement nextpage = assignmentpage.NextPageDisable();
	Assert.assertFalse((nextpage).isEnabled(), "Next Page is enabled"); 
}
//Navigation function validation from manage assignment page to other pages

@When("Admin clicks  Student button in the navigation bar")
public void admin_clicks_student_button_in_the_navigation_bar() throws InterruptedException {
    assignmentpage.Click_Student();
}

@Then("Admin should able to land on student page")
public void admin_should_able_to_land_on_student_page() throws IOException {
	String expectedUserUrl = getStudentURL();
	String actualUserUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedUserUrl, actualUserUrl);
	 Assert.assertNotNull(actualUserUrl);
	 Assert.assertTrue(actualUserUrl.startsWith("http://"));
	 if (!expectedUserUrl.equals(actualUserUrl))
	 {
		 Loggerload.info("Failed to reach the User page.Expected Url: "+ expectedUserUrl );
	 }
}

@When("Admin clicks  Program button in the navigation bar")
public void admin_clicks_program_button_in_the_navigation_bar() throws InterruptedException 
{
	assignmentpage.Click_Program();
}

@Then("Admin should able to land on Program page")
public void admin_should_able_to_land_on_program_page() throws IOException {
	String expectedUserUrl = getProgramURL();
	String actualUserUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedUserUrl, actualUserUrl);
	 Assert.assertNotNull(actualUserUrl);
	 Assert.assertTrue(actualUserUrl.startsWith("http://"));
	 if (!expectedUserUrl.equals(actualUserUrl))
	 {
		 Loggerload.info("Failed to reach the User page.Expected Url: "+ expectedUserUrl );
	 }
}

@When("Admin clicks  Batch button in the navigation bar")
public void admin_clicks_batch_button_in_the_navigation_bar() throws InterruptedException 
{
	assignmentpage.Click_Batch(); 
}

@Then("Admin should able to land on Batch page")
public void admin_should_able_to_land_on_batch_page() throws IOException {
	String expectedUserUrl = getBatchURL();
	String actualUserUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedUserUrl, actualUserUrl);
	 Assert.assertNotNull(actualUserUrl);
	 Assert.assertTrue(actualUserUrl.startsWith("http://"));
	 if (!expectedUserUrl.equals(actualUserUrl))
	 {
		 Loggerload.info("Failed to reach the User page.Expected Url: "+ expectedUserUrl );
	 } 
}

@When("Admin clicks  User button in the navigation bar")
public void admin_clicks_user_button_in_the_navigation_bar() throws InterruptedException {
	assignmentpage.Click_User();
}

@Then("Admin should able to land on user page")
public void admin_should_able_to_land_on_user_page() throws IOException
{
	String expectedUserUrl = getUserURL();
	String actualUserUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedUserUrl, actualUserUrl);
	 Assert.assertNotNull(actualUserUrl);
	 Assert.assertTrue(actualUserUrl.startsWith("http://"));
	 if (!expectedUserUrl.equals(actualUserUrl))
	 {
		 Loggerload.info("Failed to reach the User page.Expected Url: "+ expectedUserUrl );
	 }
}

@When("Admin clicks  Class button in the navigation bar")
public void admin_clicks_class_button_in_the_navigation_bar() throws InterruptedException {
	assignmentpage.Click_Class();
}

@Then("Admin should able to land on class page")
public void admin_should_able_to_land_on_class_page() throws IOException
{
	String expectedAssignmentUrl = getAssignmentURL();
	String actualAssignmentUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedAssignmentUrl, actualAssignmentUrl);
	 Assert.assertNotNull(actualAssignmentUrl);
	 Assert.assertTrue(actualAssignmentUrl.startsWith("http://"));
	 if (!expectedAssignmentUrl.equals(actualAssignmentUrl))
	 {
		 Loggerload.info("Failed to reach the Assignment page.Expected Url: "+ expectedAssignmentUrl );
	 }
}

@When("Admin clicks  Attendance button in the navigation bar")
public void admin_clicks_attendance_button_in_the_navigation_bar() throws InterruptedException {
	assignmentpage.Click_Attendance();
}

@Then("Admin should able to land on Attendence page")
public void admin_should_able_to_land_on_attendence_page() throws IOException {
	String expectedAttendanceUrl = getAttendanceURL();
	String actualAttendanceUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedAttendanceUrl, actualAttendanceUrl);
	 Assert.assertNotNull(actualAttendanceUrl);
	 Assert.assertTrue(actualAttendanceUrl.startsWith("http://"));
	 if (!expectedAttendanceUrl.equals(actualAttendanceUrl))
	 {
		 Loggerload.info("Failed to reach the Attendance page.Expected Url: "+ expectedAttendanceUrl );
	 }
}

@When("Admin clicks Logout button in the navigation bar")
public void admin_clicks_logout_button_in_the_navigation_bar() throws InterruptedException 
{
	assignmentpage.Click_Logout();
}

@Then("Admin should able to land on login page")
public void admin_should_able_to_land_on_login_page() throws IOException
{
	String expectedLoginUrl = getLoginURL();
	String actualLoginUrl = DriverFactory.getDriver().getCurrentUrl();
	 Assert.assertEquals(expectedLoginUrl, actualLoginUrl);
	 Assert.assertNotNull(actualLoginUrl);
	 Assert.assertTrue(actualLoginUrl.startsWith("http://"));
	 if (!expectedLoginUrl.equals(actualLoginUrl))
	 {
		 Loggerload.info("Failed to reach the Login page.Expected Url: "+ expectedLoginUrl );
	 }
}
}
