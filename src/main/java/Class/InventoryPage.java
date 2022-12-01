package Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class InventoryPage extends TestBase
{ 

	//TC1 =Verify the visibility of of small logo
	//TC2= verify the visibility of big logo
	//tC3= add 6 product in cart
	//TC4= remove to product from cart
	//TC6= verify the visibility of twitter logo
	//TC5= verify the visibility of FB logo
	//TC5= verify the visibility of LINKDIN logo

	// object Repository
	@FindBy(xpath="//div[@class='peek']")private WebElement smalllogo1;
	@FindBy(xpath="//img[@class='footer_robot']")private WebElement bigLogo;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sorterDropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement backpackProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLightProduct;
	@FindBy(xpath=" //button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement tshirtBlackProduct16;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private	WebElement	jacketProduct50;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement	tshirtProduct8;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private	WebElement tshirtRedProduct16;
    @FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement	productCountIcon;
    @FindBy(xpath="//a[@href='https://twitter.com/saucelabs'] ")private WebElement	TweeterLogo;
    @FindBy(xpath="//a[@href='https://www.facebook.com/saucelabs'] ")private WebElement	FaceBookLogo;
    @FindBy(xpath=" //a[@href='https://www.linkedin.com/company/sauce-labs/']")private WebElement Linkdinlogo;
    
    @FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement cart1;
    @FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cart2;

   //constructor
    public InventoryPage()
    {
    	  PageFactory.initElements(driver, this);
    }
    
    //methods
    public boolean verifySmalllogo1()
    {
    
		return smalllogo1.isDisplayed();
    }
    public	boolean	verifyBigLogo()
    {
         return	bigLogo.isDisplayed();
    }
    
    public	String	add6Product()
    {
      Select s	= new Select(sorterDropdown);
     // s.selectByVisibleText(UtilityMethod.selectClass());

      
    //  s.selectByVisibleText("Price (low to high)");
      backpackProduct.click();
      bikeLightProduct.click();
      tshirtBlackProduct16.click();
      tshirtProduct8.click();
      tshirtRedProduct16.click();
      jacketProduct50.click();
      String count =productCountIcon.getText();
      return count;
    }
    
    public	boolean	verifyTweeterLogo()
    {
         return	TweeterLogo.isDisplayed();
    }
    
    public boolean  verifyFaceBookLogo()
    {
        return	FaceBookLogo.isDisplayed();

    }
    public boolean  verifyLinkdinlogo()
    {
        return	Linkdinlogo.isDisplayed();

    }
    
    
     public String cart1()
     {
    	//add6Product();
	    cart2.click();
	  String a =cart2.getText();
	  return a;
     }
	
	
}


