#@BrincTest
Feature: Успешное создание заказа с оплатой через CreditCards залогиненным пользователем
  Scenario: Открыть страницу дев, сделать заказ, оплатить CreditCards
    Given OpenBrowser |CreditCards
    And Open page Brink DEV |CreditCards
    And Enter User |CreditCards
    And Enter Pass |CreditCards
    And Click botton OK |CreditCards
    When Click botton Profile |CreditCards
    And  Enter Benutzername (E-Mail) |CreditCards
    And  Enter Passwort |CreditCards
    And  Click botton Anmelden und weiter |CreditCards
    And  Select category American Diner im Cinecitta|CreditCards
    And Choose the quantity of the product " Arizona Iced Tea Blueberry“ in the size of 5 pcs|CreditCards
    And Add an item to the cart|CreditCards
    And Click botton cart|CreditCards
    And Click botton checkout|CreditCards
    And Click Continue|CreditCards
    And Select type CreditCards|CreditCards
    And Check the box on "I hereby accept Egourmery's Terms and conditions and Privacy policy“|CreditCards
    And Enter your Cardholder Name|CreditCards
    And Enter your Credit Card Number|CreditCards
    And Enter your Expiration|CreditCards
    And Enter your CVC Code|CreditCards
    And Click on " Complete order“|CreditCards
    Then Order complete, browser closed|CreditCards



