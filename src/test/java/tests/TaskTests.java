package tests;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Owner("Klepova Elena")
@Feature("Tasks management")
@Tags({@Tag("ui"), @Tag("task")})

public class TaskTests extends TestBase {

    MainPage mainPage = new MainPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Testing of successful task creation")
    @Story("Tasks management")
    @Severity(SeverityLevel.CRITICAL)
    void successfulCreateTaskTest() {
        step("Click add task button", () -> {
            mainPage.clickAddTaskButton();
        });
        step("Enter task name", () -> {
            mainPage.setTaskName(testData.taskName);
        });
        step("Enter task description", () -> {
            mainPage.setTaskDescription(testData.taskDescription);
        });
        step("Click task due date button", () -> {
            mainPage.clickTaskDueDateButton();
        });
        step("Select task due date tomorrow", () -> {
            mainPage.selectDueDateTomorrow();
        });
        step("Submit task creation form", () -> {
            mainPage.submitTaskCreation();
        });
        step("Open incoming tasks", () -> {
            mainPage.openIncomingTasks();
        });
        step("Check that created task exists", () -> {
            mainPage.checkTaskExists(testData.taskName);
        });
    }
}