@BrincTest
Feature: Успешное создание заказа с оплатой через GiroPay залогиненным пользователем
  Scenario: Открыть страницу дев, сделать заказ, оплатить GiroPay
    Given OpenBrowser |GiroPay
    And Open page Brink DEV |GiroPay
    And Enter User |GiroPay
    And Enter Pass |GiroPay
    And Click botton OK |GiroPay
    When Click botton Profile |GiroPay
    And  Enter Benutzername (E-Mail) |GiroPay
    And  Enter Passwort |GiroPay
    And  Click botton Anmelden und weiter |GiroPay
    And  Click botton Quick finder|GiroPay
    And  Select category American Diner im Cinecitta|GiroPay
    And Choose the quantity of the product " Arizona Iced Tea Blueberry“ in the size of 5 pcs|GiroPay
    And Add an item to the cart|GiroPay
    And Click botton cart|GiroPay
    And Click botton checkout|GiroPay
    And Click Continue|GiroPay
    And Select type GiroPay|GiroPay
    And Check the box on "I hereby accept Egourmery's Terms and conditions and Privacy policy“|GiroPay
    And Enter your name QAA|GiroPay
    And Enter your email qa@qa.qa|GiroPay
    And Open Page stripe|GiroPay
    And Click botton Authorize test payment|GiroPay
    Then Order complete, browser closed|GiroPay



