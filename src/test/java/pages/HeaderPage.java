package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.ResultComponent;
import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {
    private final SelenideElement vkButton =  $("a[title='vkontakte']"),
                                  okButton = $("a[title='classmate']"),
                                  searchButton = $("button[class='m-header__search js-open-search']"),
                                  inputSearch = $("input[class='m-search__input']"),
                                  loginButton = $("div[class='m-header__lk']"),
                                  communityButton = $("a[class='m-header__honest']");

    ResultComponent resultComponent = new ResultComponent();

    public HeaderPage openPage(){
        open("https://xn--80ajghhoc2aj1c8b.xn--p1ai/");
        return this;
    }
    public HeaderPage vkSubmit() {
        vkButton.click();
        return this;
    }
    public HeaderPage okSubmit() {
        okButton.click();
        return this;
    }
    public HeaderPage searchButton() {
        searchButton.click();
        return this;
    }
    public HeaderPage search(String value){
        inputSearch.setValue(value);
        inputSearch.pressEnter();
        return this;
    }
    public HeaderPage loginButton() {
        loginButton.click();
        return this;
    }
    public HeaderPage communityButton() {
        communityButton.click();
        return this;
    }
    public HeaderPage checkResultFirstVk(String value){
        resultComponent.checkResultFirstVk(value);
        return this;
    }
    public HeaderPage checkResultSecondVk(String value){
        resultComponent.checkResultSecondVk(value);
        return this;
    }
    public HeaderPage checkResultFirstOk(String value){
        resultComponent.checkResultFirstOk(value);
        return this;
    }
    public HeaderPage checkResultSecondOk(String value){
        resultComponent.checkResultSecondOk(value);
        return this;
    }
    public HeaderPage checkResultSearch(String value){
        resultComponent.checkResultSearch(value);
        return this;
    }
    public HeaderPage checkResultMainPage(String value){
        resultComponent.checkResultMainPage(value);
        return this;
    }
    public HeaderPage checkResultHonestCommunity(String value){
        resultComponent.checkResultHonestCommunity(value);
        return this;
    }
}
