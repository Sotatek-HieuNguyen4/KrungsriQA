package test;

import actions.commons.BaseTest;
import actions.pageObjects.LandingPageObjects;
import actions.pageObjects.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class FindCarTestCases extends BaseTest {
    WebDriver driver;
    LandingPageObjects landingPage;

    @Parameters({"browser", "url"})
    @BeforeTest
    public void beforeTest(String browserName, String appUrl) {
        driver = getBrowserDriver(browserName, appUrl);
        landingPage = PageGeneratorManager.getLandingPage(driver);
        landingPage.clickToAgreeButton(driver);
    }

    @Test(dataProvider="Filter Data Which Use For Testing")
    public void Test_Filter_Car(String carType, String carBrand, String carModel, String carSubModel, String carRegisYear, String carRegisProvince, String carInsurance ) {

        log.info("Step 1: Open Filter by clicking on CarType option");
        landingPage.clickToCarTypeFilter(driver);

        log.info("Step 2: Select carType");
        landingPage.selectCarType(driver,carType);

        log.info("Step 3: Select carBrand");
        landingPage.selectCarBrand(driver,carBrand);

        log.info("Step 4: Select carModel");
        landingPage.selectCarModel(driver,carModel);

        log.info("Step 5: Select carSubModel");
        landingPage.selectCarSubModel(driver,carSubModel);

        log.info("Step 6: Select Car registration Year");
        landingPage.selectCarRegistrationYear(driver,carRegisYear);

        log.info("Step 7: Select Car Registration Province");
        landingPage.selectCarRegistrationProvince(driver,carRegisProvince);

        log.info("Step 8: Customize Insurance Plans");
        landingPage.customizeInsurancePlans(driver,carInsurance);

        log.info("Step 9: Click filter button");
        landingPage.clickFilter(driver);

        log.info("Step 10: Go back to LandingPage");
        landingPage.goToLandingPage(driver);

    }

    @DataProvider(name = "Filter Data Which Use For Testing")
    public Object[][] Car_Options_Which_Used_For_Testing() {
        final Object[][] objects = {
                {"รถเก๋ง", "TOYOTA", "CAMRY", "CAMRY 2.0", "2565 (2022)","กาญจนบุรี","ชั้น 1"},
                {"รถกระบะ 2 ประตู", "HONDA", "TOURMASTER", "TOURMASTER 2.5", "2564 (2021)","กาญจนบุรี","ชั้น 2"},
        };
        return objects;
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
