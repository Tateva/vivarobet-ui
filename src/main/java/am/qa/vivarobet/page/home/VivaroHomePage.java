package am.qa.vivarobet.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.qa.vivarobet.page.base.PageObject;
import am.qa.vivarobet.page.login.VivaroLoginPage;
import am.qa.vivarobet.page.register.VivaroRegisterPage;
import am.qa.vivarobet.util.DriverUtil;

public class VivaroHomePage extends PageObject {
	
	public VivaroHomePage(WebDriver driver) {
		super(driver);
		DriverUtil.waitForElementPresent(driver, 5, dropdownLangXPath );
	}
	
	final String dropdownLangXPath="//div[contains(@ng-click,'languageIsToggled')]/i";
	@FindBy(xpath=dropdownLangXPath)
	WebElement dropdownLang;
	
	final String engLangXPath ="//div[@id='main-header-container']//li[@class='eng']/span";
	@FindBy(xpath=engLangXPath)
	WebElement englang;
	
	final String loginButtonXPath="//button[@ng-click='signin()']";
	@FindBy(xpath=loginButtonXPath)
 	WebElement loginbutton;
	
	@FindBy(xpath="//button[@ng-click='register()']")
	WebElement registerbutton;
	
	@FindBy(xpath="//button[@ng-if='!activeDialog.yesno && !activeDialog.link']")
	WebElement globalOkButton;
	
	
	public void clickToGlobalOkButton() {
		PageFactory.initElements(driver,  this);
		globalOkButton.click();
	}
		
	
	public void selectEnglishLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, engLangXPath);
			englang.click();
		} catch (Exception e) {
		}	
	}
	
	
	public VivaroLoginPage openLoginDialog() {
		
		try {
	    	Thread.sleep(5000);
	    		} catch (InterruptedException e) {
	    		e.printStackTrace();
	    		}
		DriverUtil.waitForElementPresent(driver, 10, loginButtonXPath);
		loginbutton.click();
		return new VivaroLoginPage(driver);
			
	}
	
	
	
	public VivaroRegisterPage openRegisterDialog() {
		registerbutton.click();

		return new VivaroRegisterPage(driver);
	}

	
	

}
