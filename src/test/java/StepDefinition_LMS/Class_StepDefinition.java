package StepDefinition_LMS;
import static Utilities.ConfigReader.getClassURL;
import static Utilities.ConfigReader.getDashboardURL;


import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import Driver.DriverFactory;
import POM_LMS.Class_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.*;
	public class Class_StepDefinition
	{
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
		public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
			
		}
		@Then("Admin should see header with {string}")
		public void admin_should_see_header_with(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
		public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see correct spelling for the all the fields")
		public void admin_should_see_correct_spelling_for_the_all_the_fields() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see disabled delete icon below the {string}")
		public void admin_should_see_disabled_delete_icon_below_the(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see search bar on the class page")
		public void admin_should_see_search_bar_on_the_class_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see +Add New Class button on the class page")
		public void admin_should_see_add_new_class_button_on_the_class_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see data table on the Manage Class Page With following column headers")
		public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Edit Icon in each row of data table only  when entries are available")
		public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Edit Icon will not be present in data table")
		public void edit_icon_will_not_be_present_in_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Delete Icon in each row of data table only  when entries are available")
		public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin cant see delete  Icon in data table")
		public void admin_cant_see_delete_icon_in_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see sort icon near the column headers except for Edit and Delete")
		public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see check box in the all rows  of data table")
		public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Above the footer Admin should see the text as \"\"Showing x to y of z entries\"\" below the table.")
		public void above_the_footer_admin_should_see_the_text_as_showing_x_to_y_of_z_entries_below_the_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see the pagination controls under the data table")
		public void admin_should_see_the_pagination_controls_under_the_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Admin should see the text with total number classes in the data table")
		public void admin_should_see_the_text_with_total_number_classes_in_the_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("Admin is on Manage Class Page")
		public void admin_is_on_manage_class_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters batch id into search box")
		public void admin_enters_batch_id_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Displays entries with that batch Id")
		public void displays_entries_with_that_batch_id() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters batch id which is not existing the table into search box")
		public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Displays empty details in the data table")
		public void displays_empty_details_in_the_data_table() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters class no into search box")
		public void admin_enters_class_no_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Displays entries with that class no")
		public void displays_entries_with_that_class_no() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters class no which is not existing the table into search box")
		public void admin_enters_class_no_which_is_not_existing_the_table_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters class topic into search box")
		public void admin_enters_class_topic_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Displays entries with that  class topic")
		public void displays_entries_with_that_class_topic() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters class topic which is not existing the table into search box")
		public void admin_enters_class_topic_which_is_not_existing_the_table_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters staff id into search box")
		public void admin_enters_staff_id_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Displays entries with that staff id")
		public void displays_entries_with_that_staff_id() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters staff id which is not existing the table into search box")
		public void admin_enters_staff_id_which_is_not_existing_the_table_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters class date into search box")
		public void admin_enters_class_date_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Displays entries with that  class date")
		public void displays_entries_with_that_class_date() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Admin enters invalid class date into search box")
		public void admin_enters_invalid_class_date_into_search_box() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

}