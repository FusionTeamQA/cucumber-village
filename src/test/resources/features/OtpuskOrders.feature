@StaffTest
Feature: Успешная отправка заявки с типом "Отпуск"
  Scenario: Авторизоваться и отправить заявку с типом "Отпуск"
    Given Given Open browser Otpuskorders
    And open page Staff DEV Otpuskorders
    And click leave an application Otpuskorders
    And click Otpuskorders type order
    When user select data Otpuskorders
    And enter heading and description Otpuskorders
    And click by send Otpuskorders
    Then Otpuskorders order send successful
    And Browser closed Otpuskorders