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

	public static String getbrowser() throws IOException

	   {

		   return init_prop().getProperty("browser");

	   }

	public static String getDashboardURL() throws IOException

	   {

		   return init_prop().getProperty("dashboardpage");

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

	
	public static String classHeader() throws IOException

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


	public static String classFields() throws IOException

	   {

		   return init_prop().getProperty("ActualInputs");

	   }

	public static String classField1() throws IOException

	   {

		   return init_prop().getProperty("ActualInput1");

	   }

	public static String classField2() throws IOException

	   {

		   return init_prop().getProperty("ActualInput2");

	   }

	public static String classField3() throws IOException

	   {

		   return init_prop().getProperty("ActualInput3");

	   }

	public static String classField4() throws IOException

	   {

		   return init_prop().getProperty("ActualInput4");

	   }

	public static String classField5() throws IOException

	   {

		   return init_prop().getProperty("ActualInput5");

	   }

	public static String classField6() throws IOException

	   {

		   return init_prop().getProperty("ActualInput6");

	   }

	public static String classField7() throws IOException

	   {

		   return init_prop().getProperty("ActualInput7");

	   }

	public static String classField8() throws IOException

	   {

		   return init_prop().getProperty("ActualInput8");

	   }

	public static String classField9() throws IOException

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


	}
