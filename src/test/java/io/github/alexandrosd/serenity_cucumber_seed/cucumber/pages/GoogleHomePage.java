package io.github.alexandrosd.serenity_cucumber_seed.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {

    @FindBy(css="input[name='q']")
    WebElementFacade searchBox;

    public void searchFor(String keyword) {
        searchBox.typeAndEnter(keyword);
    }

}