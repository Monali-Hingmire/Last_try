package Allpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Basep5.baseC5;
import genericmethodP5.genericmethodC5;

public class loginpage extends baseC5 {

	//session-80
	public static By emailinput=By.xpath("//input[@name='email']");
	public static By passwordid=By.xpath("//input[@name='pass']");
	public static By submitbtn=By.xpath("//div[@aria-label='Log in']");
	public static By title=By.xpath("//title");
	public static SoftAssert sc=new SoftAssert();
	public static By errormessage=By.xpath("//a[text()='Find your account and log in.']");
	public static By countryDropdown=By.xpath("//select[@name='country']");
	public static By   FirstName=By.xpath("//input[@name='firstName']");
	public static By LastName=By.xpath("//input[@name='lastName']");
	public static By phone_no=By.xpath("//input[@name='Phone']");
	public static By email=By.xpath("//input[@name='userName']");
	public static By radioOption1=By.xpath("//input[@value='Option 1']");
	public static By radioOption2=By.xpath("//input[@value='Option 2']");
	public static By radioOption3=By.xpath("//input[@value='Option 3']");
	public static By checkbox1=By.xpath("//input[@value='checkbox1']");
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
	
	public static void verify_title(String expectedtitle)
	{
		String actualtitle=driver.getTitle();
		//Assert.assertEquals(actualtitle,expectedtitle,"actual title and expected title not matched" );(only assert)
		sc.assertEquals(actualtitle,expectedtitle,"actual title and expected title not matched" );//(soft assert-if fail any conditition still it will contimue)
		//sc.assertTrue(driver.findElement(submitbtn).isEnabled(),"button is disabled");
	}
		
//		if(actualtitle.equals(expectedtitle))
//		{
//			System.out.println("matching");
//			return true;
//		}
//		else
//		{
//			System.out.println("not matching");
//			return false;
//		}
	
//	public static boolean verify_errormessage(String expectederrormessage) {
//		String actualerrormessage=  driver.findElement(errormessage).getText();
//		Assert.assertEquals(actualerrormessage,expectederrormessage,"actual errormessage and expected errormessage not matched" );
//	
//	return true;
//	}
	
	
	public static String takescreenshots() throws IOException
	{
		
		return genericmethodC5.takescreenshot();
	}
	
	public static void selectDropdown1(By by,String t2, String t3) throws InterruptedException
	{
		genericmethodC5.selectDropdown(countryDropdown, "visibletext", t2);
		Thread.sleep(5000);
		genericmethodC5.selectDropdown(countryDropdown, "value", t3);
		Thread.sleep(5000);
		genericmethodC5.selectDropdown(countryDropdown, "index", "15");
		
	}
	public void enterFirstname(String fname, String Lname) {
		
		WebElement nameF=driver.findElement(FirstName);
		WebElement nameL=driver.findElement(LastName);
		
	//test.sendKeys(fname);
		genericmethodC5.enterText(nameF, fname);
		genericmethodC5.enterText(nameL, Lname);
		
	}
	public void selectRadioButton(String option) {

		switch(option) {

		case "Option 1":
			WebElement redio1=driver.findElement(radioOption1);
			genericmethodC5.clickElement(redio1);
			break;

		case "Option 2":
			WebElement redio2=driver.findElement(radioOption2);
			genericmethodC5.clickElement(redio2);
			break;

		case "Option 3":
			WebElement redio3=driver.findElement(radioOption2);
			genericmethodC5.clickElement(redio3);
			break;
		}
	}
	public void selectCheckbox1() {
		WebElement checkbox=driver.findElement(checkbox1);
		genericmethodC5.clickElement(checkbox);
	}
	}


