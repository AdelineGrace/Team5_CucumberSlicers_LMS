package StepDefinition_LMS;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driver.DriverFactory;
import POM_LMS.Attendance_PageObject;
import Utilities.ConfigReader;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Attendance_StepDefinition {
	WebDriver driver;
	Attendance_PageObject Attendancepage = new Attendance_PageObject(DriverFactory.getDriver());

	ConfigReader Config = new ConfigReader();

	@Given("Admin is in dashboard page after Login")
	public void admin_is_in_dashboard_page_after_login() throws IOException {
		DriverFactory.getDriver().get(ConfigReader.getDashboardURL());
		Loggerload.info("Website Opened");

	}

	@When("Admin clicks Assignment in the navigation bar")
	public void admin_clicks_assignment_in_the_navigation_bar() throws InterruptedException {
		Attendancepage.Click_Attendance();
	}

	@Then("Admin should see the Manage attendance from {string} and {int}")
	public void admin_should_see_the_manage_attendance_from(String SheetName, Integer RowNumber)
			throws IOException, InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);

		List<String> expectedAttendanceUrl = excel.getCellData(SheetName, 0, RowNumber);
		String actualAttendanceUrl = ConfigReader.getAttendanceURL();
		Assert.assertEquals(expectedAttendanceUrl, actualAttendanceUrl);
		Assert.assertNotNull(actualAttendanceUrl);
		Assert.assertTrue(actualAttendanceUrl.startsWith("http://"));
		if (!expectedAttendanceUrl.equals(actualAttendanceUrl)) {
			Loggerload.info("Failed to reach the Attendance page.Expected Url: " + expectedAttendanceUrl);
		}
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {

		long startTime = System.currentTimeMillis();
		long expectedResponseTime = int1;
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		Assert.assertTrue(totalTime <= expectedResponseTime);
		Loggerload.info("Response time is longer than expected" + totalTime);
	}

	@Then("HTTP response >= {int} after the link is broken from {string} and {int}")
	public void http_response_after_the_link_is_broken_from(String SheetName,Integer RowNumber) throws InterruptedException {

		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		Thread.sleep(1000);
		List<String> expectedField12 = excel.getCellData(SheetName, 12, RowNumber);
   int response = 400;
		Assert.assertTrue(Integer.parseInt(expectedField12.get(12)) <= response);
		Loggerload.info("HTTP response <=400");
	}

	@Then("Admin should see LMS -Learning management system  as title from {string} and {int}")
	public void admin_should_see_lms_learning_management_system_as_title_from(String SheetName,Integer RowNumber) throws IOException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> expectedAttendanceUrl = excel.getCellData(SheetName, 0, RowNumber);
		String actualAttendanceUrl = ConfigReader.getAttendanceURL();
		Assert.assertEquals(expectedAttendanceUrl, actualAttendanceUrl);
	}

	@Then("Manage attendance header should be in left side of the page")
	public void manage_attendance_header_should_be_in_left_side_of_the_page() {
		Loggerload.info(" Verify Manage attendance header in left side ");
		assertEquals("left", Attendancepage.Headerloaction());

	}

	@Then("Admin should see correct spelling for the all the fields from {string} and {int}")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_from(String SheetName, Integer RowNumber)
			throws IOException, InterruptedException {

		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		Thread.sleep(1000);

		List<String> expectedField1 = excel.getCellData(SheetName, 2, RowNumber);
		List<String> expectedField2 = excel.getCellData(SheetName, 3, RowNumber);
		List<String> expectedField3 = excel.getCellData(SheetName, 4, RowNumber);
		List<String> expectedField4 = excel.getCellData(SheetName, 5, RowNumber);
		List<String> expectedField5 = excel.getCellData(SheetName, 6, RowNumber);
		List<String> expectedField6 = excel.getCellData(SheetName, 7, RowNumber);
		List<String> expectedField7 = excel.getCellData(SheetName, 8, RowNumber);
		List<String> expectedField8 = excel.getCellData(SheetName, 9, RowNumber);
		List<String> expectedField9 = excel.getCellData(SheetName, 10, RowNumber);
		List<String> expectedField10 = excel.getCellData(SheetName, 11, RowNumber);
		String actualField1 = ConfigReader.AttendanceField1();
		String actualField2 = ConfigReader.AttendanceField2();
		String actualField3 = ConfigReader.AttendanceField3();
		String actualField4 = ConfigReader.AttendanceField4();
		String actualField5 = ConfigReader.AttendanceField5();
		String actualField6 = ConfigReader.AttendanceField6();
		String actualField7 = ConfigReader.AttendanceField7();
		String actualField8 = ConfigReader.AttendanceField8();
		String actualField9 = ConfigReader.AttendanceField9();
		String actualField10 = ConfigReader.AttendanceField10();
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

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) throws InterruptedException {

		WebElement delete_disable = Attendancepage.DeleteAll_Displayed();
		Assert.assertTrue("Delete icon is not displayed", delete_disable.isDisplayed());

		WebElement delete_enable = Attendancepage.DeleteAll_Enabled();
		Assert.assertFalse("Delete icon is not disabled", delete_enable.isEnabled());
	}

	@Then("Admin should see search bar on the attendance page")
	public void admin_should_see_search_bar_on_the_attendance_page() throws InterruptedException {
		Loggerload.info(" Verify search bar");
		WebElement search = Attendancepage.Search();
		Assert.assertTrue("Search bar is not displayed on the Attendance page", search.isDisplayed());
	}

	@Then("Admin should see +Add New Attendance button on the attendance page")
	public void admin_should_see_add_new_attendance_button_on_the_attendance_page() throws InterruptedException {
		Loggerload.info(" Verify +Add New Attendance button");
		WebElement addnew = Attendancepage.Addnew();
		Assert.assertTrue("+Add New Button is not displayed on the as page", addnew.isDisplayed());
	}

	@Then("Admin should see data table on the Manage Attendance Page With following column headers {string}")
	public void admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers(String string)
			throws InterruptedException {
		Loggerload.info(" Manage Attendance page verication ");
		WebElement ClassID = Attendancepage.ClassID();
		Assert.assertTrue("Batch Id is not displayed on the class page", ClassID.isDisplayed());
		WebElement StudentID = Attendancepage.StudentID();
		Assert.assertTrue("Class No is not displayed on the class page", StudentID.isDisplayed());
		WebElement Present = Attendancepage.Present();
		Assert.assertTrue("Class Date is not displayed on the class page", Present.isDisplayed());
		WebElement edit = Attendancepage.EditAttendance();
		Assert.assertTrue("Edit is not displayed on the class page", edit.isDisplayed());
		WebElement delete = Attendancepage.DeleteAttendance();
		Assert.assertTrue("Delete is not displayed on the class page", delete.isDisplayed());
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() throws InterruptedException {
		WebElement Edit = Attendancepage.EditAttendance();
		Assert.assertTrue("Edit Icon in each row of data table only  when entries are available", Edit.isDisplayed());
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() throws InterruptedException {
		Loggerload.info(" Verify Presence of Edit Icon");
		WebElement Edit = Attendancepage.EditAttendance();
		Assert.assertTrue("Edit Icon will not be present in data table", Edit.isDisplayed());

	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() throws InterruptedException {
		WebElement Delete = Attendancepage.DeleteAttendance();
		Assert.assertTrue("Delete Icon is not present", Delete.isDisplayed());

	}

	@Then("Admin cant see delete  Icon in data table")
	public void admin_cant_see_delete_icon_in_data_table() throws InterruptedException {
		WebElement Delete = Attendancepage.DeleteAttendance();
		Assert.assertFalse("delete  Icon not in data table", Delete.isDisplayed());
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete()
			throws InterruptedException {

		Loggerload.info(" Verify SortIcon ");
		WebElement SortIcon = Attendancepage.SortIcon();
		Assert.assertTrue(" sort icon is  not near the column headers except for Edit and Delete",
				SortIcon.isDisplayed());
		;
	}

	@Then("Admin should see check box in the all rows  of data table")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table() throws InterruptedException {
		Loggerload.info(" Verify check box ");
		WebElement Checkbox = Attendancepage.Checkbox();
		Assert.assertTrue("check box is not in the all rows  of data table", Checkbox.isDisplayed());
	}

	@Then("Above the footer Admin should see the text as {string} from {string} and {int}")
	public void above_the_footer_admin_should_see_the_text_as_from( String SheetName,Integer RowNumber) {
		Loggerload.info(" Verify Footer Entry text");
		 
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> expectedAttendanceFooterEntry = excel.getCellData(SheetName, 13, RowNumber);
		//Assert.assertEquals(expectedAttendanceFooterEntry, actualFooterEntry);
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() throws InterruptedException {
		Loggerload.info(" Verify Pagination control presence ");
		WebElement PaginationIcon = Attendancepage.PaginationIcon();
		Assert.assertTrue("Admin not see check box in the all rows  of data table", PaginationIcon.isDisplayed());
	}

	@Then("Admin should see the text with total number classes in the data table from {string} and {int}")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table_from(String SheetName, Integer RowNumber) {
		Loggerload.info(" Verify Footer Text");
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> expectedAttendanceFootertext = excel.getCellData(SheetName, 14, RowNumber);
		//Assert.assertEquals(expectedAttendanceFootertext, actualFooterText);
	}

	@When("Admin fills values Programname ,classname,studentname,Attendance,attendancedate and click save from {string} and {int}")
	public void admin_fills_values_programname_classname_studentname_attendance_attendancedate_and_click_save_from (String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);

		Attendancepage.ProgramNameDropDown();
		Attendancepage.ClassNameDropDown();
		Attendancepage.StudentNameDropDown();
		Attendancepage.AttendanceDropDown();
		Attendancepage.AttendanceDateDropDown();

		Attendancepage.Click_Save();
	}

	@When("Admin fills values and click save without program name from {string} and {int}")
	public void admin_fills_values_and_click_save_without_program_name_from(String SheetName,
			Integer RowNumber) throws InterruptedException {

		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");

		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);

		Attendancepage.ClassNameDropDown();
		Attendancepage.StudentNameDropDown();
		Attendancepage.AttendanceDropDown();
		Attendancepage.AttendanceDateDropDown();

		Attendancepage.Click_Save();

	}

	@When("Admin fills values  and click save  without class name from {string} and {int}")
	public void admin_fills_values_and_click_save_without_class_name_from(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);

		Attendancepage.ProgramNameDropDown();
		Attendancepage.StudentNameDropDown();
		Attendancepage.AttendanceDropDown();
		Attendancepage.AttendanceDateDropDown();

		Attendancepage.Click_Save();
	}

	@When("Admin fills values and click save without student name from {string} and {int}")
	public void admin_fills_values_and_click_save_without_student_name_from(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> Attendance = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);

		Attendancepage.ProgramNameDropDown();
		Attendancepage.ClassNameDropDown();
		Attendancepage.AttendanceDropDown();
		Attendancepage.AttendanceDateDropDown();

		Attendancepage.Click_Save();

	}

	@When("Admin fills values and click save without attendances from {string} and {int}")
	public void admin_fills_values_and_click_save_without_attendances_from(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);

		Attendancepage.ProgramNameDropDown();
		Attendancepage.ClassNameDropDown();
		Attendancepage.StudentNameDropDown();
		Attendancepage.AttendanceDateDropDown();

		Attendancepage.Click_Save();
	}

	@When("Admin fillsvalues and click save without attendancedate {string} from\"Attendance Detais\" and {int}")
	public void admin_fillsvalues_and_click_save_without_attendancedate_from_attendance_detais(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance = excel.getCellData(SheetName, 4, RowNumber);

		Attendancepage.ProgramNameDropDown();
		Attendancepage.ClassNameDropDown();
		Attendancepage.StudentNameDropDown();
		Attendancepage.AttendanceDropDown();

		Attendancepage.Click_Save();
	}

	@Then("Status is from {string} and {int}")
	public void status_is_from(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> Status = excel.getCellData(SheetName, 6, RowNumber);
		Attendancepage.statusmessage();

	}

	@Then("Status is status Program name is missing from {string} and {int}")
	public void status_is_status_program_name_is_missing_from(String SheetName, Integer RowNumber)
			throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> Status = excel.getCellData(SheetName, 7, RowNumber);
		Attendancepage.statusmessage();
	}

	@Then("Status is status  Class name is missing from {string} and {int}")
	public void status_is_status_class_name_is_missing_from(String SheetName, Integer RowNumber)
			throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> Status = excel.getCellData(SheetName, 8, RowNumber);
		Attendancepage.statusmessage();
	}

	@Then("Status is status  Student name is missing from {string} and {int}")
	public void status_is_status_student_name_is_missing_from(String SheetName, Integer RowNumber)
			throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> Status = excel.getCellData(SheetName, 9, RowNumber);
		Attendancepage.statusmessage();
	}

	@Then("Status is status Attendance is missing from {string} and {int}")
	public void status_is_status_attendance_is_missing_from_and(String SheetName, Integer RowNumber)
			throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> Status = excel.getCellData(SheetName, 10, RowNumber);
		Attendancepage.statusmessage();
	}

	@Then("Status is  Attendancedateis missing from {string} and {int}")
	public void status_is_attendancedateis_missing_from_and(String SheetName, Integer RowNumber)
			throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\ajith\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS.xlsx");
		List<String> Status = excel.getCellData(SheetName, 10, RowNumber);
		Attendancepage.statusmessage();
	}

