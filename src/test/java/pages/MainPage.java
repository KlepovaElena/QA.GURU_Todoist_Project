package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement
            projectColourInput = $(".color_dropdown_toggle"),
            addProjectButton = $("#left_menu").$("[aria-label=\"Добавить проект\"]"),
            projectNameInput = $("#edit_project_modal_field_name"),
            submitButton = $("[type=\"submit\"]"),
            leftMenu = $("#left_menu_inner"),
            projectslist = $("#left-menu-projects-panel"),
            leftMenuPanel = $("#left_menu"),
            addTaskButton = $("#quick_add_task_holder"),
            taskNameField = $("[aria-label=\"Название задачи\"]"),
            taskDescriptionField = $("[aria-label=\"Описание\"]"),
            taskDueDateButton = $("[aria-label=\"Установка срока выполнения\"]"),
            taskSectionList = $(".section_list"),
            leftMenuButton = $("[aria-label=\"Открыть/закрыть боковую панель\"]"),
            search = $("#quick_find"),
            searchField = $("[aria-label=\"Введите запрос или команду…\"]"),
            searchResult = $("[aria-label=\"Результаты поиска\"]"),
            settingsButton = $("[aria-label=\"Настройки\"]"),
            content = $("#content"),
            shareProjectButton = $("[aria-label=\"Общий доступ\"]"),
            dialogWindow = $("[role=\"dialog\"]"),
            inviteFromProjectButton = $("#invitefromproject");


    public MainPage clickAddProjectButton() {
        addProjectButton.click();

        return this;
    }

    public MainPage setProjectName(String value) {
        projectNameInput.setValue(value);

        return this;
    }

    public MainPage setProjectColour() {
        projectColourInput.click();
        $("[aria-label=\"lavender\"]").click();

        return this;
    }

    public MainPage submit() {
        submitButton.click();

        return this;
    }

    public MainPage selectProject() {
        leftMenuPanel.$(byText("Дом")).click();

        return this;
    }

    public MainPage checkProjectExists(String value) {
        projectslist.shouldHave(text(value));

        return this;
    }

    public MainPage selectMenuFilter(String value) {
        leftMenuPanel.$(byText(value)).click();

        return this;
    }

    public MainPage checkFilterPageIsOpened(String value) {
        $(".simple_content").shouldHave(text(value));

        return this;
    }

    public MainPage clickAddTaskButton() {
        addTaskButton.click();

        return this;
    }

    public MainPage setTaskName(String value) {
        taskNameField.setValue(value);

        return this;
    }

    public MainPage setTaskDescription(String value) {
        taskDescriptionField.setValue(value);

        return this;
    }

    public MainPage clickTaskDueDateButton() {
        taskDueDateButton.click();

        return this;
    }

    public MainPage selectDueDateTomorrow() {
        $("[data-track=\"scheduler|date_shortcut_tomorrow\"]").click();

        return this;
    }

    public MainPage openIncomingTasks() {
        leftMenu.$(byText("Входящие")).click();

        return this;
    }

    public MainPage checkTaskExists(String value) {
        taskSectionList.shouldHave(text(value));

        return this;
    }

    public MainPage submitTaskCreation() {
        $("[data-testid=\"task-editor-submit-button\"]").click();

        return this;
    }

    public MainPage clickMenuButton() {
        leftMenuButton.click();

        return this;
    }

    public MainPage checkMenuIsHidden() {
        leftMenuPanel.shouldNotBe(visible);

        return this;
    }

    public MainPage clickSearch() {
        search.click();

        return this;
    }

    public MainPage setValueToSearchField() {
        searchField.setValue("Дом");

        return this;
    }

    public MainPage checkSearchProjectResult() {
        searchResult.shouldHave(text("Дом"));

        return this;
    }

    public MainPage clickSettingsButton() {
        settingsButton.click();

        return this;
    }

    public MainPage clickEventLogButton() {
        $(byText("Журнал действий")).click();

        return this;
    }

    public MainPage checkEventLogPageIsOpened() {
        content.shouldHave(text("Действия"));

        return this;
    }

    public MainPage clickShareProjectButton() {
        shareProjectButton.click();

        return this;
    }

    public MainPage clickInviteFromProjectButton() {
        inviteFromProjectButton.click();

        return this;
    }

    public MainPage checkMessage() {
        dialogWindow.shouldHave(text("Чтобы пригласить остальных, сперва сделайте проект общим."));

        return this;
    }
}