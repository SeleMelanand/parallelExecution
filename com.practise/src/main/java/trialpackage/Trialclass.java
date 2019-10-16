package trialpackage;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.UIDefaults.ActiveValue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericfiles.Listernerclass;


public class Trialclass extends Listernerclass{

	public RemoteWebDriver driver;

	@Test
	public void method1() throws InterruptedException {
		/*Date date = new Date();
		String dateval = date.toString();
		System.out.println(dateval);*/
		
		
		System.setProperty("webdriver.chrome.driver", "./driverfolder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

		List<WebElement> listofname = driver.findElementsByXPath("//div[@class='posts']/div/div/h2/a[1]");
		System.out.println(listofname.size());

		for(WebElement eachitem : listofname) {
			System.out.println(eachitem.getText());
		}
		
		Actions activityonelement = new Actions(driver);
		WebElement elementclick = driver.findElementByXPath("//div[@class='posts']/div[3]/div/h2/a[1]");
		activityonelement.contextClick(elementclick).sendKeys(Keys.ARROW_DOWN).build().perform();
				
		Set<String> windownames = driver.getWindowHandles();
		for(String name: windownames) {
			System.out.println(name);
		}

		
		
		
		/*WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.titleContains("Maven Repository"));
		
		JavascriptExecutor jse = driver;
		jse.executeScript("", args)
		
		Actions action = new Actions(driver); 
		WebElement abc = driver.findElementByXPath("//div[@class='posts']/div[4]//div//p/a[3]");
		action.click(abc).perform();
		
		Alert newalert =driver.switchTo().alert();
		newalert.accept();
		
		driver.switchTo().alert().dismiss();*/
		

	}
	
	//@Test
	public void method2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Projectworkspace\\com.practise\\driverfolder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
	//@Test
	public void method3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Projectworkspace\\com.practise\\driverfolder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.edureka.co/blog/synchronization-in-java/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	

}