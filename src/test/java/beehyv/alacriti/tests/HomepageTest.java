package beehyv.alacriti.tests;
import java.util.logging.Logger;

import org.testng.annotations.Test;
import beehyv.alacriti.pages.Homepage;

public class HomepageTest extends Homepage{
	private final Logger LOGGER = Logger.getLogger(HomepageTest.class.getName());
	@Test
  public void homepagetest() throws InterruptedException {
	  acessingSite();
      Thread.sleep(10000);
	  LOGGER.info(logo());
      Thread.sleep(10000);
	  LOGGER.info(url());
      Thread.sleep(10000);
	  reportSelection();
      Thread.sleep(10000);

      
//	  homePage.reportSelection(driver);
//	  System.out.println(homePage.pageHeader(driver));
//	  Assert.assertEquals("Payments By Entry Date",homePage.pageHeader(driver) );
//	 
  }
}
