package Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage3 extends TestBase
{

	//Tc= verify current url
    // TC1= verify the small logo
    // TC2= verify the small logo
    //TC3= verify your cart label
	//TC4= verify qty label
	//TC5= veriffy description label
	// TC6= verify the small logo
    // TC7= verify the twitter logo
    // TC8= verify the facebook logo
    // TC9= verify the linkdin logo

	//object repository
	
	@FindBy(xpath="//div[@class='app_logo']")private WebElement smalllogo1;
	@FindBy(xpath=" //img[@alt='Swag Bot Footer']")private WebElement biglogo;
	@FindBy(xpath=" //span[text()='Your Cart']")private WebElement cartlabel;
	
	 @FindBy(xpath="//a[@href='https://twitter.com/saucelabs'] ")private WebElement	TweeterLogo;
	 @FindBy(xpath="//a[@href='https://www.facebook.com/saucelabs'] ")private WebElement	FaceBookLogo;
	 @FindBy(xpath=" //a[@href='https://www.linkedin.com/company/sauce-labs/']")private WebElement Linkdinlogo;
	

	@FindBy(xpath="//button[@id='checkout']")private WebElement checkout;

    //Constructor
	public CartPage3()
	{
		PageFactory.initElements(driver, this);
	}
	
	//verify small logo
	public boolean smalllogo1()
	{
	
	    return smalllogo1.isDisplayed();
	}
	
	//verify big logo()
	public boolean biglogo()
	{
		
        return biglogo.isDisplayed();
	}
	
	 //verify big tweeterlogo()
		public boolean tweeterlogo()
		{
			
	        return TweeterLogo.isDisplayed();
		}
		
     //verify big tweeterlogo()
	  public boolean facebooklogo()
      {
					
	        return FaceBookLogo.isDisplayed();
      }
				
	  public boolean  verifyLinkdinlogo()
	  {
	        return	Linkdinlogo.isDisplayed();

	  }

	
      public  void verifyCheckOut()
	  {
	         checkout.click();
	   	         
	  }
      
	    public String url()
	  {
        return driver.getCurrentUrl();			

	  }

}
