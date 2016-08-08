package beehyv.alacriti.tests;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import beehyv.alacriti.pages.Homepage;

public class Bank extends Homepage {
	private final Logger LOGGER = Logger.getLogger(Bank.class.getName());

	@Test
	public void test() throws InterruptedException{
		acessingSite();
		Thread.sleep(10000);
		LOGGER.info(logo());
		Thread.sleep(10000);
		LOGGER.info(url());
		Thread.sleep(10000);
		reportSelection();
		Thread.sleep(10000);
		filters();
		Thread.sleep(10000);
		filterSelection("Bank");
		Assert.assertEquals(selectedFilterName(), "Bank");

	}
	
}