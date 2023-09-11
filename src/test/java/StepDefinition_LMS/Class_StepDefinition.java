package StepDefinition_LMS;
import static Utilities.ConfigReader.getClassURL;
import static Utilities.ConfigReader.getDashboardURL;
import static Utilities.ConfigReader.classHeader;
import static Utilities.ConfigReader.classFields;
import static Utilities.ConfigReader.classField1;
import static Utilities.ConfigReader.classField2;
import static Utilities.ConfigReader.classField3;
import static Utilities.ConfigReader.classField4;
import static Utilities.ConfigReader.classField5;
import static Utilities.ConfigReader.classField6;
import static Utilities.ConfigReader.classField7;
import static Utilities.ConfigReader.classField8;
import static Utilities.ConfigReader.classField9;
import static Utilities.ConfigReader.classField10;
import static Utilities.ConfigReader.NumberEntry;
import static Utilities.ConfigReader.NoofClasses;
import static Utilities.ConfigReader.getAddClassURL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;
import static Utilities.ConfigReader.ErrorMessage;
import static Utilities.ConfigReader.BatchIdError;

import java.io.IOException;
import java.util.List;
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
import io.cucumber.java.en.*;
	public class Class_StepDefinition
	{
		WebDriver driver;
		Class_PageObject classpage = new Class_PageObject(DriverFactory.getDriver()); 
		//#1
		@Given("Admin is on dashboard page after Login")
		public void admin_is_on_dashboard_page_after_login() throws InterruptedException, IOException {
			DriverFactory.getDriver().get(getDashboardURL());
			Loggerload.info("Website Opened");
					}

		@When("Admin clicks {string} button on the navigation bar")
		public void admin_clicks_button_on_the_navigation_bar(String string) throws InterruptedException {
			classpage.Click_Class();
		}

		@Then("Admin should see URL with Manage Class from {string} and {int}")
		public void admin_should_see_url_with_Manage_Class_from (String SheetName,Integer RowNumber) throws InterruptedException, IOException{
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
          
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
		
//#2
		@Then("Get the response time for navigation from dashboard page to manage class page")
		public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() throws InterruptedException {
			
			DriverFactory.getDriver().navigate().back();
			Thread.sleep(1000);
			long startTime = System.currentTimeMillis();
			classpage.Click_Class();
			
			 WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			 WebElement manage_class = classpage.Manage_Class();
			 WebElement manageClassElement = wait.until(ExpectedConditions.presenceOfElementLocated((By) manage_class));
			 Assert.assertTrue(manageClassElement.isDisplayed(), "Manage class is not displayed");
			 long endTime = System.currentTimeMillis();

			long totalTime = endTime - startTime;

			System.out.println("Response Time: " + totalTime + " milliseconds");
		    long expectedResponseTime = 2000;
		    Assert.assertTrue(totalTime <= expectedResponseTime, "Response time is longer than expected");
		}
//#3
		@Then("Admin should see header with Manage Class from {string} and {int}")
		public void admin_should_see_header_with_Manage_Class_from (String SheetName,Integer RowNumber) throws InterruptedException, IOException {
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
         
			List<String> expectedHeader = excel.getCellData(SheetName, 1, RowNumber);
			String actualHeader = classHeader();
			
			Assert.assertEquals(expectedHeader, actualHeader);
			 Assert.assertNotNull(actualHeader);
			 Assert.assertTrue(actualHeader.contains("Manage Class"));
			 if (!expectedHeader.equals(actualHeader))
			 {
				 Loggerload.info("Failed to see the Manage Class Header.Expected Header: "+ expectedHeader );
			 }
				
		    		}
		
//#4
		@When("Admin clicks Class button on the navigation bar and get all text from the portal page {string} and {int}")
		public void admin_clicks_class_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page (String SheetName,Integer RowNumber) throws InterruptedException, IOException {
			DriverFactory.getDriver().navigate().back();
			Thread.sleep(1000);
			classpage.Click_Class();
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
       
			List<String> expectedFields = excel.getCellData(SheetName, 12, RowNumber);
			String actualFields = classFields();
			Assert.assertEquals(expectedFields, actualFields);
			 Assert.assertNotNull(actualFields);
			
			 if (!expectedFields.equals(actualFields))
			 {
				 Loggerload.info("Failed to get all the fields from the Manage Class Page.Expected Fields: "+ expectedFields );
			 }
		}

		@Then("Admin should see correct spelling for the all the fields from {string} and {int}")
		public void admin_should_see_correct_spelling_for_the_all_the_fields_from (String SheetName,Integer RowNumber) throws InterruptedException, IOException{
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
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
			         String actualField1 = classField1();
			         String actualField2 = classField2();
			       	 String actualField3 = classField3();
			         String actualField4 = classField4();
			         String actualField5 = classField5();
			         String actualField6 = classField6();
			         String actualField7 = classField7();
			         String actualField8 = classField8();
			         String actualField9 = classField9();
			         String actualField10 = classField10();
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
//#5
		@Then("Admin should see disabled delete icon below the Manage Class")
		public void admin_should_see_disabled_delete_icon_below_the_Manage_Class() throws InterruptedException {
			
			WebElement delete_disable = classpage.DeleteAll_Displayed();
			Assert.assertTrue(delete_disable.isDisplayed(), "Delete icon is not displayed");
			
			 WebElement delete_enable = classpage.DeleteAll_Enabled();
			 Assert.assertFalse(delete_enable.isEnabled(), "Delete icon is not disabled");
			 				      			
		}
//#6
		@Then("Admin should see search bar on the class page")
		public void admin_should_see_search_bar_on_the_class_page() throws InterruptedException {
			WebElement search = classpage.Search();
			Assert.assertTrue(search.isDisplayed(), "Search bar is not displayed on the class page");
		}
//#7
		@Then("Admin should see +Add New Class button on the class page")
		public void admin_should_see_add_new_class_button_on_the_class_page() throws InterruptedException {
			WebElement addnew = classpage.Addnew();
			Assert.assertTrue(addnew.isDisplayed(), "+Add New Button is not displayed on the class page");
		}
//#8
		@Then("Admin should see data table on the Manage Class Page With following column headers")
		public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers() throws InterruptedException {
			WebElement batchid = classpage.Batchid();
			Assert.assertTrue(batchid.isDisplayed(), "Batch Id is not displayed on the class page");
			WebElement classno = classpage.ClassNo();
			Assert.assertTrue(classno.isDisplayed(), "Class No is not displayed on the class page");
			WebElement classdate = classpage.ClassDate();
			Assert.assertTrue(classdate.isDisplayed(), "Class Date is not displayed on the class page");
			WebElement classtopic = classpage.ClassTopic();
			Assert.assertTrue(classtopic.isDisplayed(), "Class Topic is not displayed on the class page");
			WebElement staffid = classpage.StaffId();
			Assert.assertTrue(staffid.isDisplayed(), "Staff Id is not displayed on the class page");
			WebElement description = classpage.Description();
			Assert.assertTrue(description.isDisplayed(), "Description is not displayed on the class page");
			WebElement comments = classpage.Comments();
			Assert.assertTrue(comments.isDisplayed(), "Comments is not displayed on the class page");
			WebElement notes = classpage.Notes();
			Assert.assertTrue(notes.isDisplayed(), "Notes is not displayed on the class page");
			WebElement recording = classpage.Recording();
			Assert.assertTrue(recording.isDisplayed(), "Recording is not displayed on the class page");
			WebElement edit = classpage.EditClass();
			Assert.assertTrue(edit.isDisplayed(), "Edit is not displayed on the class page");
			WebElement delete = classpage.DeleteClass();
			Assert.assertTrue(delete.isDisplayed(), "Delete is not displayed on the class page");
			
		}
//#9
		@Then("Edit Icon in each row of data table only  when entries are available")
		public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() throws InterruptedException {
			WebElement editA = classpage.EditA();
			Assert.assertTrue(editA.isDisplayed(), "Edit Icon is not displayed on the first row of the data table");
			WebElement editB = classpage.EditB();
			Assert.assertTrue(editB.isDisplayed(), "Edit Icon is not displayed on the second row of the data table");
			WebElement editC = classpage.EditC();
			Assert.assertTrue(editC.isDisplayed(), "Edit Icon is not displayed on the third row of the data table");
		
			
		}
//#10
		@Then("Edit Icon will not be present in data table")
		public void edit_icon_will_not_be_present_in_data_table() throws InterruptedException {
			WebElement editA = classpage.EditA();
			Assert.assertFalse(editA.isDisplayed(), "Edit Icon should not be present in the first row of the data table");
			WebElement editB = classpage.EditB();
			Assert.assertFalse(editB.isDisplayed(), "Edit Icon should not be present in the second row of the data table");
			WebElement editC = classpage.EditC();
			Assert.assertFalse(editC.isDisplayed(), "Edit Icon should not be present in the third row of the data table");
		}
//#11
		@Then("Delete Icon in each row of data table only  when entries are available")
		public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() throws InterruptedException {
			WebElement deleteA = classpage.DeleteA();
			Assert.assertTrue(deleteA.isDisplayed(), "Delete Icon is not displayed on the first row of the data table");
			WebElement deleteB = classpage.DeleteB();
			Assert.assertTrue(deleteB.isDisplayed(), "Delete Icon is not displayed on the second row of the data table");
			WebElement deleteC = classpage.DeleteC();
			Assert.assertTrue(deleteC.isDisplayed(), "Delete Icon is not displayed on the third row of the data table");
		}
//#12
		@Then("Admin cant see delete  Icon in data table")
		public void admin_cant_see_delete_icon_in_data_table() throws InterruptedException {
			WebElement deleteA = classpage.DeleteA();
			Assert.assertFalse(deleteA.isDisplayed(), "Delete Icon should not be present in the first row of the data table");
			WebElement deleteB = classpage.DeleteB();
			Assert.assertFalse(deleteB.isDisplayed(), "Delete Icon should not be present in the second row of the data table");
			WebElement deleteC = classpage.DeleteC();
			Assert.assertFalse(deleteC.isDisplayed(), "Delete Icon should not be present in the third row of the data table");
		}
//#13
		@Then("Admin should see sort icon near the column headers except for Edit and Delete")
		public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() throws InterruptedException {
			WebElement batchidsort = classpage.BatchIdSort();
			Assert.assertTrue(batchidsort.isDisplayed(), "Batch Id Sort is not displayed on the class page");
			WebElement classnosort = classpage.ClassNoSort();
			Assert.assertTrue(classnosort.isDisplayed(), "Class No Sort is not displayed on the class page");
			WebElement classdatesort = classpage.ClassDateSort();
			Assert.assertTrue(classdatesort.isDisplayed(), "Class Date Sort is not displayed on the class page");
			WebElement classtopicsort = classpage.ClassTopicSort();
			Assert.assertTrue(classtopicsort.isDisplayed(), "Class Topic Sort is not displayed on the class page");
			WebElement staffidsort = classpage.StaffIdSort();
			Assert.assertTrue(staffidsort.isDisplayed(), "Staff Id Sort is not displayed on the class page");
			WebElement descriptionsort = classpage.DescriptionSort();
			Assert.assertTrue(descriptionsort.isDisplayed(), "Description Sort is not displayed on the class page");
			WebElement commentssort = classpage.CommentsSort();
			Assert.assertTrue(commentssort.isDisplayed(), "Comments Sort is not displayed on the class page");
			WebElement notessort = classpage.NotesSort();
			Assert.assertTrue(notessort.isDisplayed(), "Notes Sort is not displayed on the class page");
			WebElement recordingsort = classpage.RecordingSort();
			Assert.assertTrue(recordingsort.isDisplayed(), "Recording Sort is not displayed on the class page");
		}
//#14
		@Then("Admin should see check box in the all rows  of data table")
		public void admin_should_see_check_box_in_the_all_rows_of_data_table() throws InterruptedException {
			WebElement checkboxheader = classpage.CheckBoxHeader();
			Assert.assertTrue(checkboxheader.isDisplayed(), "Check Box is not displayed on the header of the data table");
			WebElement checkbox1 = classpage.CheckBox1();
			Assert.assertTrue(checkbox1.isDisplayed(), "Check Box is not displayed on the first row of the data table");
			WebElement  checkbox2 = classpage.CheckBox2();
			Assert.assertTrue(checkbox2.isDisplayed(), "Check Box is not displayed on the second row of the data table");
			WebElement checkbox3 = classpage.CheckBox3();
			Assert.assertTrue(checkbox3.isDisplayed(), "Check Box is not displayed on the third row of the data table");
		}
//#15
		@Then("Above the footer Admin should see the text as \"\"Showing x to y of z entries\"\" below the table.")
		public void above_the_footer_admin_should_see_the_text_as_showing_x_to_y_of_z_entries_below_the_table() throws IOException {
			Loggerload.info("Validating Number Entries");
			String expectedNumberEntry = NumberEntry();
			    String actualNumberEntry = classpage.NumberEntry();
			    Assert.assertEquals(expectedNumberEntry, actualNumberEntry);
			    
		}
//#16
		@Then("Admin should see the pagination controls under the data table")
		public void admin_should_see_the_pagination_controls_under_the_data_table() throws InterruptedException {
			Loggerload.info("Validating Pagination Control");
			WebElement pagination = classpage.Pagination();
			Assert.assertTrue(pagination.isDisplayed(), "Pagination Control is not displayed under the data table");
		}
//#17
		@Then("Admin should see the text with total number classes in the data table")
		public void admin_should_see_the_text_with_total_number_classes_in_the_data_table() throws IOException {
			Loggerload.info("Validating Number of Classes");
			String expectedNoofclasses = NoofClasses();
			    String actualNoofclasses = classpage.NoofClasses();
			    Assert.assertEquals(expectedNoofclasses, actualNoofclasses);
		}
//#18
		@Given("Admin is on Manage Class Page")
		public void admin_is_on_manage_class_page() throws IOException {
			Loggerload.info("Admin is on the Manage Class Page.Expected Url: "+ getClassURL() );
		    		
		}

		@When("Admin enters batch id into search box from {string} and {int}")
		public void admin_enters_batch_id_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Search Box Validation with Batch Id ");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
      		List<String> content = excel.getCellData(SheetName, 13, RowNumber);
			 classpage.Text(content);
		}

		@Then("Displays entries with that batch Id from {string} and {int}")
		public void displays_entries_with_that_batch_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
     		List<String> expectedbatchid = excel.getCellData(SheetName, 13, RowNumber);
     		String actualSearchresults = classpage.SearchResults();
     		for(String batchid:expectedbatchid)
     		{
     			assertThat(actualSearchresults, containsString(batchid));
     		}
     		   		    		
		}
//#19
		@When("Admin enters batch id which is not existing the table into search box from {string} and {int}")
		public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException{
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
     		List<String> content = excel.getCellData(SheetName, 14, RowNumber);
			 classpage.Text(content);
		}

		@Then("Displays empty details in the data table")
		public void displays_empty_details_in_the_data_table() {
			Loggerload.info(" Displaying Empty Data Table");
			boolean isDataTableEmpty = classpage.DataTableEmpty();

	        Assert.assertTrue(isDataTableEmpty, "Data table is not empty.");
		}
//#20
		@When("Admin enters class no into search box from {string} and {int}")
		public void admin_enters_class_no_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Search Box Validation with Class No");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
    		List<String> content = excel.getCellData(SheetName, 14, RowNumber);
			 classpage.Text(content);
		}

		@Then("Displays entries with that class no from {string} and {int}")
		public void displays_entries_with_that_class_no_from(String SheetName,Integer RowNumber) throws InterruptedException {
			
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
    		List<String> expectedclassno = excel.getCellData(SheetName, 14, RowNumber);
    		String actualSearchresults = classpage.SearchResults();
    		for(String data:expectedclassno)
    		{
    			assertThat(actualSearchresults, containsString(data));
    		}
		}
