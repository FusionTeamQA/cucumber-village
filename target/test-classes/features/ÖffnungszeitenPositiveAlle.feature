#@VillageTest
Feature: Заполнить форму Öffnungszeiten и расшарить для всех
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму
    Given Auth|ÖffnungszeitenPositiveAlle
    And Open stage|ÖffnungszeitenPositiveAlle
    And Open LebenStage|ÖffnungszeitenPositiveAlle
    And Click botton Öffnungszeiten|ÖffnungszeitenPositiveAlle
    When Click to botton Hinzufügen||ÖffnungszeitenPositiveAlle
    And Enter Einrichtung|ÖffnungszeitenPositiveAlle
    And Enter Telefon|ÖffnungszeitenPositiveAlle
    And Enter Webseite|ÖffnungszeitenPositiveAlle
    And Enter Hausnummer|ÖffnungszeitenPositiveAlle
    And Enter Postleitzahl|ÖffnungszeitenPositiveAlle
    And Enter Ort|ÖffnungszeitenPositiveAlle
    And Select Öffnungszeiten|ÖffnungszeitenPositiveAlle
    And Enter Anmerkungen|ÖffnungszeitenPositiveAlle
    And Select Reichweite|ÖffnungszeitenPositiveAlle
    And Click Absenden|ÖffnungszeitenPositiveAlle
    Then Form send Successful|ÖffnungszeitenPositiveAlle
    And Close Browser|ÖffnungszeitenPositiveAlle