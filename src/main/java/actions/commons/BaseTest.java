package actions.commons;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

    protected final Log log;
    private WebDriver driver;

    protected BaseTest() {
        log = LogFactory.getLog(getClass());
    }

    private enum BROWSER {
        CHROME, FIREFOX, EDGE_CHOROMIUM, SAFARI;
    }

    public WebDriver getBrowserDriver(String browserName, String appUrl) {

        BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());

        if (browser == BROWSER.FIREFOX) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser == BROWSER.CHROME) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser == BROWSER.EDGE_CHOROMIUM) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please enter correct browser name!");
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appUrl);

        return driver;
    }
}
