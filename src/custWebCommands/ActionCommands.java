package custWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.BrowserSelection;

public class ActionCommands  extends BrowserSelection
{
	// This method will open the url
	public static void url(String url)
	
	{
		driver.get(url);
	}
	
	// This method is used to click in WebBrowser
	public static void click(By locator)
	{
		
		driver.findElement(locator).click();
	}
	
	// This method is used to clear the text
	public static void clear(By locator)
	{
		driver.findElement(locator).clear();
	}
	
	//This method is used to see whether the element is selected or not
	public static boolean isSelected(By locator)
	{
		return driver.findElement(locator).isSelected();
	}
	
	//This method is used to see whether the element is displayed
	public static boolean isDisplay(By locator)
	{
		return driver.findElement(locator).isDisplayed();
	}
	
	//This method is used to select the element in drop down using selectByVisibleText
	public static void selectByVisibleText(By locator, String selectVisibleText )
	{
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.selectByVisibleText(selectVisibleText);
	}
	
	//This method is used to enter the text in textbox.	
	public static void sendText(By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	
	public static void explicitWait(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		try
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void dropDown(By dropDownLocator, By listLocator)
	{
		WebElement dropdown = driver.findElement(dropDownLocator);
		dropdown.click();
		driver.findElement(listLocator).click();
	}
	
	public static void email(By emailID, By next, By password, By signIn)
	{
		int emailURLCol = 4, emailURLRow = 1, emailIDCol = 2, emailIDRow = 1, passwordCol = 3, passwordRow = 1;
		String emailUrl = Excel.reader(emailURLCol, emailURLRow, "Sheet1");
		String id = Excel.reader(emailIDCol, emailIDRow, "Sheet1");
		String pwd = Excel.reader(passwordCol, passwordRow, "Sheet1");
		driver.get(emailUrl);
		driver.findElement(emailID).sendKeys(id);
		driver.findElement(next).click();
		driver.findElement(password).sendKeys(pwd);;	
		driver.findElement(signIn).click();
	}
}



