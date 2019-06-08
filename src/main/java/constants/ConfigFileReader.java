package constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigFileReader {
	
	//we create an object of WebDriver and make it public static, it can be accesable through framework
	public static WebDriver driver;
	
	//properties can be accessible through the framework
	public static Properties properties;
	
	/**
	 * path for property file
	 */
	
    private final String propertyFilePath = "C:\\Users\\owner\\eclipse-workspace\\BDDtestFramework\\src\\test\\resorses\\Configs\\configurations.properties";
/**
 * This is constructor
 */
    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
/**
 * This method returns driver path for example
 * IE, Chrome of FF file.exe
 * @return
 */
    public static String getDriverPath() {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null)
            return driverPath;
        else
            throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }
/**
 * This method returns Implicit wait time
 * @return
 */
    public static long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null)
            return Long.parseLong(implicitlyWait);
        else
            throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }
/**
 * This method returns Application URL
 * @return
 */
    public static String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null)
            return url;
        else
            throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    public static String getReportConfigPath(){
   	 String reportConfigPath = properties.getProperty("reportConfigPath");
   	 if(reportConfigPath!= null) return reportConfigPath;
   	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
   	}
/**
 * This method get the url and initialize the browser	
 */
  public static void initialization() {
	driver.get(getApplicationUrl());
	  
	  
  }
    
    
}
