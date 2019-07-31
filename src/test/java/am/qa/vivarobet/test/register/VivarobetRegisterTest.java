package am.qa.vivarobet.test.register;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.page.register.VivaroRegisterPage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;

public class VivarobetRegisterTest extends VivarobetBaseTest {

	@Test
	// Test_Id1
	// P0
	// Step_1.1: Click on register button
	// Step_1.2: Click on "Ok" button
	// Step_1.3: Type any email and password, than press "Next" button 
	// Step_1.4: Type any name and last name field, choose any birth date, type any text or number in passport number field, type number in mobile field

	public void testRegisterWithIncorrectCredentials() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aaabbb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aabb", "ayan");
		registerPage.secondPageDatesRegister("AG121212", "123123");	
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}


	@Test
	// Test_Id2
	// P2
	// Step_2.1: Click on register button
	// Step_2.2: Click on "Ok" button
	// Step_2.3: Type any text in email field and press enter

	public void testRegisterWithIncorrectEmailCharachters() throws Exception {
		VivaroHomePage home = new VivaroHomePage(driver);
		Thread.sleep(4000);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aaaaaa", "");	
		Assert.assertTrue(registerPage.passiveNextButtonPresent());

	}
	

	@Test
	// Test_Id3
	// P2
	// Step_3.1: Click on register button
	// Step_3.2: Click on "Ok" button
	// Step_3.3: Type any email and 15 character in password field

	public void testRegisterWithLongCharactersPassword() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567891234567");
		Thread.sleep(3000);
		Assert.assertTrue(registerPage.passLongPresent());
	}
	
	
	@Test
	// Test_Id4
	// P2
	// Step_4.1: Click on register button
	// Step_4.2: Click on "Ok" button
	// Step_4.3: Type any email in email field and press next button

	public void testRegisterWithOnlyEmail() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aaabbb@gmail.com", "");
		Assert.assertTrue(registerPage.passiveNextButtonPresent());

	}

	
	@Test
	// Test_Id5
	// P2
	// Step_5.1: Click on register button
	// Step_5.2: Click on "Ok" button
	// Step_5.3: Type any password in password field and press next button

	public void testRegisterWithOnlyPassword() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aaabbb@gmail.com", "");
		Assert.assertTrue(registerPage.passiveNextButtonPresent());

	}

	
	@Test
	// Test_Id6
	// P2
	// Step_6.1: Click on register button
	// Step_6.2: Click on "Ok" button
	// Step_6.3: Type any email and any password less than 6 characters and press enter

	public void testRegisterWithShortPassword() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "12345");
		Assert.assertTrue(registerPage.passiveNextButtonPresent());

	}

	
	@Test
	// Test_Id7
	// P2
	// Step_7.1: Click on register button
	// Step_7.2: Click on "Ok" button
	// Step_7.3: Type any email and password, than press "Next" button 
	// Step_7.4: Type any digits in name field and press enter

	public void testRegisterNameFieldNotAcceptDigits() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("123456", "");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());
	}

	
	@Test
	// Test_Id8
	// P2
	// Step_8.1: Click on register button
	// Step_8.2: Click on "Ok" button
	// Step_8.3: Type any email and password, than press "Next" button 
	// Step_8.4: Type any letters with space in name field 

	public void testRegisterNameFieldNotAcceptSpace() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa aaa", "");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
	// Test_Id9
	// P2
	// Step_9.1: Click on register button
	// Step_9.2: Click on "Ok" button
	// Step_9.3: Type any email and password, than press "Next" button 
	// Step_9.4: Type any letters and symbols in name field 

	public void testRegisterNameFieldNotAcceptSymbol() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa#@", "");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
	// Test_Id10
	// P2
	// Step_10.1: Click on register button
	// Step_10.2: Click on "Ok" button
	// Step_10.3: Type any email and password, than press "Next" button 
	// Step_10.4: Type 51 characters in name field

	public void testRegisterNameFieldNotAcceptTooLongCharachters() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabbb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbba", "aaa");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
	// Test_Id11
	// P2
	// Step_11.1: Click on register button
	// Step_11.2: Click on "Ok" button
	// Step_11.3: Type any email and password, than press "Next" button 
	// Step_11.4: Type 1 character in name field

	public void testRegisterNameFieldNotAcceptTooShortCharachters() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabbb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("a", "");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());


	}

	
	@Test
	// Test_Id12
	// P2
	// Step_12.1: Click on register button
	// Step_12.2: Click on "Ok" button
	// Step_12.3: Type any email and password, than press "Next" button 
	// Step_12.4: Type any digits in last name field and press enter

	public void testRegisterLastNameFieldNotAcceptDigits() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa", "123456");
		registerPage.secondPageDatesRegister("aaa123", "123456");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
	// Test_Id13
	// P2
	// Step_13.1: Click on register button
	// Step_13.2: Click on "Ok" button
	// Step_13.3: Type any email and password, than press "Next" button 
	// Step_13.4: Type any letters with space in last name field 

	public void testRegisterLastNameFieldNotAcceptSpace() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa", "aaa aaa");
		registerPage.secondPageDatesRegister("aaa123", "123456");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
	// Test_Id14
	// P2
	// Step_14.1: Click on register button
	// Step_14.2: Click on "Ok" button
	// Step_14.3: Type any email and password, than press "Next" button 
	// Step_14.4: Type any letters and symbols in last name field 

	public void testRegisterLastNameFieldNotAcceptSymbol() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa", "aaa@#");
		registerPage.secondPageDatesRegister("aaa123", "123456");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
    // Test_Id15
	// P2
	// Step_15.1: Click on register button
	// Step_15.2: Click on "Ok" button
	// Step_15.3: Type any email and password, than press "Next" button 
	// Step_15.4: Type 51 characters in last name field

	public void testRegisterLastNameFieldNotAcceptTooLongCharachters() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabbb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa", "aaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbba");
		registerPage.secondPageDatesRegister("aaa123", "123456");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
    // Test_Id16
	// P2
	// Step_16.1: Click on register button
	// Step_16.2: Click on "Ok" button
	// Step_16.3: Type any email and password, than press "Next" button 
	// Step_16.4: Type 1 character in last name field

	public void testRegisterLastNameFieldNotAcceptTooShortCharachters() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabbb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa", "a");
		registerPage.secondPageDatesRegister("aaa123", "123456");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}

	
	@Test
    // Test_Id17
	// P2
	// Step_17.1: Click on register button
	// Step_17.2: Click on "Ok" button
	// Step_17.3: Type any email and password, than press "Next" button 
	// Step_17.4: Type only letters in passport number field

	public void testRegisterPassportNumberFieldNotAcceptOnlyLetters() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroRegisterPage registerPage = home.openRegisterDialog();
		registerPage.firstPageRegister("aabbb@aaa.com", "1234567");
		registerPage.secondPageNamesRegister("aaa", "aaa");
		registerPage.secondPageDatesRegister("aaaaaa", "123456");
		Assert.assertTrue(registerPage.secondPageRegisterButtonPresent());

	}
	
	
	
	
	
	
	
}
