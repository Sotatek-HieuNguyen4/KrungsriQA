package actions.pageObjects;

import actions.commons.BasePage;
import interfaces.LandingPageUIs;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

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
        switchToIframeByElement(driver,LandingPageUIs.FRAME_FILTER);
        waitForElementVisible(driver,LandingPageUIs.CAR_TYPE,option);
        clickToElement(driver,LandingPageUIs.CAR_TYPE,option);
//        clickToElementByJS(driver,LandingPageUIs.CAR_TYPE,option);

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

    public void selectCarRegistrationProvince(WebDriver driver,String option) throws InterruptedException {
        Thread.sleep(3000);
        clickToElementByJS(driver,LandingPageUIs.CAR_REGIS_PROVINCE);
        clickToElementByJS(driver,LandingPageUIs.PROVINCE);
//        sendkeyToElementByJS(driver,LandingPageUIs.CAR_REGIS_PROVINCE,option);
        Thread.sleep(3000);
    }

    public void customizeIssurancePlans(WebDriver driver,String option) {
        clickToElementByJS(driver,LandingPageUIs.CAR_INSURANCE_TYPE,option);
    }

    public void clickFilter(WebDriver driver) {
    }

    public void verifySearchResultDisplays(WebDriver driver) {
    }
}
