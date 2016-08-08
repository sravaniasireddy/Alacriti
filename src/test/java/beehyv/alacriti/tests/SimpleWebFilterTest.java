package beehyv.alacriti.tests;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import beehyv.alacriti.pages.SimpleWebFilter;

public class SimpleWebFilterTest extends SimpleWebFilter {
	private final Logger LOGGER = Logger.getLogger(SimpleWebFilterTest.class.getName());

	@Test
	public void test() throws InterruptedException{
		SimpleWeb();
		Assert.assertEquals(selectedFilterName(), "Simple Web");

	}
	
}
