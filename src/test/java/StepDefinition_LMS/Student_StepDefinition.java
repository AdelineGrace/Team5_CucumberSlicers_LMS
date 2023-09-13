package StepDefinition_LMS;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static Utilities.ConfigReader.getStudentTitle;
import static Utilities.ConfigReader.getLMSTitle;
import static Utilities.ConfigReader.getProgramURL;
import static Utilities.ConfigReader.getStudentName;
import static Utilities.ConfigReader.getBatchId;
import static Utilities.ConfigReader.getBatchURL;
import static Utilities.ConfigReader.getStudentURL;

import static Utilities.ConfigReader.getClassURL;
import static Utilities.ConfigReader.getAssignmentURL;
import static Utilities.ConfigReader.getAttendanceURL;
import static Utilities.ConfigReader.getLoginURL;
import static Utilities.ConfigReader.getUserURL;

import Driver.DriverFactory;
import POM_LMS.Class_PageObject;
import POM_LMS.Student_PageObject;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_StepDefinition {
	WebDriver driver;
	Student_PageObject studentpage = new Student_PageObject(DriverFactory.getDriver()); 
//#1
	@When("Admin clicks Student on the navigation bar")
	public void admin_clicks_student_on_the_navigation_bar() throws InterruptedException {
		 Loggerload.info("Validating Page Title");
		studentpage.Click_Student();
	}

	@Then("Admin should see the Student details Page Title")
	public void admin_should_see_the_student_details_page_title() throws IOException, InterruptedException {
		String expectedTitle = getStudentTitle();
	  String  actualTitle = DriverFactory.getDriver().getTitle();
	    assertTrue(actualTitle.contains(expectedTitle));

	    
	}
//#2
	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) throws InterruptedException {
	   
		DriverFactory.getDriver().navigate().back();
	Thread.sleep(1000);
	long startTime = System.currentTimeMillis();
	studentpage.Click_Student();
	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("Response Time: " + totalTime + " milliseconds");
    long expectedResponseTime = 30;
    Assert.assertTrue(totalTime <= expectedResponseTime, "Response time is longer than expected");
	}
//#3	
	@Then("HTTP response >= {int} Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer responsecode) throws InterruptedException {
		DriverFactory.getDriver().navigate().back();
		studentpage.Click_Student();
		if (responsecode >= 400) {
            System.out.println("The link is broken (HTTP Status Code >= 400)");
        } else {
            System.out.println("The link is working (HTTP Status Code < 400)");

	}}
//#4
	@Then("Admin should see LMS -Learning management system as title Verify LMS title")
	public void admin_should_see_lms_learning_management_system_as_title_verify_lms_title() throws IOException, InterruptedException {
		String expectedTitle = getLMSTitle();
		  String  actualTitle = studentpage.LMS_title();
		    assertTrue(actualTitle.contains(expectedTitle));

	}
//#5
	@Then("Student Detail title should be in centre of the page")
	public void student_detail_title_should_be_in_centre_of_the_page() throws InterruptedException {
	    studentpage.Location_title();
	}
//#6
	@Then("{int} dropdowns should be present in the page")
	public void dropdowns_should_be_present_in_the_page(Integer int1) throws InterruptedException {
	    WebElement studentnamedropdown = studentpage.StudentNameDropDown();
		Assert.assertTrue(studentnamedropdown.isDisplayed(), "Student Name dropdown not present");

	}
//#7
	@Then("Admin should see search box inside the drop down")
	public void admin_should_see_search_box_inside_the_drop_down() throws InterruptedException {
		WebElement studentnamesearchbox = studentpage.StudentSearchBoxDropDown();
		Assert.assertTrue(studentnamesearchbox.isDisplayed(), "Student Name search box not present in the dropdown");
	}
//#8
	@Then("Admin should see search box inside batch id drop down")
	public void admin_should_see_search_box_inside_batch_id_drop_down() throws InterruptedException {
		WebElement batchidsearchboxdropdown = studentpage.BatchSearchBoxDropDown();
		Assert.assertTrue(batchidsearchboxdropdown.isDisplayed(), "Batch Id search box not present in the dropdown");
	}
//#9
	@Then("Admin should see correct spelling select student name")
	public void admin_should_see_correct_spelling_select_student_name() throws InterruptedException, IOException {
		String expectedsname = getStudentName();
				String actualsname = studentpage.StudentName();
		 Assert.assertEquals(expectedsname, actualsname,
		            "Student Name spelling is not correct");
	}
//#10
	@Then("Admin should see correct spelling select batch id text")
	public void admin_should_see_correct_spelling_select_batch_id_text() throws InterruptedException, IOException {
		String expectedname = getBatchId();
		String actualname = studentpage.BatchId();
 Assert.assertEquals(expectedname, actualname,
            "Batch Id name spelling is not correct.");
	}
