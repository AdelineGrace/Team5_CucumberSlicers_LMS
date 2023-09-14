package POM_lms;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class User_PageObject {
	WebDriver driver;

	
	//User file
	By User = By.xpath("//input[text='user']");
	By show_entries = By.xpath("//input[text='In total there are 2 users']");
	By userId = By.xpath("//*[@id=’userId’]/tbody/tr[1]/td[1]");
	By userName = By.xpath("//*[@id=’userName’]/tbody/tr[1]/td[2]");
	By userLocation = By.xpath("//*[@id=’userLocation’]/tbody/tr[2]/td[1]");
	By userPhone = By.xpath("//*[@id=’userPhone’]/tbody/tr[2]/td[2]");
	By Edit = By.xpath("//*[@id=’edit’]/tbody/tr[2]/td[10]");
	By delete_button_left = By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[11]");
	By delete_button = By.xpath("//*[@id=’delete’]/tbody/tr[2]/td[1]");
	By addNew_user = By.xpath("//button[@type='button'][text()='Add New']");
	By assign_staff = By.xpath("//button[@type='button'][text()='Assign staff']");
	By Search = By.xpath("//a[text()='Search']");
	By DataTable = By.xpath("//*[@id=’User’]/tbody/tr/td");
	By checkboxs = By.xpath(".//input[@type='checkbox']");
	By checkbox = By.xpath("//*[@id=’checkbox’]/tbody/tr[2]/td[6]");
	By FirstName = By.xpath("//*[@id=’userName’]/tbody/tr[1]/td[2]");
	By Middlename = By.xpath("//*[@id=’middleName’]/tbody/tr[1]/td[3]");
	By LastName = By.xpath("//*[@id=’LastName’]/tbody/tr[1]/td[4]");
	By Location = By.xpath("//*[@id=’location’]/tbody/tr[1]/td[5]");
	By phone = By.xpath("//*[@id=’phone’]/tbody/tr[2]/td[6]");
	By email = By.xpath("//*[@id=’email’]/tbody/tr[1]/td[2]");
	By linkedinUrl = By.xpath("//*[@id=’linkedin’]/tbody/tr[1]/td[3]");
	By Undergraduate = By.xpath("//*[@id=’undergraduate’]/tbody/tr[1]/td[5]");
	By postgraduate = By.xpath("//*[@id=’postgraduate’]/tbody/tr[1]/td[6]");
	By userRole = By.xpath("//a[@class='user-role dropdown-toggle']");
	By roleStatus = By.xpath("//a[@class='role-status dropdown-toggle']");
	By visaStatus = By.xpath("//a[@class='visa-status dropdown-toggle']");
	By timezone = By.xpath("//*[@id=’timezone’]/tbody/tr[1]/td[7]");
	By usercomments = By.xpath("//*[@id=’usercomments’]/tbody/tr[1]/td[8]");
	By time_zone = By.xpath("//a[text()='time']");
	By DataTables = By.xpath("//*[@id=’User’]/tbody/tr/td");
	By Submit = By.xpath("//button[text()='submit']");
	By newUser = By.xpath("//input[@class='User']");
	By updatedFirstName = By.xpath("//*[@id=’userName’]/tbody/tr[1]/td[1]");
	By updatedLocation = By.xpath("//*[@id=’LastName’]/tbody/tr[1]/td[4]");
	By Users = By.xpath(".//input[text='user']");
	By CheckBox1 = By.xpath("//*[@id=’checkbox’]/tbody/tr[2]/td[1]");
	By CheckBox2 = By.xpath("//*[@id=’checkbox’]/tbody/tr[3]/td[1]");
	By CheckBox3 = By.xpath("//*[@id=’checkbox’]/tbody/tr[4]/td[1]");

	public User_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnUser() {
		driver.findElement(User).click();
	}

	public WebElement pagination_text() {
		return driver.findElement(show_entries);
	}

	public WebElement userId() {
		return driver.findElement(userId);
	}

	public WebElement userName() {
		return driver.findElement(userName);
	}

	public WebElement userLocation() {
		return driver.findElement(userLocation);
	}

	public WebElement userPhoneno() {
		return driver.findElement(userPhone);
	}

	public WebElement EditClass() {
		return driver.findElement(Edit);
	}

	public WebElement DeleteClass() {
		return driver.findElement(delete_button);
	}

	public WebElement Addnew() throws InterruptedException {
		return driver.findElement(addNew_user);

	}

	public WebElement assignStaff() throws InterruptedException {
		return driver.findElement(assign_staff);

	}

	public WebElement Search() throws InterruptedException {
		return driver.findElement(Search);
	}

	public void checkbox() {
		WebElement table = driver.findElement(DataTable);
		List<WebElement> checkboxes = table.findElements(checkboxs);
		for (WebElement checkbox : checkboxes) {
			Assert.assertTrue(checkbox.isDisplayed(), "Checkbox is not displayed in a row.");
		}
	}

	public void first_name(List<String> name) throws InterruptedException {
		for (String contents : name) {
			driver.findElement(FirstName).sendKeys(contents);
			Thread.sleep(1000);
		}
	}

	public void last_name(List<String> name) {
		for (String contents : name) {

			driver.findElement(LastName).sendKeys(contents);
		}
	}

	public void middle_name(List<String> name) {
		for (String contents : name) {
			driver.findElement(Middlename).sendKeys(contents);
		}
	}

	public void location(List<String> name) {
		for (String contents : name) {
			driver.findElement(Location).sendKeys(contents);
		}
	}

	public void phone(List<String> name) {
		for (String contents : name) {
			driver.findElement(phone).sendKeys(contents);
		}
	}

	public void email(List<String> name) {
		for (String contents : name) {
			driver.findElement(email).sendKeys(contents);
		}
	}

	public void linkedinurl(List<String> name) {
		for (String contents : name) {
			driver.findElement(linkedinUrl).sendKeys(contents);
		}
	}

	public void undergraduate(List<String> name) {
		for (String contents : name) {
			driver.findElement(Undergraduate).sendKeys(contents);
		}
	}

	public void postgraduate(List<String> name) {
		for (String contents : name) {
			driver.findElement(postgraduate).sendKeys(contents);
		}
	}

	public void timezone(List<String> name) {
		for (String contents : name) {
			driver.findElement(time_zone).sendKeys(contents);
		}
	}

	public void usercomments(List<String> name) {
		for (String contents : name) {
			driver.findElement(usercomments).sendKeys(contents);
		}
	}

	public WebElement isFirstnamePresent() {
		return driver.findElement(FirstName);

	}

	public WebElement lastname() {
		return driver.findElement(LastName);

	}

	public WebElement middlename() {
		return driver.findElement(Middlename);

	}

	public WebElement locationDisplayed() {
		return driver.findElement(Location);

	}

	public WebElement phoneNo() {
		return driver.findElement(phone);

	}

	public WebElement emailDisplayed() {
		return driver.findElement(email);

	}

	public WebElement linkedinurlD() {
		return driver.findElement(linkedinUrl);
	}

	public WebElement undergraduateD() {

		return driver.findElement(Undergraduate);
	}

	public WebElement postgraduateD() {

		return driver.findElement(postgraduate);
	}

	public WebElement timezoneD() {

		return driver.findElement(time_zone);
	}

	public WebElement usercommentsD() {

		return driver.findElement(usercomments);
	}

	public void clickOnSubmit() {
		driver.findElement(Submit).click();
	}

	public WebElement userAdded() {
		return driver.findElement(newUser);
	}

	public boolean DataTableEmpty() {
		WebElement dataTable = driver.findElement(DataTable);
		String dataTableText = dataTable.getText().trim();
		return dataTableText.isEmpty();
	}

	public WebElement editButton() {
		return driver.findElement(Edit);
	}

	public WebElement updatedfirstName() {

		return driver.findElement(updatedFirstName);
	}

	public WebElement updatedLocation() {
		return driver.findElement(updatedLocation);
	}

	public void deleteMandotaryfields() {
		driver.findElement(FirstName).clear();
		driver.findElement(LastName).clear();
		driver.findElement(Location).clear();
		driver.findElement(userRole).clear();
		driver.findElement(roleStatus).clear();
		driver.findElement(visaStatus).clear();
	}
	public boolean deleteisEnabled() {
		WebElement delete = driver.findElement(delete_button);
		return delete.isEnabled();
		 }
	public void clickOnDelete() {
		driver.findElement(delete_button);
	}
	public Alert alertMsg() {
		return driver.switchTo().alert();
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	public void checkBoxDisabled() {
		WebElement table = driver.findElement(DataTable);
		List<WebElement> checkboxes = table.findElements(checkboxs);
		boolean anyCheckboxSelected = false;
		for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                anyCheckboxSelected = true;
                break; 
            }
        }
		 Assert.assertFalse(anyCheckboxSelected, "One or more checkboxes are selected.");
	}
	
	public WebElement deleteisdisabled() {
	return driver.findElement(delete_button_left);
				
				}
		 public WebElement checkboxIsSelected() {
			return driver.findElement(checkbox);
		 }
		 public void clickOnLeftDelete() {
				driver.findElement(delete_button_left);
			}
		 public void isRecordPresentInTable(List<String> recordId) {
		        
		        List<WebElement> dataTable = driver.findElements(DataTables);
		        boolean recordPresent = false;
		        for(WebElement dataTables : dataTable) {
		        	if(dataTable.contains(recordId)) {
		        		recordPresent = true;
		        		break;
		        		}
		       }
		        Assert.assertFalse(recordPresent, "Record is not present");
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
}





	
	
	

