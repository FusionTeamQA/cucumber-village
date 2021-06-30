#@StaffTest
Feature: Успешная отправка заявки отгула на весь день
  Scenario: Авторизоваться и отправить заявку отгула на весь день
    Given Open browser OtgulDenOrder
    And open page Staff DEV OtgulDenOrder
    And click leave an application OtgulDenOrder
    And click type order OtgulDenOrder
    When user select data OtgulDenOrder
    And enter heading and description OtgulDenOrder
    And click by send OtgulDenOrder
    Then OtgulDenOrder order send successful
    And Browser closed OtgulDenOrder
