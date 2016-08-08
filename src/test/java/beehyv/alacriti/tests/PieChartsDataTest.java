package beehyv.alacriti.tests;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;
import beehyv.alacriti.pages.PieChartsData;

public class PieChartsDataTest extends PieChartsData{
	private final Logger LOGGER = Logger.getLogger(PieChartsDataTest.class.getName());
	@Test
  public void homepagetest() throws InterruptedException {
	  acessingSite();
      Thread.sleep(10000);
	  reportSelection();
      Thread.sleep(10000);
      Assert.assertEquals(pageHeader(), "Payments By Entry Date");
      Thread.sleep(10000);
      chartHeader();
      Thread.sleep(10000);
      chartLegends();
      
//	  homePage.reportSelection(driver);
//	  System.out.println(homePage.pageHeader(driver));
//	  Assert.assertEquals("Payments By Entry Date",homePage.pageHeader(driver) );
//	 
  }
}
