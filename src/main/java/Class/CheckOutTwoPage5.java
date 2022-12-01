package Class;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage3;
import Pages.CheckOutTwoPage5;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.Page4;

public class CheckOutTwoPage5 extends TestBase
{
	//object Repository
	
			@FindBy(xpath="//div[@class='header_secondary_container']")private WebElement LabelCheckOutOverview;
			@FindBy(xpath="//div[@class='cart_desc_label']")private WebElement LablQuntityDis;
			@FindBy(xpath="//div[@class='summary_info_label'][1]")private WebElement Lablpaymentinfo;
			@FindBy(xpath="//div[@class='summary_value_label']")private WebElement Lablsauscard;
			@FindBy(xpath="//div[@class='summary_info_label'][1]")private WebElement Lableshippinginfo;
		    @FindBy(xpath="//div[@class='summary_value_label']")private WebElement Lablfreepony;
		    @FindBy(xpath="//div[text()='Item total: $']")private WebElement Lablitem;
		    @FindBy(xpath="//div[text()='Tax: $']")private WebElement Labltax;

		    @FindBy(xpath="//button[@id='finish']")private WebElement FinishBtn;
			

		    //constructor
		    public CheckOutTwoPage5()
		    {
		    	PageFactory.initElements(driver, this);
		    }
		    
		   // TC=1 url
		    //method for verify current url
		    public String verifycurrentUrl()
		    {
		    	String a  = driver.getCurrentUrl();
		    	return a;
		    }
		   // TC=2 verify label checkout
		    public String verifylebel1check()
		    {
		    	return LabelCheckOutOverview.getText();
		    }
		    
		 // TC=2 verify label qtydis
		    public String qtydi()
		    {
		    	 return LablQuntityDis.getText();
		    }
		    //TC 3 verify label payinfo
		    public String payinfo()
		    {
		    	
				 return Lablpaymentinfo.getText();
		    }
		 //TC4 verify label4 swascard
		    public String swascard()
		    {
		           return Lablsauscard.getText();
		    }
	    //TC5 verify label ship
		    public String shipin()
		    {
		        return  Lableshippinginfo.getText();
		    }
	    //TC6 verify pony
		    public String pony()
		    {
		    	return Lablfreepony.getText();
		    }
		    
		//TC7 verify pony
		    public String item()
		    {
		    	return Lablitem.getText();
		    }
	   //TC8 verify pony
		    public String tax()
		    {
		    	return Labltax.getText();
		    }
		    
	   //TC9  verify button click
		    public String finbtn() 
		    {
		    	FinishBtn.click();
		    	return driver.getCurrentUrl();
				
				
			}
	  
		    

	}
