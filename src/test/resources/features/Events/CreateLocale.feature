#@test
@VillageTest
Feature: Создать новый эвент - Locale
  Scenario: Авторизироваться, Открыть вкладку Эвенты - создать новый эвент с типом Locale
    Given Auth|CreateLocale
    And Open page Events|CreateLocale
    When Click button Neues Event|CreateLocale
    And Enter Titel des Events|CreateLocale
    And Enter Datum auswählen|CreateLocale
    And Enter Uhrzeit wählen|CreateLocale
    And Enter Ende (Optional)|CreateLocale
    And Enter Ort der Veranstaltung (Adresse)|CreateLocale
    And Enter Beschreibung|CreateLocale
    And Click botton Weiter|CreateLocale
    And Select type Locale|CreateLocale
    And Click botton Weitertwo|CreateLocale
    And Upload image|CreateLocale
    And Click button Veröffentlichen|CreateLocale
    Then Event spontanes succesfull create|CreateLocale
    And Close Browser|CreateLocale