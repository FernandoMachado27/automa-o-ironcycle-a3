package core.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWebActions {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public CustomWebActions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	// --------------Actions------------
	
	public void click(WebElement element) {
		waitForElementToBeClickable(element);
	}
	
	public void clear(WebElement element) {
		waitForElementToBeClear(element);
	}
	
	public void sendKeys(WebElement element, String text) {
		waitForElementToBeClickableAndSendKeys(element, text);
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public WebElement waitVisibilityOf(WebElement element) {
		return waitVisibilityOfElement(element);
	}
	
	public String getText(WebElement element) {
		return waitVisibilityOfElement(element).getText();
	}
	
	public void sleep(int seconds) {
		try {
			Thread.sleep(1_000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// ----------------Wait--------------

	public WebElement waitVisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void waitForElementToBeClickableAndSendKeys(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);;
	}
	
	public void waitForElementToBeClear(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).clear();
	}
}
