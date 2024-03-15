package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ResultComponent {
    public void checkResultFirstVk(String value){
        webdriver().shouldHave(url(value));
    }
    public void checkResultSecondVk(String value){
        $("h1[class='page_name']").shouldHave(text(value));
    }
    public void checkResultFirstOk(String value){
        webdriver().shouldHave(url(value));
    }
    public void checkResultSecondOk(String value){
        $("h1[class='group-name_h']").shouldHave(text(value));
    }
    public void checkResultSearch(String value){
        $("a[class='search-results__url']").shouldHave(text(value));
    }
    public void checkResultMainPage(String value){
        $(".MuiBox-root h3.MuiTypography-root.MuiTypography-h3").shouldHave(text(value));
    }
    public void checkResultHonestCommunity(String value){
        webdriver().shouldHave(url(value));
    }
}