//Attendance details popup window  verification

	@Given("Admin is in manage attendance page")
	public void admin_is_in_manage_attendance_page() throws IOException {
		DriverFactory.getDriver().get(ConfigReader.getAttendanceURL());
		Loggerload.info("##manage attendance page is opened##");
	}

	@When("Admin clicks + a new attendance button")
	public void admin_clicks_a_new_attendance_button() throws InterruptedException {
		Loggerload.info("Click +A New Attendance");
		Attendancepage.Click_AddNew();
	}

	@Then("Admin should see correct spellings in the label from {string} and {int}")
	public void admin_should_see_correct_spellings_in_the_label_from_and(String SheetName, Integer RowNumber)
			throws InterruptedException, IOException {
		Loggerload.info("Verify correct spellings in the label");
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		List<String> expectedField15 = excel.getCellData(SheetName, 15, RowNumber);
		String actualField15 = ConfigReader.AttendanceField15();
		Assert.assertEquals(expectedField15, actualField15);
	}

	@Then("{int} dropdown should be present")
	public void dropdown_should_be_present(Integer Actualcount) throws InterruptedException {
		int Count;
		for (Count = 1; Count <= Actualcount; Count++) {
			WebElement ProgramNameDropDown = Attendancepage.ProgramNameDropDown();

			WebElement ClassNameDropDown = Attendancepage.ClassNameDropDown();
			WebElement StudentNameDropDown = Attendancepage.StudentNameDropDown();
			WebElement AttendanceDropDown = Attendancepage.AttendanceDropDown();
			WebElement AttendanceDateDropDown = Attendancepage.AttendanceDateDropDown();

		}
		if (Count == Actualcount) {
			System.out.println("Actualcount drop down present.");
		} else {
			System.out.println("Actual count drop down not present");
		}

	}

	@Then("Admin should see  close button on the attendance details popup window")
	public void admin_should_see_close_button_on_the_attendance_details_popup_window() throws InterruptedException {
		Loggerload.info("Verify Colse button");

		WebElement Closebutton = Attendancepage.Close();
		Assert.assertTrue("Close button is not displayed on the Attendance details page", Closebutton.isDisplayed());
	}

	@Then("Close button should on the top right corner")
	public void close_button_should_on_the_top_right_corner() throws InterruptedException {

	}

	@Then("First dropdown box {string} text  should be present")
	public void first_dropdown_box_text_should_be_present(String string) throws InterruptedException {
		WebElement ProgramNameDropDown = Attendancepage.ProgramNameDropDown();
		Assert.assertTrue("ProgramNameDropDown is not displayed on the Attendance details page",
				ProgramNameDropDown.isDisplayed());
	}

	@Then("Second dropdown box {string} text  should be present")
	public void second_dropdown_box_text_should_be_present(String string) throws InterruptedException {
		WebElement ClassNameDropDown = Attendancepage.ClassNameDropDown();
		Assert.assertTrue("ClassNameDropDown is not displayed on the Attendance details page",
				ClassNameDropDown.isDisplayed());
	}

	@Then("Third dropdown box {string} text  should be present")
	public void third_dropdown_box_text_should_be_present(String string) throws InterruptedException {
		WebElement AttendanceDropDown = Attendancepage.AttendanceDropDown();
		Assert.assertTrue("AttendanceDropDown is not displayed on the Attendance details page",
				AttendanceDropDown.isDisplayed());
	}

	@Then("Fourth dropdown box {string} text  should be present")
	public void fourth_dropdown_box_text_should_be_present(String string) throws InterruptedException {
		WebElement AttendanceDateDropDown = Attendancepage.AttendanceDateDropDown();
		Assert.assertTrue("AttendanceDateDropDown is not displayed on the Attendance details page",
				AttendanceDateDropDown.isDisplayed());

	}

	@Then("Admin  should text in gray color")
	public void admin_should_text_in_gray_color() {
		String colorString = driver.findElement(By.id("foo")).getAttribute("Attendance");
		String[] arrColor = colorString.split("#");
		assertTrue(arrColor[1].equals("gray"));
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() throws InterruptedException {
		Loggerload.info(" Validating the Save Button in Attendance Details Page");
		WebElement save = Attendancepage.Save();
		Assert.assertTrue("Save Button is not displayed on the Attendance details page", save.isDisplayed());
	}

	@Then("Admin should see  cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() throws InterruptedException {
		Loggerload.info(" Validating the Save Button in Attendance Details Page");
		WebElement Cancel = Attendancepage.Cancel();
		Assert.assertTrue("Cancel Button is not displayed on the Attendance details page", Cancel.isDisplayed());
	}

	@Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.")
	public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date() {
		Point location1 = ((WebElement) Attendancepage.Student).getLocation();
		int x1 = location1.getX();
		int y1 = location1.getY();
		Point location2 = ((WebElement) Attendancepage.Program).getLocation();
		int x2 = location2.getX();
		int y2 = location1.getY();
		Point location3 = ((WebElement) Attendancepage.Batch).getLocation();
		int x3 = location3.getX();
		int y3 = location3.getY();
		Point location4 = ((WebElement) Attendancepage.Class).getLocation();
		int x4 = location4.getX();
		int y4 = location4.getY();
		Point location5 = ((WebElement) Attendancepage.User).getLocation();
		int x5 = location5.getX();
		int y5 = location5.getY();
		Point location6 = ((WebElement) Attendancepage.Assignment).getLocation();
		int x6 = location6.getX();
		int y6 = location6.getY();
		Point location7 = ((WebElement) Attendancepage.Attendance).getLocation();
		int x7 = location7.getX();
		int y7 = location7.getY();
		if (y1 < y2) {
			System.out.println("Student module in first position");

		}
		if (y2 < y3) {
			System.out.println("Program module is in second position");

		}
		if (y3 < y4) {
			System.out.println("Batch module in third position");

		}
		if (y4 < y5) {
			System.out.println("class module in forth position");

		}
		if (y5 < y6) {
			System.out.println("user module in fifth position");

		}
		if (y6 < y7) {
			System.out.println("Attendance module in sixth position");

		}

	}

//Attendance detailspopup 1
	@Given("Admin is in  attendance details popup window")
	public void admin_is_in_attendance_details_popup_window() throws IOException {
		String currentURL = DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = ConfigReader.getAttendanceURL();
		Assert.assertEquals(expectedURL, currentURL);
		Assert.assertNotNull(currentURL);
		Assert.assertTrue(currentURL.startsWith("http://"));
		if (!expectedURL.equals(currentURL)) {
			Loggerload.info("Failed to reach the Attendance detail page.Expected Url: " + expectedURL);
		}
	}

	@When("Admin clicks  program name dropdown")
	public void admin_clicks_program_name_dropdown() throws InterruptedException {

		Attendancepage.Click_ProgramNameDropDown();

	}

	@Then("Program Name in the drop down should match with  program name in  manage program page table")
	public void program_name_in_the_drop_down_should_match_with_program_name_in_manage_program_page_table() {
		Loggerload.info("Comparing Program Name from Drop Down and Data Table");
		String tableProgramName = Attendancepage.DataTableProgramName();
		List<WebElement> ProgramNameoptions = Attendancepage.ProgramNameDropDownText();
		if (tableProgramName.equals(ProgramNameoptions.toString().trim())) {
			System.out.println("Dropdown and table Program Names match.");
		} else {
			System.out.println("Dropdown and table Program Names do not match.");
		}
	}

	@When("Admin clicks class name dropdown")
	public void admin_clicks_class_name_dropdown() throws InterruptedException {
		Loggerload.info(" Verify class name dropdown");
		Attendancepage.Click_ClassNameDropDown();
	}

	@Then("ClassName in the drop down should match with  class name in  manage class page table")
	public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table() {
		Loggerload.info("Comparing Class Name from Drop Down and Data Table");
		String tableClassName = Attendancepage.DataTableClassName();
		List<WebElement> ClassNameoptions = Attendancepage.ProgramNameDropDownText();
		if (tableClassName.equals(ClassNameoptions.toString().trim())) {
			System.out.println("Dropdown and table ClassName match.");
		} else {
			System.out.println("Dropdown and table Class Name do not match.");
		}

	}

	@When("Admin clicks  Attendance dropdown")
	public void admin_clicks_attendance_dropdown() throws InterruptedException {
		Loggerload.info(" Verify Attendance dropdown");
		Attendancepage.Click_AttendanceDropDown();
	}

	@Then("Attendance field should have keywords such as - present, absent, late, excused")
	public void attendance_field_should_have_keywords_such_as_present_absent_late_excused() {
		Loggerload.info("Verify keywords such as - present, absent, late, excused in Attendance dropdown");
		String tableAttendance = Attendancepage.DataTableClassName();
		List<WebElement> Attendanceoptions = Attendancepage.AttendanceDropDownText();
		if (tableAttendance.equals(Attendanceoptions.toString().trim())) {
			System.out.println("Dropdown have keywords such as - present, absent, late, excused");
		} else {
			System.out.println("Dropdown doesn't have keywords such as - present, absent, late, excused");
		}
	}

	@Then("Admin should see correct spellings in dropdown text")
	public void admin_should_see_correct_spellings_in_dropdown_text() {
		Loggerload.info("Verify correct spellings in Attendance dropdown");
		String tableAttendance = Attendancepage.DataTableAttendance();
		List<WebElement> Attendanceoptions = Attendancepage.AttendanceDropDownText();
		Assert.assertEquals("Correct spelling", tableAttendance, Attendanceoptions.toString().trim());
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() throws InterruptedException {
		Loggerload.info(" Verify Attendance dropdown");
		Attendancepage.Click_AttendanceDateDropDown();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() throws InterruptedException {
		WebElement date = Attendancepage.AttendanceDate();
		Assert.assertTrue("Selected date is displayed in class data text box", date.isDisplayed());
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() throws InterruptedException, ParseException {
		Loggerload.info(" selected date should be in  mm\\\\/dd\\\\/yyyy format");

		String actualDateintextbox = Attendancepage.AttendanceDateTextBox();
		String formattedDate = Attendancepage.Date();
		Assert.assertEquals(actualDateintextbox, formattedDate, "Date format is not as expected");
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() throws InterruptedException {
		Loggerload.info(" Verify right arrow");
		Attendancepage.rightarrow_click();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() throws InterruptedException, ParseException {
		String nextmonth = Attendancepage.DateNextMonth();
		Assert.assertTrue("Next Month is not visible on the date picker of class details page",
				nextmonth.contains("MM"));
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() throws InterruptedException {
		Loggerload.info(" Admin clicks left arrow in the date picker near month");
		Attendancepage.DatePickerClick();
		Attendancepage.DatePickerLeftArrow();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() throws InterruptedException, ParseException {
		String previousmonth = Attendancepage.DatePreviousMonth();
		Assert.assertTrue("Previous Month is not visible on the date picker of class details page",
				previousmonth.contains("MM"));
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() throws InterruptedException {
		Loggerload.info("  clicks date picker button");
		Attendancepage.Click_Datepicker();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() throws InterruptedException {
		String currentdate = Attendancepage.CurrentDate();
		String datapickerdate = Attendancepage.DatePickerdate();
		Assert.assertTrue("current date is not  highlighted in the date picker", datapickerdate.contains(currentdate));
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() throws InterruptedException {
		Loggerload.info(" Admin validates future date in the date picker ");

		Attendancepage.DatePickerClick();
		Attendancepage.FutureDate();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() throws InterruptedException {
		String futuredate = Attendancepage.CurrentDate();
		String datapickerdate = Attendancepage.DatePickerdate();
		Assert.assertEquals(futuredate, datapickerdate, "Admin shoukd not see future date in the data picker");
	}

	@When("Admin fills values {string} ,{string},{string},{string},{string} and click {string}")
	public void admin_fills_values_and_click(String Programname, String classname, String studentname,
			String Attendance, String attendancedate, String Save) throws InterruptedException {
		Loggerload.info(" Admin fills values and click save ");
		Attendancepage.ProgramName().sendKeys(Programname);
		Attendancepage.ClassName().sendKeys(classname);
		Attendancepage.StudentName().sendKeys(studentname);
		Attendancepage.Attendance1().sendKeys(Attendance);
		Attendancepage.AttendanceDate().sendKeys(attendancedate);
		Attendancepage.Click_Save();

	}

	@Then("Status is {string}")
	public void status_is(String Message) {
		System.out.println("Getting message" + Message);

	}

	@When("Admin fills values missing Program name {string} and {string},{string},{string},{string} click save")
	public void admin_fills_values_missing_program_name_and_click_save(String Programname, String classname,
			String studentname, String Attendance, String attendancedate) throws InterruptedException {
		Attendancepage.ProgramName().sendKeys(Programname);
		Attendancepage.ClassName().sendKeys(classname);
		Attendancepage.StudentName().sendKeys(studentname);
		Attendancepage.Attendance1().sendKeys(Attendance);
		Attendancepage.AttendanceDate().sendKeys(attendancedate);
		Attendancepage.Click_Save();

	}

	@Then("Status is {string} Program name is missing")
	public void status_is_program_name_is_missing(String Message) {
		System.out.println("Getting message" + Message);

	}

	@When("Admin fills values  {string} and {string},{string},{string},{string} click save")
	public void admin_fills_values_and_click_save(String Programname, String classname, String studentname,
			String Attendance, String attendancedate) throws InterruptedException {
		Attendancepage.ProgramName().sendKeys(Programname);
		Attendancepage.ClassName().sendKeys(classname);
		Attendancepage.StudentName().sendKeys(studentname);
		Attendancepage.Attendance1().sendKeys(Attendance);
		Attendancepage.AttendanceDate().sendKeys(attendancedate);
		Attendancepage.Click_Save();
	}

	@When("Admin fills values missing {string} and {string},{string},{string},{string} click save")
	public void admin_fills_values_missing_and_click_save(String Programname, String classname, String studentname,
			String Attendance, String attendancedate) throws InterruptedException {
		Attendancepage.ProgramName().sendKeys(Programname);
		Attendancepage.ClassName().sendKeys(classname);
		Attendancepage.StudentName().sendKeys(studentname);
		Attendancepage.Attendance1().sendKeys(Attendance);
		Attendancepage.AttendanceDate().sendKeys(attendancedate);
		Attendancepage.Click_Save();
	}

	@When("Admin fills miss {string} and {string},{string},{string},\" <attendance date>\"click save")
	public void admin_fills_miss_and_attendance_date_click_save(String Programname, String classname,
			String studentname, String Attendance) throws InterruptedException {
		Attendancepage.ProgramName().sendKeys(Programname);
		Attendancepage.ClassName().sendKeys(classname);
		Attendancepage.StudentName().sendKeys(studentname);
		Attendancepage.Attendance1().sendKeys(Attendance);
		Attendancepage.Click_Save();
	}

	@Then("Status is {string}  Class name is missing")
	public void status_is_class_name_is_missing(String Message) {
		System.out.println("Getting message" + Message);
	}

	@Then("Status is {string}  Student name is missing")
	public void status_is_student_name_is_missing(String Message) {
		System.out.println("Getting message" + Message);

	}

	@Then("Status is {string} Attendance is missing")
	public void status_is_attendance_is_missing(String Message) {
		System.out.println("Getting message" + Message);

	}

	@Then("Class Name in the drop down should match with  class name in  manage classpage table")
	public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_classpage_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	/// Edit Attendance

	@When("Admin fills all the values from {string} and row number {int} click save")
	public void admin_fills_all_the_values_from_and_row_number_click_save(String SheetName, Integer RowNumber)
			throws InterruptedException {

		Loggerload.info("  fills all the values from Attendance Detais");
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance1 = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);
		Attendancepage.ProgramNameTextBox(ProgramName);
		Attendancepage.ClassNameTextBox(ClassName);
		Attendancepage.StudentNameTextBox(StudentName);
		Attendancepage.AttendanceTextBox(Attendance1);
		Attendancepage.DateTextBox(AttendanceDate);
		Attendancepage.Click_Save();
	}

	@Then("Admin should see success message in popup window and sees new attendance details in manage attendance details DB")
	public void admin_should_see_success_message_in_popup_window_and_sees_new_attendance_details_in_manage_attendance_details_db()
			throws InterruptedException {
		WebElement Sucesspopup = Attendancepage.Sucesspopup();
		Assert.assertTrue("Sucess message", Sucesspopup.isDisplayed());
	}

	@When("Admin fills values missing program name from {string} and row number {int} click save")
	public void admin_fills_values_missing_program_name_from_and_row_number_click_save(String SheetName,
			Integer RowNumber) throws InterruptedException {

		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance1 = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);
		Attendancepage.ClassNameTextBox(ClassName);
		Attendancepage.StudentNameTextBox(StudentName);
		Attendancepage.AttendanceTextBox(Attendance1);
		Attendancepage.DateTextBox(AttendanceDate);
		Attendancepage.Click_Save();
	}

	@When("Admin fills values missing class name from {string} and row number {int} click save")
	public void admin_fills_values_missing_class_name_from_and_row_number_click_save(String SheetName,
			Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance1 = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);
		Attendancepage.ProgramNameTextBox(ProgramName);
		Attendancepage.StudentNameTextBox(StudentName);
		Attendancepage.AttendanceTextBox(Attendance1);
		Attendancepage.DateTextBox(AttendanceDate);
		Attendancepage.Click_Save();
	}

	@When("Admin fills values missing student name from {string} and row number {int} click save")
	public void admin_fills_values_missing_student_name_from_and_row_number_click_save(String SheetName,
			Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> Attendance1 = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);
		Attendancepage.ProgramNameTextBox(ProgramName);
		Attendancepage.ClassNameTextBox(ClassName);
		Attendancepage.AttendanceTextBox(Attendance1);
		Attendancepage.DateTextBox(AttendanceDate);
		Attendancepage.Click_Save();
	}

	@When("Admin fills values missing attendance from {string} and row number {int} click save")
	public void admin_fills_values_missing_attendance_from_and_row_number_click_save(String SheetName,
			Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);
		Attendancepage.ClassNameTextBox(ClassName);
		Attendancepage.StudentNameTextBox(StudentName);
		Attendancepage.DateTextBox(AttendanceDate);
		Attendancepage.Click_Save();
	}

	@When("Admin fills values missing attendance date from {string} and row number {int} click save")
	public void admin_fills_values_missing_attendance_date_from_and_row_number_click_save(String SheetName,
			Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance1 = excel.getCellData(SheetName, 4, RowNumber);
		Attendancepage.ClassNameTextBox(ClassName);
		Attendancepage.StudentNameTextBox(StudentName);
		Attendancepage.AttendanceTextBox(Attendance1);
		Attendancepage.Click_Save();
	}

	@When("Admin fills values with future date from {string} and row number {int} click save")
	public void admin_fills_values_with_future_date_from_and_row_number_click_save(String SheetName, Integer RowNumber)
			throws InterruptedException {
		ExcelReader excel = new ExcelReader(
				"C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		Thread.sleep(1000);
		List<String> ProgramName = excel.getCellData(SheetName, 1, RowNumber);
		List<String> ClassName = excel.getCellData(SheetName, 2, RowNumber);
		List<String> StudentName = excel.getCellData(SheetName, 3, RowNumber);
		List<String> Attendance1 = excel.getCellData(SheetName, 4, RowNumber);
		List<String> AttendanceDate = excel.getCellData(SheetName, 5, RowNumber);
		Attendancepage.ClassNameTextBox(ClassName);
		Attendancepage.StudentNameTextBox(StudentName);
		Attendancepage.AttendanceTextBox(Attendance1);
		Attendancepage.DateTextBox(AttendanceDate);
		Attendancepage.Click_Save();
	}

	@Then("Program name is missing")
	public void program_name_is_missing() throws InterruptedException {
		WebElement classno = Attendancepage.ProgramName();
		Assert.assertTrue("Program name is missing", classno.isDisplayed());
	}

	@Then("class name is missing")
	public void class_name_is_missing() throws InterruptedException {
		WebElement classname = Attendancepage.ClassName();
		Assert.assertTrue("Program name is missing", classname.isDisplayed());
	}

	@Then("student name is missing")
	public void student_name_is_missing() throws InterruptedException {
		WebElement StudentName = Attendancepage.StudentName();
		Assert.assertTrue("Student name is missing", StudentName.isDisplayed());
	}

	@Then("Attendance is missing")
	public void attendance_is_missing() throws InterruptedException {
		WebElement Attendance1 = Attendancepage.StudentName();
		Assert.assertTrue("Attendance name is missing", Attendance1.isDisplayed());
	}

	@Then("Attendance date is missing")
	public void attendance_date_is_missing() throws InterruptedException {
		WebElement AttendanceDate = Attendancepage.StudentName();
		Assert.assertTrue("Attendance name is missing", AttendanceDate.isDisplayed());
	}

	@Then("Invalidate attendance date")
	public void invalidate_attendance_date() throws InterruptedException {
		Loggerload.info(" Invalid attendance date");
		String futuredate = Attendancepage.CurrentDate();
		String datapickerdate = Attendancepage.DatePickerdate();
		Assert.assertEquals(futuredate, datapickerdate, "Admin shoukd not see future date in the data picker");
	}

////Delete Attendance
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() throws InterruptedException {
		Loggerload.info("  clicks delete button in data table row ");
		Attendancepage.Click_Delete1();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() throws InterruptedException {
		Loggerload.info(" see  confirm alert ");
		Attendancepage.Confirm_Displayed();
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String Yes) throws InterruptedException {
		Loggerload.info(" Verify Yes Button ");
		Assert.assertEquals(Yes, Attendancepage.ConfirmYes());
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String No) throws InterruptedException {
		Loggerload.info(" Verify No Button ");
		Assert.assertEquals(No, Attendancepage.ConfirmNo());
	}

	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() throws InterruptedException {
		Loggerload.info(" see  delete alert ");
		Attendancepage.Confirm_Displayed();
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() throws InterruptedException {
		Loggerload.info("  clicks yes button");
		Attendancepage.Click_ConfirmYes();
	}

	@Then("Success message and selected attendance details are deleted from the data table")
	public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table()
			throws InterruptedException {
		Loggerload.info(" Class Id deleted sucess message");
		Attendancepage.confirmmesage();
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() throws InterruptedException {
		Loggerload.info("clicks no button ");
		Attendancepage.Click_ConfirmNo();
	}

	@Then("Redirected attendance page and selected attendance details are not deleted from the data table")
	public void redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table()
			throws InterruptedException {
		Attendancepage.Manage_Attendance();
	}

///Delete multiple attendance***

	@Then("Success message and selected attendance detail are deleted from the data table")
	public void success_message_and_selected_attendance_detail_are_deleted_from_the_data_table()
			throws InterruptedException {
		Loggerload.info("Success message and selected attendance detail are deleted from the data table");
		Attendancepage.Sucessmesg();
		Loggerload.info(" Displaying Empty Data Table");
		boolean isDataTableEmpty = Attendancepage.DataTableEmpty();

		Assert.assertTrue("Data table is not empty.", isDataTableEmpty);
	}

	@Then("Redirected to attendance page and selected attendance details are not deleted from the data table")
	public void redirected_to_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table()
			throws InterruptedException {

		Loggerload.info(" Displaying Empty Data Table");
		boolean isDataTableEmpty = Attendancepage.DataTableEmpty();

		Assert.assertTrue("Data table is empty.", isDataTableEmpty);
	}

	@Then("Success message and validate particular attendance details are deleted from the data table")
	public void success_message_and_validate_particular_attendance_details_are_deleted_from_the_data_table() {
		Loggerload.info(" Displaying Empty Data Table");
		boolean isDataTableEmpty = Attendancepage.DataTableEmpty();

		Assert.assertTrue("Data table is not empty.", isDataTableEmpty);

	}

	@When("Admin clicks single  rowlevel check box in the data table")
	public void admin_clicks_single_rowlevel_check_box_in_the_data_table() throws InterruptedException {
		Attendancepage.Click_checkbox1();
	}

	@Then("Admin should see deleteicon below the header is enabled")
	public void admin_should_see_deleteicon_below_the_header_is_enabled() throws InterruptedException {
		WebElement Delete_Enabled = Attendancepage.DeleteAll_Enabled();
		Assert.assertTrue("table pagination controls is not Disabled", Delete_Enabled.isDisplayed());
	}

	@When("Admin clicks single  row level checkbox in the data table")
	public void admin_clicks_single_row_level_checkbox_in_the_data_table() throws InterruptedException {
		Attendancepage.Click_checkbox2();
	}

	@Then("Admin should see tick mark in check box")
	public void admin_should_see_tick_mark_in_check_box() throws InterruptedException {
		Attendancepage.Tickmark1();
	}

	@When("Admin clicks multiple row level check box in the data table")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table() throws InterruptedException {
		Attendancepage.Click_checkbox1();
		Attendancepage.Click_checkbox2();

	}

	@Then("Admin should see tickmark in check box  of the selectedrows")
	public void admin_should_see_tickmark_in_check_box_of_the_selectedrows() throws InterruptedException {
		Attendancepage.Tickmark1();
		Attendancepage.Tickmark2();
	}

////Pagination***
	@When("Admin clicks {string} button on the navigation bar")

	public void admin_clicks_button_on_the_navigation_bar(String string) throws InterruptedException {
		Loggerload.info("clicks attendance button on the navigation bar");

		Attendancepage.Click_Attendance();
	}

	@Then("Data table should display {int} page  when entries available")
	public void data_table_should_display_page_when_entries_available(Integer int1)
			throws InterruptedException, IOException {
		WebElement ClassId = Attendancepage.ClassID();
		Assert.assertTrue("ClassId is not displayed on the class page", ClassId.isDisplayed());
		WebElement StudentId = Attendancepage.StudentID();
		Assert.assertTrue("StudentId is not displayed on the class page", StudentId.isDisplayed());
		WebElement Present = Attendancepage.Present();
		Assert.assertTrue(Present.isDisplayed());
		WebElement EditAttendance = Attendancepage.EditAttendance();
		Assert.assertTrue("EditAttendance not displayed on the class page", EditAttendance.isDisplayed());
		Loggerload.info("Validating Number Entries");

		String expectedNumberEntry = Config.actualNumberEntryText();
		String actualNumberEntry = Attendancepage.NumberEntry();
		Assert.assertEquals(expectedNumberEntry, actualNumberEntry);
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer Entrycount) {
		if (Entrycount > 5) {
			WebElement PaginationRightArrow_Enabled = Attendancepage.PaginationRightArrow_Enabled();
			Assert.assertFalse("Delete icon is not disabled", PaginationRightArrow_Enabled.isEnabled());
		}
	}

	@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer Entrycount) {
		if (Entrycount > 5) {
			WebElement PaginationLefttArrow_Enabled = Attendancepage.PaginationLefttArrow_Enabled();
			Assert.assertFalse("Delete icon is not disabled", PaginationLefttArrow_Enabled.isEnabled());
		}
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer Count) {
		if (Count > 5) {
			WebElement PaginationRightArrow_Enabled = Attendancepage.PaginationRightArrow_Enabled();
			Assert.assertFalse("Delete icon is not disabled", PaginationRightArrow_Enabled.isEnabled());
		}
	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
		WebElement PaginationLefttArrow_Enabled = Attendancepage.PaginationLefttArrow_Enabled();
		Assert.assertFalse("Delete icon is not disabled", PaginationLefttArrow_Enabled.isEnabled());
	}

	@Then("entries are more than {int} in data table pagination controls enabled")
	public void entries_are_more_than_in_data_table_pagination_controls_enabled(Integer Count)
			throws InterruptedException {
		if (Count > 5) {
			WebElement Pagination_Enabled = Attendancepage.PaginationIcon();
			Assert.assertFalse("table pagination controls is not enabled", Pagination_Enabled.isEnabled());
		}
	}

	@Then("entries are less than {int} in data table pagination controls disabled")
	public void entries_are_less_than_in_data_table_pagination_controls_disabled(Integer Count)
			throws InterruptedException {
		if (Count < 5) {

			WebElement Pagination_Disbled = Attendancepage.PaginationIcon();
			Assert.assertTrue("table pagination controls is not Disabled", Pagination_Disbled.isDisplayed());

		}
	}

	@Then("Data table should displaypage {int} when entriesavailable")
	public void data_table_should_displaypage_when_entriesavailable(Integer NumberEntry) {
		Loggerload.info("Validating Number Entries");
		String expectedNumberEntry = String.valueOf(NumberEntry);
		String actualNumberEntry = Attendancepage.NumberEntry();
		Assert.assertEquals(expectedNumberEntry, actualNumberEntry);
	}

///Pagination 1

	@Given("Admin is in add attendance details popup window")
	public void admin_is_in_add_attendance_details_popup_window() throws IOException {
		String currentURL = DriverFactory.getDriver().getCurrentUrl();
		String expectedURL = Config.getAddAttendanceURL();
		Assert.assertEquals(expectedURL, currentURL);
		Assert.assertNotNull(currentURL);
		Assert.assertTrue(currentURL.startsWith("http://"));
		if (!expectedURL.equals(currentURL)) {
			Loggerload.info("Failed to reach the Attendance detail page.Expected Url: " + expectedURL);
		}

	}

	@When("Admin creates {int} new attendance")
	public void admin_creates_new_attendance(Integer Actual) throws InterruptedException {

		String entry = Attendancepage.NumberEntry();
		Assert.assertEquals(entry, Actual);
		Loggerload.info(" Navigating to Add Class page");
		Attendancepage.Click_AddNew();
	}

	@Then("total attendance entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void total_attendance_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(
			Integer Count, Integer int2) {
		String entry = Attendancepage.NumberEntry();

		if (Integer.parseInt(entry) > Count) {
			WebElement PaginationLefttArrow_Enabled = Attendancepage.PaginationLefttArrow_Enabled();
			Assert.assertFalse("Next page is not enabled", PaginationLefttArrow_Enabled.isEnabled());

		}

	}

	@When("Admin creates less than or equal to {int} new attendance")
	public void admin_creates_less_than_or_equal_to_new_attendance(Integer Count) {
		String entry = Attendancepage.NumberEntry();
		if (Integer.parseInt(entry) <= Count) {
			WebElement PaginationLefttArrow_Enabled = Attendancepage.PaginationLefttArrow_Enabled();
			Assert.assertFalse("Next page is not enabled", PaginationLefttArrow_Enabled.isEnabled());

		}
	}

	@Then("total attendance entries  {int} or below next page is disabled")
	public void total_attendance_entries_or_below_next_page_is_disabled(Integer int1) throws InterruptedException {
		WebElement Pagination_Disbled = Attendancepage.PaginationIcon();
		Assert.assertTrue("next page is not Disabled", Pagination_Disbled.isDisplayed());

	}

////Navigation

	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String string) throws IOException, InterruptedException {
		Loggerload.info(" Click  on Student Page");

		Attendancepage.Click_Studentpage();
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() throws IOException {
		Loggerload.info(" Land on Student Page");
		Config.getStudentpage();
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() throws IOException, InterruptedException {
		Attendancepage.Click_Program();
		Loggerload.info(" Land on Program Page");
		Config.getProgrampage();
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() throws IOException, InterruptedException {
		Attendancepage.Click_Batch();

		Loggerload.info(" Land on Batch Page");
		Config.getBatche();
	}

	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() throws IOException, InterruptedException {
		Attendancepage.Click_User();
		Loggerload.info(" Land on user Page");
		Config.getUser();
	}

	@Then("Admin should able to land on Assignment page")
	public void admin_should_able_to_land_on_assignment_page() throws IOException, InterruptedException {
		Attendancepage.Click_Assignment();
		Loggerload.info(" Land on Assignment Page");
		Config.getAssignment();
	}

	@Then("Admin should able to land on class page")
	public void admin_should_able_to_land_on_class_page() throws IOException, InterruptedException {
		Attendancepage.Click_Class();
		Loggerload.info(" Land on class Page");
		Config.get_Class();

	}

	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() throws IOException {
		Loggerload.info(" Land on login Page");
		Config.get_Login();
	}

}
