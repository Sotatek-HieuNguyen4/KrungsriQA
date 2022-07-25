package actions.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	WebDriver driver;
	private static LandingPageObjects landingPage;
	public PageGeneratorManager(WebDriver driver) {
	}
	
	public static LandingPageObjects getLandingPage (WebDriver driver) {
		if(landingPage == null) {
			return new LandingPageObjects(driver);
		}
		return landingPage;
	}

}
