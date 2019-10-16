package testcases;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericfiles.Wrapperconfiguration;

public class Testcase003 extends Wrapperconfiguration{
	@BeforeClass
	public void testcasedata() {
		testcase = "TC003 gettitlemyaccount";
		testcasename 	= "TC003 getting title of myaccount";
		testcasedescription = "Getting title of myaccount";
	}
	
	@Test
	public void myacc() throws IOException {
	FileAppender fa = new FileAppender();
		
		
		driver.findElementByXPath(prop.getProperty("page.myaccount")).click();
		String titlename = driver.getTitle();
		
		System.out.println(titlename);	
		status ="pass";
		takesnapshot(status);

	}

}
