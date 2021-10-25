#@VillageTest
Feature: Заполнить форму Schadensmelder
  Scenario: Авторизироваться, открыть вкладку Leben in Stage, заполнить форму Schadensmelder
    Given Auth|SchadensmelderPositive
    And Open stage|SchadensmelderPositive
    And Open LebenStage|SchadensmelderPositive
    And Click botton Schadensmelder|SchadensmelderPositive
    And Enter Name|SchadensmelderPositive
    And Enter Telefon|SchadensmelderPositive
    And Enter eMail-Adresse|SchadensmelderPositive
    And Select Datum|SchadensmelderPositive
    And Enter Standort|SchadensmelderPositive
    And Enter Beschreibung des Schadens|SchadensmelderPositive
    And Click radiobotton Hiermit bestätigen Sie die|SchadensmelderPositive
    Then Form send Successful|SchadensmelderPositive
    And Close Browser|SchadensmelderPositive