package com.busyqa.test.TestCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.busyqa.test.TestBase.TestBase;



@Listeners(com.busyqa.test.listeners.ListenerTest.class)
class Failed_TC extends TestBase{
	
	public static final Logger log = Logger.getLogger(TC04_LoginTest.class.getName());
	
 
    
	@Parameters({"env", "browser"})
    @BeforeTest
	 void setUp(String env, String browser) {
		 	
    	init(env, browser);
	}
	
    @Test
	 void failed_TC1() {
		
		  Assert.assertEquals(false, true);
	}


	 
   @AfterTest
   public void endTest() {
   	
   	
   	
   }

}


