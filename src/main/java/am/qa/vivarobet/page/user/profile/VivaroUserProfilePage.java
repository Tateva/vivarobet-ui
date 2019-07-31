package am.qa.vivarobet.page.user.profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.vivarobet.page.home.VivaroHomePage;

public class VivaroUserProfilePage extends VivaroHomePage{

	public VivaroUserProfilePage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//i[@class='profile-icon-tab-b']")
	WebElement profileIcon;	
	
	public boolean profileIconPresent() {
		return profileIcon.isDisplayed();
	}
	
	
	@FindBy(xpath="//a[@class='brand-color cms-jcon-deposit']")
	WebElement depositButton;//	


	public void clickToDepositButton() {
		depositButton.click();
	}
	
	
	
	
	
	
	
}

	
