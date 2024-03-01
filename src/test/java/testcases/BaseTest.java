package testcases;

import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

@Listeners(listeners.TestListeners.class)
public class BaseTest {
    protected final String BASE_URL_API = "https://reqres.in";
    protected final String BASE_URL_UI = "https://ek.ua/ua/";
    protected final SoftAssert softAssert = new SoftAssert();

}