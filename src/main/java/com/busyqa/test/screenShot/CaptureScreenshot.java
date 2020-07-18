package com.busyqa.test.screenShot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;



public class CaptureScreenshot {
	public static final Logger log = Logger.getLogger(CaptureScreenshot.class.getName());
	String dest = "";
	
public String getScreenShot(WebDriver driver,String scenario_name){
		
		try {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			
			SimpleDateFormat s=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
			
			
			String d = s.format(new Date());
			
			
			dest = System.getProperty("user.dir")+"\\ScreenShots\\/"+d+"-"+scenario_name+".png";
			
			
			File destination = new File(dest);
			
			
			FileHandler.copy(source, destination);
			
			
			Reporter.log("Screen Shot Taken",true);
			
		    	
		}  
		
		catch (Exception e) {
			
			Reporter.log(e.getMessage(),true);
			
		}
		
		return dest;
		
	}
}
