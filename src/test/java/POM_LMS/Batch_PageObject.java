
package POM_LMS;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import StepDefinition_LMS.batchStatus_Batch_Main;
//import StepDefinition_LMS.edit_Batch_Main;

public class Batch_PageObject {

	By Batch = By.xpath("//button[@type='button'][text()='Batch']");
	By ManageBatch = By.xpath("//a[text()='ManageBatch']");
	By batchName_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[1]");
	By batchDescription_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[2]");
	By batchStatus_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[3]");
	By noOfClasses_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[4]");
	By programName_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[5]");
	By edit_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[6]");
	By delete_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[7]");
	By DeleteAll_Batch_Main = By.xpath("//a[text()='DeleteAll']");
	By AddNewBatch_Batch = By.xpath("//button[@type='button'][text()='Add New Batch']");
	By checkBox1_Batch_Main = By.xpath("//*[@id=â€™checkboxâ€™]/tbody/tr[2]/td[1]");
	By checkBox2_Batch_Main = By.xpath("//*[@id=â€™checkboxâ€™]/tbody/tr[3]/td[1]");
	By checkBox3_Batch_Main = By.xpath("//*[@id=â€™checkboxâ€™]/tbody/tr[4]/td[1]");
	By CheckBoxHeader_Batch_main = By.xpath("//input[@type='checkbox']");
	By Delete1_Batch_Main = By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[2]/td[11]");
	By Delete2_Batch_Main = By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[3]/td[11]");
	By Delete3_Batch_Main = By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[4]/td[11]");
	By Edit1_Batch_Main = By.xpath("//*[@id=â€™editâ€™]/tbody/tr[2]/td[10]");
	By Edit2_Batch_Main = By.xpath("//*[@id=â€™editâ€™]/tbody/tr[3]/td[10]");
	By Edit3_Batch_Main = By.xpath("//*[@id=â€™editâ€™]/tbody/tr[4]/td[10]");
	By BatchDetails = By.xpath("//a[text()='BatchDetails']");
	By AddNewBatch = By.xpath("//button[@type='button'][text()='Add New' Batch]");
	By AddNewBatch_batchname = By.xpath("//button[@type='button'][text()='Add New Batch']");
	By ProgramName_Batch_Main = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[5]");
	By BatchName = By.xpath("//*[@id=â€™batchidâ€™]/tbody/tr[1]/td[1]");
	By BatchDescription = By.xpath("//*[@id=â€™classnoâ€™]/tbody/tr[1]/td[2]");
	By ProgramName = By.xpath("//*[@id=â€™classdateâ€™]/tbody/tr[1]/td[3]");
	By StatusActive = By.xpath("//*[@id=â€™classtopicâ€™]/tbody/tr[1]/td[4]");
	By StatusInactive = By.xpath("//*[@id=â€™staffidâ€™]/tbody/tr[1]/td[5]");
	By NoClasses = By.xpath("//*[@id=â€™descriptionâ€™]/tbody/tr[1]/td[6]");
	By Comments = By.xpath("//*[@id=â€™commentsâ€™]/tbody/tr[1]/td[7]");
	By Notes = By.xpath("//*[@id=â€™notesâ€™]/tbody/tr[1]/td[8]");
	By BatchNameTextBox = By.xpath("//input[@class='Batch Name']");
	By BatchDropDown = By.xpath("//a[@class='batch-box dropdown-toggle']");
	By StaffDropDown = By.xpath("//a[@class='staff-box dropdown-toggle']");
	By Calender = By.xpath("//table[@class='calendar-table']");
	By CommentsTextBox = By.xpath("//input[@class='Comments']");
	By NotesTextBox = By.xpath("//input[@class='Notes']");
	By RecordingTextBox = By.xpath("//input[@class='Recording']");
	By StaffIdTextBox = By.xpath("//input[@class='Staff id']");
	By batchDetails = By.xpath("//a[text()='batch Details']");
	By TextBox = By.cssSelector(".batch-details-popup input[type='text']");
	By ProgramNameDropDown = By.xpath("//a[@class='batch-box dropdown-toggle']");
	By ProgramNameTextbox = By.xpath("//input[@class='Batch Id']");
	By BatchDescriptionTextBox = By.xpath("//input[@class='Batch Id']");
	By NoClassesTextBox = By.xpath("//input[@class='Class No']");
	By StatusActiveRadioButton = By.xpath("//a[@class='status-active-box radio-toggle']");
	By StatusInactiveRadioButton = By.xpath("//a[@class='status-Inactive-box radio-toggle']");
	By Save = By.xpath("//button[@type='button'][text()='Save']");
	By Cancel = By.xpath("//button[@type='button'][text()='Cancel']");
	By Close = By.xpath("//button[@type='button'][text()='Close']");
	By BatchIdTextBox = By.xpath("//input[@class='Batch Id']");
	By ClassNoTextBox = By.xpath("//input[@class='Class No']");
	By ClassDateTextBox = By.xpath("//input[@class='Class Date']");
	By ClassTopicTextBox = By.xpath("//input[@class='Class Topic']");
	By DescriptionTextBox = By.xpath("//input[@class='Description']");
	By DataTableBatch = By.xpath("//*[@id=â€™customersâ€™]/tbody/tr/td");
	//Delete Batch
	By DeleteA_Batch =By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[2]/td[11]");
	By DeleteB_Batch = By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[2]/td[11]");
	By DeleteC_Batch = By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[3]/td[11]");
	By DeleteBatch = By.xpath("//*[@id=â€™deleteâ€™]/tbody/tr[1]/td[11]");
	By YesBatchDelete = By.xpath("//button[@type='button'][text()='yes']");
	By NoBatchDelete = By.xpath("//button[@type='button'][text()='no']");
	By CheckBoxHeaderBatch = By.xpath("//input[@type='checkbox']");
	By CheckBox1Batch = By.xpath("//*[@id=â€™checkboxâ€™]/tbody/tr[2]/td[1]");
	By CheckBox2Batch= By.xpath("//*[@id=â€™checkboxâ€™]/tbody/tr[3]/td[1]");
	By CheckBox3Batch = By.xpath("//*[@id=â€™checkboxâ€™]/tbody/tr[4]/td[1]");
	
	
	WebDriver driver;

