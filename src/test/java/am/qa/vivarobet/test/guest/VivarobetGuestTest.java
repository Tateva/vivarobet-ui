package am.qa.vivarobet.test.guest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.qa.vivarobet.page.guest.VivaroGuestPage;
import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;

public class VivarobetGuestTest extends VivarobetBaseTest{
	
	@Test
	// Test_Id1
	// P2
	// Step_1.1: Click on "Feedback" button
	// Step_1.2: Type any text in email field

	public void testFeedbackWithIncorrectEmail()  {
	VivaroHomePage home = new VivaroHomePage(driver);
	VivaroGuestPage guest = home.openFeedbackForm();
	guest.feedback("aaabbb", "");	
	Assert.assertTrue(guest.emailErrorWindowDisplayed());
	}
	
	@Test
	// Test_Id2
	// P2
	// Step_1.1: Click on "Feedback" button
	// Step_1.2: Type any email in email field
	// Step_1.3: Click send button

	public void testFeedbackWithEmailAndEmptyMessageBox() throws InterruptedException  {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroGuestPage guest = home.openFeedbackForm();
		guest.feedback("aaabbb@gmail.com", "");	
		guest.clickOnSendButton();
		Thread.sleep(3000);
		Assert.assertTrue(guest.errorWindowDisplayed());
	}
	
	@Test
	// Test_Id3
	// P2
	// Step_1.1: Click on "Feedback" button
	// Step_1.2: Type any email and any text after press send button
	
	public void testFeedbackWithEmailAndMessageText() throws InterruptedException  {
		VivaroHomePage home = new VivaroHomePage(driver);
		prepareEnglishPage();
		Thread.sleep(3000);
		VivaroGuestPage guest = home.openFeedbackForm();
		guest.feedback("aaabbb@gmail.com", "aaaaaa");	
		guest.clickOnSendButton();
		Thread.sleep(3000);
		Assert.assertTrue(guest.okWindowDisplayed());
	}
	
	
}
