package POM_LMS;
import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Driver.DriverFactory;

public class AssignmentPOM_LMS {
	By Student = By.xpath("//button[@type='button'][text()='Student']");	
	By Program = By.xpath("//button[@type='button'][text()='Program']");	
	By Batch = By.xpath("//button[@type='button'][text()='Batch']");	
	By User = By.xpath("//button[@type='button'][text()='User']");	
	By Class = By.xpath("//button[@type='button'][text()='Class']");	
	By Attendance = By.xpath("//button[@type='button'][text()='Attendance']");	
	By Logout = By.xpath("//button[@type='button'][text()='Logout']");	
	By Assignment = By.xpath("//button[@type='button'][text()='Assignment']");	
	By ManageAssignment = By.xpath("//a[text()='ManageAssignment']");
	By DeleteAll = By.xpath("//a[text()='DeleteAll']");
	By Search = By.xpath("//a[text()='Search']");
	By AddNew = By.xpath("//button[@type='button'][text()='Add New']");	
	By AssignmentName = By.xpath("//*[@id=’assignmentname’]/tbody/tr[1]/td[1]");
	By AssignmentDescription = By.xpath("//*[@id=’assignmentdescription’]/tbody/tr[1]/td[2]");
	By AssignmentDueDate = By.xpath("//*[@id=’assignmentduedate’]/tbody/tr[1]/td[3]");
	By AssignmentGrade = By.xpath("//*[@id=’assignmentgrade’]/tbody/tr[1]/td[4]");
	//By StaffId = By.xpath("//*[@id=’staffid’]/tbody/tr[1]/td[5]");
	//By Description = By.xpath("//*[@id=’description’]/tbody/tr[1]/td[6]");
	//By Comments = By.xpath("//*[@id=’comments’]/tbody/tr[1]/td[7]");
	//By Notes = By.xpath("//*[@id=’notes’]/tbody/tr[1]/td[8]");
	//By Recording = By.xpath("//*[@id=’recording’]/tbody/tr[1]/td[9]");
	By EditAssignment = By.xpath("//*[@id=’editAssignment’]/tbody/tr[1]/td[5]");
	By DeleteAssignment = By.xpath("//*[@id=’deleteAssignment’]/tbody/tr[1]/td[6]");
	By EditA = By.xpath("//*[@id=’edit’]/tbody/tr[2]/td[10]");
	By EditB = By.xpath("//*[@id=’edit’]/tbody/tr[3]/td[10]");
	By EditC = By.xpath("//*[@id=’edit’]/tbody/tr[4]/td[10]");
	By DeleteA =By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[11]");
	By DeleteB = By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[11]");
	By DeleteC = By.xpath("//*[@id=’delete’]/tbody/tr[3]/td[11]");
	By AssignmentNameSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[1]");
	By AssignmentDescriptionSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[2]");
	By AssignmentDueDateSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[3]");
	By AssignmentGradeSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[4]");
	//By StaffIdSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[4]");
	//By DescriptionSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[5]");
	//By CommentsSort =By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[6]");
	//By NotesSort = By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[7]");
	//By RecordingSort =By.xpath("//*[@id=’sort’]/tbody/tr[1]/td[8]");
	By CheckBoxHeader = By.xpath("//input[@type='checkbox']");
	By CheckBox1 = By.xpath("//*[@id=’checkbox’]/tbody/tr[2]/td[1]");
	By CheckBox2 = By.xpath("//*[@id=’checkbox’]/tbody/tr[3]/td[1]");
	By CheckBox3 = By.xpath("//*[@id=’checkbox’]/tbody/tr[4]/td[1]");
	By NumberEntry = By.xpath("//form[@id='entry_form']");
	By Pagination =  By.xpath("//form[@id='control']");
	By NoofAssignment = By.xpath("//a[text()='number of assignment']");
	By SearchResults = By.xpath("//a[text()='result']");
	By DataTable = By.xpath("//*[@id=’customers’]/tbody/tr/td");
	By AssignmentDetails = By.xpath("//a[text()='AssignmentDetails']");
	By TextBox = By.cssSelector(".class-details-popup input[type='text']");
	By ProgramNameDropdown = By.xpath("//a[@class='Program-name dropdown-toggle']");
	By BatchNumberDropdown = By.xpath("//a[@class='Batch-number dropdown-toggle']");
    By Calender = By.xpath("//table[@class='calendar-table']");
	By Save = By.xpath("//button[@type='button'][text()='Save']");	
	By Cancel = By.xpath("//button[@type='button'][text()='Cancel']");	
	By Close = By.xpath("//button[@type='button'][text()='Close']");
	By AssignmentNumber = By.xpath("//input[@class='AssignmentNumber ']");
	By AssignmentDescriptionTxt = By.xpath("//input[@class='AssignmentDescriptionTxt']");
	By AssignmentGradeByTxt = By.xpath("//input[@class='AssignmentGradeby']");
	By AssignmentDueDateInput = By.xpath("//input[@class='Due Date']");
	By Assignment1 = By.xpath("//input[@class='Assignment1']");
	By Assignment2 = By.xpath("//input[@class='Assignment2']");
	By Assignment3= By.xpath("//input[@class='Assignment3']");
	By Assignment4 = By.xpath("//input[@class='Assignment4']");
	By Assignment5 = By.xpath("//input[@class='Assignment6']");
	By GradeBy = By.xpath("//input[@class='GradeBy']");
	//By DescriptionTextBox = By.xpath("//input[@class='Description']");
	//By CommentsTextBox = By.xpath("//input[@class='Comments']");
	//By NotesTextBox = By.xpath("//input[@class='Notes']");
	//By RecordingTextBox = By.xpath("//input[@class='Recording']");
	//By StaffIdTextBox = By.xpath("//input[@class='Staff id']");
    By DatePickerRightArrow = By.cssSelector(".date-picker .right-arrow");
    By DatePickerLeftArrow = By.cssSelector(".date-picker .left-arrow");
    By DatePickerPreviousMonth = By.cssSelector(".date-picker .month");
    By DatePickerNextMonth = By.cssSelector(".date-picker .month");
    By Yes = By.xpath("//button[@type='button'][text()='yes']");
    By No = By.xpath("//button[@type='button'][text()='no']");
    By RightArrowPagination = By.xpath("//div[@class='pagination']//a[@class='right']");
    By LeftArrowPagination = By.xpath("//div[@class='pagination']//a[@class='left']");
	
			
	 WebDriver driver;
		
