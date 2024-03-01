package testcases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.SuiteConfiguration;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;


public class UiTestInit extends BaseTest{
    private SuiteConfiguration conf;

    @BeforeSuite
    public void setParam() throws IOException {
        this.conf = new SuiteConfiguration();
    }

    @Step("Preparing a browser for the test")
    @BeforeMethod
    public void setup() {
        Configuration.baseUrl = BASE_URL_UI;
        System.setProperty("selenide.reportsFolder", "./target");
        Configuration.reportsFolder = "./target";
        Configuration.downloadsFolder = "./target";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        Configuration.browser = conf.getBrowserProperty();
        Configuration.holdBrowserOpen=true;

        open("/");

        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

        @AfterMethod
    public void closeBrowser() {
        WebDriverRunner.getWebDriver().close();
        softAssert.assertAll();
    }
}
