package Basep5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//session-80
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseC5 {
	//driver initialization
		//browser close
		//browser launch
		//DB connection
	public static String browser="chrome";
	public static String URL="https://demo.guru99.com/test/radio.html";
	public static WebDriver driver;
	
	public static void browserInitialization()
	{
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			try {
				if((URL.length()==0))
				{
					throw new URLexception("incorrect URL");
				}
				else
				{
					driver.get(URL);
					break;
				}
				
			}
			catch(Exception E) {
				System.out.println(E);
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				break;
			}
				
			
		case "IE":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		}
	}
}