		public  AssignmentPOM_LMS(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void Click_Assignment() throws InterruptedException
		{
			driver.findElement(Assignment).click();
			Thread.sleep(1000);
		}
		public WebElement AssignmentDetails() throws InterruptedException
		{
			return driver.findElement(AssignmentDetails);
					
		}
		public WebElement Manage_Assignment() throws InterruptedException
		{
			return driver.findElement(ManageAssignment);
					
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
		
		public WebElement AssignmentName() throws InterruptedException
		{
			return driver.findElement(AssignmentName);
			
		}
		public WebElement AssignmentNumber() throws InterruptedException
		{
			return driver.findElement(AssignmentNumber);
			
		}
		public WebElement AssignmentDescription() throws InterruptedException
		{
			return driver.findElement(AssignmentDescription);
			
		}
		public WebElement AssignmentDueDate() throws InterruptedException
		{
			return driver.findElement(AssignmentDueDate);
			
		}
		public WebElement AssignmentDescriptionTxt() throws InterruptedException
		{
			return driver.findElement(AssignmentDescriptionTxt);
			
		}
		public WebElement AssignmentGrade() throws InterruptedException
		{
			return driver.findElement(AssignmentGrade);
			
		}
		public WebElement AssignmentGradeTxt() throws InterruptedException
		{
			return driver.findElement(AssignmentGradeByTxt);
			
		}
		
		//public WebElement StaffId() throws InterruptedException
//		{
//			return driver.findElement(StaffId);
//			
//		}
//		public WebElement Description() throws InterruptedException
//		{
//			return driver.findElement(Description);
//			
//		}
//		public WebElement Comments() throws InterruptedException
//		{
//			return driver.findElement(Comments);
//			
//		}
//		public WebElement Notes() throws InterruptedException
//		{
//			return driver.findElement(Notes);
//			
//		}
//		public WebElement Recording() throws InterruptedException
//		{
//			return driver.findElement(Recording);
//			
	//	}
		public WebElement EditAssignment() throws InterruptedException
		{
			return driver.findElement(EditAssignment);
			
		}
		public WebElement DeleteAssignment() throws InterruptedException
		{
			return driver.findElement(DeleteAssignment);
			
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
		public WebElement AssignmentNameSort() throws InterruptedException
		{
			return driver.findElement(AssignmentNameSort);
			
		}
		public WebElement AssignmentDescriptionSort() throws InterruptedException
		{
			return driver.findElement(AssignmentDescriptionSort);
			
		}
		public WebElement AssignmentDueDateSort() throws InterruptedException
		{
			return driver.findElement(AssignmentDueDateSort);
			
		}
		public WebElement AssignmentGradeSort() throws InterruptedException
		{
			return driver.findElement(AssignmentGradeSort);
			
		}
//		public WebElement StaffIdSort() throws InterruptedException
//		{
//			return driver.findElement(StaffIdSort);
//			
//		}
//		public WebElement DescriptionSort() throws InterruptedException
//		{
//			return driver.findElement(DescriptionSort);
//			
//		}
//		public WebElement CommentsSort() throws InterruptedException
//		{
//			return driver.findElement(CommentsSort);
//			
//		}
//		public WebElement NotesSort() throws InterruptedException
//		{
//			return driver.findElement(NotesSort);
//			
//		}
//		public WebElement RecordingSort() throws InterruptedException
//		{
//			return driver.findElement(RecordingSort);
//			
//		}
		public WebElement Yes() throws InterruptedException
		{
			 return driver.findElement(Yes);
		}
	 public WebElement No() throws InterruptedException
		{
			 return driver.findElement(No);
		}
	 public void Click_Yes() throws InterruptedException
		{
			driver.findElement(Yes).click();
		}
	 public void Click_No() throws InterruptedException
		{
			driver.findElement(No).click();
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
		public String NoofAssignment()
		{
			return driver.findElement(NoofAssignment).getText();
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
		
		 public List<WebElement> TextBox() throws InterruptedException
			{
			WebElement textbox =  driver.findElement(TextBox);
			List<WebElement> textboxes = new ArrayList<>();
			textboxes.add(textbox);
			 return textboxes;
						
			}
		 public WebElement ProgramNameDropDown() throws InterruptedException
			{
				return driver.findElement(ProgramNameDropdown);
				
			}
		 public WebElement BatchNumberDropDown() throws InterruptedException
			{
				return driver.findElement(BatchNumberDropdown);
				
			}
		 public WebElement Calender() throws InterruptedException
			{
				return driver.findElement(Calender);
				
			}
		 public WebElement Assignment1() throws InterruptedException
			{
				return driver.findElement(Assignment1);
				
			}
		 public WebElement Assignment2() throws InterruptedException
			{
				return driver.findElement(Assignment2);
				
			}
		 public WebElement Assignment3() throws InterruptedException
			{
				return driver.findElement(Assignment3);
				
			}
		 public WebElement Assignment4() throws InterruptedException
			{
				return driver.findElement(Assignment4);
				
			}
		 
		 public WebElement Assignment5() throws InterruptedException
			{
				return driver.findElement(Assignment5);
				
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
//		 //public void Click_ProgramNameDropDown() throws InterruptedException
//			{
//				driver.findElement(ProgramNameDropdown).click();
//				Thread.sleep(1000);
//			}
		 public List<WebElement> ProgramNameDropDownText()
			{
			 Select dropdown = new Select(driver.findElement(ProgramNameDropdown));

		         List<WebElement> options = dropdown.getOptions();

		        return options;
				
			}
		 public List<WebElement> BatchNumberDropDownText()
			{
			 Select dropdown = new Select(driver.findElement(BatchNumberDropdown));

		         List<WebElement> options = dropdown.getOptions();

		        return options;
				
			}
//		 public  String DataTableBatchId()
//			{
//			String batches = driver.findElement(BatchId).getText();
//		            return batches;
//		        }
		 public void ProgramNameDropDownText(List<String> programname) throws InterruptedException
			{
			 Select dropdown = new Select(driver.findElement(ProgramNameDropdown));
			 for (String id : programname)
			 {

                   dropdown.selectByValue(id);
			}
			}
//		 public void ClassNoTextBox(List<String> classno) throws InterruptedException
//			{
//			 for(String contents : classno) { 
//				driver.findElement(ClassNoTextBox).sendKeys(contents);
//				Thread.sleep(1000);
//			}
//			}
		 public void ClassDateCalender(List<String> classdate) throws InterruptedException
			{
			  WebElement classdatetextbox = driver.findElement(AssignmentDueDateInput);
			  classdatetextbox.click();
			 for (String date: classdate) {
				 By dateLocator = By.xpath("//td[@data-date='" + date + "']");
				 WebElement dateElement = driver.findElement(dateLocator);
			        dateElement.click();
			 }
			}
//		 public void StaffIdDropDown(List<String> staffid) throws InterruptedException
//			{
//			 Select dropdown = new Select(driver.findElement(BatchDropDown));
//			 for (String id : staffid) {
//
//                   dropdown.selectByValue(id);
//			}}
			 public void Click_Save() throws InterruptedException
				{
				 driver.findElement(Save).click();
								
			}
			 public  List<String> DataTable() throws InterruptedException
				{
				 List<String> rowData = new ArrayList<>();
				 List<WebElement> dataTableRowElements = driver.findElements(DataTable);
				 for (WebElement row : dataTableRowElements) {
			           
			            WebElement AssignmentNameCell = row.findElement(AssignmentName); 
			            WebElement AssignmentDescriptionCell = row.findElement(AssignmentDescription); 
			            WebElement AssignmentDueDateCell = row.findElement(AssignmentDueDate);
			            WebElement AssignmentGradeCell = row.findElement(AssignmentGrade);
			            String AssignmentNameData = AssignmentNameCell.getText();
			            String AssignmentDescriptionData = AssignmentDescriptionCell.getText();
			            String AssignmentDueDateData = AssignmentDueDateCell.getText();
			            String AssignmentGradeData = AssignmentGradeCell.getText();
			            
			            String rowDatas = "Assignment Name: " + AssignmentNameData + ", Assignment Description: " + AssignmentDescriptionData +
	                               ", Assignment Due Date: " + AssignmentDueDateData + ", Assignment Grade: " + AssignmentGradeData;

			            
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
//			 public void ClassTopicTextBox(List<String> classtopic) throws InterruptedException
//				{
//				 for(String contents : classtopic) { 
//					driver.findElement(ClassTopicTextBox).sendKeys(contents);
//					Thread.sleep(1000);
//				}
//				}
			 public void  AssignmentDescriptionTextBox(List<String> description) throws InterruptedException
				{
				 for(String contents : description) { 
					driver.findElement(AssignmentDescriptionTxt).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void Assignment1(List<String> assignment1) throws InterruptedException
				{
				 for(String contents : assignment1) { 
					driver.findElement(Assignment1).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void Assignment2(List<String> notes) throws InterruptedException
				{
				 for(String contents : notes) { 
					driver.findElement(Assignment2).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void Assignment3(List<String> recording) throws InterruptedException
				{
				 for(String contents : recording) { 
					driver.findElement(Assignment3).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void Assignment4(List<String> comments) throws InterruptedException
				{
				 for(String contents : comments) { 
					driver.findElement(Assignment4).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public void Assignment5(List<String> notes) throws InterruptedException
				{
				 for(String contents : notes) { 
					driver.findElement(Assignment5).sendKeys(contents);
					Thread.sleep(1000);
				}
				}
			 public String ClassDateTextBox() throws InterruptedException
				{
					String datecontent= driver.findElement(AssignmentDueDateInput).getText();
					return datecontent;
										
				}
			 public void DatePickerRightArrow() throws InterruptedException
				{
					driver.findElement(DatePickerRightArrow).click();
				}
			public void DatePickerLeftArrow() throws InterruptedException
				{
					driver.findElement(DatePickerLeftArrow).click();
				}
			 public String Date() throws InterruptedException, ParseException
				{
				 String datecontent= driver.findElement(AssignmentDueDateInput).getText();
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					Date parsedDate = sdf.parse(datecontent);
			        String formattedDate = sdf.format(parsedDate);
					return formattedDate;
										
				}
			 public String Month() throws InterruptedException, ParseException
				{
				 String datecontent= driver.findElement(AssignmentDueDateInput).getText();
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					Date parsedDate = sdf.parse(datecontent);
					 SimpleDateFormat monthformat = new SimpleDateFormat("MM");
						String currentMonth = monthformat.format(parsedDate);
					return currentMonth;
										
				}
			 
			 public String DatePreviousMonth() throws InterruptedException, ParseException
				{
				 String datecontent= driver.findElement(AssignmentDueDateInput).getText();
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
			 
			 public String DateNextMonth() throws InterruptedException, ParseException
				{
				 String datecontent= driver.findElement(AssignmentDueDateInput).getText();
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					Date parsedDate = sdf.parse(datecontent);
				  SimpleDateFormat monthformat = new SimpleDateFormat("MM");
							String currentMonth = monthformat.format(parsedDate);
							int monthInt = Integer.parseInt(currentMonth);
							if (monthInt < 12) {
						        monthInt++;
						    } else {
						        monthInt = 1;			    }
 					    String nextMonth = String.format("%02d", monthInt);
								return nextMonth;		
				}
			 public void DatePickerClick() throws InterruptedException
				{
					driver.findElement(Calender).click();
				}
			 public String CurrentDate() throws InterruptedException
				{
				 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
				 	 Date date = new Date();
					 String date1= dateFormat.format(date);
					 return date1;
				}
			 public String DatePickerdate() throws InterruptedException
				{  
					String date = driver.findElement(Calender).getText();
					return date;
				}
			 public void FutureDate() throws InterruptedException
				{
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
			 public List<String> DataTableDescendingSort() throws InterruptedException
				{
				 							
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				      List<String> AssignmentNameList = new ArrayList<>();
				    for (WebElement row : datatablerowelements) {
				        WebElement AssignmentNameCell = row.findElement(AssignmentName);
				        String assignmentname = AssignmentNameCell.getText();
				        AssignmentNameList.add(assignmentname);
				    }

				    List<String> tablesortedlist = new ArrayList<>(AssignmentNameList);
				    Collections.sort(tablesortedlist, Collections.reverseOrder());
		   				    
			     return tablesortedlist;
			    		 
				}
			 public List<String> AssignmentNameSortedList() throws InterruptedException
				{
				 							
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				      List<String> AssignmentNameList = new ArrayList<>();
				    for (WebElement row : datatablerowelements) {
				        WebElement AssignmentNameCell = row.findElement(AssignmentName);
				        String AssignmentName = AssignmentNameCell.getText();
				        AssignmentNameList.add(AssignmentName);
				    }

				    	   				    
			     return AssignmentNameList ;
			    		 
				}
			 public List<String> DataTableAscendingSort() throws InterruptedException
				{
				 							
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				      List<String> AssignmentNameList = new ArrayList<>();
				    for (WebElement row : datatablerowelements) {
				        WebElement AssignmentNameCell = row.findElement(AssignmentName);
				        String AssignmentName = AssignmentNameCell.getText();
				        AssignmentNameList.add(AssignmentName);
				    }

				    List<String> tablesortedlist = new ArrayList<>(AssignmentNameList);
				    Collections.sort(tablesortedlist);
		   				    
			     return tablesortedlist;
			    		 
				}
			 public WebElement PageNo1() throws InterruptedException
				{
			        List<WebElement> allPages = (List<WebElement>) driver.findElement(Pagination);
			      WebElement page1 = null;
			        for(WebElement page : allPages)
			        {
			        	if (page.getText().equals("1")) {
			        		page1 = page;
			        	}
			        		
			        }
			        return page1;
				}
			 public WebElement PageNo2() throws InterruptedException
				{
			        List<WebElement> allPages = (List<WebElement>) driver.findElement(Pagination);
			      WebElement page2 = null;
			        for(WebElement page : allPages)
			        {
			        	if (page.getText().equals("2")) {
			        		page2 = page;
			        	}
			        		
			        }
			        return page2;
				}
			 public boolean LeftArrowPagination() throws InterruptedException
				{
				 List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement leftarrow=null;
                   if (datatablerowelements.size()> 5)
                   {
                  	  leftarrow  = driver.findElement(LeftArrowPagination);
                   }
                   return leftarrow!= null && !leftarrow.isDisplayed();
				}
			 public boolean LeftArrowPage2() throws InterruptedException
				{
				 List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement leftarrow=null;
             
               	  leftarrow  = driver.findElement(LeftArrowPagination);
               
                return leftarrow!= null && leftarrow.isDisplayed();
				}
			 public boolean RightArrowPagination() throws InterruptedException
				{
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement rightarrow=null;
                      if (datatablerowelements.size()> 5)
                      {
                     	  rightarrow  = driver.findElement(RightArrowPagination);
                      }
                      return rightarrow!= null && rightarrow.isEnabled();
				}
			 public boolean RightArrowPage2() throws InterruptedException
				{
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement rightarrow=null;
                   if (datatablerowelements.size()> 10)
                   {
                  	  rightarrow  = driver.findElement(RightArrowPagination);
                   }
                   return rightarrow!= null && rightarrow.isEnabled();
				}
			 public boolean RightArrowPage2Disable() throws InterruptedException
				{
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement rightarrow=null;
                if (datatablerowelements.size()< 10)
                {
               	  rightarrow  = driver.findElement(RightArrowPagination);
                }
                return rightarrow!= null && !rightarrow.isEnabled();
				}
			 public boolean PaginationEnable() throws InterruptedException
				{
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement pagination=null;
             if (datatablerowelements.size()> 5)
             {
            	  pagination  = driver.findElement(Pagination);
             }
             return pagination.isEnabled();
				}
			 public boolean PaginationDisable() throws InterruptedException
				{
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				    WebElement pagination=null;
          if (datatablerowelements.size()< 5)
          {
         	  pagination  = driver.findElement(Pagination);
          }
          return !pagination.isEnabled();
				}
			 public WebElement NextPageEnable() throws InterruptedException
				{	
                WebElement rightarrow  = driver.findElement(RightArrowPagination);
                int noofentries= 6;
                if (noofentries > 5 && rightarrow.isEnabled()) {
                    return rightarrow;
                } else {
                    return null; 
                }
				}
                public WebElement NextPageDisable() throws InterruptedException
				{	
                   WebElement rightarrow  = driver.findElement(RightArrowPagination);
                   int noofentries= 4;
                   if (noofentries <= 5 && !rightarrow.isEnabled()) {
                       return rightarrow;
                   } else {
                       return null; 
                   }
			 
				} 
			 public void Click_Cancel() throws InterruptedException
				{
					 driver.findElement(Cancel).click();
				}
			 public void Click_Edit() throws InterruptedException
				{
					 driver.findElement(EditAssignment).click();
					
				}
			 public void Click_EditA() throws InterruptedException
				{
					 driver.findElement(EditA).click();
					
				}
			 public void Click_Student() throws InterruptedException
        		{
        			driver.findElement(Student).click();
        		}
                public void Click_Program() throws InterruptedException
     		{
     			driver.findElement(Program).click();
     		}
                public void Click_Batch() throws InterruptedException
     		{
     			driver.findElement(Batch).click();
     		}
                public void Click_User() throws InterruptedException
     		{
     			driver.findElement(User).click();
     		}
                public void Click_Class() throws InterruptedException
     		{
     			driver.findElement(Class).click();
     			Thread.sleep(1000);
     		}
                public void Click_Attendance() throws InterruptedException
     		{
     			driver.findElement(Attendance).click();
     			Thread.sleep(1000);
     		}
     		public void Click_Logout() throws InterruptedException
     		{
     			driver.findElement(Logout).click();
     			Thread.sleep(1000);
     		}
			
			 
}


