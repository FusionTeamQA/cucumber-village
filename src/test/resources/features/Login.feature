@VillageTest
Feature: Авторизация
  Scenario: Пройти успешную авторизацию
    Given Open browser|Login
    And Open stage|Login
    When Enter login|Login
    And Enter Password|Login
    And Click button Login|Login
    Then Successful open home page|Login
    And Close Browser