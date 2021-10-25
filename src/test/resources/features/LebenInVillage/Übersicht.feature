#@VillageTest
Feature: Заполнить форму Übersicht der Vereine
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму Übersicht der Vereine
    Given Auth|Übersicht
    And Open stage|Übersicht
    And Open LebenStage|Übersicht
    When Click botton Übersicht|Übersicht
    And Enter Name|Übersicht
    And Enter Beschreibung|Übersicht
    And Enter Telefon|Übersicht
    And Enter eMail-Adresse|Übersicht
    And Enter Webseite|Übersicht
    And Enter Straße und Hausnummer|Übersicht
    And Enter Postleitzahl|Übersicht
    And Enter Ort|Übersicht
    And Select Reichweite-Alle|Übersicht
    Then Form send Successful|Übersicht
    And Close Browser|Übersicht