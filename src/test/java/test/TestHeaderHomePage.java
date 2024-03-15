package test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HeaderPage;
import static io.qameta.allure.Allure.step;

@Tag("header_simple")
public class TestHeaderHomePage extends TestBase {
    HeaderPage headerPage = new HeaderPage();

    @Test
    @DisplayName("Переход на страницу Vk Честный знак")
    void goToVkPageTest() {
        step("Открываем главную страницу", () -> {
            headerPage.openPage();
        });
        step("Переходим на страницу Vk", () -> {
            headerPage.vkSubmit();;
        });
        step("Проверяем url открывшейся странице", () -> {
            headerPage.checkResultFirstVk("https://vk.com/chestnyznak");
        });
        step("Проверяем надпись на открывшейся странице", () -> {
            headerPage.checkResultSecondVk("Честный ЗНАК");
        });
    }

    @Test
    @DisplayName("Переход на страницу Ok Честный знак")
    void goToOkPageTest() {
        step("Открываем главную страницу", () -> {
            headerPage.openPage();
        });
        step("Переходим на страницу Ok", () -> {
            headerPage.okSubmit();
        });
        step("Проверяем url открывшейся странице", () -> {
            headerPage.checkResultFirstOk("https://ok.ru/group/54181569298614");
        });
        step("Проверяем надпись на открывшейся странице", () -> {
            headerPage.checkResultSecondOk("Честный ЗНАК");
        });

    }

    @Test
    @DisplayName("Поиск информации на главной странице")
    void siteSearchTest() {
        step("Открываем главную страницу", () -> {
            headerPage.openPage();
        });
        step("Переходим на страницу поиска", () -> {
            headerPage.searchButton();
        });
        step("Вводим запрос в поисковое поле", () -> {
            headerPage.search("МДЛП");
        });
        step("Проверяем соответствие найденной записи", () -> {
            headerPage.checkResultSearch("https://честныйзнак.рф/business/projects/medicines/became_partner/");
        });
    }

    @Test
    @DisplayName("Переход в личный кабинет с главной странице")
    void openingMainPageHonestSignTest() {
        step("Открываем главную страницу", () -> {
            headerPage.openPage();
        });
        step("Переходим на страницу личного кабинета", () -> {
            headerPage.loginButton();
        });
        step("Проверяем наличие надписи на открывшейся странице", () -> {
            headerPage.checkResultMainPage("Личный кабинет");
        });
    }

    @Test
    @DisplayName("Переход в Честное сообщество")
    void openingHonestCommunityPageTest() {
        step("Открываем главную страницу", () -> {
            headerPage.openPage();
        });
        step("Переходим на страницу Честного сообщества", () -> {
            headerPage.communityButton();
        });
        step("Проверяем url открывшейся странице", () -> {
            headerPage.checkResultHonestCommunity("https://markirovka.ru/community/");
        });
    }

}
