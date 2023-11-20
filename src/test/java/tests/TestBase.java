package tests;

import com.codeborne.selenide.AuthenticationType;
import com.codeborne.selenide.BearerTokenCredentials;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.sun.security.jgss.AuthorizationDataEntry;
import config.ConfigReader;
import config.WebConfig;
import config.WebConfigProject;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.AuthenticationType.BASIC;
import static com.codeborne.selenide.AuthenticationType.BEARER;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    private static final WebConfig config = ConfigReader.Instance.read();

    @BeforeAll
    public static void beforeAll(){
        WebConfigProject webConfigProject = new WebConfigProject(config);
        webConfigProject.webConfig();
        Configuration.proxyEnabled = true;
        open("/app/today", BASIC, new BearerTokenCredentials("Authorization", "Bearer fcb77d42006db0c8fcfec8583fe4e200b06c74f5"));

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.proxyEnabled = true;
//        open(baseUrl);
//        open("https://todoist.com/app/today", BEARER, new BearerTokenCredentials("Token", "fcb77d42006db0c8fcfec8583fe4e200b06c74f5"));
//        open("https://todoist.com", BASIC, "", "");
//        $("#element-0").setValue("elena.klyopova@gmail.com");
//        $("#element-3").setValue("Elena1111!").pressEnter();
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