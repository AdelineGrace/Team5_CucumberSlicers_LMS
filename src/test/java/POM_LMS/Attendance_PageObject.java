package POM_LMS;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

public class Attendance_PageObject {
	public By Attendance = By.xpath("//button[@type='button'][text()='Attendance']");
	By ManageAttendance = By.xpath("//a[text()='ManageAttendance']");
	By DeleteAll = By.xpath("//a[text()='DeleteAll']");
	By Search = By.xpath("//a[text()='Search']");
	By AddNew = By.xpath("//button[@type='button'][text()='Add New']");
	By ClassID = By.xpath("//*[@id='Class ID ']/tbody/tr[1]/td[0]");
	By StudentID = By.xpath("//*[@id='StudentID']/tbody/tr[2]/tr[1]/td[0]");
	By Present = By.xpath("//*[@id='Present']/tbody/tr[1]/td[0]");
	By EditAttendance = By.xpath("//a[text()='Edit']");
	By NumberEntry = By.xpath("//form[@id='entry_form']");
	By DatePickerRightArrow = By.cssSelector(".date-picker .right-arrow");
	By DatePickerLeftArrow = By.cssSelector(".date-picker .left-arrow");
	By tickmark1 = By.xpath("//*[@value='Manual Tester1']");
	By tickmark2 = By.xpath("//*[@value='Manual Tester2']");
	By DeleteAttendance = By.xpath("//a[text()='Delete']");
	By Sucessmesg = By.xpath("\"//*[@id=’Sucessmesg’]/tbody/tr[3]/td[2]/td[1]");
	By Checkbox = By.xpath("\"//*[@id=’Checkbox’]/tbody/tr[1]/td[6]");
	By SortIcon = By.xpath("//*[@id='Present']/tbody/tr[3]/td[2]/td[1]/td[0]");
	By PaginationIcon = By.xpath("//*[@id='Present']/tbody/tr[4]/td[3]/td[1]/td[0]");
	By ProgramName = By.xpath("//*[@id=’ProgramName’]/tbody/tr[1]/td[7]");;
	By ClassName = By.xpath("//*[@id=’ClassName’]/tbody/tr[1]/td[6]");
	By StudentName = By.xpath("//*[@id=’StudentName’]/tbody/tr[1]/td[8]");
	By Attendance1 = By.xpath("//*[@id=’Attendance1’]/tbody/tr[1]/td[9]");
	By AttendanceDate = By.xpath("//*[@id=’AttendanceDate’]/tbody/tr[1]/td[10]");
	By Delete1 = By.xpath("//*[@id=’Delete1’]/tbody/tr[1]/td[1]");
	By Delete2 = By.xpath("//*[@id=’Delete2’]/tbody/tr[1]/td[1]");
	By Checkbox1 = By.xpath("//*[@id=’Checkbox1’]/tbody/tr[1]/td[1]");
	By Checkbox2 = By.xpath("//*[@id=’Checkbox2’]/tbody/tr[1]/td[1]");
	By ProgramNameTextBox = By.xpath("//input[@class='ProgramName']");
	By ClassNameTextBox = By.xpath("//input[@class='ClassName']");
	By StudentNameTextBox = By.xpath("//input[@class='StudentName']");
	By AttendanceTextBox = By.xpath("//input[@class='Attendance']");
	By DateTextBox = By.xpath("//input[@class='Date']");
	By AttendanceDateTextBox = By.xpath("//input[@class='AttendanceDate']");
	By statusmsg = By.xpath("//input[@class='statusmsg']");

