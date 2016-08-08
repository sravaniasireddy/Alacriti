package beehyv.alacriti.pages;
import java.util.logging.Logger;

public class SimpleWebFilter extends Homepage{
	private final Logger LOGGER = Logger.getLogger(SimpleWebFilter.class.getName());	

	public void SimpleWeb(){
		try{
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
		      filterSelection("Simple Web");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
