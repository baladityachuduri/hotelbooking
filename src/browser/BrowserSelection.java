package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelection 
{
	
	public static WebDriver driver;
	public void BrowserSelection(String Browser)
	{
		//FireFox Browser will open if Browser = FireFox(ignore case)
		if(Browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		
		//Chrome Browser will open if Browser = Chrome(ignore case)
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ctm\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//IE Browser will open if Browser = IE(ignore case)
		{
			System.setProperty("webdriver.ie.driver", "C:\\ctm\\IEDriverServer.exe");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