	By Sucesspopup = By.xpath("//*[@id=’Sucesspopup’]/tbody/tr[1]/td[10]");
	By ProgramNameDropDown = By.xpath("//a[@class='ProgramName-toggle']");
	By ClassNameDropDown = By.xpath("//a[@class='ClassName-toggle']");
	By StudentNameDropDown = By.xpath("//a[@class='StudentName-toggle']");
	By AttendanceDropDown = By.xpath("//a[@class=' Attendance-toggle']");
	By AttendanceDateDropDown = By.xpath("//a[@class='AttendanceDate-toggle']");
	By Close = By.xpath("//a[text()='Close']");
	By Save = By.xpath("//a[text()='Save']");
	By Cancel = By.xpath("//a[text()='Cancel']");
	By Confirm = By.cssSelector("Confirm-popup input[type='text']");
	By ConfirmYes = By.cssSelector("ConfirmYes-popup input[type='text']");
	By ConfirmNo = By.cssSelector("ConfirmNo-popup input[type='text']");
	By confirmmesage = By.cssSelector("confirmmesage input[type='text']");
	By Pagination = By.xpath("//form[@id='control']");
	By DataTable = By.xpath("//*[@id=’customers’]/tbody/tr/td");
	By Datepicker = By.xpath("//*[@id=’Datepicker’]/tbody/tr[1]/td[10]");
	By rightarrow = By.xpath("//a[@class='rightarrow']");
	By PaginationRightArrow = By.cssSelector(".date-picker .right-arrow");
	By PaginationLeftArrow = By.cssSelector(".date-picker .left-arrow");
	By Calender = By.xpath("//table[@class='calendar-table']");
	public By Student = By.xpath("//*[@id=’Student’]/tbody/tr[1]/td[7]");;
	public By Program = By.xpath("//*[@id=’Program’]/tbody/tr[1]/td[6]");
	public By Batch = By.xpath("//*[@id=’Batch’]/tbody/tr[1]/td[8]");
	public By Class = By.xpath("//*[@id=’Class’]/tbody/tr[1]/td[9]");
	public By User = By.xpath("//*[@id=’User’]/tbody/tr[1]/td[10]");
	public By Assignment = By.xpath("//*[@id=’Assignment’]/tbody/tr[1]/td[10]");
	By AttendanceNavigation = By.xpath("//*[@id=’Attendance’]/tbody/tr[1]/td[10]");
	By Logout = By.xpath("//*[@id=’Logout’]/tbody/tr[1]/td[10]");
	WebDriver driver;

	public Attendance_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Click_Attendance() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public void Click_AddNew() throws InterruptedException {
		driver.findElement(AddNew).click();
		Thread.sleep(1000);
	}

	public WebElement Manage_Attendance() throws InterruptedException {
		return driver.findElement(ManageAttendance);

	}

	public WebElement DeleteAll_Displayed() throws InterruptedException {
		return driver.findElement(DeleteAll);

	}

	public WebElement Confirm_Displayed() throws InterruptedException {
		return driver.findElement(Confirm);

	}

	public WebElement confirmmesage() throws InterruptedException {
		return driver.findElement(confirmmesage);

	}

	public WebElement DeleteAll_Enabled() throws InterruptedException {
		return driver.findElement(DeleteAll);

	}

	public WebElement Search() throws InterruptedException {
		return driver.findElement(Search);
	}

	public WebElement Addnew() throws InterruptedException {
		return driver.findElement(AddNew);

	}

	public WebElement PaginationRightArrow_Enabled() {
		return driver.findElement(PaginationRightArrow);
	}

	public WebElement PaginationLefttArrow_Enabled() {
		return driver.findElement(PaginationLeftArrow);
	}

	public WebElement ClassID() throws InterruptedException {
		return driver.findElement(ClassID);

	}

	public WebElement Sucessmesg() throws InterruptedException {
		return driver.findElement(Sucessmesg);

	}

	public String NumberEntry() {
		return driver.findElement(NumberEntry).getText();
	}

	public WebElement ConfirmYes() throws InterruptedException {
		return driver.findElement(ConfirmYes);

	}

	public WebElement ConfirmNo() throws InterruptedException {
		return driver.findElement(ConfirmNo);

	}

	public WebElement statusmessage() throws InterruptedException {
		return driver.findElement(statusmsg);

	}

	public WebElement Present() throws InterruptedException {
		return driver.findElement(Present);

	}

	public WebElement EditAttendance() throws InterruptedException {
		return driver.findElement(EditAttendance);

	}

	public WebElement DeleteAttendance() throws InterruptedException {
		return driver.findElement(DeleteAttendance);

	}

	public WebElement StudentID() throws InterruptedException {
		return driver.findElement(StudentID);

	}

	public void Click_Delete1() throws InterruptedException {
		driver.findElement(Delete1).click();
		Thread.sleep(1000);
	}

	public void Click_Delete2() throws InterruptedException {
		driver.findElement(Delete2).click();
		Thread.sleep(1000);
	}

	public void Click_checkbox1() throws InterruptedException {
		driver.findElement(Checkbox1).click();
	}

	public void Click_checkbox2() throws InterruptedException {
		driver.findElement(Checkbox2).click();
	}

