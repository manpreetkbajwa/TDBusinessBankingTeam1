package TdUtility;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	public class HelperClass {
		
		private WebDriver driver;

		/*
		 * The following method will be called before any class execution starts and will initiate the bowser
		 */
		@BeforeClass(alwaysRun = true)
		
		public void setup() {


			
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.td.com/ca/en/business-banking/small-business/bank-accounts/");
			
		}

		/*
		 * The following method will be called after any class execution stops and will close the browser
		 */
		@AfterClass(alwaysRun = true)
		public void tearDown() {
			driver.quit();
		}

		/*
		 * Constructor method to instantiate the driver in all dependent test classes
		 */
		public WebDriver getDriver() {
			return driver;
		}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
