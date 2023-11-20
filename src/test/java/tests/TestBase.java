package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.ConfigReader;
import config.WebConfig;
import config.ProjectConfiguration;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    private static final WebConfig webConfig = ConfigReader.Instance.read();

    @BeforeAll
    public static void beforeAll(){
        ProjectConfiguration webConfigProject = new ProjectConfiguration(webConfig);
        webConfigProject.webConfig();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    void beforeEach() {
        open("/app/today");
        $("#element-0").setValue("elena.klyopova@gmail.com");
        $("#element-3").setValue("Elena1111!").pressEnter();
    }

    @AfterEach
    void addAttachments() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}