//#21		
		
		@When("Admin enters class no which is not existing the table into search box from {string} and {int}")
		public void admin_enters_class_no_which_is_not_existing_the_table_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException{
			Loggerload.info(" Displaying Empty Data Table");
		
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
    		List<String> content = excel.getCellData(SheetName, 14, RowNumber);
			 classpage.Text(content);
		}
//#22
		@When("Admin enters class topic into search box from {string} and {int}")
		public void admin_enters_class_topic_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException{
			Loggerload.info(" Search Box Validation with Class Topic");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> content = excel.getCellData(SheetName, 15, RowNumber);
			 classpage.Text(content);
		}
		
		@Then("Displays entries with that  class topic")
		public void displays_entries_with_that_class_topic_from(String SheetName,Integer RowNumber) throws InterruptedException{
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> expectedclasstopic = excel.getCellData(SheetName, 15, RowNumber);
   		String actualSearchresults = classpage.SearchResults();
   		for(String data:expectedclasstopic)
   		{
   			assertThat(actualSearchresults, containsString(data));
   		}
		}
//#23		
		@When("Admin enters class topic which is not existing the table into search box from {string} and {int}")
		public void admin_enters_class_topic_which_is_not_existing_the_table_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Displaying Empty Data Table");
			
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
    		List<String> content = excel.getCellData(SheetName, 16, RowNumber);
			 classpage.Text(content);
		}
