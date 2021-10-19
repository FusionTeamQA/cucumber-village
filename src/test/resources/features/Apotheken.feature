@VillageTest
Feature: Заполнить форму Apotheken и расшарить для всех
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму
    Given Auth|Apotheken
    And Open stage|Apotheken
    And Open LebenStage|Apotheken
    And Click botton Öffnungszeiten|Apotheken
    When Click to botton Hinzufügen||Apotheken
    And Enter Einrichtung|Apotheken
    And Enter Telefon|Apotheken
    And Enter Webseite|Apotheken
    And Enter Hausnummer|Apotheken
    And Enter Postleitzahl|Apotheken
    And Enter Ort|Apotheken
    And Select Öffnungszeiten|Apotheken
    And Enter Anmerkungen|Apotheken
    And Select Reichweite|Apotheken
    And Click Absenden|Apotheken
    Then Form send Successful|Apotheken
    And Close Browser|Apotheken