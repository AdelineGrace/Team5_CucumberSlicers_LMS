
package POM_LMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Driver.DriverFactory;

public class Program_PageObject {
	
	static WebDriver driver;
	
	//Private static final Logger LOG= LogManager.getLogger(Program_PageObject.class);
	By program_button = By.xpath("//input[text='Program']");
	By new_program = By.xpath("//button[@type='button'][text()='Add New']");
	By delete_button_left = By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[11]");
	By delete_button = By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[1]");
	By manage_program = By.xpath("//input[text='Manage Program']");
	By footer = By.xpath("//input[text='In total there are 4557 programs']");
	By show_entries = By.xpath("//input[text='Showing 1 to 5 of 4557 entries']");
	By DeleteAll = By.xpath("//a[text()='DeleteAll']");
	By AddNew = By.xpath("//button[@type='button'][text()='Add New']");
	By Description = By.xpath("//*[@id=’description’]/tbody/tr[1]/td[2]");
	By program_name = By.xpath("//*[@id=’program-name’]/tbody/tr[1]/td[1]");
	By status =By.xpath("//*[@id=’userId’]/tbody/tr[1]/td[3]");
	By EditClass = By.xpath("//*[@id=’edit’]/tbody/tr[2]/td[10]");
	By DeleteClass = By.xpath("//a[text()='Delete']");
	By Search = By.xpath("//a[text()='Search']");
	By DescriptionArrow = By.xpath("//a[text()='Description']");
	By program_nameArrow = By.xpath("//a[text()='program name']");
	By statusArrow = By.xpath("//a[text()='status']");
	By checkbox = By.xpath("//*[@id=’checkbox’]/tbody/tr[2]/td[6]");
	By ProgramDetails = By.xpath("//a[text()='programDetails']");
	By DataTable = By.xpath("//*[@id=’customers’]/tbody/tr/td");
	By SearchResults = By.xpath("//a[text()='result']");
	By Save = By.xpath("//button[@type='button'][text()='Save']");	
	By Cancel = By.xpath("//button[@type='button'][text()='Cancel']");
	By programNameAsce = By.xpath("//*[@id=’program name’]/tbody/tr[1]/td[1]");
	By programNameDesc = By.xpath("//*[@id=’program name’]/tbody/tr[1]/td[2]");
	By programDescriptionAsce = By.xpath("//*[@id=’program Description’]/tbody/tr[1]/td[1]");
	By programDescriptionDesc = By.xpath("//*[@id=’program Description’]/tbody/tr[1]/td[2]");
	By programStatusAsce = By.xpath("//*[@id=’program Status’]/tbody/tr[1]/td[1]");
	By programStatusDesc = By.xpath("//*[@id=’program Status’]/tbody/tr[1]/td[2]");
	By programNameElement = By.xpath("//td[@class='program-name']");
	By programDescriptionElement = By.xpath("//td[@class='program-description']");
	By programStatusElement = By.xpath("//td[@class='program-status']");
	By Errormsg = By.xpath("//a[text()='Error msg']");
	By ProgramNameTextBox = By.xpath("//*[@id=’Textbox’]/tbody/tr[1]/td[1]");
	By ProgramDescriptionTextBox = By.xpath("//*[@id=’Textbox’]/tbody/tr[1]/td[2]");
	By Alertmsg = By.xpath("//a[text()='Alert msg']");
	By Edit = By.xpath("//button[text()='Edit']");
	By EditName = By.xpath("//button[text()='Edit Name']");
	By EditDescription = By.xpath("//*[@id=’edit description’]/tbody/tr[1]/td[1]");
	By Status = By.xpath("//button[text()='Active']");
	By SuccesAlertMsg = By.xpath("//a[text()='Success Msg']");
	By Table = By.xpath("//class[text()='Data table']");
	By Checkbox = By.xpath("//input[text()='Checkbox']");
	By program1Row = By.xpath("//input[text()='Program entry1']");
	By program2Row = By.xpath("//input[text()='Program entry2']");
	By firstPage = By.xpath("//input[@button='next']");
	By nextPage = By.xpath("//input[@button='next']");
	By previousPage= By.xpath("//input[@button='next']");
	By lastPage = By.xpath("//input[@button='next']");
	By pagination = By.xpath("//input[text()='Pagination']");
	By Student = By.xpath("//input[text()='Student']");
	By Batch = By.xpath("//input[text()='Batch']");
	By Class = By.xpath("//input[text()='Class']");
	By User = By.xpath("//input[text()='User']");
	By Assignment = By.xpath("//input[text()='Assignment']");
	By Attendance= By.xpath("//input[text()='Attendance']");
	By Logout = By.xpath("//input[text()='logout']");
	
	
	
	
	public Program_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void click_program() {
		driver.findElement(program_button).click();;
	}
	
public WebElement manage_program() {
	return driver.findElement(manage_program);
}
public WebElement footer_text() {
	return driver.findElement(footer);
}
public WebElement pagination_text() {
	return driver.findElement(show_entries);
}
public WebElement editbuttonPresent() {
	
	return	driver.findElement(Edit);
		}


public WebElement deletebuttonPresent() {
	
	return	driver.findElement(Edit);
		}
public WebElement DeleteAll_Displayed() throws InterruptedException
{
	return driver.findElement(DeleteAll);
				
}
public WebElement DeleteAll_Enabled() throws InterruptedException
{
	return driver.findElement(DeleteAll);
				
}
public WebElement Addnew() throws InterruptedException
{
	return driver.findElement(AddNew);
	
}
public WebElement programName() throws InterruptedException
{
	return driver.findElement(program_name);
	
}
public WebElement description() throws InterruptedException
{
	return driver.findElement(Description);
	
}
public WebElement status() throws InterruptedException
{
	return driver.findElement(status);
	
}
public WebElement EditClass() throws InterruptedException
{
	return driver.findElement(EditClass);
	
}
public WebElement DeleteClass() throws InterruptedException
{
	return driver.findElement(DeleteClass);
	
}
public WebElement Search() throws InterruptedException
{
return driver.findElement(Search);
			}

public WebElement programNameArrow() throws InterruptedException
{
	return driver.findElement(program_nameArrow);
	
}
public WebElement descriptionArrow() throws InterruptedException
{
	return driver.findElement(DescriptionArrow);
	
}
public WebElement statusArrow() throws InterruptedException
{
	return driver.findElement(statusArrow);
	
}
public WebElement checkbox() {
	return driver.findElement(checkbox);
}
public void verifyElements() {
	WebElement table= driver.findElement(DataTable);
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	int recordCount = rows.size();
	Assert.assertEquals(recordCount, 5, "Number of records displayed in the data table should be 5.");
}



public void program_add_name() {
	driver.findElement(Search).sendKeys("jan23-TechWarriorsSDET-019-001");
	}


public void program_add_description() {
	driver.findElement(Search).sendKeys("jan23-TechWarriorsSDET-Desc");
	}
public void program_add_Status() {
	driver.findElement(Search).sendKeys("Active");
	}

public void clickNewProgram() {
	driver.findElement(new_program).click();
}
public String SearchResults()
{
	return driver.findElement(SearchResults).getText();
}

public WebElement ProgramDetails()
{
	return driver.findElement(ProgramDetails);
}
public void Text(List<String> content)
{
      Actions act = new Actions(DriverFactory.getDriver());
	
	for(String contents : content) { 
		act.moveToElement(driver.findElement(Search)).sendKeys(contents).build().perform();
	}
	
}
public boolean DataTableEmpty() {
    WebElement dataTable = driver.findElement(DataTable);
    String dataTableText = dataTable.getText().trim();
    return dataTableText.isEmpty();
}
public void clickOnSave() {
	driver.findElement(Save).click();
}
public String getErrorMsg() {
	return driver.findElement(Errormsg).getText();
}
public void programNameTextBox(List<String> programname) throws InterruptedException
{
 for(String contents : programname) { 
	driver.findElement(ProgramNameTextBox).sendKeys(contents);
	Thread.sleep(1000);
}

}
public void programDescriptionTextBox(List<String> programdescription) throws InterruptedException
{
 for(String contents : programdescription) { 
	driver.findElement(ProgramDescriptionTextBox).sendKeys(contents);
	Thread.sleep(1000);
}
 
}
 public String getAlertmsg() {
	 return driver.findElement(Alertmsg).getText();
	 }

