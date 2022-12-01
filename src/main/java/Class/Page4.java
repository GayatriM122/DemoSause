package Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Page4 extends TestBase
{
	//TC1=verify current url
//			TC2= Verify label1	
		//  TC3= verify signinDemo
		//  TC4= verify label2	
			
			//object repository
			@FindBy(xpath=" //div[@class='app_logo']")private WebElement SmallLogo1;

			@FindBy(xpath="//input[@name='firstName']")private WebElement UserName;
			@FindBy(xpath="//input[@name='lastName']")private WebElement Password;
			@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")private WebElement ZipCode;
//			@FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement label1;
			@FindBy(xpath="//input[@id='continue']")private WebElement button;
			@FindBy(xpath="//div[@class='footer_copy'] ")private WebElement label2;

		    //constructor
			public Page4()
			{
				PageFactory.initElements(driver, this);
			}
			
			//method for current url
			public String currenturl()
			{
				String a = driver.getCurrentUrl();
				return a;
			}
			
			//method for small logo
			public boolean SmallLogo1()
			{
				return SmallLogo1.isDisplayed();
			}
			
			//method of signin page
			public String Checkoutstep2()
			{
				UserName.sendKeys("Swami");
				Password.sendKeys("Samartha");
				ZipCode.sendKeys("12345");
		        button.click();
		        return driver.getCurrentUrl();			

				
		    }
			
			
			
			
			
			
		

}
