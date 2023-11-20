package tests;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Owner("Klepova Elena")
@Feature("Projects management")
@Tags({@Tag("ui"), @Tag("project")})

public class ProjectTests extends TestBase {

    MainPage mainPage = new MainPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Testing of successful project creation")
    @Story("Projects management")
    @Severity(SeverityLevel.CRITICAL)
    void successfulCreateProjectTest() {
        step("Click add project button", () -> {
            mainPage.clickAddProjectButton();
        });
        step("Enter project name", () -> {
            mainPage.setProjectName(testData.projectName);
        });
        step("Select project colour", () -> {
            mainPage.setProjectColour();
        });
        step("Submit project form", () -> {
            mainPage.submit();
        });
        step("Check that created project exists", () -> {
            mainPage.checkProjectExists(testData.projectName);
        });
    }

    @Test
    @DisplayName("Testing of project sharing to project members message")
    @Story("Projects management")
    @Severity(SeverityLevel.NORMAL)
    void shareProjectTest() {
        step("Select project", () -> {
            mainPage.selectProject();
        });
        step("Click share project button", () -> {
            mainPage.clickShareProjectButton();
        });
        step("Click invite from project button", () -> {
            mainPage.clickInviteFromProjectButton();
        });
        step("Check invite from project message", () -> {
            mainPage.checkMessage();
        });
    }
}