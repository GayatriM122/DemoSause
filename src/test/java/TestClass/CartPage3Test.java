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


public class CartPage3Test extends TestBase
{
	LoginPage login;
	CartPage3 cart;
	InventoryPage invent;
	private String url;
	
        @BeforeMethod
        public void setup() throws IOException
        {
        	initalization();
            cart=  new CartPage3();
            login= new LoginPage();
     	    invent = new InventoryPage();
        	login.loginToApp1();
            invent.cart1();
            
        }
        
       @Test(enabled = false)
       public void verifySmalllogo1Test()
       {
    	  boolean result =  cart.smalllogo1();
    	  Assert.assertEquals(result, true);
       }
        
       @Test(enabled = false)
       public void verifybiglogoTest()
       {
    	  boolean result =cart.biglogo();
    	  Assert.assertEquals(result, true);
       }
        
        @Test(enabled = false)
        public String checksLabelsTest()
        {
        	String label=login.loginToApp1();
        	Assert.assertEquals(label, "Your Cart");
			return label;

        }
        @Test(enabled = false)
        public void TweeterLogoTest()
        {
     	   boolean result = cart.tweeterlogo();
            Assert.assertEquals(result,true);
  
 	   }
        @Test(enabled = false)
        public void FaceBookLogoTest()
        {
     	   boolean result = cart.facebooklogo();
            Assert.assertEquals(result,false);    // make false
  
 	   }
        @Test(enabled =true,invocationCount=5 )
        public void LinkdinlogoTest()
        {
     	   boolean result = cart.verifyLinkdinlogo();
           Assert.assertEquals(result,false);          //make false for learning purpose
  
 	    }
        @Test(enabled =false,timeOut=100 )
        public void checkoutTest()
        {
        	
        	cart.verifyCheckOut();
            String a =driver.getCurrentUrl();
        	Assert.assertEquals(a, "https://www.saucedemo.com/checkout-step-one.html");
        }
    
         @AfterMethod()
       public void closeBrowser()
        {
        	driver.close();
        }
        
        
        
}    
        
        
        
        
        
        
        
        
        
        
        


