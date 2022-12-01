package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Class.InventoryPage;
import Class.LoginPage;


public class InventoryPageTest extends TestBase
{
	LoginPage login;
    InventoryPage invent;

	@BeforeMethod
     public  void setup() throws IOException
     {
  	   initalization();
  	   invent = new InventoryPage();
  	   login = new LoginPage();
     }

     @Test(enabled=false)
     public void verifySmalllogo1Test()
     {
  	  
		  login.loginToApp1();
		  boolean result = invent.verifySmalllogo1();
  	  Assert.assertEquals(result, true);
     }
     
     @Test(enabled=false)
    
     public void verifyBigLogoTest()
     {
     login.loginToApp1();
     boolean	result	=	invent.verifyBigLogo();
     Assert.assertEquals(result,true);
     }
     
     
     @Test(enabled=false)
     public void add6ProductTest()
     {
     login.loginToApp1();
     String result = invent.add6Product();
     Assert.assertEquals(result,	"6");
     }
     @Test(enabled=false)
     public void TweeterLogoTest()
     {
  	   login.loginToApp1();
  	   boolean result = invent.verifyTweeterLogo();
         Assert.assertEquals(result,true);

	   }
     @Test(enabled=true)
     public void FaceBookLogoTest()
     {
  	   login.loginToApp1();
  	   boolean result = invent.verifyFaceBookLogo();
         Assert.assertEquals(result,true);

	   }
     @Test(enabled=true,dependsOnMethods="FaceBookLogoTest")
     public void LinkdinlogoTest()
     {
  	   login.loginToApp1();
  	   boolean result = invent.verifyLinkdinlogo();
         Assert.assertEquals(result,true);

	   }
     @Test(enabled=false)
     public void cart1Test()
     {
  	   login.loginToApp1();
  	   invent.cart1();
  	   
  	   
     }
     
	   @AfterMethod
		public void closeBrowser()
	   {
		
		   driver.close();

		}
	 
	 
}


