package am.qa.vivarobet.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.qa.vivarobet.page.base.PageObject;
import am.qa.vivarobet.page.guest.VivaroGuestPage;
import am.qa.vivarobet.page.login.VivaroLoginPage;
import am.qa.vivarobet.page.register.VivaroRegisterPage;
import am.qa.vivarobet.util.DriverUtil;

public class VivaroHomePage extends PageObject {

	public VivaroHomePage(WebDriver driver) {
		super(driver);
		DriverUtil.waitForElementPresent(driver, 5, dropdownLangXPath);
	}

	final String dropdownLangXPath = "//div[contains(@ng-click,'languageIsToggled')]/i";
	@FindBy(xpath = dropdownLangXPath)
	WebElement dropdownLang;
	

	@FindBy(xpath = "//button[@ng-if='!activeDialog.yesno && !activeDialog.link']")
	WebElement globalOkButton;

	public void clickToGlobalOkButton() {
		PageFactory.initElements(driver, this);
		globalOkButton.click();
	}

	
	final String signButtonXPath = "//button[@ng-click='signin()']";
	@FindBy(xpath = signButtonXPath)
	WebElement signButton;
	
	public VivaroLoginPage openLoginDialog() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DriverUtil.waitForElementPresent(driver, 10, signButtonXPath);
		signButton.click();
		return new VivaroLoginPage(driver);
	}

	public boolean signButtonDisplayed() {
		return signButton.isDisplayed();
	}

	
	
	@FindBy(xpath = "//button[@ng-click='register()']")
	WebElement registerButton;
	
	public VivaroRegisterPage openRegisterDialog() {
		registerButton.click();

		return new VivaroRegisterPage(driver);
	}

	
	
	@FindBy(xpath = "//div[@class='settings-icon-contain leng-b selected-arm']")
	WebElement armIcon;

	public boolean armIconDisplayed() {
		return armIcon.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='settings-icon-contain leng-b selected-rus']")
	WebElement rusIcon;

	public boolean rusIconDisplayed() {
		return rusIcon.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='settings-icon-contain leng-b selected-geo']")
	WebElement geoIcon;

	public boolean geoIconDisplayed() {
		return geoIcon.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='settings-icon-contain leng-b selected-eng']")
	WebElement engIcon;

	public boolean engIconDisplayed() {
		return engIcon.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='settings-icon-contain leng-b selected-fas']")
	WebElement fasIcon;

	public boolean fasIconDisplayed() {
		return fasIcon.isDisplayed();
	}

	
	@FindBy(xpath = "//button[@ng-click=\"broadcast('feedback.toggle')\"]")
	WebElement feedbackButton;
	
	public VivaroGuestPage openFeedbackForm() {	
		
		feedbackButton.click();
		return new VivaroGuestPage(driver);
	
	
	}
	
	
	
	
	
}
