#@BrincTest
Feature: Успешное создание заказа с оплатой через PayPal залогиненным пользователем
  Scenario: Открыть страницу дев, сделать заказ, оплатить PayPal
    Given OpenBrowser |PayPal
    And Open page Brink DEV |PayPal
    And Enter User |PayPal
    And Enter Pass |PayPal
    And Click botton OK |PayPal
    When Click botton Profile |PayPal
    And  Enter Benutzername (E-Mail) |PayPal
    And  Enter Passwort |PayPal
    And  Click botton Anmelden und weiter |PayPal
    And  Click botton Quick finder|PayPal
    And  Select category American Diner im Cinecitta|PayPal
    And Choose the quantity of the product " Arizona Iced Tea Blueberry“ in the size of 5 pcs|PayPal
    And Add an item to the cart|PayPal
    And Click botton cart|PayPal
    And Click botton checkout|PayPal
    And Click Continue|PayPal
    And Select type PayPal|PayPal
    And Check the box on "I hereby accept Egourmery's Terms and conditions and Privacy policy“|PayPal
    And Click on " Complete order“|PayPal
    And Open Page stripe|PayPal
    And Click botton Authorize test payment|PayPal
    Then Order complete, browser closed|PayPal



