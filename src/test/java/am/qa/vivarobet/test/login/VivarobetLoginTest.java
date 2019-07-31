package am.qa.vivarobet.test.login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.page.login.VivaroLoginPage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;
import am.qa.vivarobet.util.ReadFromFileUtil;

public class VivarobetLoginTest extends VivarobetBaseTest {

	@BeforeMethod
	public void prepareEng() throws InterruptedException{
		prepareEnglishPage();
	}
	@Test
	// Test_Id1
	// P0
	// Step_1.1: Click on "sign in" button
	// Step_1.2: Type valid username and invalid password, after press "sign in" button

	public void testLoginWithCorrectLoginIncorrectPassword() throws Exception {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog(); 
		String correctUser = ReadFromFileUtil.readPropertyByName("userName");
		String incorrectPassword = ReadFromFileUtil.readPropertyByName("incorrectPassword");
		loginPage.login(correctUser, incorrectPassword);
		loginPage.closeLoginDialog();
		Assert.assertTrue(loginPage.loginButtonDisplayed());

	}


	@Test
	// Test-Id2 
	// P0
	// Step_2.1: Click on "sign in" button
	// Step_2.2: Type valid email and  password, after press "sign in" button
	
	public void testLoginWithCorrectEmailPassword() throws Exception {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog();
		String correctUser = ReadFromFileUtil.readPropertyByName("userEmail");
		String correctPassword = ReadFromFileUtil.readPropertyByName("password");
		loginPage.login(correctUser, correctPassword);
		Thread.sleep(3000);
		loginPage.clickToSignButton();
		Assert.assertTrue(loginPage.userSettingsButtonDisplayed());

	}

	
	@Test
	// Test_Id3
	// P0
	// Step_3.1: Click on "sign in" button
	// Step_3.2: Type valid username and password, after press "sign in" button
	
	public void testLoginWithCorrectUsernamePassword() throws Exception {
		VivaroHomePage home = new VivaroHomePage(driver);;
		VivaroLoginPage loginPage = home.openLoginDialog();
		String correctUser = ReadFromFileUtil.readPropertyByName("userName");
		String correctPassword = ReadFromFileUtil.readPropertyByName("password");
		loginPage.login(correctUser, correctPassword);
		Thread.sleep(3000);
		loginPage.clickToSignButton();
		Assert.assertTrue(loginPage.userSettingsButtonDisplayed());

	}
	
	
	@Test
	// Test_Id4
	// P0
	// Step_4.1: Navigate to "My profile" icon
	// Step_4.2: Click on "log out" element

	public void testLogOut() throws Exception {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog();
		String correctUser = ReadFromFileUtil.readPropertyByName("userName");
		String correctPassword = ReadFromFileUtil.readPropertyByName("password");
		loginPage.login(correctUser, correctPassword);
		Thread.sleep(3000);
		loginPage.clickToSignButton();
		Thread.sleep(5000);
		loginPage.logOut();
		Thread.sleep(4000);
		Assert.assertTrue(loginPage.loginButtonDisplayed());

	}
	
	
	@Test
	// Test-Id5
	// P2
	// Step_5.1: Click on "sign in" button
	// Step_5.2: Type invalid username and invalid password, after press  "sign in" button

	public void testLoginWithIncorrectCredentials() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog();
		loginPage.login("aaabbb@gmail.com", "1234567");
		Thread.sleep(5000);
		loginPage.closeLoginDialog();
		Assert.assertTrue(loginPage.loginButtonDisplayed());

	}

	
	@Test
	// Test_Id6
	// P2
	// Step_6.1: Click on "sign in" button
	// Step_6.2: Type valid username and after press "sign in" button

	public void testLoginWithOnlyCorrectUsername() throws Exception {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog();
		String correctUser = ReadFromFileUtil.readPropertyByName("userEmail");
		loginPage.login(correctUser,"");		
		Thread.sleep(3000);
		loginPage.closeLoginDialog();
		Assert.assertTrue(loginPage.loginButtonDisplayed());

	}
	
	
	@Test
	// Test_Id7
	// P2
	// Step_7.1: Click on "sign in" button
	// Step_7.2: Type any password in password field, after press "sign in" button

	public void testLoginWithOnlyPassword() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog();
		loginPage.login("", "123abc");
		loginPage.closeLoginDialog();
		Assert.assertTrue(loginPage.loginButtonDisplayed());

	}


}
