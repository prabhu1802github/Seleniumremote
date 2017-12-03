package PackageLogger;



import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassLogger {

		private static WebDriver driver;
	 
		private static Logger Log = Logger.getLogger(ClassLogger.class.getName());
	 
		public static void main(String[] args) {
	 
			DOMConfigurator.configure("C:\\Users\\Prabhu Jayapalan\\Desktop\\Log4j.xml");
	 
			// Create a new instance of the Firefox driver
			
			System.setProperty("WebDriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	 
	        driver = new ChromeDriver();
	 
	        Log.info("New driver instantiated");
	 
	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        Log.info("Implicit wait applied on the driver for 10 seconds");
	 
	        //Launch the Online Store Website
	 
	        driver.get("http://www.google.com");
	 
	        Log.info("Web application launched");
	 
	        
	 
	        Log.info("Click action performed on My Account link");
	 
	        
	        Log.info("Username entered in the Username text box");
	 
	        
	        Log.info("Password entered in the Password text box");
	 
	       
	 
	        Log.info("Click action performed on Submit button");
	 
	 
	       
	 
	        Log.info("Click action performed on Log out link");
	 
	        // Close the driver
	 
	        driver.quit();
	 
	        Log.info("Browser closed");
	 
		}	
	}
