package beehyv.alacriti.pages;
import java.util.logging.Logger;

public class WebPortalFilter extends Homepage{
	private final Logger LOGGER = Logger.getLogger(WebPortalFilter.class.getName());	

	public void webPortalFilter(){
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
		      filterSelection("Web Portal");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
