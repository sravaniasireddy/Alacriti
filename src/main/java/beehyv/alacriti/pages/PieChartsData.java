package beehyv.alacriti.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PieChartsData extends Homepage {
	By header = By.xpath(".//*[@class='piecharts']/h5/strong");
	By chartFilter = By.tagName("tspan");
	
	
	
	public void chartHeader(){
		try{
			List<WebElement> chartName = driver.findElements(header);
			System.out.println(chartName.size());
			for(WebElement chart:chartName){
				System.out.println(chart.getText());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void chartLegends(){
		try{
			List<WebElement> legendtName = driver.findElements(chartFilter);
			System.out.println(legendtName.size());
			for(WebElement legend:legendtName){
				System.out.println(legend.getText());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
