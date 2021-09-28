#@BrincTest
Feature: Успешная авторизация на деве
  Scenario: Открыть страницу и авторизироваться
    Given Open browser
    And open page Staff DEV
    When user enters login and password
    And click by login
    Then User navigated to home page
    And Browser closed