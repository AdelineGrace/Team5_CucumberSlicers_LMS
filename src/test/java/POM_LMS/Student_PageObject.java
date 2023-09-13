package POM_LMS;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Student_PageObject {
	
	
	By Student = By.xpath("//button[@type='button'][text()='Student']");
	By LMS = By.xpath("//a[text()='LMS']");
	By Studenttitle = By.xpath("//a[text()='Studenttitle']");
	By StudentNameDropDown = By.xpath("//a[@class='student-box dropdown-toggle']");
	By BatchIdDropDown = By.xpath("//a[@class='batch-box dropdown-toggle']");
	By StudentSearchBox = By.xpath("//a[text()='Searchbox']");
	By BatchSearchBox = By.xpath("//a[text()='Searchbox']");
	By SelectedStudentTextBox = By.xpath("//span[contains(text(),'select student name')]");
	By SelectedBatchTextBox = By.xpath("//span[contains(text(),'select batch id')]");
    By StudentList = By.cssSelector("student_list");
    By BatchIdList = By.cssSelector("batch_list"); 
	By StudentDetails = By.id("student-details");
	By Program = By.xpath("//button[@type='button'][text()='Program']");	
	By Batch = By.xpath("//button[@type='button'][text()='Batch']");	
	By User = By.xpath("//button[@type='button'][text()='User']");	
	By Assignment = By.xpath("//button[@type='button'][text()='Assignment']");	
	By Attendance = By.xpath("//button[@type='button'][text()='Attendance']");	
	By Logout = By.xpath("//button[@type='button'][text()='Logout']");	
	By Class = By.xpath("//button[@type='button'][text()='Class']");	

	
	
	WebDriver driver;
	
	public Student_PageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Click_Student() throws InterruptedException
	{
		driver.findElement(Student).click();
		Thread.sleep(1000);
	}
	public String LMS_title() throws InterruptedException
	{
		String lms= driver.findElement(LMS).getText();
		return lms;
				
	}
	public void Location_title() throws InterruptedException
	{
		
        WebElement element = driver.findElement(Studenttitle);
        
        org.openqa.selenium.Point location = element.getLocation();
        int X =location.getX();
        int Y =location.getY();
        int Width = driver.manage().window().getSize().getWidth();
        int Height = driver.manage().window().getSize().getHeight();
        int CenterX = Width / 2;
        int CenterY = Height / 2;
        int tolerance = 10;
      
        boolean isCentered = Math.abs(X - CenterX) <= tolerance
                && Math.abs(Y - CenterY) <= tolerance;
        if (isCentered) {
            System.out.println("The element is at the center of the page.");
        } else {
            System.out.println("The element is not at the center of the page.");
        }
  
        	}
	public WebElement StudentNameDropDown() throws InterruptedException
	{
		return driver.findElement(StudentNameDropDown);
				
	}
	public WebElement BatchIdDropDown() throws InterruptedException
	{
		return driver.findElement(BatchIdDropDown);
				
	}
	public WebElement StudentSearchBoxDropDown() throws InterruptedException
	{
		return driver.findElement(StudentSearchBox);
				
	}
	public WebElement BatchSearchBoxDropDown() throws InterruptedException
	{
		return driver.findElement(BatchSearchBox);
				
	}
	public String StudentName() throws InterruptedException
	{
		String name = driver.findElement(StudentSearchBox).getText();
		return name;
				
	}
	public String BatchId() throws InterruptedException
	{
		String name = driver.findElement(BatchSearchBox).getText();
		return name;
				
	}
	public boolean BatchDropDownText()
	{
	 Select dropdown = new Select(driver.findElement(BatchSearchBox));

         List<WebElement> options = dropdown.getOptions();
         String optionText = ((WebElement) options).getText().trim();
         List<Boolean> batchidlist = new ArrayList<>();
         boolean batchid = optionText.matches("^[0-9]+$");
         batchidlist.add(batchid);
        return batchid;
		
	}
	public boolean StudentNameColor()
	{
	  WebElement studentbox = driver.findElement(StudentSearchBox);
	  String name = studentbox.getText();
	   String color = studentbox.getCssValue("color");
       color = color.toLowerCase().replace(" ", "");
        boolean isGray = color.equals("gray") || color.equals("rgb(128,128,128)");
        return isGray;         
		
	}
	public boolean BatchIdColor()
	{
	  WebElement batchidbox = driver.findElement(BatchSearchBox);
	   String color = batchidbox.getCssValue("color");
       color = color.toLowerCase().replace(" ", "");
        boolean isGray = color.equals("gray") || color.equals("rgb(128,128,128)");
        return isGray;         
		
	}
	public boolean FirstSearchBox() throws InterruptedException
	{
		WebElement studentDropdown = driver.findElement(StudentSearchBox); 
           Select dropdown = new Select(studentDropdown);
        WebElement firstOption = dropdown.getFirstSelectedOption();
        String firstOptionText = firstOption.getText().trim();
        String expectedText = "select student name";
        boolean isFirst = firstOptionText.equals(expectedText);
        return isFirst;
				
	}
	public boolean SecondSearchBox() throws InterruptedException
	{
		WebElement batchDropdown = driver.findElement(BatchSearchBox); 
           Select dropdown = new Select(batchDropdown);
           dropdown.selectByIndex(1);
        WebElement secondOption = dropdown.getFirstSelectedOption();
        String secondOptionText = secondOption.getText().trim();
        String expectedText = "select batch id";
        boolean isSecond = secondOptionText.equals(expectedText);
        return isSecond;
				
	}
	public boolean ScrollStudentBox() throws InterruptedException
	{
		WebElement studentDropdown = driver.findElement(StudentSearchBox); 
        Select dropdown = new Select(studentDropdown);
        Actions actions = new Actions(driver);
        studentDropdown.click();
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(studentDropdown, org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
        }
   dropdown.selectByIndex(2);
                return true;
				
	}
	public boolean ScrollBatchBox() throws InterruptedException
	{
		WebElement batchDropdown = driver.findElement(BatchSearchBox); 
        Select dropdown = new Select(batchDropdown);
        Actions actions = new Actions(driver);
        batchDropdown.click();
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(batchDropdown, org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
        }
        dropdown.selectByIndex(2);
        return true;
            
	}

public boolean SelectedStudentTextBox() throws InterruptedException
{
	WebElement Dropdown = driver.findElement(SelectedStudentTextBox); 
   
    return Dropdown.isDisplayed();
        
}
public boolean SelectedBatchTextBox() throws InterruptedException
{
	WebElement batchDropdown = driver.findElement(SelectedBatchTextBox); 
   
    return batchDropdown.isDisplayed();
        
}
public void EntersStudentX() throws InterruptedException
{
	
  driver.findElement(StudentSearchBox).sendKeys("x");
 			
}
public void EntersBatchX() throws InterruptedException
{
	
  driver.findElement(BatchSearchBox).sendKeys("x");
 			
}
public boolean StudentStartsWithX() throws InterruptedException
{
	
List<WebElement> studentNameList = driver.findElements(StudentList); // Replace with the actual CSS selector
for (WebElement studentName : studentNameList) {
    String studentNameText = studentName.getText().trim();

   if (!studentNameText.startsWith("x")) {
           return false;
      
   }
}

return true;
}
public boolean BatchStartsWithX() throws InterruptedException
{
	
List<WebElement> batchidList = driver.findElements(BatchIdList); // Replace with the actual CSS selector
for (WebElement batchId : batchidList) {
    String batchIdText = batchId.getText().trim();

   if (!batchIdText.startsWith("x")) {
           return false;
      
   }
}

return true;
}

public void StudentNameContent(List<String> studentname) throws InterruptedException
{
	Select dropdown = new Select(driver.findElement(StudentNameDropDown));
	 for (String name : studentname) {

          dropdown.selectByValue(name);
	}
}
public void BatchIdContent(List<String> batchid) throws InterruptedException
{
	Select dropdown = new Select(driver.findElement(BatchIdDropDown));
	 for (String id : batchid) {

          dropdown.selectByValue(id);
	}
}
public boolean StudentDetails() throws InterruptedException
{
	WebElement studentdetails = driver.findElement(StudentDetails); 
   
    return studentdetails.isDisplayed();
        
}
public void Click_Class() throws InterruptedException
	{
		driver.findElement(Class).click();
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