 public void programStatus() {
	 driver.findElement(status).click();
 }
 
 public void clickOnCancel() {
		driver.findElement(Cancel).click();
	}
 
 public String getProgramName() {
	 return driver.findElement(program_name).getText();
	 
 }
 public String getProgramdescription() {
	 return driver.findElement(Description).getText();
	 
 }
 public void clickOnEdit() {
		driver.findElement(Edit).click();
	}
 public void clickOnEditName() {
		driver.findElement(EditName).click();
	}
 public void clickOnEditDescription() {
		driver.findElement(EditDescription).click();
	}
 public void clickOnEditStatus() {
		driver.findElement(Status).click();
	}
 
 public String getSuccessAlertmsg() {
	String alert = driver.switchTo().alert().getText();
	 return alert;
	 }
 public void clickOnDelete() {
	 driver.findElement(delete_button).click();
 }
 public void acceptAlert() {
	 driver.switchTo().alert().accept();
 }
 public void dismissAlert() {
	 driver.switchTo().alert().dismiss();
 }
 public  boolean isAlertPresent() {
     try {
         driver.switchTo().alert();
         return true;
     } catch (Exception e) {
         return false;
     }
 }
 
 public void clickOncheckbox() {
	 driver.findElement(Checkbox).click();
 }
 public boolean deleteisEnabled() {
	WebElement delete = driver.findElement(delete_button_left);
	return delete.isEnabled();
	 
 }
 public  boolean isProgram1Present() {
     try {
         driver.findElement(program1Row);
         return true;
     } catch (Exception e) {
         return false;
     }
 }
 public  boolean isProgram2Present() {
     try {
         driver.findElement(program2Row);
         return true;
     } catch (Exception e) {
         return false;
     }
 }
 
 
 public void clickProgramNameDesc() {
	 driver.findElement(programNameDesc).click();
 }
 public void clickProgramNameAsec() {
	 driver.findElement(programNameAsce).click();
 }
 public void clickProgramDescriptionDesc() {
	 driver.findElement(programDescriptionDesc).click();
 }
 public void clickProgramDescriptionAsec() {
	 driver.findElement(programDescriptionAsce).click();
 }
 public void clickProgramStatusDesc() {
	 driver.findElement(programStatusDesc).click();
 }
 public void clickProgramStatusAsec() {
	 driver.findElement(programStatusAsce).click();
 }
 
