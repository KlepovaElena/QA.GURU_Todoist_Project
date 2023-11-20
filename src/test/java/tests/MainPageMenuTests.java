package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Owner("Klepova Elena")
@Feature("Main page")
@Tags({@Tag("ui"), @Tag("mainpage")})

public class MainPageMenuTests extends TestBase {
    MainPage mainPage = new MainPage();

    @DisplayName("Testing of side menu filters pages")
    @Story("Menu")
    @Severity(SeverityLevel.CRITICAL)
    @CsvSource(value = {
            "Входящие,     Входящие",
            "Сегодня,     Сегодня",
            "Предстоящее, Просрочено",
            "Фильтры и метки, Фильтры и метки"
    })
    @ParameterizedTest(name = "When clicking menu filter {0} page {1} is opened")
    void checkMenuFiltersPagesTest(String menuFilter, String filterPage) {
        step("Select filter from menu", () -> {
            mainPage.selectMenuFilter(menuFilter);
        });
        step("Filter page is opened", () -> {
            mainPage.checkFilterPageIsOpened(filterPage);
        });
    }

    @Test
    @DisplayName("Testing of hiding side menu")
    @Story("Menu")
    @Severity(SeverityLevel.CRITICAL)
    void checkMenuCanBeHiddenTest () {
        step("Click menu button to hide menu", () -> {
            mainPage.clickMenuButton();
        });
        step("Check that menu is hidden", () -> {
            mainPage.checkMenuIsHidden();
        });
        }

    @Test
    @DisplayName("Testing of searching")
    @Story("Search")
    @Severity(SeverityLevel.CRITICAL)
    void searchProjectTest () {
        step("Click search", () -> {
            mainPage.clickSearch();
        });
        step("Enter search query", () -> {
            mainPage.setValueToSearchField();
        });
        step("Check search project result", () -> {
            mainPage.checkSearchProjectResult();
        });
    }

    @Test
    @DisplayName("Testing of event log page")
    @Story("Settings")
    @Severity(SeverityLevel.NORMAL)
    void eventLogModalWindowTest () {
        step("Click settings button", () -> {
            mainPage.clickSettingsButton();
        });
        step("Select event log", () -> {
            mainPage.clickEventLogButton();
        });
        step("Check event log page is opened", () -> {
            mainPage.checkEventLogPageIsOpened();
        });
    }
    }