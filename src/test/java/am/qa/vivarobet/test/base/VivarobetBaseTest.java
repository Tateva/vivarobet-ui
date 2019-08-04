package am.qa.vivarobet.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import am.qa.vivarobet.page.home.VivaroHomePage;
import am.qa.vivarobet.page.language.VivaroLanguageLocalizationPage;
import am.qa.vivarobet.page.login.VivaroLoginPage;


public class VivarobetBaseTest {
	protected WebDriver driver;
	
		
	@BeforeMethod
	@Parameters({"driverType", "driverPath"})
	public void createDriver(String driverType, String driverPath) throws InterruptedException {
		System.setProperty(driverType, driverPath);
		driver = new ChromeDriver();
		driver.get("https://www.vivarobet.am/#/");
		globalOkButtonSelect();
	}
	
	
    @AfterMethod
    public void teardown() {
	driver.quit();			
    }
	
    
	public void globalOkButtonSelect() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		Thread.sleep(3000);
		home.clickToGlobalOkButton();
		Thread.sleep(3000);
	}
	
	
	public void prepareEnglishPage() throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLanguageLocalizationPage language = new VivaroLanguageLocalizationPage(driver);
		language.selectEnglishLanguage();
		Thread.sleep(3000);
		home.clickToGlobalOkButton();
		Thread.sleep(5000);
	}
	
	
	
	public void login(String username, String password) throws InterruptedException {
		VivaroHomePage home = new VivaroHomePage(driver);
		VivaroLoginPage loginPage = home.openLoginDialog();
		loginPage.login(username, password);
		loginPage.clickToSignButton();
		
	}

}
