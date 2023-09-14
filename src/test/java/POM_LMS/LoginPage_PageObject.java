package POM_LMS;

import java.io.File;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.URL;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.interactions.Actions;

import Driver.DriverFactory;

import Utilities.ConfigReader;

import Utilities.Loggerload;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;





public class LoginPage_PageObject {



	public static WebDriver driver = DriverFactory.getDriver();

	public  void LoginPage(WebDriver webDriver) {

	PageFactory.initElements(driver,this);

	}

	@FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement Login;

	@FindBy (xpath="/html/body/div[1]/div[2]/div/img") WebElement Logo;

	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement Header;

	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement UserTxtBox;

	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement PassTextBox;

	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement userpasslink;

	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement resetpasslink;

	@FindBy (xpath="/html/body") WebElement Screenshotmessage;

	@FindBy (xpath="/html/body/div[3]") WebElement errormessage;

	@FindBy (xpath="/html/body/div[3]") WebElement UsernameAsterik;

	@FindBy (xpath="/html/body/div[5]") WebElement PasswordAsterik;



	//private By username;



public String open_portallink()

{

	return driver.getTitle();	

}





public String open_homepage()

{

	return driver.getTitle();	

}





public void login_Click()

{

	Login.click();

}



public String verify_loginTitle()

{

	return driver.getTitle();

}





public void check_brokenlinks() throws IOException

{

	List<WebElement> links = driver.findElements(By.tagName("a"));

	Loggerload.info("No of links are "+ links.size());  

      for(int i=0;i<links.size();i++)

    {

        WebElement E1= links.get(i);

        String url= E1.getAttribute("href");

        verifyLinks(url);

    }

}

public static void verifyLinks(String linkUrl) throws IOException

{

	String URL = ConfigReader.getloginURL(); 



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



		} catch (Exception e) {



		System.out.println(URL + " - " + "is a broken link");



		}

}





public boolean header_verify()

{

	return Header.isDisplayed();

}





public boolean usertxtField_verify()

{

	return UserTxtBox.isDisplayed();

}





public boolean passtxtField_verify()

{

	return PassTextBox.isDisplayed();

}





public String verify_defaultUsertxt()

{

	String usettext=UserTxtBox.getAttribute("name");

	return usettext;

	

}

public String verify_defaultPasstxt()

{

	String passtext=PassTextBox.getAttribute("name");

	return passtext;

	

}





public boolean forgot_user_pass_verify()

{

	return userpasslink.isDisplayed();

}

public boolean reset_pass_verify()

{

	return resetpasslink.isDisplayed();

}





public String[] user_text_color()

{

String colorString = UserTxtBox.getAttribute("class");

String[] arrColor = colorString .split("#");

return arrColor;

}





public String[] pass_text_color()

{



String colorString1 = PassTextBox.getAttribute("class");

String[] arrColor1 = colorString1 .split("#");

return arrColor1;

}





public String user_alignment()

{

	return UserTxtBox.getAttribute("align");

}

public String pass_alignment()

{

	return PassTextBox.getAttribute("align");

}

public String login_alignment()

{

	return Login.getAttribute("style");

}

public String open_loginpage()





{

	return driver.getTitle();

	

	

}





public void valid_login_details(String uname1,String pwd1)

{

	UserTxtBox.sendKeys(uname1);

	PassTextBox.sendKeys(pwd1);

	Login.click();

	

}





public String dashboard_Title()

{

	return driver.getTitle();

}

public void invalid_login_details(String username,String password) 

{



	UserTxtBox.sendKeys(username);

	PassTextBox.sendKeys(password);

	Login.click();

}



public boolean UsernameAsterik_Verify()

{

	

	return UsernameAsterik.isDisplayed();



}

public boolean PasswordAsterik_Verify()

{

	

	return PasswordAsterik.isDisplayed();



}





public String errormess_capture() throws IOException

{

	String message=errormessage.getText();

	System.out.println(message);

	TakesScreenshot screenshots = null;

	TakesScreenshot ts = (TakesScreenshot) screenshots;

	File src = ts.getScreenshotAs(OutputType.FILE);

	File src1 = ((TakesScreenshot) screenshots).getScreenshotAs(OutputType.FILE);

	Date dt = new Date();

	DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");

	File trg = new File(".\\Screenshots\\image.png");

	FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));

	return message;





}





public void valid_user_details(String user1) 

{

	UserTxtBox.sendKeys(user1);

	Login.click();

	

}



public void valid_pass_details(String pass1) 

{

	PassTextBox.sendKeys(pass1);

	Login.click();	

}





public void valid_login_details_keyboardAction(String user1,String pass1)

{

	Actions act=new Actions(driver);

	

	act.moveToElement(UserTxtBox).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();





	act.sendKeys(UserTxtBox,user1).sendKeys(Keys.TAB).build().perform();

	act.moveToElement(PassTextBox).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(PassTextBox,pass1).sendKeys(Keys.TAB).build().perform();

	act.keyDown(Keys.ENTER);









	

}





	



}