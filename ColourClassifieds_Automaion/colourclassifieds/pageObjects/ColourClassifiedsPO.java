package pageObjects;

import org.openqa.selenium.WebDriver;
import applicationUtilities.ApplicationUtilities;
import generalUtilities.ReadProperties;
import generalUtilities.ReadXL;

public class ColourClassifiedsPO 
{
	WebDriver driver ;
	ApplicationUtilities util;
	ReadProperties prop;
	ReadXL myXl;
	
	public ColourClassifiedsPO(WebDriver driver)
	{
		this.driver = driver;
		this.util= new ApplicationUtilities(driver);
		this.prop= new ReadProperties("E:\\Java Programs\\ColourClassifieds_Automaion\\colourclassifieds\\Testdata.properties");
		this.myXl= new ReadXL(prop.readData("EXCELPATH"));
				
	}
	
	public void launch()
	{
		driver.get(prop.readData("URL"));
		
	}

		public void Registration()
		{	//Click on Register Link
			util.returnWebElement("id", "register").click();
	
			util.returnWebElement("name", "email").sendKeys(myXl.getCellData("Register", 1, 2));
			util.returnWebElement("name", "name").sendKeys(myXl.getCellData("Register", 1, 3));
			util.returnWebElement("name", "passwd").sendKeys(myXl.getCellData("Register", 1, 4));
			util.returnWebElement("name", "passwd2").sendKeys(myXl.getCellData("Register", 1, 4));
			util.returnWebElement("name", "emelding").click();
			util.returnWebElement("name", "hide_email").click();
			util.returnWebElement("name", "agree_cond").click();
			util.returnWebElement("className", "button").click();
		}
		public void login()
		{
			util.returnWebElement("xpath", "//*[@id='login']/a").click();
			util.returnWebElement("name", "username").sendKeys(myXl.getCellData("Login", 1, 1));
			util.returnWebElement("name", "password").sendKeys(myXl.getCellData("Login", 1, 2));
			util.returnWebElement("name", "submit").click();
			System.out.println("im trying git");
		}

}
