#@test
@VillageTest
Feature: Создать новый эвент - Regionale
  Scenario: Авторизироваться, Открыть вкладку Эвенты - создать новый эвент с типом Regionale
    Given Auth|CreateRegionale
    And Open page Events|CreateRegionale
    When Click button Neues Event|CreateRegionale
    And Enter Titel des Events|CreateRegionale
    And Enter Datum auswählen|CreateRegionale
    And Enter Uhrzeit wählen|CreateRegionale
    And Enter Ende (Optional)|CreateRegionale
    And Enter Ort der Veranstaltung (Adresse)|CreateRegionale
    And Enter Beschreibung|CreateRegionale
    And Click botton Weiter|CreateRegionale
    And Select type Regionale|CreateRegionale
    And Click botton Weitertwo|CreateRegionale
    And Upload image|CreateRegionale
    And Click button Veröffentlichen|CreateRegionale
    Then Event spontanes succesfull create|CreateRegionale
    And Close Browser|CreateRegionale