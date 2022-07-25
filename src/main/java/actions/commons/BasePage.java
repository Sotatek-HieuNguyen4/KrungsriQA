package actions.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BasePage {

    public By getByXpath(String locator) {
        return By.xpath(locator);
    }

    public String getDynamicLocator(String locator, String... params) {
        return String.format(locator, (Object[]) params);
    }

    public WebElement getElement(WebDriver driver, String locator) {
        return driver.findElement(getByXpath(locator));
    }

    public void clickToElement(WebDriver driver, String locator) {
        getElement(driver, locator).click();
    }

    public void clickToElement(WebDriver driver, String locator, String... params) {
        getElement(driver, getDynamicLocator(locator, params)).click();
    }

    public void clickToElementByJS(WebDriver driver, String locator, String... params) {
        jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", getElement(driver, getDynamicLocator(locator, params)));
    }

    public void waitForElementVisible(WebDriver driver, String locator) {
        explicitWait = new WebDriverWait(driver, timeout);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(locator)));
    }

    public void waitForElementVisible(WebDriver driver, String locator, String...params) {
        locator = getDynamicLocator(locator, params);
        explicitWait = new WebDriverWait(driver, timeout);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(locator)));
    }

    public void waitForElementClickable(WebDriver driver, String locator) {
        explicitWait = new WebDriverWait(driver, timeout);
        explicitWait.until(ExpectedConditions.elementToBeClickable(getByXpath(locator)));
    }

    public void waitForElementClickable(WebDriver driver, String locator, String...params) {
        locator = getDynamicLocator(locator, params);
        explicitWait = new WebDriverWait(driver, timeout);
        explicitWait.until(ExpectedConditions.elementToBeClickable(getByXpath(locator)));
    }

    public String getElementText(WebDriver driver, String locator) {
        return getElement(driver, locator).getText();
    }

    public boolean isElementDisplay(WebDriver driver, String locator) {
        return getElement(driver, locator).isDisplayed();
    }

    public void waitForAllPageLoaded( WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public void sleepInSecond(long timeInSecond) {
        try {
            Thread.sleep(timeInSecond * 1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    private long timeout = 30;
    private WebDriverWait explicitWait;
    private JavascriptExecutor jsExecutor;
    WebDriver driver;
}