//#24
		@When("Admin enters staff id into search box from {string} and {int}")
		public void admin_enters_staff_id_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException{
			Loggerload.info(" Search Box Validation with Staff Id");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> content = excel.getCellData(SheetName, 17, RowNumber);
			 classpage.Text(content);
		}

		@Then("Displays entries with that staff id from {string} and {int}")
		public void displays_entries_with_that_staff_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
  		List<String> expectedstaffid = excel.getCellData(SheetName, 17, RowNumber);
  		String actualSearchresults = classpage.SearchResults();
  		for(String data:expectedstaffid)
  		{
  			assertThat(actualSearchresults, containsString(data));
  		}
		}
//#25
		@When("Admin enters staff id which is not existing the table into search box from {string} and {int}")
		public void admin_enters_staff_id_which_is_not_existing_the_table_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException  {
              Loggerload.info(" Displaying Empty Data Table");
			
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
    		List<String> content = excel.getCellData(SheetName, 18, RowNumber);
			 classpage.Text(content);
		}
//#26
		@When("Admin enters class date into search box from {string} and {int}")
		public void admin_enters_class_date_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Search Box Validation with Staff Id");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> content = excel.getCellData(SheetName, 19, RowNumber);
			 classpage.Text(content);
		}

		@Then("Displays entries with that  class date from {string} and {int}")
		public void displays_entries_with_that_class_date_from(String SheetName,Integer RowNumber) throws InterruptedException {
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
 		List<String> expectedstaffid = excel.getCellData(SheetName, 19, RowNumber);
 		String actualSearchresults = classpage.SearchResults();
 		for(String data:expectedstaffid)
 		{
 			assertThat(actualSearchresults, containsString(data));
 		}
		}
