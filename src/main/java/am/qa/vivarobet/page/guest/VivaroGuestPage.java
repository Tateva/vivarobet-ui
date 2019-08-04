package am.qa.vivarobet.page.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.vivarobet.page.home.VivaroHomePage;

public class VivaroGuestPage extends VivaroHomePage{

	public VivaroGuestPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@name='email']")
	WebElement feedEmailField;
	
	@FindBy(xpath="//textarea[@ng-model='messageBody']")
	WebElement feedMessageField;
	
	public VivaroGuestPage feedback (String emailValue, String messageValue)  {
		
		feedEmailField.clear();
		feedEmailField.sendKeys(emailValue);
		feedMessageField.clear();
		feedMessageField.sendKeys(messageValue);
		return new VivaroGuestPage(driver);
					
		}
	
	
	@FindBy(xpath="//span[@ng-show='feedbackForm.email.$error.pattern']")
	WebElement emailErrorWindow;
	
	public boolean emailErrorWindowDisplayed() {
		return emailErrorWindow.isDisplayed();
	}
	
	
	@FindBy(xpath="//button[@ng-click='sendMessage()']")
	WebElement sendButton;
	
	public void clickOnSendButton() {
		sendButton.click();
	}
	

	
	@FindBy(xpath="//p[text()='Error while sending message.body is empty']")
	WebElement ErrorWindow;
	
	public boolean errorWindowDisplayed() {
		return ErrorWindow.isDisplayed();
	}
	
	
	@FindBy(xpath="//p[text()='Your message has been sent.']")
	WebElement okWindow;
	
	public boolean okWindowDisplayed() {
		return okWindow.isDisplayed();
	}
	
	
	
}
