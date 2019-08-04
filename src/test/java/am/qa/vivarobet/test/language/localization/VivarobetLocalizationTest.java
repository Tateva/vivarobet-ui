package am.qa.vivarobet.test.language.localization;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.page.language.VivaroLanguageLocalizationPage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;

public class VivarobetLocalizationTest extends VivarobetBaseTest {

	@Test
	// Test_Id1
	// P2
	// Step_1.1: Click on Armenian language icon
    // Step_1.2: Click on Russian language name's line
    // Step_1.3: Click on Russian language icon
    // Step_1.4: Click on English language name's line
    // Step_1.5: Click on English language icon
    // Step_1.6: Click on Georgian language name's line
    // Step_1.7: Click on Georgian languages icon
    // Step_1.8: Click on Farsi language name's line
    // Step_1.9: Click on Farsi language icon 
    // Step_1.10: Click on Armenian language name's line
    // Step_1.11: Click on Armenian language icon 

	public void testAllLanguageLocalization() throws InterruptedException {

		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLanguageLocalizationPage language = new VivaroLanguageLocalizationPage(driver);

		language.selectRussianLanguage();
		globalOkButtonSelect();
		Thread.sleep(3000);
		Assert.assertTrue(home.rusIconDisplayed());

		language.selectEnglishLanguage();
		globalOkButtonSelect();
		Thread.sleep(3000);
		Assert.assertTrue(home.engIconDisplayed());

		language.selectGeorgianLanguage();
		globalOkButtonSelect();
		Thread.sleep(3000);
		Assert.assertTrue(home.geoIconDisplayed());

		language.selectFarsiLanguage();
		globalOkButtonSelect();
		Thread.sleep(3000);
		Assert.assertTrue(home.fasIconDisplayed());

		language.selectArmenianLanguage();
		Thread.sleep(3000);
		Assert.assertTrue(home.armIconDisplayed());

	}

}
