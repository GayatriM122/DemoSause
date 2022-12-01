package Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase
{
	//ObjectRepository
	
		@FindBy(xpath="//div[@class='login_logo']")private WebElement loginLogo;
		@FindBy(xpath="//div[@class='bot_column']")private WebElement botlogo;
		@FindBy(xpath="//input[@id='user-name']")private WebElement username;
		@FindBy(xpath="//input[@id='password']")private WebElement password;
		@FindBy(xpath="//input[@id='login-button']")private WebElement loginButton;
		@FindBy(xpath="//span[@class='title']")private WebElement productLable;

	   // constructor to initialize the element of page
		public LoginPage()
		{
		     PageFactory.initElements(driver, this);
		}
		
		
	 //method to veryfy the current url
		 
		 public  String LoginToApp2()
		 {
			 loginToApp1();
			return driver.getCurrentUrl();
		 }
		 
		 // method to  verify the title
		 public String verifyTitle()
		 {
			return driver.getTitle();
		 }
		 
		 //method to verify visisblility of login logo
		 public boolean verifyLoginlogo()
		 {
			 return loginLogo.isDisplayed();
			
		 }
		 
		 //method to verify visibolity of botlogo
		 public boolean verifybotlogo()
		 {
			return botlogo.isDisplayed();
		 }
		 
		//method to login application and verify the label
			 public   String loginToApp1()
			{
				username.sendKeys("standard_user");
				password.sendKeys("secret_sauce");
				loginButton.click();
				return productLable.getText();
			}
		 // method to  verify the URL

		  public String verifyURL()
		  {
			return driver.getCurrentUrl();
		  }
		 
	

}
