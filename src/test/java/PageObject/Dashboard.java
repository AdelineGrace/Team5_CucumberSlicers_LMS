package PageObject;

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
import io.netty.handler.timeout.TimeoutException;

import static Utilities.ConfigReader.getDashboardURL;
import static Utilities.ConfigReader.getloginURL;

import static org.testng.Assert.assertEquals;
import static Utilities.ConfigReader.classHeader;

import static Utilities.ConfigReader.classFields;




import Driver.DriverFactory;
//import StepDefinition_LMS.By;
import Utilities.ConfigReader;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.Point;
import java.io.IOException;


public class Dashboard {

	public static WebDriver driver = DriverFactory.getDriver();
	public  Dashboard(WebDriver webDriver) {
	PageFactory.initElements(driver,this);

			

		}

		
@FindBy(id ="id_username") WebElement username;

@FindBy(id ="id_password") WebElement password;

@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement Login;

@FindBy(id = "Header") WebElement header;

@FindBy(id = "LMS Title") WebElement LMSTitle;

@FindBy(id = "Student") WebElement Student;

@FindBy(id = "Program") WebElement Program;
@FindBy(id = "Batch") WebElement Batch;
@FindBy(id = "Class") WebElement Class;
@FindBy(id = "User") WebElement User;
@FindBy(id = "Assignment") WebElement Assignment;
@FindBy(id = "Attendance") WebElement Attendance;
@FindBy(id = "Logout") WebElement Logout;
@FindBy(className ="navbar-text") WebElement navigationBar;
@FindBy(className ="LMS-title")
WebElement Title; 

		

public void Login() throws IOException{
	String URL = ConfigReader.getloginURL(); 
	driver.get(URL);
}		


public String getCurrentPageTitle() {
	 return driver.getTitle().trim();
	}

public void ValidCredentials(String user, String pwd) {

		username.sendKeys(user);
		password.sendKeys(pwd);
		Login.click();
}
		
		public String Login_Gettittle(){

			return driver.getTitle();

}
		
		public void Logout()
		{
			Logout.click();
		}

		public String verifyHeaderText() {

			Loggerload.info("Admin see the header Text");

			String HeaderText = header.getText();

			return HeaderText;
		}

		public void verifyLink()throws IOException {
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

		public String verifyLMSTitle() {

			Loggerload.info("Admin see the LMS Title");

			String LMS_Title = LMSTitle.getText();

			return LMS_Title;
}

		public void ResponseTime() throws InterruptedException {
			DriverFactory.getDriver().navigate().back();

			Thread.sleep(1000);

			long startTime = System.currentTimeMillis();
			

			 WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			 
			 WebElement manageDashboard= new WebDriverWait(driver,Duration.ofSeconds(30))
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='accordion']/div[2]/div/h4/a")));
					//first.click();

			// WebElement manageClassElement = wait.until(ExpectedConditions.visibilityOfElementLocated((By) manage_class));

			 Assert.assertTrue(manageDashboard.isDisplayed(), "Login is not displayed");

			 long endTime = System.currentTimeMillis();

			long totalTime = endTime - startTime;

			System.out.println("Response Time: " + totalTime + " milliseconds");

		    long expectedResponseTime = 30;

		    Assert.assertTrue(totalTime <= expectedResponseTime, "Response time is longer than expected");

					}
		
		
		public void LMSTitleAlignment() {
			
			  assertEquals("left",LMSTitle.getAttribute("align"));
			}
		
		
		public void NavigationAlignment() {
			  assertEquals("Right",Student.getAttribute("align"));
			}
			
		public String TitleText() {
			return Title.getText();
			} 
		public void Student_Positioning()
		{
			
			Point location1 = Student.getLocation();
		   int x1 = location1.getX();
		   int y1 = location1.getY();
		    
		   Point location2 = Program.getLocation();
		    int x2 = location2.getX();
			int y2 = location2.getY();
			
			if(y1<y2)
		    {
				System.out.println("The Student is in first position");}
			
				else {
					
					System.out.println("The Student is not in first position");}

		    }
		
		public String getNavigationBarText() {
			return navigationBar.getText();

			}
		    
		
					public void Program_Positioning()
		{
			Point location2 = Program.getLocation();
		    int x2 = location2.getX();
			int y2 = location2.getY();
			
			Point location3 = Batch.getLocation();
		    int x3 = location3.getX();
			int y3 = location3.getY();
		    
			if (y2<y3)
			{  
				System.out.println("The Program is in second position");
				}
			
			else {
				
				System.out.println("The Program is not in first position");
				}

		}
			
		public void Batch_Positioning()
		{
			
			Point location3 = Batch.getLocation();
		    int x3 = location3.getX();
			int y3 = location3.getY();
			
			 
			Point location4 = Batch.getLocation();
		    int x4 = location4.getX();
			int y4 = location4.getY();
			
			if (y3<y4)
			{  
				System.out.println("The Batch is in third position");
				}
			
			else {
				
				System.out.println("The Batch is not in third position");
				}

		}

		public void Class_Positioning()
		{
			Point location4 = Batch.getLocation();
		    int x4 = location4.getX();
			int y4 = location4.getY();
			
			 
			Point location5 = Class.getLocation();
		    int x5 = location5.getX();
			int y5 = location5.getY();
		    
			if (y4<y5)
			{  
				System.out.println("The Class is in fourth position");
				}
			
			else {
				
				System.out.println("The Class is not in fourth position");
				}

		}

		public void User_Positioning()
		{
			 
			Point location5 = Class.getLocation();
		    int x5 = location5.getX();
			int y5 = location5.getY();
			
			Point location6 = User.getLocation();
		    int x6 = location6.getX();
			int y6 = location6.getY();
		    
		    
			if (y5<y6)
			{  
				System.out.println("The User is in fifth position");
				}
			
			else {
				
				System.out.println("The User is not in fifth position");
				}

		}
		
		public void Assignment_Positioning()
		{
			
			Point location6 = User.getLocation();
		    int x6 = location6.getX();
			int y6 = location6.getY();
		    
			Point location7= Assignment.getLocation();
		    int x7 = location7.getX();
			int y7 = location7.getY();
		    
		    
			if (y6<y7)
			{  
				System.out.println("The Assignment is in sixth position");
				}
			
			else {
				
				System.out.println("The Assignmet is not in sixth position");
				}
		}
			public void Attendance_Positioning()
			{
				
				Point location7= Assignment.getLocation();
			    int x7 = location7.getX();
				int y7 = location7.getY();
			    
				Point location8 = Attendance.getLocation();
			    int x8 = location8.getX();
				int y8= location8.getY();
			    
				if (y7<y8)
				{  
					System.out.println("The Attendance is in seventh position");
					}
				
				else {
					
					System.out.println("The Attendance is not in seventh position");
					}

		}

			public void Logout_Positioning()
			{
				
				Point location8 = Attendance.getLocation();
			    int x8 = location8.getX();
				int y8= location8.getY();
			    

				Point location9 = Logout.getLocation();
			    int x9 = location9.getX();
				int y9 = location9.getY();
			    
				if (y8<y9)
				{  
					System.out.println("The Logout is in eigth position");
					}
				
				else {
					
					System.out.println("The Logout is not in eigth position");
					}

		}

			
			
			
			
		    				
}

