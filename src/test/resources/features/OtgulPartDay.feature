#@StaffTest
Feature: Успешная отправка заявки отгула в течении дня
  Scenario: Авторизоваться и отправить заявку отгула на весь день
    Given Open browser OtgulPartDay
    And open page Staff DEV OtgulPartDay
    And click leave an application OtgulPartDay
    And click type order OtgulPartDay
    When user select data OtgulPartDay
    And select time start, end
    And enter heading and description OtgulPartDay
    And click by send OtgulPartDay
    Then OtgulPartDay order send successful
    And Browser closed OtgulPartDay