//#27
		@When("Admin enters invalid class date into search box from {string} and {int}")
		public void admin_enters_invalid_class_date_into_search_box_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Search Box Validation with Staff Id");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> content = excel.getCellData(SheetName, 20, RowNumber);
			 classpage.Text(content);
		}
//#28		
		@When("Admin click +Add New Class button")
		public void admin_click_add_new_class_button() throws InterruptedException {
			Loggerload.info(" Navigating to Add Class page");
			classpage.Click_AddNew();
		}

		@Then("Admin should see a popup  with  heading class details")
		public void admin_should_see_a_popup_with_heading_class_details() {
			WebElement classdetails = classpage.ClassDetails();
			Assert.assertTrue(classdetails.isDisplayed(), "Class Details pop up not appeared");
		}
//#29
		@Then("Admin should see input fields Text")
		public void admin_should_see_input_fields_text() throws InterruptedException, IOException {
			Loggerload.info(" Validatind the fields in Class Details Page");
			WebElement batchid = classpage.Batchid();
			Assert.assertTrue(batchid.isDisplayed(), "Batch Id is not displayed on the class details page");
			WebElement classno = classpage.ClassNo();
			Assert.assertTrue(classno.isDisplayed(), "Class No is not displayed on the class details page");
			WebElement classdate = classpage.ClassDate();
			Assert.assertTrue(classdate.isDisplayed(), "Class Date is not displayed on the class details page");
			WebElement classtopic = classpage.ClassTopic();
			Assert.assertTrue(classtopic.isDisplayed(), "Class Topic is not displayed on the class details page");
			WebElement staffid = classpage.StaffId();
			Assert.assertTrue(staffid.isDisplayed(), "Staff Id is not displayed on the class details page");
			WebElement description = classpage.Description();
			Assert.assertTrue(description.isDisplayed(), "Description is not displayed on the class details page");
			WebElement comments = classpage.Comments();
			Assert.assertTrue(comments.isDisplayed(), "Comments is not displayed on the class details page");
			WebElement notes = classpage.Notes();
			Assert.assertTrue(notes.isDisplayed(), "Notes is not displayed on the class details page");
			WebElement recording = classpage.Recording();
			Assert.assertTrue(recording.isDisplayed(), "Recording is not displayed on the class details page");
			
					}
