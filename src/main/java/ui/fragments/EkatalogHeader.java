package ui.fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class EkatalogHeader {
    private static final SelenideElement HEADER = $x("//div[@class='header']");

    private static final SelenideElement SEARCH_FIELD = $x("//input[@id='ek-search']");

    private static final SelenideElement SEARCH_BUTTON = $x("//button[@name='search_but_']");

    public void findProduct(String product) {
        HEADER.shouldBe(visible).click();
        SEARCH_FIELD.sendKeys(product);
        SEARCH_BUTTON.shouldBe(visible).click();
    }
}
