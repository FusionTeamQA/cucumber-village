#@StaffTest
Feature: Успешная отправка технической заявки
  Scenario: Авторизоваться и отправить техническую заявку
    Given Open browser techorder
    And open page Staff DEV techorder
    And click leave an application
    And click Tech type order
    When user select data
    And enter heading and description
    And click by send
    Then Tech order send successful
    And Browser closed techorder