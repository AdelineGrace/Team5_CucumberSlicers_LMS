package POM_LMS;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.DriverFactory;

public class Class_PageObject {

	By Class = By.xpath("//button[@type='button'][text()='Class']");	
	By ManageClass = By.xpath("//a[text()='ManageClass']");
	By DeleteAll = By.xpath("//a[text()='DeleteAll']");
	By Search = By.xpath("//a[text()='Search']");
	By AddNew = By.xpath("//button[@type='button'][text()='Add New']");	
	By BatchId = By.xpath("//*[@id=’batchid’]/tbody/tr[1]/td[1]");
	By ClassNo = By.xpath("//*[@id=’classno’]/tbody/tr[1]/td[2]");
	By ClassDate = By.xpath("//*[@id=’classdate’]/tbody/tr[1]/td[3]");
	By ClassTopic = By.xpath("//*[@id=’classtopic’]/tbody/tr[1]/td[4]");
	By StaffId = By.xpath("//*[@id=’staffid’]/tbody/tr[1]/td[5]");
	By Description = By.xpath("//*[@id=’description’]/tbody/tr[1]/td[6]");
	By Comments = By.xpath("//*[@id=’comments’]/tbody/tr[1]/td[7]");
	By Notes = By.xpath("//*[@id=’notes’]/tbody/tr[1]/td[8]");
	By Recording = By.xpath("//*[@id=’recording’]/tbody/tr[1]/td[9]");
	By EditClass = By.xpath("//*[@id=’edit’]/tbody/tr[1]/td[10]");
	By DeleteClass = By.xpath("//*[@id=’delete’]/tbody/tr[1]/td[11]");
	By EditA = By.xpath("//*[@id=’edit’]/tbody/tr[2]/td[10]");
	By EditB = By.xpath("//*[@id=’edit’]/tbody/tr[3]/td[10]");
	By EditC = By.xpath("//*[@id=’edit’]/tbody/tr[4]/td[10]");
	By DeleteA =By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[11]");
	By DeleteB = By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[11]");
	By DeleteC = By.xpath("//*[@id=’delete’]/tbody/tr[3]/td[11]");
	By BatchIdSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[1]");
	By ClassNoSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[2]");
	By ClassDateSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[3]");
	By ClassTopicSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[4]");
	By StaffIdSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[4]");
	By DescriptionSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[5]");
	By CommentsSort =By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[6]");
	By NotesSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[7]");
	By RecordingSort =By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[8]");
	By CheckBoxHeader = By.xpath("//input[@type='checkbox']");
	By CheckBox1 = By.xpath("//*[@id=’checkbox’]/tbody/tr[2]/td[1]");
	By CheckBox2 = By.xpath("//*[@id=’checkbox’]/tbody/tr[3]/td[1]");
	By CheckBox3 = By.xpath("//*[@id=’checkbox’]/tbody/tr[4]/td[1]");
	By NumberEntry = By.xpath("//form[@id='entry_form']");
	By Pagination =  By.xpath("//form[@id='control']");
	By NoofClasses = By.xpath("//a[text()='number of classes']");
	By SearchResults = By.xpath("//a[text()='result']");
	By DataTable = By.xpath("//*[@id=’customers’]/tbody/tr/td");
	By ClassDetails = By.xpath("//a[text()='ClassDetails']");
	By TextBox = By.cssSelector(".class-details-popup input[type='text']");
	By BatchDropDown = By.xpath("//a[@class='batch-box dropdown-toggle']");
	By StaffDropDown = By.xpath("//a[@class='staff-box dropdown-toggle']");
    By Calender = By.xpath("//table[@class='calendar-table']");
	By Save = By.xpath("//button[@type='button'][text()='Save']");	
	By Cancel = By.xpath("//button[@type='button'][text()='Cancel']");	
	By Close = By.xpath("//button[@type='button'][text()='Close']");
	By BatchIdTextBox = By.xpath("//input[@class='Batch Id']");
	By ClassNoTextBox = By.xpath("//input[@class='Class No']");
	By ClassDateTextBox = By.xpath("//input[@class='Class Date']");
	By ClassTopicTextBox = By.xpath("//input[@class='Class Topic']");
	By DescriptionTextBox = By.xpath("//input[@class='Description']");
	By CommentsTextBox = By.xpath("//input[@class='Comments']");
	By NotesTextBox = By.xpath("//input[@class='Notes']");
	By RecordingTextBox = By.xpath("//input[@class='Recording']");
	By StaffIdTextBox = By.xpath("//input[@class='Staff id']");


	
			
	 WebDriver driver;
		