	public Batch_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Click_Batch() throws InterruptedException {
		driver.findElement(Batch).click();
		Thread.sleep(1000);
	}

	public WebElement Manage_Batch() throws InterruptedException {
		return driver.findElement(ManageBatch);

	}

	public WebElement batchName_Batch_Main() throws InterruptedException {
		return driver.findElement(batchName_Batch_Main);

	}

	public WebElement batchDescription_Batch_Main() throws InterruptedException {
		return driver.findElement(batchDescription_Batch_Main);

	}

	public WebElement batchStatus_Batch_Main() throws InterruptedException {
		return driver.findElement(batchStatus_Batch_Main);

	}

	public WebElement noOfClasses_Batch_Main() throws InterruptedException {
		return driver.findElement(noOfClasses_Batch_Main);

	}

	public WebElement programName_Batch_Main() throws InterruptedException {
		return driver.findElement(programName_Batch_Main);

	}

	public WebElement edit_Batch_Main() throws InterruptedException {
		return driver.findElement(edit_Batch_Main);

	}

	public WebElement delete_Batch_Main() throws InterruptedException {
		return driver.findElement(delete_Batch_Main);

	}

	public WebElement DeleteAll_Displayed_Batch_Main() throws InterruptedException {
		return driver.findElement(DeleteAll_Batch_Main);

	}

	public WebElement DeleteAll_Enabled_Batch_Main() throws InterruptedException {
		return driver.findElement(DeleteAll_Batch_Main);

	}

	public WebElement AddNewBatch() throws InterruptedException {
		return driver.findElement(AddNewBatch);

	}

	public WebElement CheckBoxHeader_Batch_Main() throws InterruptedException {
		return driver.findElement(CheckBoxHeader_Batch_main);

	}

	public WebElement CheckBox1_Batch_Main() throws InterruptedException {
		return driver.findElement(checkBox1_Batch_Main);

	}

	public WebElement CheckBox2_Batch_Main() throws InterruptedException {
		return driver.findElement(checkBox2_Batch_Main);

	}

	public WebElement CheckBox3_Batch_Main() throws InterruptedException {
		return driver.findElement(checkBox3_Batch_Main);

	}

	public WebElement Delete1_Batch_Main() throws InterruptedException {
		return driver.findElement(Delete1_Batch_Main);

	}

	public WebElement Delete2_Batch_Main() throws InterruptedException {
		return driver.findElement(Delete2_Batch_Main);

	}

	public WebElement Delete3_Batch_Main() throws InterruptedException {
		return driver.findElement(Delete3_Batch_Main);

	}

	public WebElement Edit1_Batch_Main() throws InterruptedException {
		return driver.findElement(Edit1_Batch_Main);

	}

	public WebElement Edit2_Batch_Main() throws InterruptedException {
		return driver.findElement(Edit2_Batch_Main);

	}

	public WebElement Edit3_Batch_Main() throws InterruptedException {
		return driver.findElement(Edit3_Batch_Main);

	}

	public void Click_AddNewBatch_Batch() throws InterruptedException {
		driver.findElement(AddNewBatch_Batch);
		Thread.sleep(1000);
	}

	public WebElement BatchDetails() {
		return driver.findElement(BatchDetails);
	}

	public WebElement Save() throws InterruptedException {
		return driver.findElement(Save);

	}

	public WebElement Cancel() throws InterruptedException {
		return driver.findElement(Cancel);

	}

	public WebElement Close() throws InterruptedException {
		return driver.findElement(Close);

	}

	public WebElement BatchName() throws InterruptedException {
		return driver.findElement(BatchName);

	}

	public WebElement BatchDescription() throws InterruptedException {
		return driver.findElement(BatchDescription);

	}

	public WebElement ProgramName() throws InterruptedException {
		return driver.findElement(ProgramName);

	}

	public WebElement NoClasses() throws InterruptedException {
		return driver.findElement(NoClasses);

	}

	public WebElement StatusInactive() throws InterruptedException {
		return driver.findElement(StatusInactive);

	}

