package am.qa.vivarobet.test.menu;

import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import am.qa.vivarobet.page.menu.VivaroAllMenuPage;
import am.qa.vivarobet.page.menu.VivaroBetfightsPage;
import am.qa.vivarobet.page.menu.VivaroBlastPage;
import am.qa.vivarobet.page.menu.VivaroLiveCasinoPage;
import am.qa.vivarobet.page.menu.VivaroPokerPage;
import am.qa.vivarobet.page.menu.VivaroPoolsBettingPage;
import am.qa.vivarobet.page.menu.VivaroTalismanPage;
import am.qa.vivarobet.test.base.VivarobetBaseTest;
//import am.qa.vivarobet.util.ReadFromFileUtil;

public class VivarobetMenuNavigationTest extends VivarobetBaseTest {
	
//
//	@BeforeMethod
//	public void prepareEnv() throws Exception {
////login(ReadFromFileUtil.readPropertyByName("user"),
  //ReadFromFileUtil.readPropertyByName("password"));
//	}
	
	
	@Test
	// Test_Id1
	// P0
	// Step_1.1: Click on "Virtual sports" from top menu header list
	// Step_1.2: Press sign in button

	public void testVirtualSportNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToVirtualSport();
		globalOkButtonSelect();
		Assert.assertTrue(menu.selectVirtualGamesDisplayed());
	}

	
	@Test
	// Test_Id7
	// P0
	// Step_7.1: Click on "Live" category from top menu header list

	public void testLiveNavigation() throws InterruptedException {	
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToLive();
		Assert.assertTrue(menu.DashboardIconDisplayed());
	}

	
	@Test
	// Test_Id14
	// P0
	// Step_14.1: Click on "Sport" category from top menu header list

	public void testSportNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToSport();
		Assert.assertTrue(menu.DashboardIconDisplayed());
	}

	
	@Test
	// Test_Id15
	// P0
	// Step_14.1: Click on "Sport" category from top menu header list

	public void testPokerNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToPoker();
		VivaroPokerPage poker = new VivaroPokerPage(driver);
		poker = new VivaroPokerPage(driver);
		globalOkButtonSelect();
		Thread.sleep(3000);
		Assert.assertTrue(poker.pokerLogoDisplayed());
		
	}

	
	@Test
	// Test_Id24
	// P0
	// Step_24.1: Click on "Belote" category from top menu header list

	public void testBeloteNavigation () throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToBelote();
		Assert.assertTrue(menu.vivarpLogoDisplayed());
	}

	
	@Test
	// Test_Id25
	// P0
	// Step_25.1: Click on "Casino" category from top menu header list

	public void testCasinoNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToCasino();
		globalOkButtonSelect();
		Thread.sleep(3000);
		Assert.assertTrue(menu.vivaroArmLogoDisplayed());
	}

	
	@Test
	// Test_Id27
	// P0
	// Step_27.1: Click on "Keno" category from top menu header list

	public void testKenoNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToKeno();
		Thread.sleep(3000);
		Assert.assertTrue(menu.vivarpLogoDisplayed());
	}

	
	@Test
	// Test_Id28
	// P0
	// Step_28.1: Click on "More games" dropdown from top menu header list
	// Step_28.2: Click on "BetFights" category from"More Games" dropdown

	public void testBetfightsNavigation() throws InterruptedException {	
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToBetFights();
		VivaroBetfightsPage betfights = new VivaroBetfightsPage(driver);
		betfights.closePopups();
		Assert.assertTrue(menu.vivarpLogoDisplayed());
	}

	
	@Test
	// Test_Id30
	// P0
	// Step_30.1: Click on "More games" dropdown from top menu header list
	// Step_30.2: Click on "Farkle" category from "More Games" dropdown

	public void testFarkleNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToFarkle();
		Thread.sleep(3000);
		Assert.assertTrue(menu.vivarpLogoDisplayed());
	}

	
	@Test
	// Test_Id32
	// P0
	// Step_32.1: Click on "More games" dropdown from top menu header list
	// Step_32.2: Click on "Games" category

	public void testGamesNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		prepareEnglishPage();
		menu.navigateToGames();
		Thread.sleep(3000);
	    globalOkButtonSelect();
		Assert.assertTrue(menu.vivaroArmLogoDisplayed());
		
	}
	
	
	@Test
	// Test_Id46
	// P0
	// Step_46.1: Click on "More games" dropdown from top menu header list
	// STep_46.2: Click on "Tournaments" category from top menu header list

	public void testTournamentsNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToTournaments();
		Thread.sleep(2000);
		Assert.assertTrue(menu.vivaroArmLogoDisplayed());
	}

	
	@Test
	// Test_Id47
	// P0
	// Step_47.1: Click on "More games" dropdown from top menu header list
	// Step_47.2: Click on "Fantasy sports" category from top menu header list

	public void testFantasySportsNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToFantasySports();
		Thread.sleep(5000);
		Assert.assertTrue(menu.vivarpLogoDisplayed());

	}

	
	@Test
	// Test_Id49
	// P0
	// Step_49.1: Click on "More games" dropdown from top menu header list
	// Step_49.2: Click on "Bet on politics" category

	public void testBetOnPoliticsNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateTobetOnPolitics();
		Assert.assertTrue(menu.vivaroArmLogoDisplayed());
	}

	
	@Test
	// Test_Id50
	// P0
	// Step_50.1: Click on "More games" dropdown from top menu header list
	// Step_50.2: Click on "Pools betting" category

	public void testPoolsBettingNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToPoolBetting();
		VivaroPoolsBettingPage pools = new VivaroPoolsBettingPage(driver);
		pools = new VivaroPoolsBettingPage(driver);
		Assert.assertTrue(pools.vivarpLogoDisplayed());

	}

	
	@Test
	// Test_Id51
	// P0
	// Step_51.1: Click on "More games" dropdown from top menu header list
	// Step_51.2: Click on "Vivarogo" category

	public void testVivaroGoNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToVivarogo();
		Thread.sleep(3000);
		Assert.assertTrue(menu.vivaroGoIconDisplayed());
	}

	
	@Test
	// Test_Id52
	// P0
	// Step_52.1: Click on "Blast" category from top menu header list
	// Step_52.2: Type valid username and password, after press login button

	public void testBlastNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToBlast();
		VivaroBlastPage blast = new VivaroBlastPage(driver);
		Thread.sleep(5000);
		blast.closePopups();
		blast = new VivaroBlastPage(driver); 
		Assert.assertTrue(blast.vivarpLogoDisplayed());
	}

	
	@Test
	// Test_Id53
	// P0
	// Step_53.1: Click on "Talisman" category from top menu header list

	public void testTalismanNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);;
		prepareEnglishPage();
		Thread.sleep(3000);
		menu.navigaeToTalisman();
		Thread.sleep(5000);
		VivaroTalismanPage talisman = new VivaroTalismanPage(driver);
		talisman = new VivaroTalismanPage(driver);
		Thread.sleep(5000);
		Assert.assertTrue(talisman.vivarpLogoDisplayed());
	}
	
	
	@Test
	// Test_Id54
	// P0
	// Step_54.1: Click on "Live casino" category from top menu header list

	public void testLiveCasinoNavigation() throws InterruptedException {
		VivaroAllMenuPage menu = new VivaroAllMenuPage(driver);
		menu.navigateToLiveCasino();
		//Thread.sleep(5000);
		VivaroLiveCasinoPage liveCasino = new VivaroLiveCasinoPage(driver);
		liveCasino = new VivaroLiveCasinoPage(driver);
		Assert.assertTrue(liveCasino.liveCasinoIconDisplayed());
	}
		
	
}
