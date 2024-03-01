package testcases.uiTest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import testcases.UiTestInit;
import ui.fragments.EkatalogHeader;
import ui.pages.EkatalogSearchResultPage;

public class SimleTest extends UiTestInit {

    EkatalogHeader ekatalogHeader = new EkatalogHeader();
    EkatalogSearchResultPage ekatalogSearchResultPage = new EkatalogSearchResultPage();

    String expectedresult = "iphone";

    @Test
    @Description("Simple test of search usability")
    public void searchTest(){
        ekatalogHeader.findProduct(expectedresult);
        String actualresult = ekatalogSearchResultPage.getSearchText();
        softAssert.assertEquals(expectedresult, actualresult,"Search failed");
    }
}
