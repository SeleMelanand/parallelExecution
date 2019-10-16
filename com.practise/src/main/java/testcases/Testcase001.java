package testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericfiles.Wrapperconfiguration;

public class Testcase001 extends Wrapperconfiguration {
	
	@BeforeClass
	public void testcasedata() {
		testcase = "TC001gettitleurl";
		testcasename 	= "TC001 getting title of homepage";
		testcasedescription = "Getting title of homepage";
	}
	
	@Test
	public void gettitle() throws IOException {
		String	titlename = driver.getTitle();
		System.out.println(titlename);
		status ="pass";
		takesnapshot(status);	
		System.out.println(System.getProperty("user.dir"));
	}

}
