package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Class.CartPage3;
import Class.CheckOutTwoPage5;
import Class.InventoryPage;
import Class.LoginPage;
import Class.Page4;
import Class.SwagLabFinal6;


public class PageFinal6 extends TestBase
{
	LoginPage login;
	InventoryPage invent;
	CartPage3 cart;
	Page4 Page;
	CheckOutTwoPage5 Checkout;
	SwagLabFinal6 Swaglab;
	
        @BeforeMethod
        public void setup() throws IOException
        {
        	initalization();
        	login= new LoginPage();
     	    invent = new InventoryPage();
     	    cart= new CartPage3();
       	    Page= new Page4();
            Checkout=new CheckOutTwoPage5();
            Swaglab = new SwagLabFinal6();
            
            login.loginToApp1();
            invent.cart1();
            cart.verifyCheckOut();
            Page.Checkoutstep2();
            Checkout.finbtn();
         }
        
      @Test(enabled = true)
      public void currenturlTest() 
      {
        String result = Swaglab.veryifcurrenturl();
        Assert.assertEquals(result, "https://www.saucedemo.com/checkout-complete.html");
	  }
      @Test(enabled = true)
      public void smalllogoTest()
      {
    	    boolean result = Swaglab. smalllogo();
			Assert.assertEquals(result, true);
      }
      @Test(enabled = true)
      public void checklabelTest()
      {
    	    String result = Swaglab. checklabel();
			Assert.assertEquals(result, "CHECKOUT: COMPLETE!");
      }
      @Test(enabled = true)
      public void headerTest()
      {
    	 String result =Swaglab. header();
    	 Assert.assertEquals(result, "THANK YOU FOR YOUR ORDER");
      }
      @Test(enabled = true)
      public void textlabelTest()
      {
    	 String result =Swaglab. textlabel();
    	// Assert.assertEquals(result, " Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    	 System.out.println("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
      } 
        
      @Test(enabled = true)
      public void biglogoTest()
      {
    	    boolean result = Swaglab. biglogo();
			Assert.assertEquals(result, false);
      }  
        
       @Test(enabled = true)
       public void finbtnTest()
       {
    	   String result= Swaglab.finbtn();
			Assert.assertEquals(result, "https://www.saucedemo.com/inventory.html");

       }
        
        @AfterMethod
        public void clodedbrowser()
        {
        	driver.close();
        }
}
