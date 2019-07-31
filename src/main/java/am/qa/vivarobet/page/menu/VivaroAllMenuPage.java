package am.qa.vivarobet.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.util.DriverUtil;

public class VivaroAllMenuPage extends VivaroHomePage {

	public VivaroAllMenuPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='#/sport/?type=1']")
	WebElement liveLink;
	
	@FindBy(xpath="//a[@href='#/sport/?type=0']")
	WebElement sportLink;
	
	@FindBy(xpath="//a[@href='#/poker/']")
	WebElement pokerLink;
	
	@FindBy(xpath="//a[@href='#/virtualsports/']")
	WebElement virtualSportLink;
	
	@FindBy(xpath="//a[@href='#/game/VGS10/provider/VGS/exid/10']")
	WebElement beloteLink;
	
	@FindBy(xpath="//a[@href='#/casino/']")
	WebElement casinoLink;
	
	@FindBy(xpath="//a[@href='#/livedealer/']")
	WebElement liveCasinoLink;
	
	@FindBy(xpath="//a[@href='#/game/VGS12121/provider/VGS/exid/324']")
	WebElement kenoLink;
	
	@FindBy(xpath="//a[@href='#/game/VGS5000000/provider/VGS/exid/5000000']")
	WebElement blastLink;
	
	@FindBy(xpath="//div[@class='top-menu-more']")
	WebElement menuMoreLink;
	
	@FindBy(xpath="//label[@class='menu-visible-icon-b']")
	WebElement menuIcon;
	
	
	
	
	@FindBy(xpath="//div[@class='closed-popup-form']")
	WebElement loginCloseIcon;
	
	public void closePopups() {
		PageFactory.initElements(driver,  this);
		loginCloseIcon.click();
	}
	


	final String talismanCloseIconXPath ="//a[@href='#/game/VGS125157/provider/VGS/exid/125157']";
	@FindBy(xpath=talismanCloseIconXPath)
	WebElement talismanCloseIcon;
	
	public void talismanClosePopups() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, talismanCloseIconXPath);
			talismanCloseIcon.click();
		} catch (Exception e) {
		}
		
		
	}
	
	
	
	
	
	
	@FindBy(xpath="//img[contains(@ng-src,'images/VBET/vivaro-eng-logo')]")
	WebElement vivaroEngLogo;
	
	public boolean vivaroEngLogoDisplayed() {
		return vivaroEngLogo.isDisplayed();
	}
	
	
	@FindBy(xpath="//img[contains(@ng-src,'images/VBET/vivaro-arm-logo')]")
	WebElement vivaroArmLogo;
	
	public boolean vivaroArmLogoDisplayed() {
		return vivaroArmLogo.isDisplayed();
	}
	
	
	@FindBy(xpath="//img[contains(@src,'images/VBET/vivaro-logo-2.png')]")
	WebElement vivaroLogo;
	
	public boolean vivarpLogoDisplayed() {
		return vivaroLogo.isDisplayed();
	}
	
	
	@FindBy(xpath="//div[@class='select-game-v3']")
	WebElement selectVirtualGames;
	
	public boolean selectVirtualGamesDisplayed() {
		return selectVirtualGames.isDisplayed();
	}
	
	
	@FindBy(xpath="//i[@class='dashboard-icon-b']")
	WebElement DashboardIcon;
	
	public boolean DashboardIconDisplayed() {
		return DashboardIcon.isDisplayed();
	}
	
	
	@FindBy(xpath="//h1[@class='Poker-icon']")
	WebElement pokerLogo;
	
	public boolean pokerLogoDisplayed() {
		return pokerLogo.isDisplayed();
	}
	
	
	@FindBy(xpath="//img[@class='v-go-qr']")
	WebElement vivaroGoIcon;
	
	public boolean vivaroGoIconDisplayed() {
		return vivaroGoIcon.isDisplayed();
	}
	
	@FindBy(xpath = "//div[@class='live-casino-icon vgs110']")
	WebElement liveCasinoIcon;
	
	public boolean liveCasinoIconDisplayed() {
		return liveCasinoIcon.isDisplayed();
	}

	
	
	
	
	final String betFightsLinkXPath ="//a[@href='#/game/VGS125157/provider/VGS/exid/125157']";
	@FindBy(xpath=betFightsLinkXPath)
	WebElement betFightsLink;
	
	public void navigateToBetFights() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, betFightsLinkXPath);
			betFightsLink.click();
		} catch (Exception e) {
		}
		
	}

	
	final String farkleLinkXPath ="//a[@href='#/game/VGSfarkle/provider/VGS/exid/3537']";
	@FindBy(xpath=farkleLinkXPath)
	WebElement farkleLink;
	
	public void navigateToFarkle() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, farkleLinkXPath);
			farkleLink.click();
		} catch (Exception e) {
		}
		
	}
		
	
	
	final String gamesLinkXPath ="//a[@href='#/games/']";
	@FindBy(xpath=gamesLinkXPath)
	WebElement gamesLink;
	
	public void navigateToGames() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 7, farkleLinkXPath);
			gamesLink.click();
		} catch (Exception e) {
		}	
	}
	
	
	
	final String tournamentsLinkXPath ="//a[@href='#/tournaments/']";
	@FindBy(xpath=tournamentsLinkXPath)
	WebElement tournamentsLink;
	
	public void navigateToTournaments() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, farkleLinkXPath);
			tournamentsLink.click();
		} catch (Exception e) {
		}
		
	}
	
	
	
	final String fantasySportsLinkXPath ="//a[@href='#/fantasy/']";
	@FindBy(xpath=fantasySportsLinkXPath)
	WebElement fantasySportsLink;
	
	public void navigateToFantasySports() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, fantasySportsLinkXPath);
			fantasySportsLink.click();
		} catch (Exception e) {
		}
		
	}
	
	
	
	@FindBy(xpath="//span[contains(@class,'close-icon thirdText')]")
	WebElement fantasySportsCloseIcon;
	
	public void clickToFantasySportsCloseIcon() {
		PageFactory.initElements(driver, this);
		fantasySportsCloseIcon.click();
	}
	
	
	
	final String betOnPoliticsLinkXPath ="//a[@href='#/betonpolitics/']";
	@FindBy(xpath=betOnPoliticsLinkXPath)
	WebElement betOnPoliticsLink;
	
	public void navigateTobetOnPolitics() throws InterruptedException {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, betOnPoliticsLinkXPath);
			betOnPoliticsLink.click();
		} catch (Exception e) {
		}

	}
	
	

	final String poolBettingLinkXPath ="//a[@href='#/csbpoolbetting']";
	@FindBy(xpath=poolBettingLinkXPath)
	WebElement poolBettingLink;
	
	public void navigateToPoolBetting() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, poolBettingLinkXPath);
			poolBettingLink.click();
		} catch (Exception e) {
		}
		
	}
	
	
	
	final String vivarogoLinkXPath ="//a[@href='#/go']";
	@FindBy(xpath=vivarogoLinkXPath)
	WebElement vivarogoLink;
	
	public void navigateToVivarogo() {
		menuMoreLink.click();
		try {
			DriverUtil.waitForElementPresent(driver, 5, vivarogoLinkXPath);
			vivarogoLink.click();
		} catch (Exception e) {
		}
		
	}
	
	
	
	final String talismanLinkXPath ="//a[@href='#/game/VGS1181/provider/VGS/exid/1181']";
	@FindBy(xpath=talismanLinkXPath)
	WebElement talismanLink;
		
	
	public void navigaeToTalisman() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, talismanLinkXPath);
			talismanLink.click();
		} catch (Exception e) {
		}
		
	}
	
	
	
	public VivaroLivePage navigateToLive( ) {
		liveLink.click();
		return new VivaroLivePage(driver);
	}
	
	
	public VivaroSportPage navigateToSport() {
		sportLink.click();
		return new VivaroSportPage(driver);
	}
	
	
	public VivaroPokerPage navigateToPoker() {
		pokerLink.click();
		return new VivaroPokerPage(driver);
	}
		
	
	public VivaroVirtualSportPage navigateToVirtualSport() {
		virtualSportLink.click();
		return new VivaroVirtualSportPage(driver);
	}
	

	public VivaroBelotePage navigateToBelote() {
		beloteLink.click();
		return new VivaroBelotePage(driver);
	}
	
	
	public VivaroCasinoPage navigateToCasino() {
		casinoLink.click();
		return new VivaroCasinoPage(driver);
	}
	
	
	public VivaroLiveCasinoPage navigateToLiveCasino() {
		liveCasinoLink.click();
		return new VivaroLiveCasinoPage(driver);
	}
	
	public VivaroKenoPage navigateToKeno() {
		kenoLink.click();
		return new VivaroKenoPage(driver);
	}
	
	
	public VivaroBlastPage navigateToBlast() {
		blastLink.click();
		return new VivaroBlastPage(driver);
	}
		
		
	
}
