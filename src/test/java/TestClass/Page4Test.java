package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Class.CartPage3;
import Class.InventoryPage;
import Class.LoginPage;
import Class.Page4;




public class Page4Test  extends TestBase
{
	LoginPage login;
	InventoryPage invent;
	CartPage3 cart;
	Page4 Page;
	
     @BeforeMethod
     public void setup() throws IOException	

     {
    	 initalization();
    	 login= new LoginPage();
  	     invent = new InventoryPage();
  	     cart= new CartPage3();
    	 Page= new Page4();

     	 login.loginToApp1();
         invent.cart1();
         cart.verifyCheckOut();
     }
     
     @Test(enabled=false)
     public void  currenturlTest()
     {
    	 String url=Page.currenturl();
    	 Assert.assertEquals(url, "https://www.saucedemo.com/checkout-step-one.html");
	
     }
     @Test (enabled=false)
     public void SmallLogo1Test()
     {

    	boolean Result = Page.SmallLogo1();
    	Assert.assertEquals(Result, true);
     }
     
     
     @Test(enabled=true)
     public void Checkoutstep2Test()
     {
    	String result = Page.Checkoutstep2();
   
		Assert.assertEquals(result, "https://www.saucedemo.com/checkout-step-two.html");
     }

	@AfterMethod    
     public void closedbroweser()
     {
    	 driver.close();
     }
   


     
     
     

}
