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
	By Pagination =  By.xpath("//div[@id='reportPagination_wrapper']//a");
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
    By DatePickerRightArrow = By.cssSelector(".date-picker .right-arrow");
    By DatePickerLeftArrow = By.cssSelector(".date-picker .left-arrow");
    By DatePickerPreviousMonth = By.cssSelector(".date-picker .month");
    By DatePickerNextMonth = By.cssSelector(".date-picker .month");
    By Yes = By.xpath("//button[@type='button'][text()='yes']");
    By No = By.xpath("//button[@type='button'][text()='no']");
    By RightArrowPagination = By.xpath("//div[@class='pagination']//a[@class='right']");
    By LeftArrowPagination = By.xpath("//div[@class='pagination']//a[@class='left']");
	By Student = By.xpath("//button[@type='button'][text()='Student']");	
	By Program = By.xpath("//button[@type='button'][text()='Program']");	
	By Batch = By.xpath("//button[@type='button'][text()='Batch']");	
	By User = By.xpath("//button[@type='button'][text()='User']");	
	By Assignment = By.xpath("//button[@type='button'][text()='Assignment']");	
	By Attendance = By.xpath("//button[@type='button'][text()='Attendance']");	
	By Logout = By.xpath("//button[@type='button'][text()='Logout']");	
			
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
		 public List<WebElement> StaffIdDropDownText()
			{
			 Select dropdown = new Select(driver.findElement(StaffDropDown));

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
			 public String ClassDateTextBox() throws InterruptedException
				{
					String datecontent= driver.findElement(ClassDateTextBox).getText();
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
				 String datecontent= driver.findElement(ClassDateTextBox).getText();
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					Date parsedDate = sdf.parse(datecontent);
			        String formattedDate = sdf.format(parsedDate);
					return formattedDate;
										
				}
			 public String Month() throws InterruptedException, ParseException
				{
				 String datecontent= driver.findElement(ClassDateTextBox).getText();
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					Date parsedDate = sdf.parse(datecontent);
					 SimpleDateFormat monthformat = new SimpleDateFormat("MM");
						String currentMonth = monthformat.format(parsedDate);
					return currentMonth;
										
				}
			 
			 public String DatePreviousMonth() throws InterruptedException, ParseException
				{
				 String datecontent= driver.findElement(ClassDateTextBox).getText();
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
				 String datecontent= driver.findElement(ClassDateTextBox).getText();
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
			 public void Click_Cancel() throws InterruptedException
				{
					 driver.findElement(Cancel).click();
				}
			 public void Click_Edit() throws InterruptedException
				{
					 driver.findElement(EditClass).click();
					
				}
			 public void Click_EditA() throws InterruptedException
				{
					 driver.findElement(EditA).click();
					
				}
			 public String ClassNoContents() throws InterruptedException
				{
				WebElement classnotextbox =  driver.findElement(BatchIdTextBox);
				String textboxcontents = classnotextbox.getAttribute("value");
						 return textboxcontents;
							
				}
			 public String DescriptionContents() throws InterruptedException
				{
				WebElement decriptiontextbox =  driver.findElement(BatchIdTextBox);
				String textboxcontents = decriptiontextbox.getAttribute("value");
						 return textboxcontents;
							
				}
			 public String ClassTopicContents() throws InterruptedException
				{
				WebElement classtopictextbox =  driver.findElement(BatchIdTextBox);
				String textboxcontents = classtopictextbox.getAttribute("value");
						 return textboxcontents;
							
				}
			 public String CommentsContents() throws InterruptedException
				{
				WebElement commentstextbox =  driver.findElement(BatchIdTextBox);
				String textboxcontents = commentstextbox.getAttribute("value");
						 return textboxcontents;
							
				}
			 public String NotesContents() throws InterruptedException
				{
				WebElement notestextbox =  driver.findElement(BatchIdTextBox);
				String textboxcontents = notestextbox.getAttribute("value");
						 return textboxcontents;
							
				}
			 public String RecordingContents() throws InterruptedException
				{
				WebElement recordingtextbox =  driver.findElement(BatchIdTextBox);
				String textboxcontents = recordingtextbox.getAttribute("value");
						 return textboxcontents;
							
				}
			 public void Click_Delete() throws InterruptedException
				{
					 driver.findElement(DeleteA).click();
				}
			 public Alert DeleteAlert() throws InterruptedException
				{
					 Alert alert = driver.switchTo().alert();
					 return alert;
				}
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
			 public void Click_CheckBoxHeader() throws InterruptedException
				{
					driver.findElement(CheckBoxHeader).click();
				}
			 public void Click_DeleteHeader() throws InterruptedException
				{
					driver.findElement(DeleteAll).click();
				}
			 public void Click_CheckBoxA() throws InterruptedException
				{
					driver.findElement(CheckBox1).click();
				}
			 public void Click_DeleteA() throws InterruptedException
				{
					driver.findElement(DeleteA).click();
				}
			 public void Click_CheckBoxB() throws InterruptedException
				{
					driver.findElement(CheckBox2).click();
				}
			 public void Click_CheckBoxC() throws InterruptedException
				{
					driver.findElement(CheckBox3).click();
				}
			 public void Click_BatchIdSort() throws InterruptedException
				{
					driver.findElement(BatchIdSort).click();
				}
			 public List<String> DataTableDescendingSort() throws InterruptedException
				{
				 							
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				      List<String> BatchIdList = new ArrayList<>();
				    for (WebElement row : datatablerowelements) {
				        WebElement batchIDCell = row.findElement(BatchId);
				        String batchID = batchIDCell.getText();
				        BatchIdList.add(batchID);
				    }

				    List<String> tablesortedlist = new ArrayList<>(BatchIdList);
				    Collections.sort(tablesortedlist, Collections.reverseOrder());
		   				    
			     return tablesortedlist;
			    		 
				}
			 public List<String> BatchIdSortedList() throws InterruptedException
				{
				 							
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				      List<String> BatchIdList = new ArrayList<>();
				    for (WebElement row : datatablerowelements) {
				        WebElement batchIDCell = row.findElement(BatchId);
				        String batchID = batchIDCell.getText();
				        BatchIdList.add(batchID);
				    }

				    	   				    
			     return BatchIdList ;
			    		 
				}
			 public List<String> DataTableAscendingSort() throws InterruptedException
				{
				 							
				    List<WebElement> datatablerowelements = driver.findElements(DataTable);
				      List<String> BatchIdList = new ArrayList<>();
				    for (WebElement row : datatablerowelements) {
				        WebElement batchIDCell = row.findElement(BatchId);
				        String batchID = batchIDCell.getText();
				        BatchIdList.add(batchID);
				    }

				    List<String> tablesortedlist = new ArrayList<>(BatchIdList);
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
                   public void Click_Assignment() throws InterruptedException
        		{
        			driver.findElement(Assignment).click();
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
			    		 
				

