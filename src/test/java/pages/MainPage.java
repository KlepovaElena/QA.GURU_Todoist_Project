package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement
            projectColourInput = $(".color_dropdown_toggle"),
            addProjectButton = $("[aria-label=\"Добавить проект\"]"),
            projectNameInput = $("#edit_project_modal_field_name"),
            submitButton = $("[type=\"submit\"]"),
            topMenu = $("#top-menu"),
            projectslist = $("#left-menu-projects-panel"),
            leftMenuPanel = $("[aria-label=\"Основная навигация: проекты, метки, фильтры\"]"),
            addTaskButton = $("[aria-label=\"Добавить задачу\"]"),
            taskNameField = $("[aria-label=\"Название задачи\"]"),
            taskDescriptionField = $("[aria-label=\"Описание\"]"),
            taskDueDateButton = $("[aria-label=\"Установка срока выполнения\"]"),
            taskSectionList = $(".section_list"),
            leftMenuButton = $("[aria-label=\"Открыть/закрыть боковую панель\"]"),
            search = $("[aria-label=\"Поиск\"]"),
            searchField = $("[aria-label=\"Введите запрос или команду…\"]"),
            searchResult = $("[aria-label=\"Результаты поиска\"]"),
            settingsButton = $("[aria-label=\"Настройки\"]"),
            content = $("[aria-label=\"Основное содержание\"]"),
            shareProjectButton = $("[aria-label=\"Общий доступ\"]"),
            dialogWindow = $("[role=\"dialog\"]"),
            inviteFromProjectButton = $("#invitefromproject"),
            projectMenuList = $("[aria-label=\"Меню опций проекта\"]"),
            taskCardMenu = $("[aria-label=\"Другие действия\"]"),
            deleteTaskButton = $("[aria-label=\"Удалить задачу…\"]"),
            lavenderColour = $("#dropdown-select-5-option-30"),
            pageContent = $(".simple_content"),
            calendarTomorrowDate = $("[data-track=\"scheduler|date_shortcut_tomorrow\"]"),
            taskEditorSubmitButton = $("[data-testid=\"task-editor-submit-button\"]");


    public MainPage clickAddProjectButton() {
        addProjectButton.click();

        return this;
    }

    public MainPage setProjectName(String value) {
        projectNameInput.setValue(value);

        return this;
    }

    public MainPage setProjectColour(String value) {
        projectColourInput.click();
        $(byText(value)).click();

        return this;
    }

    public MainPage submit() {
        submitButton.click();

        return this;
    }

    public MainPage selectProject(String value) {
        leftMenuPanel.$(byText(value)).click();

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
        pageContent.shouldHave(text(value));

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
        calendarTomorrowDate.click();

        return this;
    }

    public MainPage openIncomingTasks() {
        topMenu.$(byText("Входящие")).click();

        return this;
    }

    public MainPage checkTaskExists(String value) {
        taskSectionList.shouldHave(text(value));

        return this;
    }

    public MainPage submitTaskCreation() {
        taskEditorSubmitButton.click();

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

    public MainPage setValueToSearchField(String value) {
        searchField.setValue(value);

        return this;
    }

    public MainPage checkSearchProjectResult(String value) {
        searchResult.shouldHave(text(value));

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

    public MainPage deleteProject(String value) {
        leftMenuPanel.$(byText(value)).click();
        projectMenuList.click();
        $(byText("Удалить")).click();
        submitButton.click();

        return this;
    }

    public MainPage deleteTask(String value) {
        leftMenuPanel.$(byText("Входящие")).click();
        taskSectionList.$(byText(value)).click();
        taskCardMenu.click();
        deleteTaskButton.click();
        submitButton.click();

        return this;
    }
}