	public WebElement StatusActive() throws InterruptedException {
		return driver.findElement(StatusActive);

	}

	public void Click_ProgramNameDropDown() throws InterruptedException {
		driver.findElement(ProgramNameDropDown).click();
		Thread.sleep(1000);
	}

	public List<WebElement> ProgramNameDropDownText() {
		Select dropdown = new Select(driver.findElement(ProgramNameDropDown));

		List<WebElement> options = dropdown.getOptions();

		return options;

	}

	public void Click_StatusActiveRadioButton() throws InterruptedException {
		driver.findElement(StatusActiveRadioButton).click();
		Thread.sleep(1000);
	}

	public void Click_StatusInactiveRaditoButton() throws InterruptedException {
		driver.findElement(StatusActiveRadioButton).click();
		Thread.sleep(1000);
	}

	public void ProgramNameDropDown(List<String> programName) throws InterruptedException {
		Select dropdown = new Select(driver.findElement(ProgramNameDropDown));
		for (String id : programName) {

			dropdown.selectByValue(id);
		}
	}

	public void ClassNoTextBox(List<String> classno) throws InterruptedException {
		for (String contents : classno) {
			driver.findElement(ClassNoTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}

	public void BatchNameTextBox(List<String> batchname) throws InterruptedException {
		for (String contents : batchname) {
			driver.findElement(BatchNameTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}

	public void ProgramNameTextbox(List<String> programname) throws InterruptedException {
		for (String contents : programname) {
			driver.findElement(ProgramNameTextbox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}

	public void StatusActiveRadioButton(List<String> status) throws InterruptedException {
		for (String contents : status) {
			driver.findElement(ClassNoTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}
	public void BatchDescriptionTextBox(List<String> batchdescription) throws InterruptedException {
		for (String contents : batchdescription) {
			driver.findElement(BatchDescriptionTextBox).sendKeys(contents);
			Thread.sleep(1000);
		}
	}
	public String Alert() throws InterruptedException
	{
	 Alert alert =  driver.switchTo().alert();
	        String alertText = alert.getText();
	        return alertText;
	}
	 public void Click_Save() throws InterruptedException
		{
		 driver.findElement(Save).click();
						
	}
	public boolean DataTableEmptyBatch() {
		WebElement dataTable = driver.findElement(DataTableBatch);
		String dataTableText = dataTable.getText().trim();
		return dataTableText.isEmpty();
	}

	public List<String> DataTableBatch() throws InterruptedException {
		List<String> rowData = new ArrayList<>();
		List<WebElement> dataTableRowElements = driver.findElements(DataTableBatch);
		for (WebElement row : dataTableRowElements) {

			WebElement batchNameCell = row.findElement(BatchName);
			WebElement batchDescriptionCell = row.findElement(BatchDescription);
			WebElement noClassesCell = row.findElement(NoClasses);

			String batchName = batchNameCell.getText();
			String batchDescription = batchDescriptionCell.getText();
			String noClasses = noClassesCell.getText();

			String rowDatas = "Batch Name: " + batchName + ", batchDescription: " + batchDescription
					+ ", Number of Classes: " + noClasses + "";

			rowData.add(rowDatas);

		}
		return rowData;
	}
	
	public WebElement DeleteA_Batch() throws InterruptedException
	{
		return driver.findElement(DeleteA_Batch);
		
	}
	public WebElement DeleteB_Batch() throws InterruptedException
	{
		return driver.findElement(DeleteB_Batch);
		
	}
	public WebElement DeleteC_Batch() throws InterruptedException
	{
		return driver.findElement(DeleteC_Batch);
		
	}
	public WebElement DeleteBatch() throws InterruptedException
	{
		return driver.findElement(DeleteBatch);
		
	}
	
	public void Click_Delete_Icon() {
		driver.findElement(DeleteA_Batch).click();
	
	}
	
	public Alert  DeleteAlertBatch() {
		Alert alert = driver.switchTo().alert();
		return alert;
		
	}
	
	 public WebElement YesBatchDelete() throws InterruptedException
		{
			 return driver.findElement(YesBatchDelete);
		}
	 public WebElement NoBatchDelete() throws InterruptedException
		{
			 return driver.findElement(NoBatchDelete);
		}
	 public void Click_Yes_Batch() throws InterruptedException
		{
			driver.findElement(YesBatchDelete).click();
		}
	 public void Click_No_Batch() throws InterruptedException
		{
			driver.findElement(NoBatchDelete).click();
		}
	 
	 public void Click_DeleteHeaderBatch()
	 {
		 driver.findElement( DeleteAll_Batch_Main).click();
	 }
	
	public void Click_CheckBox1_Batch() {
		driver.findElement(checkBox1_Batch_Main).click();
	}
	public void Click_CheckBox2_Batch() {
		driver.findElement(checkBox2_Batch_Main).click();
	}
	
	public void Click_Edit_Batch() throws InterruptedException
	{
		 driver.findElement(edit_Batch_Main).click();
		
	}
 public void Click_Edit1_Batch_Main() throws InterruptedException
	{
		 driver.findElement(Edit1_Batch_Main).click();
		
	}
 
}

