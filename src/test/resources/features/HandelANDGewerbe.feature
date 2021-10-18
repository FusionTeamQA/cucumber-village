#@VillageTest
Feature: Заполнить форму Handel & Gewerbe
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму Handel & Gewerbe
    Given Auth|Handel
    And Open stage|Handel
    And Open LebenStage|Handel
    When Click botton Übersicht|Handel
    And Enter Name|Handel
    And Enter Beschreibung|Handel
    And Enter Telefon|Handel
    And Enter eMail-Adresse|Handel
    And Enter Webseite|Handel
    And Enter Straße und Hausnummer|Handel
    And Enter Postleitzahl|Handel
    And Enter Ort|Handel
    And Select Reichweite-Alle|Handel
    Then Form send Successful|Handel
    And Close Browser|Handel