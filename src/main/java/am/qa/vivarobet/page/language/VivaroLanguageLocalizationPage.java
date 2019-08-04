package am.qa.vivarobet.page.language;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.util.DriverUtil;

public class VivaroLanguageLocalizationPage extends VivaroHomePage{

	public VivaroLanguageLocalizationPage(WebDriver driver) {
		super(driver);
	}

	final String dropdownLangXPath="//div[contains(@ng-click,'languageIsToggled')]/i";
	@FindBy(xpath=dropdownLangXPath)
	WebElement dropdownLang;
	
	
	final String rusLangXPath ="//div[@id='main-header-container']//li[@class='rus']/span";
	@FindBy(xpath=rusLangXPath)
	WebElement rusLang;	
	
	public void selectRussianLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 10, rusLangXPath);
			rusLang.click();
		} catch (Exception e) {
		}
	}
	
	
	final String engLangXPath ="//div[@id='main-header-container']//li[@class='eng']/span";
	@FindBy(xpath=engLangXPath)
	WebElement engLang;
	
	public void selectEnglishLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, engLangXPath);
			engLang.click();
		} catch (Exception e) {
		}	
	}
	
	
	final String geoLangXPath ="//div[@id='main-header-container']//li[@class='geo']/span";
	@FindBy(xpath=geoLangXPath)
	WebElement geoLang;
	
	public void selectGeorgianLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, geoLangXPath);
			geoLang.click();
		} catch (Exception e) {
		}
	}
	
	
	final String fasLangXPath ="//div[@id='main-header-container']//li[@class='fas']/span";
	@FindBy(xpath=fasLangXPath)
	WebElement fasLang;
	
	public void selectFarsiLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, fasLangXPath);
			fasLang.click();
		} catch (Exception e) {
		}
	}
	
	final String armLangXPath ="//div[@id='main-header-container']//li[@class='arm']/span";
	@FindBy(xpath=armLangXPath)
	WebElement armLang;
	
	public void selectArmenianLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, armLangXPath);
			armLang.click();
		} catch (Exception e) {
		}
	}
	
	
	
}
