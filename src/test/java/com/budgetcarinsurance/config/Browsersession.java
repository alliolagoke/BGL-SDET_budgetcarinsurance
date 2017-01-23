package com.budgetcarinsurance.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browsersession {
	
public static WebDriver driver;
    
    public static void startBrowser() {
    	
        	
//    	//FIREFOX
//		ProfilesIni allProfiles = new ProfilesIni();
//		FirefoxProfile profile = allProfiles.getProfile("default");
////		FirefoxProfile profile = allProfiles.getProfile("Automated User");
//		profile.setAssumeUntrustedCertificateIssuer(false); 
//    	driver = new FirefoxDriver(profile); 
    	
    	//IE
		//DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer(); 		
		//ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		//driver = new InternetExplorerDriver(ieCapabilities); 	
		
		
    	//CHROME
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
    	DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
    	driver = new ChromeDriver();
    	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	 // capabilities.setCapability("chrome.switches", Arrays.asList("--user-data-dir=/path/to/profile/directory"));
    	  //WebDriver driver = new ChromeDriver(capabilities);
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
	
		   		    	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       
    }


	public static WebDriver getDriver() {
		return driver;
	}

}
