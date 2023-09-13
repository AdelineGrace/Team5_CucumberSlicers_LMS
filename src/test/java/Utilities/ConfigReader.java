package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ConfigReader {

	// This method is used to load the properties from the config file
	public static Properties init_prop() throws IOException {
		FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");

		Properties prop = new Properties();

		prop.load(ip);

		return prop;
	}

	public static String getDashboardURL() throws IOException {
		return init_prop().getProperty("dashboardpage");

	}

	public static String getAttendanceURL() throws IOException {
		return init_prop().getProperty("Attendancepage");

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