 public void programNameAscendingSort() 
	{
	 WebElement table = driver.findElement(DataTable);
	 
	 List<WebElement> programNameElements = table.findElements(programNameElement);
	 List<String> programNames = new ArrayList<>();
     for (WebElement element : programNameElements) {
         programNames.add(element.getText());
     }

     //sorted copy of the program names list
     List<String> sortedProgramNames = new ArrayList<>(programNames);
     Collections.sort(sortedProgramNames);
	 
     Assert.assertEquals(programNames, sortedProgramNames, "Program names should be sorted in ascending order.");
	 
	 }
 
      public void programNameDescendingSort() {
      WebElement table = driver.findElement(DataTable);
	 
	 List<WebElement> programNameElements = table.findElements(programNameElement);
	 List<String> programNames = new ArrayList<>();
     for (WebElement element : programNameElements) {
         programNames.add(element.getText());
     }
      List<String> sortedProgramNamesDescending = new ArrayList<>(programNames);
     Collections.sort(sortedProgramNamesDescending, Collections.reverseOrder());

     Assert.assertEquals(programNames, sortedProgramNamesDescending, "Program names should be sorted in descending order.");
     
	 }
      public void programDescriptionDescendingSort() {
          WebElement table = driver.findElement(DataTable);
    	 
    	 List<WebElement> programDescriptionElements = table.findElements(programDescriptionElement);
    	 List<String> programDescription = new ArrayList<>();
         for (WebElement element : programDescriptionElements) {
             programDescription.add(element.getText());
         }
          List<String> sortedProgramDescriptionDescending = new ArrayList<>(programDescription);
         Collections.sort(sortedProgramDescriptionDescending, Collections.reverseOrder());

         Assert.assertEquals(programDescription, sortedProgramDescriptionDescending, "Program Description should be sorted in descending order.");
         
    	 }
      public void programStatusDescendingSort() {
          WebElement table = driver.findElement(DataTable);
    	 
    	 List<WebElement> programStatusElements = table.findElements(programStatusElement);
    	 List<String> programStatus = new ArrayList<>();
         for (WebElement element : programStatusElements) {
             programStatus.add(element.getText());
         }
          List<String> sortedProgramStatusDescending = new ArrayList<>(programStatus);
         Collections.sort(sortedProgramStatusDescending, Collections.reverseOrder());

         Assert.assertEquals(programStatus, sortedProgramStatusDescending, "Program Status should be sorted in descending order.");
         
    	 }
	  public void programDescriptionAscendingSort() 
	{
	 WebElement table = driver.findElement(DataTable);
	 
	 List<WebElement> programDescriptionElements = table.findElements(programDescriptionElement);
	 List<String> programDescription = new ArrayList<>();
  for (WebElement element : programDescriptionElements) {
      programDescription.add(element.getText());
  }

  //sorted copy of the program description list
  List<String> sortedProgramDescription = new ArrayList<>(programDescription);
  Collections.sort(sortedProgramDescription);
	 
  Assert.assertEquals(programDescription, sortedProgramDescription, "Program Description should be sorted in ascending order.");
	 
	 }
 