//#30
		@Then("{int} textbox should be  present in Class details popup window")
		public void textbox_should_be_present_in_class_details_popup_window(Integer NoofTextBoxes) throws InterruptedException {
			Loggerload.info(" Validatind the Number of Text Boxes in Class Details Page");
			List<WebElement> textboxes = classpage.TextBox();
		  int totaltextboxes = textboxes.size();
		  Assert.assertEquals(totaltextboxes, NoofTextBoxes,
		            "Number of textboxes in the popup window doesn't match the expected value.");
		}
//#31
		@Then("Admin should see  dropdown option for Batch ID")
		public void admin_should_see_dropdown_option_for_batch_id() throws InterruptedException {
			Loggerload.info(" Validatind the Batch id Drop down in Class Details Page");
			WebElement batchdropdown = classpage.BatchDropDown();
			Assert.assertTrue(batchdropdown.isDisplayed(), "Batch Id Drop Down is not displayed on the class details page");  
		}
//#32
		@Then("Admin should see  dropdown option for Staff Id")
		public void admin_should_see_dropdown_option_for_staff_id() throws InterruptedException {
			Loggerload.info(" Validatind the Staff id Drop down in Class Details Page");
			WebElement staffiddropdown = classpage.StaffDropDown();
			Assert.assertTrue(staffiddropdown.isDisplayed(), "Staff Id Drop Down is not displayed on the class details page");  
		}
