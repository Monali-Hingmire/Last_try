package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basep5.baseC5;
import genericmethodP5.genericmethodC5;

public class Registrationpage extends baseC5{ //extended basec5 for browser initialization

	public static By emailinput=By.xpath("//input[@name='email']");
	public static By passwordid=By.xpath("//input[@name='pass']");
	public static By submitbtn=By.xpath("//div[@aria-label='Log in']");
	
	public static void enteremailid(String emailidd)
	{
		driver.findElement(emailinput).sendKeys(emailidd);
	}
	public static void enterpassword(String passwordd)
	{
		driver.findElement(passwordid).sendKeys(passwordd);
	}
	
	public static void clicklogin()
	{
		WebElement Ele=driver.findElement(submitbtn);
		genericmethodC5.javascriptExecutor_click(Ele);
		
	}
}
