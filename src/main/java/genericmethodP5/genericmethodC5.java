package genericmethodP5;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//session-80
import Basep5.baseC5;

public class genericmethodC5 extends baseC5 {
//click button
	public static void javascriptExecutor_click(WebElement ele) {
		// TODO Auto-generated method stub
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
//Take screenshot
	public static String takescreenshot() throws IOException
	{
		TakesScreenshot tc=(TakesScreenshot)baseC5.driver;
		//we are TakesScreenshot as interface and converting driver as TakesScreenshot
		
		File srcfile=tc.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\Shree\\Downloads\\NareshIT\\Screenshots"+"ScrenCapture"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(srcfile, destfile);
		return destfile.getAbsolutePath();
	}
	//Dropdown
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		}

		
		public static void selectDropdown(By locator,
				String selectionType,
				String value) {

				Select select = new Select(getElement(locator));

				switch (selectionType.toLowerCase()) {

				    case "visibletext":
				        select.selectByVisibleText(value);
				        break;

				    case "value":
				        select.selectByValue(value);
				        break;

				    case "index":
				        select.selectByIndex(Integer.parseInt(value));
				        break;

				    default:
				        throw new IllegalArgumentException(
				            "Invalid selection type: " + selectionType);
				}

				}
		//sendkeys
		public static void enterText(WebElement element, String value) {
			element.sendKeys(value);
			
		}
		//radio button
		public static boolean isSelected(WebElement element) {

			return element.isSelected();
		}
		
		public static void clickElement(WebElement element) {

			if (element != null) {
				element.click();
			}
		}
		
	

	

}
