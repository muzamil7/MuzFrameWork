//package dataProviders;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;
//
//import uk.gov.rrs.enums.DriverType;
//	 
//	public class ConfigFileReader2 {
//		
//		
//		Properties pro;
//		//Constuctor called
//		public ConfigFileReader2(){
//		
//		try
//		{
//			File src = new File("./src/test/resources/Configs/Configuration.properties");
//			
//			FileInputStream fis = new FileInputStream(src);
//			
//			 pro = new Properties();
//			
//			pro.load(fis);
//			
//		}
//		catch (Exception e) {
//			
//			System.out.println("Exception is ==" +e.getMessage());
//			
//		   } 
//		
//		}
//		
//		
//		public DriverType getBrowser() {
//			String browserName = pro.getProperty("browser");
//			if (browserName == null || browserName.equalsIgnoreCase("chrome"))
//					
//				return DriverType.CHROME;
//			
//			else if (browserName.equalsIgnoreCase("firefox"))
//				return DriverType.FIREFOX;
//			
//			else if (browserName.equalsIgnoreCase("iexplorer"))
//				return DriverType.INTERNETEXPLORER;
//			
//			else
//				throw new RuntimeException(
//						"Browser Name Key value in Configuration.properties is not matched : " + browserName);
//		}
//		
//		
//		public String getchromeDriverPathWindows(){
//			String driverPath = pro.getProperty("chromeDriverPathWindows");
//			if(driverPath!= null) return driverPath;
//			else throw new RuntimeException("chrome driverPath not specified in the Configuration.properties file.");	
//			
//			Above code can be written as.
//			 * String driverpath = pro.getProperty("chromeDriverPathWindows");
//			 * retutn path;
//			 
//		}
//		
//		public String getfirefoxDriverPathWindows(){
//			String driverPath = pro.getProperty("firefoxDriverPathWindows");
//			if(driverPath!= null) return driverPath;
//			else throw new RuntimeException("firefox driverPath not specified in the Configuration.properties file.");		
//		}
//		
//		public String ieDriverPathWindows(){
//			String driverPath = pro.getProperty("/src/test/resources/Browsers/IEDriverServer.exe");
//			if(driverPath!= null) return driverPath;
//			else throw new RuntimeException("ie driverPath not specified in the Configuration.properties file.");		
//		}
//		
//		public String getApplicationUrl() {
//			String url = pro.getProperty("url");
//			if(url != null) return url;
//			else throw new RuntimeException("url not specified in the Configuration.properties file.");
//		}
//		
//		public Boolean getBrowserWindowSize() {
//			String windowSize = pro.getProperty("windowMaximize");
//			if (windowSize != null)
//				return Boolean.valueOf(windowSize);
//			return true;
//		}
//		public long getImplicitlyWait() {		
//			String implicitlyWait =pro.getProperty("implicitlyWait");
//			if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
//			else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
//		}
//		
//	 public String getUserName() {
//		 
//		 String UserName = pro.getProperty("userName");
//		 if(UserName != null)return UserName;
//			else throw new RuntimeException("username not specified in the Configuration.properties file."); 	 
//	 }
//	 
//	 public String getPassword() {
//		 
//		 String pwd = pro.getProperty("password");
//		 if(pwd != null)return pwd;	 
//		else throw new RuntimeException("Pwd not specified in the Configuration.properties file."); 	
		 	 
	 }
 
	}
	