	public void Click_ConfirmYes() throws InterruptedException {
		driver.findElement(ConfirmYes).click();
	}

	public void Click_ConfirmNo() throws InterruptedException {
		driver.findElement(ConfirmNo).click();
	}

	public WebElement Checkbox() throws InterruptedException {
		return driver.findElement(Checkbox);

	}

	public WebElement Tickmark1() throws InterruptedException {
		return driver.findElement(tickmark1);

	}

	public WebElement Tickmark2() throws InterruptedException {
		return driver.findElement(tickmark2);

	}

	public WebElement SortIcon() throws InterruptedException {
		return driver.findElement(SortIcon);

	}

	public WebElement PaginationIcon() throws InterruptedException {
		return driver.findElement(PaginationIcon);

	}

	public WebElement ProgramName() throws InterruptedException {
		return driver.findElement(ProgramName);

	}

	public WebElement ClassName() throws InterruptedException {
		return driver.findElement(ClassName);

	}

	public WebElement StudentName() throws InterruptedException {
		return driver.findElement(StudentName);

	}

	public WebElement Attendance1() throws InterruptedException {
		return driver.findElement(Attendance1);

	}

	public WebElement AttendanceDate() throws InterruptedException {
		return driver.findElement(AttendanceDate);

	}

	public WebElement ProgramNameDropDown() throws InterruptedException {
		return driver.findElement(ProgramNameDropDown);

	}

	public WebElement ClassNameDropDown() throws InterruptedException {
		return driver.findElement(ClassNameDropDown);

	}

	public WebElement StudentNameDropDown() throws InterruptedException {
		return driver.findElement(StudentNameDropDown);

	}

	public WebElement AttendanceDropDown() throws InterruptedException {
		return driver.findElement(AttendanceDropDown);

	}

	public WebElement AttendanceDateDropDown() throws InterruptedException {
		return driver.findElement(AttendanceDateDropDown);

	}

	public WebElement Close() throws InterruptedException {
		return driver.findElement(Close);

	}

	public WebElement Save() throws InterruptedException {
		return driver.findElement(Save);

	}

	public WebElement Cancel() throws InterruptedException {
		return driver.findElement(Cancel);

	}

	public WebElement Sucesspopup() throws InterruptedException {
		return driver.findElement(Sucesspopup);

	}

	public void Click_ProgramNameDropDown() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public void Click_ClassNameDropDown() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public void Click_StudentNameDropDown() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public void Click_AttendanceDropDown() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public void Click_AttendanceDateDropDown() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public void rightarrow_click() throws InterruptedException {
		driver.findElement(Attendance).click();
		Thread.sleep(1000);
	}

	public List<WebElement> ProgramNameDropDownText() {
		Select dropdown = new Select(driver.findElement(ProgramNameDropDown));

		List<WebElement> options = dropdown.getOptions();

		return options;

	}

	public List<WebElement> AttendanceDropDownText() {
		Select dropdown = new Select(driver.findElement(AttendanceDropDown));

		List<WebElement> options = dropdown.getOptions();

		return options;

	}

	public String DataTableProgramName() {
		String ProgramNames = driver.findElement(ProgramName).getText();
		return ProgramNames;
	}

	public String DataTableClassName() {
		String classNames = driver.findElement(ClassName).getText();
		return classNames;
	}

	public String DataTableAttendance() {
		String classNames = driver.findElement(Attendance).getText();
		return classNames;
	}

	public String Headerloaction() {
		WebElement link = driver.findElement(By.linkText("Manage attendance"));

		String linkLocatin = link.getAttribute("href");
		System.out.println("Link Location " + linkLocatin);
		return linkLocatin;
	}

	public List<String> DataTable() throws InterruptedException {
		List<String> rowData = new ArrayList<>();
		List<WebElement> dataTableRowElements = driver.findElements(DataTable);
		for (WebElement row : dataTableRowElements) {

			WebElement programNameCell = row.findElement(ProgramName);
			WebElement classNameCell = row.findElement(ClassName);
			WebElement studentNameCell = row.findElement(StudentName);
			WebElement attendanceCell = row.findElement(Attendance);
			WebElement attendancedateCell = row.findElement(AttendanceDate);
			String programName = programNameCell.getText();
			String className = classNameCell.getText();
			String studentName = studentNameCell.getText();
			String attendance = attendanceCell.getText();
			String attendancedate = attendancedateCell.getText();

			String rowDatas = "ProgramName: " + ProgramName + ", ClassName: " + ClassName + ", StudentName: "
					+ StudentName + ",Attendance: " + Attendance + ", AttendanceDate: " + AttendanceDate + "";

			rowData.add(rowDatas);

		}
		return rowData;
	}

