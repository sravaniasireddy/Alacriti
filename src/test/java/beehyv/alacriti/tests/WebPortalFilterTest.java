package beehyv.alacriti.tests;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import beehyv.alacriti.pages.WebPortalFilter;

public class WebPortalFilterTest extends WebPortalFilter {
	private final Logger LOGGER = Logger.getLogger(WebPortalFilterTest.class.getName());

	@Test
	public void test() throws InterruptedException{
		webPortalFilter();
		Assert.assertEquals(selectedFilterName(), "Web Portal");

	}
	
}
