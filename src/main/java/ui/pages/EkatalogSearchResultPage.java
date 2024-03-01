package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class EkatalogSearchResultPage {

    public static  final SelenideElement SEARCH_TITLE = $x("//b[@class='hst']");

    public String getSearchText(){
        return SEARCH_TITLE.shouldBe(visible).getText();
    }
}
