package dataProviders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	 
	public class ConfigFileReader {
		
public static String name_Of_Environment,chromeBrowser, FirefoxBrowser,ieBrowser,url,usrName,pwd;
		//Constuctor called
		/*public ConfigFileReader(){
		
		try
		{
			File src = new File("./src/test/resources/Configs/Configuration.properties");
			
			FileInputStream fis = new FileInputStream(src);
			
			 pro = new Properties();
			
			pro.load(fis);
			
		}
		catch (Exception e) {
			
			System.out.println("Exception is ==" +e.getMessage());
			
		   } 
		
		}*/
		
		
		public void configuration() {
	        BufferedReader chpConfig = null;
	        try {
	            chpConfig = new BufferedReader(new FileReader("Configuration.properties"));
	            Properties pro = new Properties();
	            pro.load(chpConfig);
	            name_Of_Environment = pro.getProperty("browser");
	            chromeBrowser = pro.getProperty("chromeDriverPathWindows");
	            FirefoxBrowser = pro.getProperty("firefoxDriverPathWindows");
	            ieBrowser = pro.getProperty("ieDriverPathWindows");
	            url = pro.getProperty("url");
	            usrName = pro.getProperty("userName");
	            pwd = pro.getProperty("password");
	            
	        } catch (Exception configFN) {
	            configFN.printStackTrace();
	        }
	    }
			
		public String getBrowser() {
			
			WebDriver driver ;
			
			System.out.println( " name" +name_Of_Environment);
			
			if (name_Of_Environment == null || name_Of_Environment.equalsIgnoreCase("chrome")){
					
				System.setProperty("webdriver.chrome.driver", chromeBrowser );
			    driver = new ChromeDriver();
			  
			}
			else if (name_Of_Environment.equalsIgnoreCase("firefox")){
				
			System.setProperty("webdriver.gecko.driver", FirefoxBrowser);
		    driver = new FirefoxDriver();
		   
		    
			}
			else if (name_Of_Environment.equalsIgnoreCase("iexplorer")){
				
				System.setProperty("webdriver.ie.driver", ieBrowser);
				 driver = new InternetExplorerDriver();
				 
				
			}
			else
				throw new RuntimeException(
						"Browser Name Key value in Configuration.properties is not matched : " + name_Of_Environment);
			
			return name_Of_Environment;
		}
		
		public String getApplicationUrl() {
			if(url != null) return url;
			else throw new RuntimeException("url not specified in the Configuration.properties file.");
		}
		
	/*	public Boolean getBrowserWindowSize() {
			String windowSize = pro.getProperty("windowMaximize");
			if (windowSize != null)
				return Boolean.valueOf(windowSize);
			return true;
		}
		
		public long getImplicitlyWait() {		
			String implicitlyWait =pro.getProperty("implicitlyWait");
			if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
			else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
		}
		*/
	 public String getUserName() {
		 
		
		 if(usrName != null)return usrName;
			else throw new RuntimeException("username not specified in the Configuration.properties file."); 	 
	 }
	 
	 public String getPassword() {
		 
		 if(pwd != null)return pwd;	 
		else throw new RuntimeException("Pwd not specified in the Configuration.properties file."); 	
		 
		 	 	 
	 }
	 
	}
	

