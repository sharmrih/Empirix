package Empirix1_Project.Empirix1_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class AppTest {
	 public WebDriver driver;	
	 String url = "https://services.empirix.com";
	 
	 
	 	@Parameters("browser")
		@BeforeTest
		 public void setup(String browser) {
	 		{	
	 			System.out.println("Name of the Browser" + browser);
	 			System.out.println("Thread ID is" + Thread.currentThread().getId());
				try
					
				
	              {
						if(browser.equalsIgnoreCase("Firefox"))
						{
							WebDriverManager.firefoxdriver().setup();
							driver = new FirefoxDriver();
	                        System.out.println("Firefox Lanched");
						}
							if(browser.equalsIgnoreCase("Chrome"))
						{
	                    	 WebDriverManager.chromedriver().version("2.40").setup();
	                    	 driver = new ChromeDriver();
	                         System.out.println("Chrome Lacunched");
						}
							if(browser.equalsIgnoreCase("Edge"))
							{
								WebDriverManager.edgedriver().setup();
								driver = new EdgeDriver();
								System.out.println("Edge Launched");
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
		public void TC01() {	
			
				driver.get(url);
		}	
	
		
		
		@AfterTest
		public void afterTest() {
			driver.quit();
			driver.close();
		}		

}
