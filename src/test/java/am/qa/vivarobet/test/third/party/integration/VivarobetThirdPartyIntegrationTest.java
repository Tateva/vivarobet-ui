package am.qa.vivarobet.test.third.party.integration;

import org.testng.annotations.Test;

import am.qa.vivarobet.page.third.party.integration.VivaroThirdPartyIntegrationPage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;

public class VivarobetThirdPartyIntegrationTest extends VivarobetBaseTest {

	@Test
	// Test_Id1
	// P2
	// Click on facebook icon

	public void testFacebookNavigation() throws InterruptedException {
		VivaroThirdPartyIntegrationPage integration = new VivaroThirdPartyIntegrationPage(driver);
		integration.clickToFacebookIcon();
	}

	

	@Test
	// Test_Id2
	// P2
	// Click on twitter icon
	
	public void testTwitterNavigation() throws InterruptedException {
		VivaroThirdPartyIntegrationPage integration = new VivaroThirdPartyIntegrationPage(driver);
		integration.clickToTwitterIcon();
	}

	
	@Test
	// Test_Id3
	// P2
	// Click on instagram icon
	
	public void testInstagramNavigation() throws InterruptedException {
		VivaroThirdPartyIntegrationPage integration = new VivaroThirdPartyIntegrationPage(driver);
		integration.clickToInstagramIcon();
	}
	
}


