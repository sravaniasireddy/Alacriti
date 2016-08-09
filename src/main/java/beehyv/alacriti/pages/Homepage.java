package beehyv.alacriti.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


 public class Homepage extends Testbase{
	 
	 @FindBy(className = "logo-image") WebElement logoName;
	 @FindBy(linkText = "Reports") WebElement reportsLink;
	 @FindBy(className = "uib-tab-heading") List<WebElement> reportname;
	 @FindBy(xpath = "html/body/div[1]/div/div/report-body/div/div[1]/div[1]/p[1]") WebElement reportPageHeader;
	 @FindBy(className = "startDate") WebElement startDateFilterSelection;
	 @FindBy(className = "endDate") WebElement endDateFilterSelection;
	 @FindBy(className = "selected-thisrange ng-binding") WebElement selectedDateRange;
	 @FindBy(xpath = "html/body/div[1]/div/tab/div/nav/ul/li[3]/div/button/text()") WebElement userName;
	 @FindBy(xpath = "html/body/div[1]/div/div/report-body/div/div[1]/div[2]/nav/ul/li[1]/filter/div/div/a")WebElement navFilter;
	 @FindBy(className = "modal-body") WebElement navFilterModel;
	 @FindBy(tagName = "label") List<WebElement> filterOptions;
	 @FindBy(xpath = ".//*[@id='filter-modal']/div/div/div[2]/div[3]") WebElement applyButton;
	 @FindBy(xpath = "html/body/div[1]/div/div/report-body/div/div[1]/div[1]/p[4]/span") WebElement selectedFilter;
	 @FindBy(xpath = ".//*[@class='piecharts']/h5/strong") List<WebElement> header;
	 @FindBy(tagName = "tspan") List<WebElement> chartFilter;
	 @FindBy(xpath = ".//*[@id='customrange']/span/img") WebElement dateFilterCalender;
	 @FindBy(xpath = "html/body/div[4]") WebElement calenderPopup;
	 @FindBy(xpath = "html/body/div[4]/div[1]/ul/li") WebElement calenderOptions;
	 @FindBy(xpath = "html/body/div[4]/div[2]/div[1]/input") WebElement calenderStartDate;
	 @FindBy(xpath = "html/body/div[4]/div[3]/div[1]/input") WebElement calenderEndDate;
		
		public void chartHeader(){
			try{
				List<WebElement> chartName = header;
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
				List<WebElement> legendtName = chartFilter;
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

		return logoName.getAttribute("alt");
	}
	 
    public String url(){
   	 	return driver.getCurrentUrl();
    }
    
    public String user(){
    	return userName.getText();
    }
    public void reportsLink(){
    System.out.println(reportsLink.isDisplayed());
    	if(reportsLink.isDisplayed()){
        	System.out.println(reportsLink.isDisplayed());
    	}
    }

    public void reportSelection(){
    	try{
    		List<WebElement> name = reportname;
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
    		header = reportPageHeader.getText();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return header;
    }
   
    public void dateSelection(){
    	try{
    		System.out.println(startDateFilterSelection.isDisplayed());
    		if(selectedDateRange.isDisplayed()){
        		selectedDateRange.click();
        	}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	
    }
    
    
    public void filters(){
    	try{
			navFilter.click();
			Thread.sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    
    public void filterNames(){
    	try{
    		if(navFilterModel.isDisplayed()){
				 List<WebElement> options = filterOptions;
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
    		if(navFilterModel.isDisplayed()){
				 List<WebElement> options = filterOptions;
				 System.out.println(options.size());
				 for(WebElement option:options){
					 System.out.println(option.getText());
					 if(option.getText().equals(name)){
						 option.click();
						 Thread.sleep(20000);
						 applyButton.click();
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
    		filterName = selectedFilter.getText();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return filterName;
    }
}
 