 public void programStatusAscendingSort() 
	{
	 WebElement table = driver.findElement(DataTable);
	 
	 List<WebElement> programStatusElements = table.findElements(programStatusElement);
	 List<String> programStatus = new ArrayList<>();
  for (WebElement element : programStatusElements) {
      programStatus.add(element.getText());
  }

  //sorted copy of the program description list
  List<String> sortedProgramStatus = new ArrayList<>(programStatus);
  Collections.sort(sortedProgramStatus);
	 
  Assert.assertEquals(programStatus, sortedProgramStatus, "Program Status should be sorted in ascending order.");
	 
	 }
 
 
 
 
 
 public void clickOnNextpage() {
	 driver.findElement(nextPage).click();
 }
 public boolean nextPageisdisabled() {
	 try {
		 driver.findElement(nextPage);
		 return true;
	 }catch(Exception e) {
		 return false;
	 }
 }
 public void clickOnfirstpage() {
	 driver.findElement(firstPage).click();
 }
 public boolean previousPageisdisabled() {
	 try {
		 driver.findElement(firstPage);
		 return true;
	 }catch(Exception e) {
		 return false;
	 }
 }
 public boolean previousPageEnabled() {
	 try {
		 driver.findElement(previousPage);
		 return true;
	 }catch(Exception e) {
		 return false;
	 }
 }
 public void clickOnLastpage() {
	 driver.findElement(lastPage).click();
 }
 
 public WebElement paginationElement() {
	 return driver.findElement(pagination);
 }
 
 
 public void clickOnstudent() {
	 driver.findElement(Student).click();
 }
 public void clickOnBatch() {
	 driver.findElement(Batch).click();
 }
 public void clickOnUser() {
	 driver.findElement(User).click();
 }
 public void clickOnClass() {
	 driver.findElement(Class).click();
 }
 public void clickOnAssignment() {
	 driver.findElement(Assignment).click();
 }
 public void clickOnAttendance() {
	 driver.findElement(Attendance).click();
 }
 public void clickOnLogout() {
	 driver.findElement(Logout).click();
 }

 
}