//#33
		@Then("Admin should see  calendar icon for class date")
		public void admin_should_see_calendar_icon_for_class_date() throws InterruptedException {
			Loggerload.info(" Validatind the Calender Icon in Class Details Page");
			WebElement calender = classpage.Calender();
			Assert.assertTrue(calender.isDisplayed(), "Calender Icon is not displayed on the class details page");    
		}
//#34
		@Then("Admin should see  save button in the class detail popup window")
		public void admin_should_see_save_button_in_the_class_detail_popup_window() throws InterruptedException {
			Loggerload.info(" Validating the Save Button in Class Details Page");
			WebElement save = classpage.Save();
			Assert.assertTrue(save.isDisplayed(), "Save Button is not displayed on the class details page");    
		
		}
//#35
		@Then("Admin should see  cancel button in the class detail popup window")
		public void admin_should_see_cancel_button_in_the_class_detail_popup_window() throws InterruptedException {
			Loggerload.info(" Validatind the Cancel Button in Class Details Page");
			WebElement cancel = classpage.Cancel();
			Assert.assertTrue(cancel.isDisplayed(), "Cancel Button is not displayed on the class details page");    
		
		}
//#36q
		@Then("Admin should see  close button on the class details popup window")
		public void admin_should_see_close_button_on_the_class_details_popup_window() throws InterruptedException {
			Loggerload.info(" Validatind the Close Button in Class Details Page");
			WebElement close = classpage.Close();
			Assert.assertTrue(close.isDisplayed(), "Close Button is not displayed on the class details page");    
		}
//#37		
		@Given("Admin is in  class detail popup window")
		public void admin_is_in_class_detail_popup_window() throws IOException {
		String currentURL =DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = getAddClassURL();
			 Assert.assertEquals(expectedURL, currentURL);
			 Assert.assertNotNull(currentURL);
			 Assert.assertTrue(currentURL.startsWith("http://"));
			 if (!expectedURL.equals(currentURL))
			 {
				 Loggerload.info("Failed to reach the Class detail page.Expected Url: "+ expectedURL );
			 }
				
		}

		@When("Admin clicks  Batch ID dropdown")
		public void admin_clicks_batch_id_dropdown() throws InterruptedException {
		    classpage.Click_BatchDropDown();
		}

		@Then("Batch id in the drop down should match with Batch id manage batch page table")
		public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
			Loggerload.info("Comparing Batch Id from Drop Down and Data Table");
			String tablebatchid = classpage.DataTableBatchId();
		    List<WebElement> batchidoptions = classpage.BatchDropDownText();
		    if (tablebatchid.equals(batchidoptions.toString().trim())) {
	            System.out.println("Dropdown and table Batch Ids match.");
	        } else {
	            System.out.println("Dropdown and table Batch Ids do not match.");
	        }

		}
