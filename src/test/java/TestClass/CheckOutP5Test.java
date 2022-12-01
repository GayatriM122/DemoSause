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

public class CheckOutP5Test extends TestBase
{
	LoginPage login;
	InventoryPage invent;
	CartPage3 cart;
	Page4 Page;
	CheckOutTwoPage5 Checkout;
	
    @BeforeMethod
    public void setup() throws IOException
    { 
    	initalization();
    	login= new LoginPage();
 	    invent = new InventoryPage();
 	    cart= new CartPage3();
   	    Page= new Page4();
        Checkout=new CheckOutTwoPage5();
        
        login.loginToApp1();
        invent.cart1();
        cart.verifyCheckOut();
        Page.Checkoutstep2();
    }
     
    @Test
    public void verifycurrentUrlTest()
    {
    	String Url=Checkout.verifycurrentUrl();
    	Assert.assertEquals(Url, "https://www.saucedemo.com/checkout-step-two.html");
    }
    
    @Test
    public void verifylebel1checkTest()
    {
        String label = Checkout.verifylebel1check();
    	Assert.assertEquals(label, "CHECKOUT: OVERVIEW");

    }
    @Test
    public void qtydiTest()
    {
        String label = Checkout.qtydi();
    	Assert.assertEquals(label, "DESCRIPTION");

    }
    @Test
    public void payinfoTest()
    {
        String label = Checkout.payinfo();
    	Assert.assertEquals(label, "Payment Information:");

    }
    @Test
    public void payiswascardnfoTest()
    {
        String label = Checkout.swascard();
    	Assert.assertEquals(label, "SauceCard #31337");

    }
    
   
    @Test
    public void ponyTest()
    {
        String label = Checkout.pony();
    	Assert.assertEquals(label, "SauceCard #31337");

    }
    
    @Test
    public void itemTest()
    {
        String label = Checkout.item();
    	Assert.assertEquals(label, "Item total: $0");

    }
    
    @Test
    public void taxTestTest()
    {
        String label = Checkout.tax();
    	Assert.assertEquals(label, "Tax: $0.00");

    }
    
     @Test
     public void finbtnTest()
    {
        
		String result=Checkout.finbtn();
		Assert.assertEquals(result, "https://www.saucedemo.com/checkout-complete.html");

    }

       @AfterMethod    
    public void closedbroweser()
    {
   	    driver.close();
    }
}
