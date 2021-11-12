#@test
#@VillageTest
Feature: Создать новый эвент - Spontanes
  Scenario: Авторизироваться, Открыть вкладку Эвенты - создать новый эвент с типом Spontane
    Given Auth|CreateSpontane
    And Open page Events|CreateSpontane
    When Click button Neues Event|CreateSpontane
    And Enter Titel des Events|CreateSpontane
    And Enter Datum auswählen|CreateSpontane
    And Enter Uhrzeit wählen|CreateSpontane
    And Enter Ende (Optional)|CreateSpontane
    And Enter Ort der Veranstaltung (Adresse)|CreateSpontane
    And Enter Beschreibung|CreateSpontane
    And Click botton Weiter|CreateSpontane
    And Select type Spontanes|CreateSpontane
    And Click botton Weitertwo|CreateSpontane
    And Upload image|CreateSpontane
    And Click button Veröffentlichen|CreateSpontane
    Then Event spontanes succesfull create|CreateSpontane
    And Close Browser|CreateSpontane
