#@test
@VillageTest
Feature: Создать новую группу с типом Privat
  Scenario: Авторизироваться, Открыть вкладку Группы - создать новую группу с типом Privat
    Given Auth|CreateGruppenPrivat
    And Open page Gruppen|CreateGruppenPrivat
    When Click button Neue Gruppe erstellen|CreateGruppenPrivat
    And Click botton Suche nach Titelbild z.B. Sommer|CreateGruppenPrivat
    And Click random image|CreateGruppenPrivat
    And Enter Gruppen name|CreateGruppenPrivat
    And Enter Beschreibung|CreateGruppenPrivat
    And Select type gruppen|CreateGruppenPrivat
    And Click button Fertig|CreateGruppenPrivat
    Then Gruppen succesfull create|CreateGruppenPrivat
    And Close Browser|CreateGruppenPrivat
