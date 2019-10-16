package genericfiles;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter extends Wrapper {

	protected static ExtentHtmlReporter html;
	protected static ExtentReports extent;
	protected ExtentTest test;

	public void htmlreportgen() {
		html = new ExtentHtmlReporter("./reports/smoketestresult102019.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	public void htmltestgen() {
		test = extent.createTest(testcasename, testcasedescription);
		test.assignAuthor("Anand");
		test.assignCategory("sanity");
	}

	public void endresult() {
		extent.flush();
	}

	public void takesnapshot(String curstatus) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy/ss");
		Date date = new Date();
		String currentdate = dateFormat.format(date).replace("/", "");
		//String dateformat = currentdate.replace("/", "");
		String filepath = currentdate + testcase + ".jpeg";

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = "./reports/" + filepath;

		FileUtils.copyFile(source, new File(destination));

		test.addScreenCaptureFromPath("./../reports/" + filepath);
		if (curstatus.equalsIgnoreCase("pass")) {
			test.log(Status.PASS, "Testcase passed successfully");
		} else {
			test.log(Status.FAIL, "Testcase Failed!!!!!!!!!");
		}

	}

}
