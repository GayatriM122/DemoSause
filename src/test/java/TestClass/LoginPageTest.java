package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Class.LoginPage;
import Utility.CaptureScreenShot;


public class LoginPageTest extends TestBase
{
	   LoginPage login;
	
	   @BeforeMethod
	   public void setup() throws IOException
	   {
		   initalization();
		   login = new LoginPage();
	   }
	   
	  @Test (enabled = true, priority=3)
	  public void loginApp1Test()
	  {
		
		String label= login.loginToApp1();
		Assert.assertEquals(label, "PRODUCTS");
	  }
	  @Test ( enabled=true,priority=2 )
	  public	void	loginToApp2Test()
	  {
	  Assert.assertEquals(login.LoginToApp2(),	
	  "https://www.saucedemo.com/inventory.html");
	  }
	  
	   //ths will verify title on login page

	   @Test  (enabled= true,priority=1)
	   public void verifyTitleTest()
	   {
		   String Title =  login.verifyTitle();
		   Assert.assertEquals(Title, "Swag Labs");
	   }
	   //this will verify the login url

	   @Test (enabled= true,priority=0)
	   public void VerifyUrlTest()
	   {
		   String Url=login.verifyURL();
		   Assert.assertEquals(Url,"https://www.saucedemo.com/");
	   }
	   
	   // this will closed the Browser
	    @AfterMethod
	     public void closeBrowser(ITestResult it) throws IOException
	    {
	    	if(ITestResult.SUCCESS==it.getStatus()  )
	    	{
				CaptureScreenShot.screenshot(it.getName());

	    	}
		   driver.close();
	    }
		
		

}
