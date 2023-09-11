package PageObject;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import java.sql.DriverManager;

import java.util.List;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.Loggerload;
import static Utilities.ConfigReader.getDashboardURL;
import static org.testng.Assert.assertEquals;
import static Utilities.ConfigReader.classHeader;

import static Utilities.ConfigReader.classFields;




import Driver.DriverFactory;
//import StepDefinition_LMS.By;
import Utilities.ConfigReader;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.Point;
import Utilities.ConfigReader;


public class ResetPassword_PO1 {
	public static WebDriver driver = DriverFactory.getDriver();

	//	String url = ConfigReader.loginUrl();

		public  ResetPassword_PO1(WebDriver webDriver) {

		PageFactory.initElements(driver,this);



				}
		@FindBy(id ="resetpassword") WebElement Reset_Password;
		@FindBy(className ="navbar-text") WebElement ResetnavigationBar;
		@FindBy(id ="submit") WebElement Submit;
		@FindBy(id = "text-new") By txt1;
		@FindBy(id = "text-retype") By txt2;
		@FindBy(xpath = "//div[@label1 = 'Type in new password']") WebElement label1;
		@FindBy(xpath = "//div[@label2 = 'ReType password']") WebElement label2;
		@FindBy(xpath= "//button[@type='button'][text()='Cancel']") WebElement submit;

			
		public void ResetClick()
		{
			Reset_Password.click();
		}
		
		public void ResetPassword() throws IOException{
			String URL = ConfigReader.getResetPasswordURL(); 
			driver.get(URL);
		}		


		public String getCurrentPageTitle() {
			 return driver.getTitle().trim();
			}

		public String getResetNavBarText() {
			return ResetnavigationBar.getText();

			}
		
		public void SubmitAlignment() {
			
			  assertEquals("left",Submit.getAttribute("align"));
			}
		
		public WebElement user_txtvalue() throws InterruptedException

		{

			return (WebElement) driver.findElement(txt1);

					}

		public WebElement password_txtvalue() throws InterruptedException

		{

			return (WebElement) driver.findElement(txt2);

					}

		public WebElement label1_displayed() throws InterruptedException

		{

			return (WebElement) driver.findElement((By) label1);

					}

		public WebElement label2_displayed() throws InterruptedException

		{

			return (WebElement) driver.findElement((By) label2);

					}

		 public WebElement Submit() throws InterruptedException
			{
				return driver.findElement((By) submit);
				
			}
		
}

		




