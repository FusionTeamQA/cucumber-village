@BrincTest
Feature: Успешное создание заказа с оплатой через Sofort залогиненным пользователем
  Scenario: Открыть страницу дев, сделать заказ, оплатить Sofort
    Given OpenBrowser |Sofort
    And Open page Brink DEV |Sofort
    And Enter User |Sofort
    And Enter Pass |Sofort
    And Click botton OK |Sofort
    When Click botton Profile |Sofort
    And  Enter Benutzername (E-Mail) |Sofort
    And  Enter Passwort |Sofort
    And  Click botton Anmelden und weiter |Sofort
    And  Click botton Quick finder|Sofort
    And  Select category American Diner im Cinecitta|Sofort
    And Choose the quantity of the product " Arizona Iced Tea Blueberry“ in the size of 5 pcs|Sofort
    And Add an item to the cart|Sofort
    And Click botton cart|Sofort
    And Click botton checkout|Sofort
    And Click Continue|Sofort
    And Select type Sofort|Sofort
    And Check the box on "I hereby accept Egourmery's Terms and conditions and Privacy policy“|Sofort
    And Enter your name QAA|Sofort
    And Enter your email qa@qa.qa|Sofort
    And Select Country Germany|Sofort
    And Open Page stripe|Sofort
    And Click botton Authorize test payment|Sofort
    Then Order complete, browser closed|Sofort



