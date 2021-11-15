@VillageTest
Feature: Заполнить форму Ansprechpartner
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму Ansprechpartner
    Given Auth|Ansprechpartner
    And Open stage|Ansprechpartner
    And Open LebenStage|Ansprechpartner
    When Click botton Ansprechpartner|Ansprechpartner
    And Enter Name|Ansprechpartner
    And Enter Beschreibung|Ansprechpartner
    And Enter Telefon|Ansprechpartner
    And Enter eMail-Adresse|Ansprechpartner
    And Enter Webseite|Ansprechpartner
    And Enter Straße und Hausnummer|Ansprechpartner
    And Enter Postleitzahl|Ansprechpartner
    And Enter Ort|Ansprechpartner
    And Select Reichweite-Alle|Ansprechpartner
    Then Form send Successful|Ansprechpartner
    And Close Browser|Ansprechpartner