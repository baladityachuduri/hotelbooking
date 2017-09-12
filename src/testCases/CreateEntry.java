package testCases;

//import org.testng.annotations.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import custWebCommands.ActionCommands;
import hotelbookingrepository.Details;

public class CreateEntry extends ActionCommands {
	
	@Before
	public void startBrowser() {
		
			String url = "http://localhost:3003";

			BrowserSelection("FireFox");
			// open FireFox Browser
	
			url(url);
			Assert.assertEquals(isDisplay(Details.hotelManagementPlatformHeading), true);
	}
	
	@After
	public void stopBrowser() {
		driver.quit();
	}
	
	@Test
	public void hotelBooking()	{
	
		click(Details.login);
		// click on login

		sendText(Details.enterUsername, "admin");
		// To enter username
		sendText(Details.enterPassword, "password");
		// click(Details.enterUsername.)
		
driver.findElement(By.id("doLogin")).click();
	}
	
	@Test
	public void makeBooking () {
		
		sendText(Details.enterHotelName, "Hotel Name");
		sendText(Details.enterAddress, "15 Avenue");
		sendText(Details.enterOwner, "Tim");
		sendText(Details.enterPhoneNumber, "07777778878");
		sendText(Details.enterEmail, "tim@gmail.com");
		click(Details.createButton);
		
	}

	@Test
	public void deleteBooking() {
		click(Details.delete);
	}
	
	public void makeMultipleBooking () {
		for(int count=0;count<4;count++) {		
		sendText(Details.enterHotelName, "Hotel2");
				sendText(Details.enterAddress, "16 Avenue");
				sendText(Details.enterOwner, "Tom");
				sendText(Details.enterPhoneNumber, "07777778898");
				sendText(Details.enterEmail, "tom@gmail.com");
				click(Details.createButton);
}
			}
}
