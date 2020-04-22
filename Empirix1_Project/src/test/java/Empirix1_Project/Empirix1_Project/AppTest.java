package Empirix1_Project.Empirix1_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class AppTest {
	 private WebDriver driver;	
	 String url = "https://services.empirix.com";
	 
	 
	 	@Parameters("browser")
		@BeforeTest
		 public void setup(String browser) {
	 		{
				try

	              {

	                     if(browser.equalsIgnoreCase("Firefox"))

	                     {
	                    	// System.setProperty("webdriver.gecko.driver","C:\\Users\\sharmar\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	                    	 WebDriverManager.firefoxdriver().setup();
	                    	 driver = new FirefoxDriver();
	                           System.out.println("Firefox Lanched");

	                     }

	                     if(browser.equalsIgnoreCase("Chrome"))

	                     {

	                           //Location of the chromedriver.exe file stored in your machine

	                           // System.setProperty("webdriver.chrome.driver","C:\\Users\\sharmar\\source\\repos\\GDT Automated Test Cases\\packages\\Selenium.WebDriver.ChromeDriver.80.0.3987.1600\\driver\\win32\\chromedriver.exe");
	                    	 	WebDriverManager.chromedriver().version("2.40").setup();
	                           driver = new ChromeDriver();
	                           System.out.println("Chrome Lacunched");

	                     }

	                     if(browser.equalsIgnoreCase("Edge"))

	                     {

	                           //Location of the IEDriverServer.exe file stored in your machine               

	//System.setProperty("webdriver.ie.driver", x` + "IEDriverServer.exe");
	                    	 WebDriverManager.edgedriver().setup();
	                           driver = new InternetExplorerDriver();

	                     }                   

	              }

	              catch (WebDriverException e)

	              {

	                     System.out.println("Browser not found" +e.getMessage());

	              }

	              driver.get(url);

	              driver.manage().window().maximize();

	              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	       }}

		@Test				
		public void testEasy() {	
			
				driver.get(url);
		}	
	
		
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		

}
