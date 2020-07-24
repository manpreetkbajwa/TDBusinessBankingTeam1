package TDPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

	
	 private By PlanAViewDetails = By.xpath("//section[@id='catalogue1_product0']/div/div[2]/div/p/a");
	 private By PlanBViewDetails = By.xpath("//section[@id='catalogue1_product1']/div/div[2]/div/p/a");
	 private By PlanCViewDetails = By.xpath("//section[@id='catalogue1_product2']/div/div[2]/div/p/a");
	 private By PlanBusinessBasicPlan = By.xpath("//section[@id='catalogue1_product3']/div/div[2]/div/p/a");
	 
	 public LandingPage(WebDriver driver) {
			super(driver);
	 }
//
//		public void PlanAViewDetails() throws Throwable {
//			getElementAndClick(PlanAViewDetails);
//		}
//		
//		public void PlanBViewDetails() throws Throwable  {
//			getElementAndClick(PlanBViewDetails);
//		}
//		public void PlanCViewDetails() throws Throwable  {
//			getElementAndClick(PlanCViewDetails);
//		}
//		public void PlanBusinessBasicPlan() throws Throwable  {
//			getElementAndClick(PlanBusinessBasicPlan);
//		}
		
		}
	 