//#11
	@Then("Admin should see only numbers inside batch id drop down")
	public void admin_should_see_only_numbers_inside_batch_id_drop_down() {
		boolean numbers =  studentpage.BatchDropDownText();
		Assert.assertTrue(numbers, "Batch id dropdown does not have only numbers");
	}
//#12
	@Then("Admin should see select student name in gray color")
	public void admin_should_see_select_student_name_in_gray_color() {
		boolean gray =  studentpage.StudentNameColor();
		Assert.assertTrue(gray, "Student Name is not in gray color");
	}
//#13
	@Then("Admin should see select batch ID in gray color")
	public void admin_should_see_select_batch_id_in_gray_color() {
		boolean gray =  studentpage.BatchIdColor();
		Assert.assertTrue(gray, "Batch Id is not in gray color");
	}
//#14
	@Then("Admin should see select student name in first")
	public void admin_should_see_select_student_name_in_first() throws InterruptedException {
		boolean first =  studentpage.FirstSearchBox();
		Assert.assertTrue(first, "Student Name box is not in first");
	}
//#15
	@Then("Admin should see select batch id in second")
	public void admin_should_see_select_batch_id_in_second() throws InterruptedException {
		boolean second =  studentpage.SecondSearchBox();
		Assert.assertTrue(second, "Batch Id box is not in second");
	}
//#16
	@Then("Admin should able to scroll down to select the name")
	public void admin_should_able_to_scroll_down_to_select_the_name() throws InterruptedException {
		boolean scroll =  studentpage.ScrollStudentBox();
		Assert.assertTrue(scroll, "Admin not able to scroll down to select the name");
	}
//#17
	@Then("Admin should able to scroll down to select the batch id")
	public void admin_should_able_to_scroll_down_to_select_the_batch_id() throws InterruptedException {
		boolean scroll =  studentpage.ScrollBatchBox();
		Assert.assertTrue(scroll, "Admin not able to scroll down to select the batch id");
	}
//#18	
	@Given("Admin is on student details page")
	public void admin_is_on_student_details_page() throws IOException {
		String expectedStudentUrl = getStudentURL();
		String actualStudentUrl = DriverFactory.getDriver().getCurrentUrl();
		 Assert.assertEquals(expectedStudentUrl, actualStudentUrl);
		 Assert.assertNotNull(actualStudentUrl);
		 Assert.assertTrue(actualStudentUrl.startsWith("http://"));
		 if (!expectedStudentUrl.equals(actualStudentUrl))
		 {
			 Loggerload.info("Failed to reach the Class page.Expected Url: "+ expectedStudentUrl );
		 }
	}

	@When("Admin select student name from the drop down")
	public void admin_select_student_name_from_the_drop_down() throws InterruptedException {
		boolean select =  studentpage.ScrollStudentBox();
	}

	@Then("Admin should not see select student name text")
	public void admin_should_not_see_select_student_name_text() throws InterruptedException {
		boolean isStudentVisible= studentpage.SelectedStudentTextBox();
        Assert.assertFalse(isStudentVisible, "The 'select student name' text is still visible.");
    }
//#19	

	@When("Admin select batch id from the drop down")
	public void admin_select_batch_id_from_the_drop_down() throws InterruptedException {
		boolean select =  studentpage.ScrollBatchBox();
	}

	@Then("Admin should not see select batch id text")
	public void admin_should_not_see_select_batch_id_text() throws InterruptedException {
		boolean isBatchVisible= studentpage.SelectedBatchTextBox();
        Assert.assertFalse(isBatchVisible, "The 'select batch id is still visible.");
	}
//#20
	@When("Admin clicks select student name and enters x alphabet in the search box")
	public void admin_clicks_select_student_name_and_enters_x_alphabet_in_the_search_box() throws InterruptedException {
	    studentpage.EntersStudentX();
	}

	@Then("Admin should see student name start with x is listed below")
	public void admin_should_see_student_name_start_with_x_is_listed_below() throws InterruptedException {
		boolean studentstartswithX= studentpage.StudentStartsWithX();
        Assert.assertTrue(studentstartswithX, "Student name doesn't start with X");
	}
//#21
	@When("Admin clicks select batch id and enter x number in the search box")
	public void admin_clicks_select_batch_id_and_enter_x_number_in_the_search_box() throws InterruptedException {
		studentpage.EntersBatchX();
	}

	@Then("Admin should see batch id start with x is listed below")
	public void admin_should_see_batch_id_start_with_x_is_listed_below() throws InterruptedException {
		boolean batchstartswithX= studentpage.BatchStartsWithX();
        Assert.assertTrue(batchstartswithX, "Batch Id doesn't start with X");
	}
//#22
	@When("Admin selects only student name from {string} and {int}")
	public void admin_selects_only_student_name_from(String SheetName,Integer RowNumber) throws InterruptedException {
		ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		
  		List<String> studentname = excel.getCellData(SheetName, 0, RowNumber);
           studentpage.StudentNameContent(studentname);
	}

	@Then("Student details should not be displayed")
	public void student_details_should_not_be_displayed() throws InterruptedException {
		boolean studentdetails= studentpage.StudentDetails();
        Assert.assertFalse(studentdetails, "Student Details are displayed");
	   
	}
