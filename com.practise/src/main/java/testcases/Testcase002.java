package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericfiles.Wrapperconfiguration;

public class Testcase002 extends Wrapperconfiguration{
	@BeforeClass
	public void testcasedata() {
		testcase = "TC002 gettitleprivacy";
		testcasename 	= "TC002 getting title of privacypage";
		testcasedescription = "Getting title of privacypage";
	}
	
	@Test
	public void getprivacy() throws IOException {
		driver.findElementByXPath(prop.getProperty("page.privacypolicy")).click();
		String titlename = driver.getTitle();
		
		System.out.println(titlename);
		status ="fail";
		takesnapshot(status);

	}

}
