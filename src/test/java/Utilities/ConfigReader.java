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
		   return init_prop().getProperty("Assignmentpage");
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
	public static String getAddAssignmentURL() throws IOException
	   {
		   return init_prop().getProperty("addassignmentpage");
	   }
	public static String assignmentHeader() throws IOException
	   {
		   return init_prop().getProperty("actualHeader");
	   }
	public static String assignmentFields() throws IOException
	   {
		   return init_prop().getProperty("actualFields");
	   }
	public static String assignmentField1() throws IOException
	   {
		   return init_prop().getProperty("actualField1");
	   }
	public static String assignmentField2() throws IOException
	   {
		   return init_prop().getProperty("actualField2");
	   }
	public static String assignmentField3() throws IOException
	   {
		   return init_prop().getProperty("actualField3");
	   }
	public static String assignmentField4() throws IOException
	   {
		   return init_prop().getProperty("actualField4");
	   }
	public static String assignmentField5() throws IOException
	   {
		   return init_prop().getProperty("actualField5");
	   }
	public static String assignmentField6() throws IOException
	   {
		   return init_prop().getProperty("actualField6");
	   }
	public static String assignmentField7() throws IOException
	   {
		   return init_prop().getProperty("actualField7");
	   }
	public static String assignmentField8() throws IOException
	   {
		   return init_prop().getProperty("actualField8");
	   }
	public static String assignmentField9() throws IOException
	   {
		   return init_prop().getProperty("actualField9");
	   }
	public static String assignmentField10() throws IOException
	   {
		   return init_prop().getProperty("actualField10");
	   }
	public static String NumberEntry() throws IOException
	   {
		   return init_prop().getProperty("actualNumberEntryText");
	   }
	public static String NoofAssignments() throws IOException
	   {
		   return init_prop().getProperty("NoofAssignments");
	   }
	public static String ErrorMessage() throws IOException
	   {
		   return init_prop().getProperty("ErrorMessage");
	   }
	public static String ProgramNameError() throws IOException
	   {
		   return init_prop().getProperty("ProgramNameError");
	   }
	public static String BatchNumberError() throws IOException
	   {
		   return init_prop().getProperty("BatchNumberError");
	   }
	public static String  AssignmentNameError() throws IOException
	   {
		   return init_prop().getProperty("AssignmentNameError");
	   }
	public static String AssignmentDueDateError() throws IOException
	   {
		   return init_prop().getProperty("AssignmentDueDateError");
	   }
	public static String  AssignmentgradebyError() throws IOException
	   {
		   return init_prop().getProperty("AssignmentgradebyError");
	   }
	public static String PassedDateError() throws IOException
	   {
		   return init_prop().getProperty("PassedDateError");
	   }
	public static String expectedDate() throws IOException
	   {
		   return init_prop().getProperty("expectedDate");
	   }
	public static String expectedMonthDatePicker() throws IOException
	   {
		   return init_prop().getProperty("expectedMonthDatePicker");
	   }
	}