//#38
		@When("Admin enters all mandatory field values with valid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)from {string} and {int}")
		public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Entering Mandatory fields in Add Class Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> batchid = excel.getCellData(SheetName, 13, RowNumber);
   		List<String> classno = excel.getCellData(SheetName, 15, RowNumber);
   		List<String> classdate = excel.getCellData(SheetName, 17, RowNumber);
   		List<String> staffid = excel.getCellData(SheetName, 19, RowNumber);
   		
			 classpage.BatchIdDropDown(batchid);
			 classpage.ClassNoTextBox(classno);
			 classpage.ClassDateCalender(classdate);
			 classpage.StaffIdDropDown(staffid);
			 classpage.Click_Save();
			 
		}

		@Then("Admin should see new class details is added in the data table from {string} and {int}")
		public void admin_should_see_new_class_details_is_added_in_the_data_table_from(String SheetName,Integer RowNumber) throws InterruptedException {
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
  		List<String> batchid = excel.getCellData(SheetName, 13, RowNumber);
  		List<String> classno = excel.getCellData(SheetName, 15, RowNumber);
  		List<String> classdate = excel.getCellData(SheetName, 19, RowNumber);
  		List<String> staffid = excel.getCellData(SheetName, 21, RowNumber);  
  		String expectedfields = "Batch ID: " + batchid + ", Class Date: " + classdate +
                ", Class No: " + classno + ", Staff ID: " + staffid;
          List<String> addedFields = classpage.DataTable();
  		 Assert.assertEquals(expectedfields, addedFields,
		            "Admin shoukd not see added new class in the data table");
		}
	            
//#39
		@When("Admin enters all mandatory field values with invalid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id, )from {string} and {int}")
		public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Entering Mandatory fields in Add Class Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			 Thread.sleep(1000);
   		List<String> batchid = excel.getCellData(SheetName, 14, RowNumber);
   		List<String> classno = excel.getCellData(SheetName, 16, RowNumber);
   		List<String> classdate = excel.getCellData(SheetName, 20, RowNumber);
   		List<String> staffid = excel.getCellData(SheetName, 22, RowNumber);
   		
			 classpage.BatchIdDropDown(batchid);
			 classpage.ClassNoTextBox(classno);
			 classpage.ClassDateCalender(classdate);
			 classpage.StaffIdDropDown(staffid);
			 classpage.Click_Save();
		}

		@Then("Error message should appear in alert")
		public void error_message_should_appear_in_alert() throws IOException, InterruptedException {
		    String expectedErrormessage = ErrorMessage();
		    String actualErrorMessage = classpage.Alert();
		    assertTrue(actualErrorMessage.contains(expectedErrormessage));
		}
//#40
		@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)from {string} and {int}")
		public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Entering All fields in Add Class Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
   		List<String> batchid = excel.getCellData(SheetName, 14, RowNumber);
   		List<String> classno = excel.getCellData(SheetName, 16, RowNumber);
   		List<String> classtopic = excel.getCellData(SheetName, 18, RowNumber);
   		List<String> staffid = excel.getCellData(SheetName, 20, RowNumber);
   		List<String> description = excel.getCellData(SheetName,24, RowNumber);
   		List<String> notes = excel.getCellData(SheetName, 25, RowNumber);
   		List<String> comments = excel.getCellData(SheetName, 26, RowNumber);
   		List<String> recording = excel.getCellData(SheetName, 27, RowNumber);
   		List<String> classdate = excel.getCellData(SheetName, 22, RowNumber);

   		
			 classpage.BatchIdDropDown(batchid);
			 classpage.ClassNoTextBox(classno);
			 classpage.ClassDateCalender(classdate);
			 classpage.StaffIdDropDown(staffid);
			 classpage.ClassTopicTextBox(classtopic);
			 classpage.NotesTextBox(notes);
			 classpage.CommentsTextBox(comments);
			 classpage.RecordingTextBox(recording);
			 classpage.DescriptionTextBox(description);
			 classpage.Click_Save();

			 classpage.Click_Save();
		}
