@VillageTest
Feature: Создать новую группу с типом Öffentlich
  Scenario: Авторизироваться, Открыть вкладку Группы - создать новую группу с типом Öffentlich
    Given Auth|CreateGruppenÖffentlich
    And Open page Gruppen|CreateGruppenÖffentlich
    When Click button Neue Gruppe erstellen|CreateGruppenÖffentlich
    And Click botton Suche nach Titelbild z.B. Sommer|CreateGruppenÖffentlich
    And Click random image|CreateGruppenÖffentlich
    And Enter Gruppen name|CreateGruppenÖffentlich
    And Enter Beschreibung|CreateGruppenÖffentlich
    And Select type gruppen|CreateGruppenÖffentlich
    And Click button Fertig|CreateGruppenÖffentlich
    Then Gruppen succesfull create|CreateGruppenÖffentlich
    And Close Browser|CreateGruppenÖffentlich
