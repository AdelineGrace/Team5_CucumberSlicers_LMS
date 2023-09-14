package POM_LMS;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import Utilities.ConfigReader;

public class ResetPassword_PageObject {
public static WebDriver driver = DriverFactory.getDriver();


public  ResetPassword_PageObject(WebDriver webDriver) {

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
@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement Login;
@FindBy(id ="typepassword1") WebElement TypePassword;
@FindBy(id ="typepassword2") WebElement RetypePassword;
@FindBy(xpath ="/html/body/div[3]")WebElement err_message;
@FindBy(xpath ="/html/body/div[3]")WebElement passwordmessage;


public void Login() throws IOException{
String URL = ConfigReader.getloginURL();
driver.get(URL);
}

public void type_password()
{
label1.click();
}

public void retype_password()
{
label2.click();
}


public void validPassword(String pwd, String pwdconfirm) throws IOException {


TypePassword.sendKeys(pwd);
RetypePassword.sendKeys(pwdconfirm);
Login.click();
}

public void emptyPassword(String pwd, String pwdconfirm) {

TypePassword.sendKeys("");
RetypePassword.sendKeys("");
Login.click();
}

public void mismatchPassword(String pwd1, String pwd2) {

TypePassword.sendKeys(pwd1);
RetypePassword.sendKeys(pwd2);
Login.click();
}
public void invalidPassword(String pwds,String pwdconfirms) {

TypePassword.sendKeys(pwds);
RetypePassword.sendKeys(pwdconfirms);
Login.click();
}


public void error_message() throws IOException
{
String message = err_message.getText();
System.out.println(message);
TakesScreenshot screenshots = null;
TakesScreenshot ts = (TakesScreenshot) screenshots;
File src = ts.getScreenshotAs(OutputType.FILE);
File src1 = ((TakesScreenshot) screenshots).getScreenshotAs(OutputType.FILE);
Date dt = new Date();
DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
File trg = new File(".\\Screenshots\\image.png");
FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));

}


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
public void message() throws IOException
{
String message = passwordmessage.getText();
System.out.println(message);
TakesScreenshot screenshots = null;
TakesScreenshot ts = (TakesScreenshot) screenshots;
File src = ts.getScreenshotAs(OutputType.FILE);
File src1 = ((TakesScreenshot) screenshots).getScreenshotAs(OutputType.FILE);
Date dt = new Date();
DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
File trg = new File(".\\Screenshots\\image.png");
FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
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
