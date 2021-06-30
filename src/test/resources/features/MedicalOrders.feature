@StaffTest
Feature: Успешная отправка заявки с типом "больничный"
  Scenario: Авторизоваться и отправить заявку с типом "больничный"
    Given Open browser MedicalOrders
    And open page Staff DEV MedicalOrders
    And click leave an application MedicalOrders
    And click MedicalOrders type order
    When user select data MedicalOrders
    And enter heading and description MedicalOrders
    And click by send MedicalOrders
    Then MedicalOrders order send successful
    And Browser closed MedicalOrders