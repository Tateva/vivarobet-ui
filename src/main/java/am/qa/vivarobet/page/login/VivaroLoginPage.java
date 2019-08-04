package am.qa.vivarobet.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.qa.vivarobet.page.base.PageObject;
import am.qa.vivarobet.page.member.VivaroMemberPage;


public class VivaroLoginPage extends PageObject {

	public VivaroLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
		@FindBy(xpath="//input[@ng-model='user.username']")
		WebElement emailField;
		
		@FindBy(xpath="//input[@ng-model='user.password']")
		WebElement passField;
		
		@FindBy(xpath="//button[@ng-click='signin()']")
		WebElement signButton; 
		
		@FindBy(xpath="//button[@value='Sign in']")
		WebElement loginPageSignButton; 
		
		@FindBy(xpath="//div[@class='closed-popup-form']")
		WebElement closeButton;
		
		@FindBy(xpath="//div[@id='user-settings']")
		WebElement userSettings;
		 
		@FindBy(xpath="//li[contains(@ng-click, 'logOut()')]")
		WebElement logOutIcon;
		
		
		
		public VivaroMemberPage login(String loginValue, String passwordValue)  {
			
			emailField.clear();
			emailField.sendKeys(loginValue);
			passField.clear();
			passField.sendKeys(passwordValue);
			return new VivaroMemberPage(driver);
						
			}
		
		
		public void clickToSignButton() {
			loginPageSignButton.click();
		}
		
		
		public void closeLoginDialog() {
			PageFactory.initElements(driver,  this);
			closeButton.click();
		}

		
		public VivaroMemberPage logOut() throws InterruptedException {
			
			userSettings.click();
			Thread.sleep(3000);
			PageFactory.initElements(driver, this);
			logOutIcon.click();
			
			return new VivaroMemberPage(driver);
						
			}
		
		
		public boolean userSettingsButtonDisplayed() {
			return userSettings.isDisplayed();
		}
		

}
		
	
	
	
	


