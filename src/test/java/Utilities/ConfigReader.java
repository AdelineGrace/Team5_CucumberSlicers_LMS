package Utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	
	public class ConfigReader {
		
	//This method is used to load the properties from the config file
	public static Properties init_prop() throws IOException
	{	
		FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");

	  Properties prop=new Properties();
	 
			prop.load(ip);
		
		
		return prop;
	}
	/*public static void setBrowserType(String browser)
	{
		browserType = browser;
	}
	public static String getBrowserType() 
	{	
	return browserType;
			
	}*/
	public static String getStudentTitle() throws IOException
	   {
		   return init_prop().getProperty("expectedTitle");
	   }
	public static String getLMSTitle() throws IOException
	   {
		   return init_prop().getProperty("expectedTitle");
	   }
	public static String getStudentName() throws IOException
	   {
		   return init_prop().getProperty("expectedStudentname");
	   }
	public static String getBatchId() throws IOException
	   {
		   return init_prop().getProperty("expectedbatchname");
	   }
	public static String getDashboardURL() throws IOException
	   {
		   return init_prop().getProperty("dashboardpage");
	   }
	public static String getClassURL() throws IOException
	   {
		   return init_prop().getProperty("classpage");
	   }
	public static String getStudentURL() throws IOException
	   {
		   return init_prop().getProperty("studentpage");
	   }
	public static String getProgramURL() throws IOException
	   {
		   return init_prop().getProperty("programpage");
	   }
	public static String getBatchURL() throws IOException
	   {
		   return init_prop().getProperty("batchpage");
	   }
	public static String getAssignmentURL() throws IOException
	   {
		   return init_prop().getProperty("assignmentpage");
	   }
	public static String getUserURL() throws IOException
	   {
		   return init_prop().getProperty("userpage");
	   }
	public static String getAttendanceURL() throws IOException
	   {
		   return init_prop().getProperty("attendancepage");
	   }
	public static String getLoginURL() throws IOException
	   {
		   return init_prop().getProperty("loginpage");
	   }
	public static String getAddClassURL() throws IOException
	   {
		   return init_prop().getProperty("addclasspage");
	   }
	public static String classHeader() throws IOException
	   {
		   return init_prop().getProperty("actualHeader");
	   }
	public static String classFields() throws IOException
	   {
		   return init_prop().getProperty("actualFields");
	   }
	public static String classField1() throws IOException
	   {
		   return init_prop().getProperty("actualField1");
	   }
	public static String classField2() throws IOException
	   {
		   return init_prop().getProperty("actualField2");
	   }
	public static String classField3() throws IOException
	   {
		   return init_prop().getProperty("actualField3");
	   }
	public static String classField4() throws IOException
	   {
		   return init_prop().getProperty("actualField4");
	   }
	public static String classField5() throws IOException
	   {
		   return init_prop().getProperty("actualField5");
	   }
	public static String classField6() throws IOException
	   {
		   return init_prop().getProperty("actualField6");
	   }
	public static String classField7() throws IOException
	   {
		   return init_prop().getProperty("actualField7");
	   }
	public static String classField8() throws IOException
	   {
		   return init_prop().getProperty("actualField8");
	   }
	public static String classField9() throws IOException
	   {
		   return init_prop().getProperty("actualField9");
	   }
	public static String classField10() throws IOException
	   {
		   return init_prop().getProperty("actualField10");
	   }
	public static String NumberEntry() throws IOException
	   {
		   return init_prop().getProperty("actualNumberEntryText");
	   }
	public static String NoofClasses() throws IOException
	   {
		   return init_prop().getProperty("NoofClasses");
	   }
	public static String ErrorMessage() throws IOException
	   {
		   return init_prop().getProperty("ErrorMessage");
	   }
	public static String BatchIdError() throws IOException
	   {
		   return init_prop().getProperty("BatchIdError");
	   }
	public static String ClassNoError() throws IOException
	   {
		   return init_prop().getProperty("ClassNoError");
	   }
	public static String ClassDateError() throws IOException
	   {
		   return init_prop().getProperty("ClassDateError");
	   }
	public static String StaffIdError() throws IOException
	   {
		   return init_prop().getProperty("StaffIdError");
	   }
	public static String PassedDateError() throws IOException
	   {
		   return init_prop().getProperty("PassedDateError");
	   }
	public static String ExpectedDate() throws IOException
	   {
		   return init_prop().getProperty("expectedDate");
	   }
	public static String MonthDatePicker() throws IOException
	   {
		   return init_prop().getProperty("expectedMonthDatePicker");
	   }
	public static String DeleteSuccessMessage() throws IOException
	   {
		   return init_prop().getProperty("DeleteSuccessMessage");
	   }
	}