//#23
	@When("Admin selects only batch id from {string} and {int}")
	public void admin_selects_only_batch_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		
  		List<String> batchid = excel.getCellData(SheetName, 1, RowNumber);
           studentpage.BatchIdContent(batchid);
	}

	
//#24
	@When("Admin selects student name and batch id from {string} and {int}")
	public void admin_selects_student_name_and_batch_id_from(String SheetName,Integer RowNumber) throws InterruptedException {
ExcelReader excel = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Team5_CucumberSlicers_LMS\\src\\test\\resources\\ExcelData\\LMS_excel.xlsx");
		
  		List<String> studentname = excel.getCellData(SheetName, 0, RowNumber);
  		List<String> batchid = excel.getCellData(SheetName, 1, RowNumber);
           studentpage.StudentNameContent(studentname);
           studentpage.BatchIdContent(batchid);
	}

	@Then("Particular student informations should be display")
	public void particular_student_informations_should_be_display() throws InterruptedException {
		boolean studentdetails= studentpage.StudentDetails();
        Assert.assertTrue(studentdetails, "Student Details are not displayed");
	}
//#25	
	@When("Admin clicks on program link on student page")
	public void admin_clicks_on_program_link_on_student_page() throws InterruptedException {
	    studentpage.Click_Program();
	}

	@Then("Admin is redirected to Program page")
	public void admin_is_redirected_to_program_page() throws IOException {
		String expectedProgramUrl = getProgramURL();
		String actualProgramUrl = DriverFactory.getDriver().getCurrentUrl();
		 Assert.assertEquals(expectedProgramUrl, actualProgramUrl);
		 Assert.assertNotNull(actualProgramUrl);
		 Assert.assertTrue(actualProgramUrl.startsWith("http://"));
		 if (!expectedProgramUrl.equals(actualProgramUrl))
		 {
			 Loggerload.info("Failed to reach the Program page.Expected Url: "+ expectedProgramUrl );
		 }
	}

	@When("Admin clicks on Batch link on student page")
	public void admin_clicks_on_batch_link_on_student_page() throws InterruptedException {
	   studentpage.Click_Batch();

	}

	@Then("Admin is redirected to Batch page")
	public void admin_is_redirected_to_batch_page() throws IOException {
		String expectedBatchUrl = getBatchURL();
		String actualBatchUrl = DriverFactory.getDriver().getCurrentUrl();
		 Assert.assertEquals(expectedBatchUrl, actualBatchUrl);
		 Assert.assertNotNull(actualBatchUrl);
		 Assert.assertTrue(actualBatchUrl.startsWith("http://"));
		 if (!expectedBatchUrl.equals(actualBatchUrl))
		 {
			 Loggerload.info("Failed to reach the Batch page.Expected Url: "+ expectedBatchUrl );
		 }
	}

	@When("Admin clicks on Class link on student page")
	public void admin_clicks_on_class_link_on_student_page() throws InterruptedException {
	    studentpage.Click_Class();
	}

	@Then("Admin is redirected to Class page")
	public void admin_is_redirected_to_class_page() throws IOException {
		String expectedClassUrl = getClassURL();
		String actualClassUrl = DriverFactory.getDriver().getCurrentUrl();
		 Assert.assertEquals(expectedClassUrl, actualClassUrl);
		 Assert.assertNotNull(actualClassUrl);
		 Assert.assertTrue(actualClassUrl.startsWith("http://"));
		 if (!expectedClassUrl.equals(actualClassUrl))
		 {
			 Loggerload.info("Failed to reach the Batch page.Expected Url: "+ expectedClassUrl );
		 }
	}

	@When("Admin clicks on User link on student page")
	public void admin_clicks_on_user_link_on_student_page() throws InterruptedException {
	    studentpage.Click_User();

	}

	@Then("Admin is redirected to User page")
	public void admin_is_redirected_to_user_page() throws IOException {
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

	@When("Admin clicks on Assignment link on student page")
	public void admin_clicks_on_assignment_link_on_student_page() throws InterruptedException {
	    studentpage.Click_Assignment();

	}

	@Then("Admin is redirected to Assignment page")
	public void admin_is_redirected_to_assignment_page() throws IOException {
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

	@When("Admin clicks on Attendance link on student page")
	public void admin_clicks_on_attendance_link_on_student_page() throws InterruptedException {
	    studentpage.Click_Attendance();

	}

	@Then("Admin is redirected to Attendance page")
	public void admin_is_redirected_to_attendance_page() throws IOException {
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

	@When("Admin clicks on Logout link on student page")
	public void admin_clicks_on_logout_link_on_student_page() throws InterruptedException {
	    studentpage.Click_Student();

	}

	@Then("Admin is redirected to Login page")
	public void admin_is_redirected_to_login_page() throws IOException {
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
