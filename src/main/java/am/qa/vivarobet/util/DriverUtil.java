package am.qa.vivarobet.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {
	
	public static void waitForElementPresent(WebDriver driver, int waitSeconds, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		
		
	}
	

}
