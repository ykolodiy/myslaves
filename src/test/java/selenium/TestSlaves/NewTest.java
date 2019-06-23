package selenium.TestSlaves;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		
		@BeforeClass
		public void beforeClass() {	
			System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();  
		}		
		
		@AfterClass
		public void afterClass() {
			driver.quit();			
		}		
}