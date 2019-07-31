package am.qa.vivarobet.test.user.profile;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import am.qa.vivarobet.page.user.profile.VivaroUserProfilePage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;
import am.qa.vivarobet.util.ReadFromFileUtil;

public class VivarobetUserProfileTest extends VivarobetBaseTest {
	
	@BeforeMethod
	public void loginBeforeTest() throws Exception{
		prepareEnglishPage();
		String correctUser = ReadFromFileUtil.readPropertyByName("userName");
		String correctPassword = ReadFromFileUtil.readPropertyByName("password");
		login(correctUser, correctPassword);
	}
	
	
	
	@Test
	// Test_Id5
	// P1
	// Step_5.1: Click on "deposit" button
	
	public void testClickOnDepositButton() throws InterruptedException {
	VivaroUserProfilePage userProfile = new VivaroUserProfilePage(driver);
	userProfile.clickToDepositButton();
	Thread.sleep(5000);
	Assert.assertTrue(userProfile.profileIconPresent());
	}


}
