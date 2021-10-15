@VillageTest
Feature: Открыть вкладку Leben in Stage
  Scenario: Авторизироваться, открыть вкладку Leben in Stage
    Given Open browser|OpenLeben
    And Open stage|OpenLeben
    And Enter login|OpenLeben
    And Enter Password|OpenLeben
    And Click button Login|OpenLeben
    When Successful open home page|OpenLeben
    And Click botton Leben in Stage|OpenLeben
    And Close Browser|OpenLeben