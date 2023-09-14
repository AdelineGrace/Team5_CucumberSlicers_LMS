package POM_LMS;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;

import Utilities.ConfigReader;

import java.util.List;

import java.util.logging.Logger;

public class HomePage_PageObject {



	private static final Logger LoggerLoad = null;

	

		private WebDriver dr;

		

		@FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement Login;

		@FindBy (xpath="/html/body/div[1]/div[2]/div/img") WebElement Logo;

		

		

	public void HomePage_obj(WebDriver dr)

		

		{

			this.dr=dr;

			PageFactory.initElements(dr,this);	

		}



	public String open_portallink()





	{

		return dr.getTitle();

		

		

	}





	public void check_brokenlinks() throws IOException

	{

		List<WebElement> links = dr.findElements(By.tagName("a"));





	    // This line will print the number of links and the count of links.

		LoggerLoad.info("No of links are "+ links.size());  

	  

	    //checking the links fetched.

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



	public  String verifyLoginText()

	{

		return Login.getText();

		

	}

	public void Verify_Logo()

	{

		Boolean p = (Boolean) ((JavascriptExecutor)dr)

				.executeScript("return arguments[0].complete "

				+ "&& typeof arguments[0].naturalWidth != \"undefined\" "

				+ "&& arguments[0].naturalWidth > 0", Logo);

		if (p) {

	        LoggerLoad.info("Logo present");

	     } else {

	    	 LoggerLoad.info("Logo not present");

	     }

	}





	public int verify_logo_alignment_X()

	{

		return Logo.getLocation().getX();

		

		

	}

	public int verify_logo_alignment_Y()

	{

		return Logo.getLocation().getY();

		

		

	}





	public int verify_logo_X()

	{

		return Logo.getRect().getX();

		 

		

		

		

	}

	public int verify_logo_Y()

	{

		return Logo.getRect().getY();

		 		

	}





	public boolean login_visible()

	{

		return Login.isDisplayed();

	}





	public void button_click()

	{

		if(Login.isEnabled())

		{

			Login.click();

		}

		else

		{

			LoggerLoad.info("Button Disabled");

		}

	}

		

	}













