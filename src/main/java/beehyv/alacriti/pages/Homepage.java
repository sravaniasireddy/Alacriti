package beehyv.alacriti.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


 public class Homepage extends Testbase{
	 By logoName = By.className("logo-image");
	 By reportsLink = By.linkText("Reports");
	 By reportname = By.tagName("uib-tab-heading");
	 By reportPageHeader = By.xpath("html/body/div[1]/div/div/report-body/div/div[1]/div[1]/p[1]");
	 By startDateFilterSelection = By.className("startDate");
	 By endDateFilterSelection = By.className("endDate");
	 By selectedDateRange = By.className("selected-thisrange ng-binding");
	 By userName = By.xpath("html/body/div[1]/div/tab/div/nav/ul/li[3]/div/button/text()");
	 By navFilter = By.xpath("html/body/div[1]/div/div/report-body/div/div[1]/div[2]/nav/ul/li[1]/filter/div/div/a");
	 By navFilterModel = By.className("modal-body");
	 By filterOptions=By.tagName("label");
	 By applyButton = By.xpath(".//*[@id='filter-modal']/div/div/div[2]/div[3]");
	 By selectedFilter = By.xpath("html/body/div[1]/div/div/report-body/div/div[1]/div[1]/p[4]/span");
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
	 public void acessingSite(){
		 driver.get(URL);
	 }
	 
	public String logo(){
		WebDriverWait wait = new WebDriverWait(driver, 100); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoName));
		return driver.findElement(logoName).getAttribute("alt");
	}
	 
    public String url(){
   	 	return driver.getCurrentUrl();
    }
    
    public String user(){
    	WebDriverWait wait = new WebDriverWait(driver, 100); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
    	return driver.findElement(userName).getText();
    }
    public void reportsLink(){
    	WebDriverWait wait = new WebDriverWait(driver, 100); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(reportsLink));
    	System.out.println(driver.findElement(reportsLink).isDisplayed());
    	if(driver.findElement(reportsLink).isDisplayed()){
        	System.out.println(driver.findElement(reportsLink).isDisplayed());
    	}
    }

    public void reportSelection(){
    	try{
    		List<WebElement> name = driver.findElements(reportname);
    		for(WebElement report:name){
            	if(report.getText().equals("Payments By Entry Date")){
            		report.click();
            		Thread.sleep(10000);
            		System.out.println(pageHeader());
            		break;
            	}
    		}
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	 
    }
    
    public String pageHeader() {
    	String header=null;
    	try{
    		header = driver.findElement(reportPageHeader).getText();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return header;
    }
   
    public void dateSelection(){
    	try{
    		System.out.println(driver.findElement(startDateFilterSelection).isDisplayed());
    		if(driver.findElement(selectedDateRange).isDisplayed()){
        		driver.findElement(selectedDateRange).click();
        	}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	
    }
    
    
    public void filters(){
    	try{
			driver.findElement(navFilter).click();
			Thread.sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    
    public void filterNames(){
    	try{
    		if(driver.findElement(navFilterModel).isDisplayed()){
				 List<WebElement> options = driver.findElements(filterOptions);
				 System.out.println(options.size());
				 for(WebElement option:options){
					 System.out.println(option.getText());
				 }
			}
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public void filterSelection(String name){
    	try{
    		if(driver.findElement(navFilterModel).isDisplayed()){
				 List<WebElement> options = driver.findElements(filterOptions);
				 System.out.println(options.size());
				 for(WebElement option:options){
					 System.out.println(option.getText());
					 if(option.getText().equals(name)){
						 option.click();
						 Thread.sleep(20000);
						 driver.findElement(applyButton).click();
						 Thread.sleep(10000);
					 }
				 }
			}
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
   
    
    public String selectedFilterName(){
    	String filterName=null;
    	try{
    		filterName = driver.findElement(selectedFilter).getText();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return filterName;
    }
}
 