//#41
		@When("Admin enters with invalid data in optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)from {string} and {int}")
		public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Entering Invalid Data in Add Class Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
			List<String> classtopic = excel.getCellData(SheetName, 19, RowNumber);
			List<String> description = excel.getCellData(SheetName,28, RowNumber);
	   		List<String> notes = excel.getCellData(SheetName, 29, RowNumber);
	   		List<String> comments = excel.getCellData(SheetName, 30, RowNumber);
	   		List<String> recording = excel.getCellData(SheetName, 31, RowNumber);
	   		classpage.ClassTopicTextBox(classtopic);
			 classpage.NotesTextBox(notes);
			 classpage.CommentsTextBox(comments);
			 classpage.RecordingTextBox(recording);
			 classpage.DescriptionTextBox(description);
			 classpage.Click_Save();
		}
//#42
		@When("Admin enters  data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id)from {string} and {int}")
		public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Entering Missing Mandatory fields in Add Class Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
   		
   		List<String> classno = excel.getCellData(SheetName, 16, RowNumber);
   		List<String> classdate = excel.getCellData(SheetName, 20, RowNumber);
   		List<String> staffid = excel.getCellData(SheetName, 22, RowNumber);
   		
			 classpage.ClassNoTextBox(classno);
			 classpage.ClassDateCalender(classdate);
			 classpage.StaffIdDropDown(staffid);
			 classpage.Click_Save();
		}

		@Then("Batch Id is missing")
		public void batch_id_is_missing() throws InterruptedException, IOException {
			String expectedBatchidErrormessage = BatchIdError();
		    String actualBatchIdErrorMessage = classpage.Alert();
		    assertTrue(actualBatchIdErrorMessage.contains(expectedBatchidErrormessage));
		}
//#43
		@When("Admin enters data missing value in No of class and clicks save button \\(Batch ID ,Class Date, Staff Id,from {string} and {int})")
		public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
			Loggerload.info(" Entering Mandatory fields in Add Class Page");
			ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
   		List<String> batchid = excel.getCellData(SheetName, 14, RowNumber);
   		List<String> classdate = excel.getCellData(SheetName, 20, RowNumber);
   		List<String> staffid = excel.getCellData(SheetName, 22, RowNumber);
   		
			 classpage.BatchIdDropDown(batchid);
			 classpage.ClassDateCalender(classdate);
			 classpage.StaffIdDropDown(staffid);
			 classpage.Click_Save();
		}

		@Then("No of classes is missing")
		public void no_of_classes_is_missing() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters data missing value in  class date and clicks save button \\(Batch ID , No of Classes, Staff Id, )")
		public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("class date is missing")
		public void class_date_is_missing() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters data missing value in staff id and clicks save button \\(Batch ID , No of Classes, Class Date )")
		public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("staff id is missing")
		public void staff_id_is_missing() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
		public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("class cannot be  created for the passed date")
		public void class_cannot_be_created_for_the_passed_date() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks date from date picker")
		public void admin_clicks_date_from_date_picker() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("selected date should be their in class date text box")
		public void selected_date_should_be_their_in_class_date_text_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("selected date should be in  mm\\/dd\\/yyyy format")
		public void selected_date_should_be_in_mm_dd_yyyy_format() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks right arrow in the date picker near month")
		public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Next month calender should visible")
		public void next_month_calender_should_visible() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks left arrow in the date picker near month")
		public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("previous month calender should visible")
		public void previous_month_calender_should_visible() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("Admin is in class details popup window")
		public void admin_is_in_class_details_popup_window() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks date picker button")
		public void admin_clicks_date_picker_button() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see current date is highled in the date picker")
		public void admin_should_see_current_date_is_highled_in_the_date_picker() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks date picker button and selects future date")
		public void admin_clicks_date_picker_button_and_selects_future_date() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see selected date is highled in the date picker")
		public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks Cancel button without entering values in the fields")
		public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should land on Manage Class page")
		public void admin_should_land_on_manage_class_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks Cancel button entering values in the fields")
		public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
		public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


}