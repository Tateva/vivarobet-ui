package am.qa.vivarobet.page.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.vivarobet.page.base.PageObject;

public class VivaroRegisterPage extends PageObject {

	public VivaroRegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[contains(@ng-blur,'registerform') and @type='email']")
	WebElement emailFieldReg;

	@FindBy(xpath = "//input[@autocomplete='new-password']")
	WebElement passFieldReg;

	@FindBy(xpath = "//button[@ng-click='goToNextStep()']")
	WebElement activeNextButton;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastNameField;

	@FindBy(xpath = "//select[@name='birth_day']")
	WebElement birthDayField;

	@FindBy(xpath = "//option[@label='01']")
	WebElement birthDayValueField;

	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement birthMonthField;

	@FindBy(xpath = "//option[@value='01']")
	WebElement birthMonthValueField;

	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYearField;

	@FindBy(xpath = "//option[@value='1998']")
	WebElement birthYearValueField;

	@FindBy(xpath = "//input[@name='doc_number']")
	WebElement passportNumberField;

	@FindBy(xpath = "//input[@name='phone_number']")
	WebElement phoneNumberField;
	
	
	@FindBy(xpath="//div[text()='Password is too long' and not(contains(@class, 'hide'))]")
	WebElement passTooLong;
	
	public boolean passLongPresent() {
		return passTooLong.isDisplayed();
	}
	
	
	@FindBy(xpath = "//button[contains(@ng-disabled,'registration.busy || (registration')]")
	WebElement secondRegisterPageButton;
	
	public boolean secondRegisterPageButtonPresent() {
		return secondRegisterPageButton.isDisplayed();
	}
	
	
	@FindBy(xpath = "//div[@class='button-confirm']")
	WebElement passiveNextButton;
	
	public boolean passiveNextButtonPresent() {
		return passiveNextButton.isDisplayed();
	}
	
	
	public VivaroRegisterPage firstPageRegister(String emailValue, String passwordValue) throws InterruptedException {
		Thread.sleep(3000);
		emailFieldReg.sendKeys(emailValue);
		passFieldReg.sendKeys(passwordValue);
			Thread.sleep(3000);
		clickToNextButton();
		return new VivaroRegisterPage(driver);

	}

	public void clickToNextButton() {
		try {
			activeNextButton.click();
		} catch (Exception ex) {
			passiveNextButton.click();
		}
	}

	public VivaroRegisterPage secondPageNamesRegister(String nameValue, String lastNameValue) {
		nameField.sendKeys(nameValue);
		lastNameField.sendKeys(lastNameValue);
		return new VivaroRegisterPage(driver);
	}

	public VivaroRegisterPage secondPageDatesRegister(String passportValue, String phoneValue) {
		birthDayField.click();
		birthDayValueField.click();
		birthMonthField.click();
		birthMonthValueField.click();
		birthYearField.click();
		birthYearValueField.click();
		passportNumberField.sendKeys(passportValue);
		phoneNumberField.sendKeys(phoneValue);

		return new VivaroRegisterPage(driver);

	}

}