	public void Click_Datepicker() throws InterruptedException {
		driver.findElement(Datepicker).click();
		Thread.sleep(1000);

	}

	public void Click_Save() throws InterruptedException {
		driver.findElement(Save).click();

	}

	public void ProgramNameTextBox(List<String> ProgramName) throws InterruptedException {
		for (String contents : ProgramName) {
			driver.findElement(ProgramNameTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}

	}

	public void ClassNameTextBox(List<String> ClassName) throws InterruptedException {
		for (String contents : ClassName) {
			driver.findElement(ClassNameTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}

	}

	public void StudentNameTextBox(List<String> StudentName) throws InterruptedException {
		for (String contents : StudentName) {
			driver.findElement(StudentNameTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}

	}

	public void AttendanceTextBox(List<String> Attendance) throws InterruptedException {
		for (String contents : Attendance) {
			driver.findElement(AttendanceTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}

	public void DateTextBox(List<String> Attendance) throws InterruptedException {
		for (String contents : Attendance) {
			driver.findElement(DateTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}

	public String CurrentDate() throws InterruptedException {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

	public void FutureDate() throws InterruptedException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 10);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date futureDate = calendar.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); // Adjust format as needed
		String futureDateStr = dateFormat.format(futureDate);
		Select sc = new Select(driver.findElement(Calender));
		sc.selectByValue(futureDateStr);

	}

	public String AttendanceDateTextBox() throws InterruptedException {
		String datecontent = driver.findElement(AttendanceDateTextBox).getText();
		return datecontent;

	}

	public String DatePickerdate() throws InterruptedException {
		String date = driver.findElement(Calender).getText();
		return date;
	}

	public String Date() throws InterruptedException, ParseException {
		String datecontent = driver.findElement(AttendanceDateTextBox).getText();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date parsedDate = sdf.parse(datecontent);
		String formattedDate = sdf.format(parsedDate);
		return formattedDate;

	}

	public String DateNextMonth() throws InterruptedException, ParseException {
		String datecontent = driver.findElement(AttendanceDateTextBox).getText();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date parsedDate = sdf.parse(datecontent);
		SimpleDateFormat monthformat = new SimpleDateFormat("MM");
		String currentMonth = monthformat.format(parsedDate);
		int monthInt = Integer.parseInt(currentMonth);
		if (monthInt < 12) {
			monthInt++;
		} else {
			monthInt = 1;
		}
		String nextMonth = String.format("%02d", monthInt);
		return nextMonth;
	}

	public void DatePickerClick() throws InterruptedException {
		driver.findElement(Calender).click();
	}

	public void DatePickerLeftArrow() throws InterruptedException {
		driver.findElement(DatePickerLeftArrow).click();
	}

	public String DatePreviousMonth() throws InterruptedException, ParseException {
		String datecontent = driver.findElement(AttendanceDateTextBox).getText();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date parsedDate = sdf.parse(datecontent);
		SimpleDateFormat monthformat = new SimpleDateFormat("MM");
		String currentMonth = monthformat.format(parsedDate);
		int monthInt = Integer.parseInt(currentMonth);
		if (monthInt > 1) {
			monthInt--;
		} else {
			monthInt = 12;
		}
		String previousMonth = String.format("%02d", monthInt);
		return previousMonth;
	}

	public void Click_Studentpage() throws InterruptedException {
		driver.findElement(Student).click();
	}

	public void Click_Program() throws InterruptedException {
		driver.findElement(Program).click();
	}

	public void Click_Batch() throws InterruptedException {
		driver.findElement(Batch).click();
	}

	public void Click_User() throws InterruptedException {
		driver.findElement(User).click();
	}

	public void Click_Assignment() throws InterruptedException {
		driver.findElement(Assignment).click();
	}

	public void Click_Class() throws InterruptedException {
		driver.findElement(Class).click();
	}

	public boolean DataTableEmpty() {
		WebElement dataTable = driver.findElement(DataTable);
		String dataTableText = dataTable.getText().trim();
		return dataTableText.isEmpty();
	}

}
