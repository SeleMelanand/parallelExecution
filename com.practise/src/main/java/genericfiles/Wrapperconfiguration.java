package genericfiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Wrapperconfiguration extends Reporter {
	@BeforeTest()
	public void htmlreportgenerator() throws IOException {
		htmlreportgen();

	}

	@BeforeMethod()
	public void launchapp() {
		loaddata();
		htmltestgen();
		System.setProperty("webdriver.chrome.driver", "./driverfolder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("application.url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterMethod()
	public void browserclose() {
		driver.close();
		endresult();
	}

}
