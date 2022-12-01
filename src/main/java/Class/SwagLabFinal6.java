package Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SwagLabFinal6 extends TestBase
{
	 // object repository
	
		@FindBy(xpath="//div[@class='app_logo']")private WebElement smalllogo;
		@FindBy(xpath="//div[@class='header_secondary_container']")private WebElement  checkoutlabel;
	    @FindBy(xpath="//h2[@class='complete-header']")private WebElement header;
		@FindBy(xpath="//div[@class='complete-text']")private WebElement text;
		@FindBy(xpath="//img[@src='/static/media/pony-express.46394a5d.png']")private WebElement biglogo;
	    @FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement btn;
	    @FindBy(xpath="//button[@id='back-to-products']")private WebElement backbtn;
	  
	   // constructor
	    public SwagLabFinal6()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	  //TC1= verify currentUrl
	    public String veryifcurrenturl()
	    {
	    	String a=driver.getCurrentUrl();
	    	return a;
	    }
	    
	  //TC3= verify smalllogo
	    public boolean smalllogo()
	    {
	    	return smalllogo.isDisplayed();
	    }
	  //TC3= verify checklabel
	    public String checklabel()
	    {
			return checkoutlabel.getText();
	    }
	  //TC4= verify header
	    public String header()
	    {
			return header.getText();
	    }
	  //TC5= verify header
	    public String textlabel()
	    {
			return text.getText();
	    }
	  //TC6 verift String biglogo
	    public boolean biglogo()
	    {
	    	return biglogo.isDisplayed();
	    }
	  //TC7= verify backhomepage
	    public String  finbtn()
	    {
	    	backbtn.click();
	    	return driver.getCurrentUrl();
	    }
	  
		
		
	    
	    
	    

}
