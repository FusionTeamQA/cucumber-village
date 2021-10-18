@VillageTest
Feature: Заполнить форму Öffnungszeiten и расшарить на 2 connection
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму
    Given Auth|ÖffnungszeitenPositive3Connect
    And Open stage|ÖffnungszeitenPositive3Connect
    And Open LebenStage|ÖffnungszeitenPositive3Connect
    And Click botton Öffnungszeiten|ÖffnungszeitenPositive3Connect
    When Click to botton Hinzufügen||ÖffnungszeitenPositive3Connect
    And Enter Einrichtung|ÖffnungszeitenPositive3Connect
    And Enter Telefon|ÖffnungszeitenPositive3Connect
    And Enter Webseite|ÖffnungszeitenPositive3Connect
    And Enter Hausnummer|ÖffnungszeitenPositive3Connect
    And Enter Postleitzahl|ÖffnungszeitenPositive3Connect
    And Enter Ort|ÖffnungszeitenPositive3Connect
    And Select Öffnungszeiten|ÖffnungszeitenPositive3Connect
    And Enter Anmerkungen|ÖffnungszeitenPositive3Connect
    And Select Reichweite 3connect|ÖffnungszeitenPositive3Connect
    And Click Absenden|ÖffnungszeitenPositive3Connect
    Then Form send Successful|ÖffnungszeitenPositive3Connect
    And Close Browser|ÖffnungszeitenPositive3Connect