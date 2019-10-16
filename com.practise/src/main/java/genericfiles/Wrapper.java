package genericfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Wrapper {
	public RemoteWebDriver driver;
	public static Properties prop;
	public String status;
	public String testcase, testcasename, testcasedescription;

	public void loaddata() {
		try {
			prop = new Properties();
			FileInputStream fiscp = new FileInputStream("./config/object.properties");
			prop.load(fiscp);
		} catch (FileNotFoundException e) {
			System.out.println("File not present in the respective folder");
		} catch (IOException e) {
			System.out.println("IO exception ocured");
			e.printStackTrace();
		}

	}

		

}
