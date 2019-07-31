package am.qa.vivarobet.page.third.party.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.vivarobet.page.home.VivaroHomePage;

public class VivaroThirdPartyIntegrationPage extends VivaroHomePage {

	public VivaroThirdPartyIntegrationPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//a[@class='instagram']")
	WebElement instagramIcon;

	@FindBy(xpath="//a[@class='twitter']")
	WebElement twitterIcon;
	
	@FindBy(xpath="//a[@class='facebook']")
	WebElement facebookIcon;
	
	
	public void clickToInstagramIcon() {
		instagramIcon.click();
	}

	public void clickToTwitterIcon() {
		twitterIcon.click();
	}

	public void clickToFacebookIcon() {
		facebookIcon.click();
	}

}

