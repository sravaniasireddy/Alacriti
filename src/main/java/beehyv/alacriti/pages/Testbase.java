package beehyv.alacriti.pages;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class Testbase {
	public WebDriver driver;
	
	
	public String URL = "http://183.82.96.201:9000/#/report";
	private final Logger LOGGER = Logger.getLogger(Testbase.class.getName());
    
	@AfterClass
	public void browser_terminator() {
		  driver.quit();
		  LOGGER.info("Browser is successfully terminated");
	  }
	@BeforeClass
	  public void browser_launcher() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/beehyv/Downloads/chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(10);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		LOGGER.info("Browser is successfully launched");
		  
	  }
}
