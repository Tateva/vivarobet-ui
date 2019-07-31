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
	
	final String engLangXPath ="//div[@id='main-header-container']//li[@class='eng']/span";
	@FindBy(xpath=engLangXPath)
	WebElement englang;
	
	
	
	
	public void selectEnglishLanguage() {
		dropdownLang.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, engLangXPath);
			englang.click();
		} catch (Exception e) {
		}
		
	}
	
	
}
