package actions.pageObjects;

import actions.commons.BasePage;
import interfaces.LandingPageUIs;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPageObjects extends BasePage {
    WebDriver driver;

    public LandingPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Dismiss pop-up")
    public void clickToAgreeButton(WebDriver driver) {
    waitForElementClickable(driver,LandingPageUIs.AGREE_BUTTON);
    clickToElement(driver,LandingPageUIs.AGREE_BUTTON);
    }

    @Step("Open filter by clicking on CarType Filter")
    public void clickToCarTypeFilter(WebDriver driver) {
        waitForElementClickable(driver,LandingPageUIs.CAR_TYPE_FILTER_BOX);
        clickToElement(driver,LandingPageUIs.CAR_TYPE_FILTER_BOX);
    }

    @Step("Select car type")
    public void selectCarType(WebDriver driver, String option) {
        waitForElementClickable(driver,LandingPageUIs.CAR_TYPE,option);
        clickToElement(driver,LandingPageUIs.CAR_TYPE,option);

    }

    @Step("Select car brand")
    public void selectCarBrand(WebDriver driver, String option) {
        clickToElementByJS(driver,LandingPageUIs.CAR_BRAND,option);
    }

    @Step("Select Car Model")
    public void selectCarModel(WebDriver driver, String option) {
        clickToElementByJS(driver,LandingPageUIs.CAR_MODEL,option);
    }

    @Step("Select Car SubModel")
    public void selectCarSubModel(WebDriver driver, String option) {
        clickToElementByJS(driver,LandingPageUIs.CAR_SUB_MODEL,option);
    }

    @Step("Select Car Registration Year")
    public void selectCarRegistrationYear(WebDriver driver,String option) {
        clickToElementByJS(driver,LandingPageUIs.CAR_REGIS_YEAR,option);
    }

    @Step("select Car Registration Province")
    public void selectCarRegistrationProvince(WebDriver driver,String province) {
        waitForElementClickable(driver,LandingPageUIs.CAR_REGIS_PROVINCE);
        clickToElement(driver,LandingPageUIs.CAR_REGIS_PROVINCE);
        waitForElementVisible(driver,LandingPageUIs.PROVINCE,province);
        clickToElement(driver,LandingPageUIs.PROVINCE,province);
    }
    @Step("customize Insurance Plans")
    public void customizeInsurancePlans(WebDriver driver, String option) {
        clickToElementByJS(driver,LandingPageUIs.CAR_INSURANCE_TYPE,option);
        clickToElement(driver,LandingPageUIs.CONTINUE_BTN);
    }
    @Step("Click filter")
    public void clickFilter(WebDriver driver) {
        waitForElementClickable(driver,LandingPageUIs.SUBMIT_FILTER_BTN);
        clickToElement(driver,LandingPageUIs.SUBMIT_FILTER_BTN);
    }

    @Step("Verify Search Result Displays")
    public void verifySearchResultDisplays(WebDriver driver) {
        waitForAllPageLoaded(driver);
        waitForElementVisible(driver,LandingPageUIs.FILTER_RESULT_TEXT);
        String SEARCH_RESULT_TEXT = getElementText(driver,LandingPageUIs.FILTER_RESULT_TEXT);
        Assert.assertEquals(SEARCH_RESULT_TEXT, "ประกันภัยรถยนต์ยอดนิยม");
        sleepInSecond(3000);
    }

    public void reloadPage(WebDriver driver) {
        refreshCurrenPage(driver);
        waitForAllPageLoaded(driver);
    }
}