		public Class_PageObject(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void Click_Class() throws InterruptedException
		{
			driver.findElement(Class).click();
			Thread.sleep(1000);
		}
		public WebElement Manage_Class() throws InterruptedException
		{
			return driver.findElement(ManageClass);
					
		}
		public WebElement DeleteAll_Displayed() throws InterruptedException
		{
			return driver.findElement(DeleteAll);
						
		}
		public WebElement DeleteAll_Enabled() throws InterruptedException
		{
			return driver.findElement(DeleteAll);
						
		}
		public WebElement Search() throws InterruptedException
		{
		return driver.findElement(Search);
					}
		public WebElement Addnew() throws InterruptedException
		{
			return driver.findElement(AddNew);
			
		}
		
		public WebElement Batchid() throws InterruptedException
		{
			return driver.findElement(BatchId);
			
		}
		public WebElement ClassNo() throws InterruptedException
		{
			return driver.findElement(ClassNo);
			
		}
		public WebElement ClassTopic() throws InterruptedException
		{
			return driver.findElement(ClassTopic);
			
		}
		public WebElement ClassDate() throws InterruptedException
		{
			return driver.findElement(ClassDate);
			
		}
		public WebElement StaffId() throws InterruptedException
		{
			return driver.findElement(StaffId);
			
		}
		public WebElement Description() throws InterruptedException
		{
			return driver.findElement(Description);
			
		}
		public WebElement Comments() throws InterruptedException
		{
			return driver.findElement(Comments);
			
		}
		public WebElement Notes() throws InterruptedException
		{
			return driver.findElement(Notes);
			
		}
		public WebElement Recording() throws InterruptedException
		{
			return driver.findElement(Recording);
			
		}
		public WebElement EditClass() throws InterruptedException
		{
			return driver.findElement(EditClass);
			
		}
		public WebElement DeleteClass() throws InterruptedException
		{
			return driver.findElement(DeleteClass);
			
		}
		public WebElement EditA() throws InterruptedException
		{
			return driver.findElement(EditA);
			
		}
		public WebElement EditB() throws InterruptedException
		{
			return driver.findElement(EditB);
			
		}
		public WebElement EditC() throws InterruptedException
		{
			return driver.findElement(EditC);
			
		}
		public WebElement DeleteA() throws InterruptedException
		{
			return driver.findElement(DeleteA);
			
		}
		public WebElement DeleteB() throws InterruptedException
		{
			return driver.findElement(DeleteB);
			
		}
		public WebElement DeleteC() throws InterruptedException
		{
			return driver.findElement(DeleteC);
			
		}
		public WebElement BatchIdSort() throws InterruptedException
		{
			return driver.findElement(BatchIdSort);
			
		}
		public WebElement ClassNoSort() throws InterruptedException
		{
			return driver.findElement(ClassNoSort);
			
		}
		public WebElement ClassDateSort() throws InterruptedException
		{
			return driver.findElement(ClassDateSort);
			
		}
		public WebElement ClassTopicSort() throws InterruptedException
		{
			return driver.findElement(ClassTopicSort);
			
		}
		public WebElement StaffIdSort() throws InterruptedException
		{
			return driver.findElement(StaffIdSort);
			
		}
		public WebElement DescriptionSort() throws InterruptedException
		{
			return driver.findElement(DescriptionSort);
			
		}
		public WebElement CommentsSort() throws InterruptedException
		{
			return driver.findElement(CommentsSort);
			
		}
		public WebElement NotesSort() throws InterruptedException
		{
			return driver.findElement(NotesSort);
			
		}
		public WebElement RecordingSort() throws InterruptedException
		{
			return driver.findElement(RecordingSort);
			
		}
		public WebElement CheckBoxHeader() throws InterruptedException
		{
			return driver.findElement(CheckBoxHeader);
			
		}
		public WebElement CheckBox1() throws InterruptedException
		{
			return driver.findElement(CheckBox1);
			
		}
		public WebElement CheckBox2() throws InterruptedException
		{
			return driver.findElement(CheckBox2);
			
		}
		public WebElement CheckBox3() throws InterruptedException
		{
			return driver.findElement(CheckBox3);
			
		}
		public String NumberEntry()
		{
			return driver.findElement(NumberEntry).getText();
		}
		public WebElement Pagination() throws InterruptedException
		{
			return driver.findElement(Pagination);
			
		}
		public String NoofClasses()
		{
			return driver.findElement(NoofClasses).getText();
		}
		public void Text(List<String> content)
		{
              Actions act = new Actions(DriverFactory.getDriver());
			
			for(String contents : content) { 
				act.moveToElement(driver.findElement(Search)).sendKeys(contents).build().perform();
			}
			
		}
		public String SearchResults()
		{
			return driver.findElement(SearchResults).getText();
		}
		 public boolean DataTableEmpty() {
		        WebElement dataTable = driver.findElement(DataTable);
		        String dataTableText = dataTable.getText().trim();
		        return dataTableText.isEmpty();
		    }
		 public void Click_AddNew() throws InterruptedException
			{
				driver.findElement(AddNew).click();
				Thread.sleep(1000);
			}
		 public WebElement ClassDetails()
			{
				return driver.findElement(ClassDetails);
			}
		 public List<WebElement> TextBox() throws InterruptedException
			{
			WebElement textbox =  driver.findElement(TextBox);
			List<WebElement> textboxes = new ArrayList<>();
			textboxes.add(textbox);
			 return textboxes;
						
			}
		 public WebElement BatchDropDown() throws InterruptedException
			{
				return driver.findElement(BatchDropDown);
				
			}
		 public WebElement StaffDropDown() throws InterruptedException
			{
				return driver.findElement(StaffDropDown);
				
			}
		 public WebElement Calender() throws InterruptedException
			{
				return driver.findElement(Calender);
				
			}
		 public WebElement Save() throws InterruptedException
			{
				return driver.findElement(Save);
				
			}
		 public WebElement Cancel() throws InterruptedException
			{
				return driver.findElement(Cancel);
				
			}
		 public WebElement Close() throws InterruptedException
			{
				return driver.findElement(Close);
				
			}
		 public void Click_BatchDropDown() throws InterruptedException
			{
				driver.findElement(BatchDropDown).click();
				Thread.sleep(1000);
			}
		 public List<WebElement> BatchDropDownText()
			{
			 Select dropdown = new Select(driver.findElement(BatchDropDown));

		         List<WebElement> options = dropdown.getOptions();

		        return options;
				
			}
		 public  String DataTableBatchId()
			{
			String batches = driver.findElement(BatchId).getText();
		            return batches;
		        }
		 public void BatchIdDropDown(List<String> batchid) throws InterruptedException
			{
			 Select dropdown = new Select(driver.findElement(BatchDropDown));
			 for (String id : batchid) {

                   dropdown.selectByValue(id);
			}
			}
		 public void ClassNoTextBox(List<String> classno) throws InterruptedException
			{
			 for(String contents : classno) { 
				driver.findElement(ClassNoTextBox).sendKeys(contents);
				Thread.sleep(1000);
			}
			}
		 public void ClassDateCalender(List<String> classdate) throws InterruptedException
			{
			  WebElement classdatetextbox = driver.findElement(ClassDateTextBox);
			  classdatetextbox.click();
			 for (String date: classdate) {
				 By dateLocator = By.xpath("//td[@data-date='" + date + "']");
				 WebElement dateElement = driver.findElement(dateLocator);
			        dateElement.click();
			 }
			}
		 public void StaffIdDropDown(List<String> staffid) throws InterruptedException
			{
			 Select dropdown = new Select(driver.findElement(BatchDropDown));
			 for (String id : staffid) {

                   dropdown.selectByValue(id);
			}}
			 public void Click_Save() throws InterruptedException
				{
				 driver.findElement(Save).click();
								
			}
			 public  List<String> DataTable() throws InterruptedException
				{
				 List<String> rowData = new ArrayList<>();
				 List<WebElement> dataTableRowElements = driver.findElements(DataTable);
				 for (WebElement row : dataTableRowElements) {
			           
			            WebElement batchIDCell = row.findElement(BatchId); 
			            WebElement classDataCell = row.findElement(ClassDate); 
			            WebElement classNoCell = row.findElement(ClassNo);
			            WebElement staffIdCell = row.findElement(StaffId);
			            String batchID = batchIDCell.getText();
			            String classData = classDataCell.getText();
			            String classNo = classNoCell.getText();
			            String staffId = staffIdCell.getText();
			            
			            String rowDatas = "Batch ID: " + batchID + ", Class Date: " + classData +
	                               ", Class No: " + classNo + ", Staff ID: " + staffId;

			            
			            rowData.add(rowDatas);

				 }
				 return rowData;
				}
			 public String Alert() throws InterruptedException
				{
				 Alert alert =  driver.switchTo().alert();
  			        String alertText = alert.getText();
  			        return alertText;
				}
			 public void ClassTopicTextBox(List<String> classtopic) throws InterruptedException
				{
				 for(String contents : classtopic) { 
					driver.findElement(ClassTopicTextBox).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void DescriptionTextBox(List<String> description) throws InterruptedException
				{
				 for(String contents : description) { 
					driver.findElement(DescriptionTextBox).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void CommentsTextBox(List<String> comments) throws InterruptedException
				{
				 for(String contents : comments) { 
					driver.findElement(CommentsTextBox).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void NotesTextBox(List<String> notes) throws InterruptedException
				{
				 for(String contents : notes) { 
					driver.findElement(NotesTextBox).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void RecordingTextBox(List<String> recording) throws InterruptedException
				{
				 for(String contents : recording) { 
					driver.findElement(RecordingTextBox).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 
			 
}
