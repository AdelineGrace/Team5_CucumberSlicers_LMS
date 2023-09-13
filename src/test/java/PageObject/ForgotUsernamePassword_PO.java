package PageObject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;
import Utilities.ConfigReader;

public class ForgotUsernamePassword_PO {

	

	
	public static WebDriver driver = DriverFactory.getDriver();
	public  void ForgotUsernamePassword(WebDriver webDriver) {
	PageFactory.initElements(driver,this);

			
		}
	@FindBy(id = "forgot username or password") WebElement forgot_UP;
	@FindBy(xpath= "//button[@type='button'][text()='Cancel']") WebElement sendlink;
	@FindBy(id = "txtemail") WebElement TxtEmailbox;
	@FindBy(id = "*") WebElement  Asterik;

	@FindBy(id ="email-label") WebElement Email;
	@FindBy (xpath="/html/body/div[4]") WebElement errormessage;

	
	public void Login() throws IOException{
		String URL = ConfigReader.getloginURL(); 
		driver.get(URL);
	}		

	public void Forgot_Username() throws IOException{
		String URL = ConfigReader.getForgotPasswordURL(); 
		driver.get(URL);
	}		
	public String SendLinkAlignment() {
		
			return sendlink.getAttribute("style");
		}
		
	public String getCurrentPageTitle()
		{
		 return driver.getTitle().trim();
		}
	
	public String Forgotpage()


	{
		return driver.getTitle();
	}

	public void valid_EmailId(String email)
	{
		Email.sendKeys(email);
		sendlink.click();	

	}
	
	public void Invalid_EmailId(String InvalidEmail)
	{
		Email.sendKeys(InvalidEmail);
		sendlink.click();	

	}

	public String[] user_text_color()
	{
	String colorString = TxtEmailbox.getAttribute("class");
	String[] arrColor = colorString .split("#");
	return arrColor;
	}

	public void verifyhttplink() throws IOException
	{
	String URL = ConfigReader.getForgotPasswordURL(); 

	try {

	URL link = new URL(URL);
	HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
	httpURLConnection.connect();
	if (httpURLConnection.getResponseCode()> 400) {
	System.out.println(URL + " - " + httpURLConnection.getResponseMessage());
	} else {
	System.out.println(URL + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
	}
	} 
	catch (Exception e) {
	System.out.println(URL + " - " + "is a broken link");

	}
	}
	public void linkclick() throws IOException
	{
		forgot_UP.click();
	}		
	
	public WebElement EmailText() throws InterruptedException

	{

	return driver.findElement((By) TxtEmailbox);

				}
	
	public WebElement SendLink() throws InterruptedException

	{

		return driver.findElement((By) sendlink);

		

	}

	public boolean Asterik_Verify()
	{
		return Asterik.isDisplayed();
	}

	public  String verifySendLinkText()
	{
		return sendlink.getText();
	}
	
	public  String verifyEmaiText()
	{
		return TxtEmailbox.getText();
	}
	public void Email_Verification()
	{
		String message = errormessage.getText();
				if(message== "Email sent")
				{
					System.out.println("The Admin received email");
				}
	}
	public void Email_Verification_invalid()
	{
		String message = errormessage.getText();
				if(message== "Please check email id")
				{
					System.out.println("The Admin did not received email");
				}
	}
}
