package trialpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Redbusdate {
	public RemoteWebDriver driver;
	private String empid; 
	private String empname;

	public void setempid(String id) {
		this.empid= id;
	}
	public void setempname(String name) {
		this.empname= name;
	}
	
	public String getempid() {
		return empid;
	}
	
	public String getempname() {
		return empname;
		
	}

	@Test
	public void method1() {
		String url = "https://stackoverflow.com/questions/58163017/selenium-getattributehref-return-null-value-using-java-salesforce-applicatio";
		System.setProperty("webdriver.chrome.driver", "./driverfolder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String tagevalue = driver.findElementByXPath("//a[contains(text(),'Code Reviews Better')]").getAttribute("href");
		System.out.println(tagevalue);
		
		String gettextvalue = driver.findElementByXPath("//a[contains(text(),'Code Reviews Better')]").getText();
		System.out.println(gettextvalue);
		
		
		/*driver.findElementById("src").sendKeys("madurai",Keys.E	NTER);
		driver.findElementById("dest").sendKeys("chennai",Keys.ENTER);*/
		/*setempid("E0461");
		setempname("nameoftheemployee");
		String eid = getempid();
		String ename = getempname();

		System.out.println(eid +": "+ename);*/

	}
	
	public void charstring() {
	char[] abc = {'w','e','l','c','o','m','e'};	
	String ab =  new String(abc);
	System.out.println(ab);
	}
	
}
