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
	
	public static String getHeaderName() throws IOException {
		return init_prop().getProperty("actualHeader");
	}
	public static String getProgramName() throws IOException {
		return init_prop().getProperty("Programname");
	}
	public static String getloginPage() throws IOException {
		return init_prop().getProperty("loginpage");
	}
	
	
	public static String getProgramDescription() throws IOException {
		return init_prop().getProperty("ProgramDescription");
	}
	
	public static String getAddProgramURL() throws IOException {
		return init_prop().getProperty("AddProgram");
	}
	
	public static String getdetailsURL() throws IOException {
		return init_prop().getProperty("ProgramDetails");
	}
	public static String getfirstPageURL() throws IOException {
		return init_prop().getProperty("firstPage");
	}
	public static String getlastPageURL() throws IOException {
		return init_prop().getProperty("lastPage");
	}
	public static String getStudentPageURL() throws IOException {
		return init_prop().getProperty("StudentPage");
	}
	public static String getBatchPageURL() throws IOException {
		return init_prop().getProperty("BatchPage");
	}
	public static String getUserPageURL() throws IOException {
		return init_prop().getProperty("UserPage");
	}
	public static String getClassPageURL() throws IOException {
		return init_prop().getProperty("ClassPage");
	}
	public static String getAssignmentPageURL() throws IOException {
		return init_prop().getProperty("AssignmentPage");
	}
	public static String getAttendancePageURL() throws IOException {
		return init_prop().getProperty("AttendancePage");
	}
	
	public static String getHeaderUserName() throws IOException {
		return init_prop().getProperty("userHeader");
	}
	
	public static String getAddUserURL() throws IOException {
		return init_prop().getProperty("AddUser");
	}
	public static String getbrowser() throws IOException

	  {

	  return init_prop().getProperty("browser");

	  }

	

	public static String getloginURL() throws IOException

	  {


	 return init_prop().getProperty("loginpage");

	  }

	public static String getResetPasswordURL() throws IOException

	  {

	  return init_prop().getProperty("resetpassword");

	  }

	public static String getForgotPasswordURL() throws IOException

	  {

	  return init_prop().getProperty("forgotpassword");

	  }


	public static String ClassHeader() throws IOException

	  {

	  return init_prop().getProperty("Actualheader");

	  }
	public static String gethomepagevalid() throws IOException

	  {

	  return init_prop().getProperty("homepagevaild");

	  }
	public static String gethomepageinvalid() throws IOException

	  {

	  return init_prop().getProperty("homepageinvalid");

	  }


	public static String ClassFields() throws IOException

	  {

	  return init_prop().getProperty("ActualInputs");

	  }

	public static String ClassField1() throws IOException

	  {

	  return init_prop().getProperty("ActualInput1");

	  }

	public static String ClassField2() throws IOException

	  {

	  return init_prop().getProperty("ActualInput2");

	  }

	public static String ClassField3() throws IOException

	  {

	  return init_prop().getProperty("ActualInput3");

	  }

	public static String ClassField4() throws IOException

	  {

	  return init_prop().getProperty("ActualInput4");

	  }

	public static String ClassField5() throws IOException

	  {

	  return init_prop().getProperty("ActualInput5");

	  }

	public static String ClassField6() throws IOException

	  {

	  return init_prop().getProperty("ActualInput6");

	  }

	public static String ClassField7() throws IOException

	  {

	  return init_prop().getProperty("ActualInput7");

	  }

	public static String ClassField8() throws IOException

	  {

	  return init_prop().getProperty("ActualInput8");

	  }

	public static String ClassField9() throws IOException

	  {

	  return init_prop().getProperty("ActualInput9");

	  }
	public static String getUsername() throws IOException

	  {

	  return init_prop().getProperty("username");
	 // return init_prop().getProperty("invalidusername");

	  }

	public static String getPassword() throws IOException

	  {

	  return init_prop().getProperty("password");
	//  return init_prop().getProperty("invalidpassword");

	  }

	public static String getInValidUsername() throws IOException

	  {

	 return init_prop().getProperty("Invalidusername");

	  }

	public static String getInvalidPassword() throws IOException

	  {

	 return init_prop().getProperty("Invalidpassword");

	  }

	public static String getValidUsername() throws IOException

	  {

	 return init_prop().getProperty("Validusername");

	  }

	public static String getvalidPassword() throws IOException

	  {

	 return init_prop().getProperty("Validpassword");

	  }

	public static String getvalidEmail() throws IOException

	  {

	 return init_prop().getProperty("ValidEmail");

	  }
	public static String getInvalidEmail() throws IOException

	  {

	 return init_prop().getProperty("InVaildEmail");

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
	
	public static String NoofAssignments() throws IOException
	   {
		   return init_prop().getProperty("NoofAssignments");
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
	
	public static String expectedDate() throws IOException
	   {
		   return init_prop().getProperty("expectedDate");
	   }
	public static String expectedMonthDatePicker() throws IOException
	   {
		   return init_prop().getProperty("expectedMonthDatePicker");
	   }
	
	public static String getAddAttendanceURL() throws IOException {
		return init_prop().getProperty("AttendanceDetails");

	}
	
	public static String AttendanceHeader() throws IOException {
		return init_prop().getProperty("actualHeader");

	}

	public static String AttendanceFields() throws IOException {
		return init_prop().getProperty("actualFields");
	}

	public static String AttendanceField1() throws IOException {
		return init_prop().getProperty("actualField1");
	}

	public static String AttendanceField2() throws IOException {
		return init_prop().getProperty("actualField2");
	}

	public static String AttendanceField3() throws IOException {
		return init_prop().getProperty("actualField3");
	}

	public static String AttendanceField4() throws IOException {
		return init_prop().getProperty("actualField4");
	}

	public static String AttendanceField5() throws IOException {
		return init_prop().getProperty("actualField5");
	}

	public static String AttendanceField6() throws IOException {
		return init_prop().getProperty("actualField6");
	}

	public static String AttendanceField7() throws IOException {
		return init_prop().getProperty("actualField7");
	}

	public static String AttendanceField8() throws IOException {
		return init_prop().getProperty("actualField8");
	}

	public static String AttendanceField9() throws IOException {
		return init_prop().getProperty("actualField9");
	}

	public static String AttendanceField10() throws IOException {
		return init_prop().getProperty("actualField10");
	}
	public static String AttendanceField15() throws IOException {
		return init_prop().getProperty("actualField15");
	}
	public static String getStudentpage() throws IOException {
		return init_prop().getProperty("Studentpage");
	}
	public static String getProgrampage() throws IOException {
		return init_prop().getProperty("Programpage");
	}
	public static String getBatche() throws IOException {
		return init_prop().getProperty("Batchpage");
	}
	public static String getUser() throws IOException {
		return init_prop().getProperty("User");
	}
	public static String getAssignment() throws IOException {
		return init_prop().getProperty("Assignment");
	}
	public static String get_Class() throws IOException {
		return init_prop().getProperty("Class");
	
	
	}
	public static String get_Login() throws IOException {
		return init_prop().getProperty("Login");
		
	}
	
	public String actualNumberEntryText() throws IOException {
		return init_prop().getProperty("actualNumberEntryText");
	}
	

}


	