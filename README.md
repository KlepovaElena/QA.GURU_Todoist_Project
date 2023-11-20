
<h1 >Проект по автоматизации тестирования сайта <a href="https://todoist.com"> Todoist</a></h1>

<p align="center">  
<a href="https://todoist.com"><img src="media/logo/Todoist.png" alt="MainLogo" width="400"/></a>  
</p>

# 🧾 Содержание:

- <a href="#tools"> Технологии и инструменты</a>
- <a href="#cases"> Список проверок, реализованных в автоматизированных тест-кейсах</a>
- <a href="#jenkins"> Запуск тестов (Сборка в Jenkins)</a>
- <a href="#console"> Запуск тестов (Из терминала)</a>
- <a href="#allureReport"> Allure-отчет</a>
- <a href="#allure"> Интеграция с Allure TestOps</a>
- <a href="#jira"> Интеграция с Jira</a>
- <a href="#telegram"> Уведомление в Telegram о результатах выполнения автоматизированных тестов</a>
- <a href="#video"> Видеопример прохождения тестов Selenoid</a>


<a id="tools"></a>
## 🔨 Технологии и инструменты:

| Java                                                                                                     | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         | Jenkins                                                                                                          | Jira                                                                                                                                    | Telegram                                                                                                           |                                                                                           Allure <br> TestOps |
|:---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="media/logo/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

<a id="cases"></a>
## 🏁 Реализованные проверки:

- Проверка меню
- Проверка скрытия меню
- Проверка поиска
- Проверка наличия журнала действия
- Проверка создания проекта
- Проверка сообщения об общем проекте при  приглашении в проект
- Проверка создания задания

## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/MTS-autotests-EVLShevchuk/)


<p align="center">  
<img src="media/screen/Jenkins.png" alt="Jenkins" width="950"/>  
</p>

<a id="jenkins"></a>
## 📋 Параметры сборки в Jenkins:

- _STAND_BASE_URL (URL Сайта, по умолчанию moskva.mts.ru)_
- _SELENOID_BASE_URL (URL Selenoid, по умолчанию selenoid.autotests.cloud)_
- _TASK (Задачи, по умолчанию Smoke_test)_
- _BROWSER (Браузер, по умолчанию chrome)_
- _BROWSER_VERSION (Версия браузера, по умолчанию 100.0)_
- _BROWSER_SIZE (Размер окна браузера, по умолчанию 2560x1440)_

<a id="console"></a>
## 🚀 Команда для запуска автотестов из терминала

Удаленный запуск с использованием Jenkins и Selenoid (требуется логин и пароль):
```bash  
./gradlew clean test -Denv=remote
```

<a id="allureReport"></a>
## <img alt="Allure" height="25" src="media/logo/Allure.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/MTS-autotests-EVLShevchuk/allure/">Allure Report</a>


## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/MainReportAllure1.png" width="850">  
</p>  

## 📄 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/TestCasesAllure1.png" width="850">   
</p>

## 📊 Графики

<p align="center">   
<img title="Allure Graphics1" src="media/screen/GraficsAllure11.png" width="850">  
<img title="Allure Graphics2" src="media/screen/GraficsAllure12.png" width="850">  
</p>

<a id="allure"></a>
## <img alt="Allure_TO" height="25" src="media/logo/Allure_TO.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3677/dashboards">Allure TestOps</a>


## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screen/MainReportOps1.png" width="850">  
</p>  

## 📄 Авто и Ручные тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/TestCasesOps1.png" width="850">  
</p>

<a id="jira"></a>
## <img alt="Allure" height="25" src="media/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-891">Jira</a>

<p align="center">  
<img title="Jira" src="media/screen/Jira1.png" width="">  
</p>

<a id="telegram"></a>
____
## <img alt="Allure" height="25" src="media/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/Notifications1.png" width="550">  
</p>

<a id="video"></a>
____
## <img alt="Selenoid" height="25" src="media/logo/Selenoid.svg" width="25"/></a> Видеопример выполнения теста на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="media/logo/TestVideo.gif" width="550" height="350"  alt="video">   
</p>

